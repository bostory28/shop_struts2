package shop.wishlist;

public class WishlistBookVO {
	private int code;
	private String title;
	private int price;
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
	@Override
	public String toString() {
		return "WishlistBookVO [code=" + code + ", title=" + title + ", price="
				+ price + "]";
	}
	
}
