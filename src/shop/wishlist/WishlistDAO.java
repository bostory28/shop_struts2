package shop.wishlist;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import common.MybatisConfig;

public class WishlistDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	public void insertSelectedBook(WishlistVO vo) {
		SqlSession sqlsession = null;
		try {
			sqlsession = factory.openSession();
			sqlsession.insert("wishlist.insertSelectedBook", vo);
			sqlsession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlsession != null) sqlsession.close();
		}
	}
	public List<WishlistBookVO> getSelectedBook(String id) {
		SqlSession sqlsession = null;
		List<WishlistBookVO> list = null;
		try {
			sqlsession = factory.openSession();
			list = sqlsession.selectList("wishlist.getSelectedBook", id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlsession != null) sqlsession.close();
		}
		return list;
	}
	public void deleteWishlist(WishlistVO vo) {
		SqlSession sqlsession = null;
		try {
			sqlsession = factory.openSession();
			sqlsession.delete("wishlist.deleteWishlist", vo);
			sqlsession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlsession != null) sqlsession.close();
		}
	}
}
