package shop.sale;

public class SaleVO {
	private String id;
	private int code;
	private int cnt;
	private String inputdate;
	public SaleVO() {
		super();
	}
	public SaleVO(String id, int code, int cnt, String inputdate) {
		super();
		this.id = id;
		this.code = code;
		this.cnt = cnt;
		this.inputdate = inputdate;
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
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String getInputdate() {
		return inputdate;
	}
	public void setInputdate(String inputdate) {
		this.inputdate = inputdate;
	}
	@Override
	public String toString() {
		return "SaleVO [id=" + id + ", code=" + code + ", cnt=" + cnt
				+ ", inputdate=" + inputdate + "]";
	}
	
}
