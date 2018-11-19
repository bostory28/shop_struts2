package shop.sale;

public class SaleBookVO {
	private String inputdate;
	private int code;
	private String title;
	private int price;
	private int cnt;
	private int sum;
	public SaleBookVO() {
		super();
	}
	public String getInputdate() {
		return inputdate;
	}
	public void setInputdate(String inputdate) {
		this.inputdate = inputdate;
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
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	@Override
	public String toString() {
		return "SaleBookVO [inputdate=" + inputdate + ", code=" + code
				+ ", title=" + title + ", price=" + price + ", cnt=" + cnt
				+ ", sum=" + sum + "]";
	}
	
}
