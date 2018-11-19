package shop.wishlist;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import shop.book.BookVO;
import shop.member.MemberDAO;
import shop.member.MemberVO;

import com.opensymphony.xwork2.ActionSupport;

public class WishlistAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;
	private BookVO book;
	private List<WishlistBookVO> list;
	private MemberVO member;
	private int code;
	
	public String selectBook() throws Exception {
		MemberDAO memberdao = new MemberDAO();
		String id = (String)session.get("id");
		member = memberdao.getMember(id);
		WishlistDAO dao = new WishlistDAO();
		WishlistVO wishlist = new WishlistVO();
		wishlist.setCode(book.getCode());
		wishlist.setId(id);
		//찜하기
		dao.insertSelectedBook(wishlist);
		//찜한 목록가져오기
		list = dao.getSelectedBook(wishlist.getId());
		return SUCCESS;
	}
	
	public String deleteWishlist() throws Exception {
		WishlistDAO dao = new WishlistDAO();
		String id = (String)session.get("id");
		WishlistVO wishlist = new WishlistVO(id, code);
		dao.deleteWishlist(wishlist);
		
		MemberDAO memberdao = new MemberDAO();
		member = memberdao.getMember(id);
		list = dao.getSelectedBook(wishlist.getId());
		return SUCCESS;
	}
	
	public String selectedBooks() throws Exception {
		MemberDAO memberdao = new MemberDAO();
		String id = (String)session.get("id");
		member = memberdao.getMember(id);
		
		WishlistDAO dao = new WishlistDAO();
		list = dao.getSelectedBook(id);
		return SUCCESS;
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public BookVO getBook() {
		return book;
	}

	public void setBook(BookVO book) {
		this.book = book;
	}

	public List<WishlistBookVO> getList() {
		return list;
	}

	public void setList(List<WishlistBookVO> list) {
		this.list = list;
	}
	

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public MemberVO getMember() {
		return member;
	}

	public void setMember(MemberVO member) {
		this.member = member;
	}
	
}
