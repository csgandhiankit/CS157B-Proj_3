package project_3;

import UtilClass;

import org.hibernate.Session;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Hibernate Example XML");
        Session session = UtilClass.getSessionFactory().openSession();
        
        session.beginTransaction();
        Sales_Transactions emp = new Sales_Transactions();
        
        //emp.setEmployeeCode("123");
        //emp.setEmployeeName("James Bond");
        
        session.save(emp);
        session.getTransaction().commit();
    }
}
