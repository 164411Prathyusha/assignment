package CartDao;

public class UserTransaction {
	private long userId;
	private long productId;
	private String productName;
	private int quantity;
	private double productprice;
	private double total;
	public UserTransaction(long userId, long productId, String productName,
			int quantity, double productprice, double total) {
		super();
		this.userId = userId;
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.productprice = productprice;
		this.total = total;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getProductPrice() {
		return productprice;
	}
	public void setProductPrice(double price) {
		this.productprice = price;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}

}
