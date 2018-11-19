package shop.member;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class MemberAction extends ActionSupport implements SessionAware{
	private MemberVO member;
	private Map<String , Object> session;

	public String joinMember() throws Exception {
		MemberDAO dao = new MemberDAO();
		dao.joinMember(member);
		session.put("id", member.getId());
		return SUCCESS;
	}
	
	public String login() throws Exception {
		MemberDAO dao = new MemberDAO();
		member = dao.getMember(member.getId());
		if(member == null) {
			return "login";
		}
		session.put("id", member.getId());
		return SUCCESS;
	}
	
	public String logout() throws Exception {
		session.remove("id");
		return SUCCESS;
	}
	
	public MemberVO getMember() {
		return member;
	}

	public void setMember(MemberVO member) {
		this.member = member;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
