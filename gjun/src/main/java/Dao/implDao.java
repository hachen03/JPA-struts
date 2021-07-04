package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public interface implDao {
	//連線方法
	static EntityManager getDb()
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("gjun");
		EntityManager em=emf.createEntityManager();
		
		return em;
	}
	
	//新增物件
	
	void add(Object o);
	
	//查詢物件
	Object queryId(int id);
	
	//修改物件
	void update(Object o);
	//刪除物件
    void delete(int id);
}
