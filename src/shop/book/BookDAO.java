package shop.book;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import common.MybatisConfig;

public class BookDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	public List<BookVO> bookList() {
		List<BookVO> list = null;
		SqlSession sqlsession = null;
		try {
			sqlsession = factory.openSession();
			list = sqlsession.selectList("book.bookList");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlsession != null) sqlsession.close(); 
		}
		return list;
	}
	public BookVO infoOneOfBooks(int code) {
		BookVO vo = null;
		SqlSession sqlsession = null;
		try {
			sqlsession = factory.openSession();
			vo = sqlsession.selectOne("book.infoOneOfBooks", code);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlsession != null) sqlsession.close(); 
		}
		return vo;
	}
	public void editBookCount(int code, int cnt, int quantity) {
		SqlSession sqlsession = null;
		HashMap<String, Object> hashmap = new HashMap<>();
		hashmap.put("code", code);
		hashmap.put("cnt", cnt);
		hashmap.put("quantity", quantity);
		
		try {
			sqlsession = factory.openSession();
			sqlsession.update("book.editBookCount", hashmap);
			sqlsession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlsession != null) sqlsession.close(); 
		}
	}
	
	public BestSellerVO getBookSold() {
		BestSellerVO vo = null;
		SqlSession sqlsession = null;
		try {
			sqlsession = factory.openSession();
			vo = sqlsession.selectOne("book.getBookSold");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlsession != null) sqlsession.close(); 
		}
		return vo;
	}
}
