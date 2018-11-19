package shop.member;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import common.MybatisConfig;

public class MemberDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	public void joinMember(MemberVO member) {
		SqlSession sqlsession = null;
		try {
			sqlsession = factory.openSession();
			sqlsession.insert("member.joinMember", member);
			sqlsession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlsession != null) sqlsession.close();
		}
	}
	
	public MemberVO getMember(String id) {
		SqlSession sqlsession = null;
		MemberVO vo = null;
		try {
			sqlsession = factory.openSession();
			vo = sqlsession.selectOne("member.getMember", id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlsession != null) sqlsession.close();
		}
		return vo;
	}
	
	public String checkAlreadyMember(String id) {
		SqlSession sqlsession = null;
		String idOfDatabase = null;
		try {
			sqlsession = factory.openSession();
			idOfDatabase = sqlsession.selectOne("member.checkAlreadyMember", id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlsession != null) sqlsession.close();
		}
		return idOfDatabase;
	}
}
