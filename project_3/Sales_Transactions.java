package project_3;

public class Sales_Transactions {

	private String Date; // check for date type later
	private String ProductName;
	private int Quantity;
	private int UnitCost;
	private int TotalCost;

	public Sales_Transactions() {

	}

	public Sales_Transactions(String Date, String ProductName, int Quantity, int UnitCost, int TotalCost) {
		this.Date = Date;
		this.ProductName = ProductName;
		this.Quantity = Quantity;
		this.UnitCost = UnitCost;
		this.TotalCost = TotalCost;
	}

	public void save() {

	}

	public String getDate() {
		return Date;
	}

	public String getProductName() {
		return ProductName;
	}

	public int getQuantity() {
		return Quantity;
	}

	public int getUnitCost() {
		return UnitCost;
	}

	public int getTotalCost() {
		return TotalCost;
	}

	public void setDate(String date) {
		Date = date;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public void setUnitCost(int unitCost) {
		UnitCost = unitCost;
	}

	public void setTotalCost(int totalCost) {
		TotalCost = totalCost;
	}

}
