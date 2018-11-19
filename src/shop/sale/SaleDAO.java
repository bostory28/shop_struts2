package shop.sale;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import common.MybatisConfig;

public class SaleDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	
	public void purchaseBook(SaleVO vo) {
		SqlSession sqlsession = null;
		try {
			sqlsession = factory.openSession();
			sqlsession.insert("sale.purchaseBook", vo);
			sqlsession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlsession != null) sqlsession.close();
		}
	}
	
	public List<SaleBookVO> getSalelistOfId(String id) {
		SqlSession sqlsession = null;
		List<SaleBookVO> list = null;
		try {
			sqlsession = factory.openSession();
			list = sqlsession.selectList("sale.getSalelistOfId", id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlsession != null) sqlsession.close();
		}
		return list;
	}
	
}
