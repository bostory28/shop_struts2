package shop.book;

public class BestSellerVO {
	private int code;
	private String title;
	private int price;
	private int count;
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
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "SaleBookVO [code=" + code + ", title=" + title + ", price="
				+ price + ", count=" + count + "]";
	}
	
}
