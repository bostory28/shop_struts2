package shop.sale;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import shop.book.BookDAO;
import shop.book.BookVO;
import shop.member.MemberDAO;
import shop.member.MemberVO;

import com.opensymphony.xwork2.ActionSupport;

public class SaleAction extends ActionSupport implements SessionAware{
	private Map<String, Object> session;
	private MemberVO member;
	private BookVO book;
	private SaleVO sale;
	private List<SaleBookVO> list;
	private int sum;
	
	public String purchaseBook() throws Exception {
		String id = (String)session.get("id");
		sale.setId(id);
		sale.setCode(book.getCode());
		MemberDAO memberdao = new MemberDAO();
		member = memberdao.getMember(id);
		//책구입
		SaleDAO saledao = new SaleDAO();
		saledao.purchaseBook(sale);
		//책수량차감
		BookDAO bookdao = new BookDAO();
		bookdao.editBookCount(book.getCode(), sale.getCnt(), book.getQuantity());
		
		list = saledao.getSalelistOfId(id);
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i).getSum(); 
		}
		return SUCCESS;
	}
	public String purchased() throws Exception {
		String id = (String)session.get("id");
		MemberDAO memberdao = new MemberDAO();
		member = memberdao.getMember(id);
		
		SaleDAO saledao = new SaleDAO();
		list = saledao.getSalelistOfId(id);
		return SUCCESS;
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
		
	}

	public MemberVO getMember() {
		return member;
	}

	public void setMember(MemberVO member) {
		this.member = member;
	}

	public List<SaleBookVO> getList() {
		return list;
	}

	public void setList(List<SaleBookVO> list) {
		this.list = list;
	}

	public BookVO getBook() {
		return book;
	}

	public void setBook(BookVO book) {
		this.book = book;
	}

	public SaleVO getSale() {
		return sale;
	}

	public void setSale(SaleVO sale) {
		this.sale = sale;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
	
}
