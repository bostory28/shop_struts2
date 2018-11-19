package shop.wishlist;

public class WishlistVO {
	private String id;
	private int code;
	public WishlistVO() {
		super();
	}
	public WishlistVO(String id, int code) {
		super();
		this.id = id;
		this.code = code;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "WishlistVO [id=" + id + ", code=" + code + "]";
	}
	
}
