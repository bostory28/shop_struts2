package shop.book;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;


import com.opensymphony.xwork2.ActionSupport;

public class BookAction extends ActionSupport  implements SessionAware{
	private Map<String, Object> session;
	private List<BookVO> list;
	private int code;
	private BookVO book;
	private BestSellerVO bestseller;
	
	public String bookList() throws Exception {
		BookDAO dao = new BookDAO();
		list = dao.bookList();
		return SUCCESS;
	}
	
	public String infoOneOfBooks() throws Exception {
		BookDAO dao = new BookDAO();
		book = dao.infoOneOfBooks(code);
		return SUCCESS;
	}
	
	public String bestseller() throws Exception {
		BookDAO dao = new BookDAO();
		bestseller = dao.getBookSold();
		System.out.println(bestseller);
		return SUCCESS;
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
		
	}

	public List<BookVO> getList() {
		return list;
	}

	public void setList(List<BookVO> list) {
		this.list = list;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public BookVO getBook() {
		return book;
	}

	public void setBook(BookVO book) {
		this.book = book;
	}

	public BestSellerVO getBestseller() {
		return bestseller;
	}

	public void setBestseller(BestSellerVO bestseller) {
		this.bestseller = bestseller;
	}
	
	
}
