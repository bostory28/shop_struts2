package shop.book;

public class BookVO {
	private int code;
	private String title;
	private int price;
	private int quantity;
	
	public BookVO() {
		super();
	}
	public BookVO(int code, String title, int price, int quantity) {
		super();
		this.code = code;
		this.title = title;
		this.price = price;
		this.quantity = quantity;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "BookVO [code=" + code + ", title=" + title + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
}
