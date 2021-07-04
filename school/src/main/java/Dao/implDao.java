package Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Model.student;

public interface implDao {
     static Session getDb()
     {
    	 Configuration con=new Configuration().configure();
    	 SessionFactory sf=con.buildSessionFactory();
    	 Session se=sf.openSession();
    	 return se;
     }
   //新增
 	void add(Object o);
 	
 	
 	//查詢
 	Object query(int id);
 	List<Object> queryAll();
 	List<Object> query(int start,int end);
 	//修改
 	void updateObject(Object o);
 	
 	
 	//刪除
 	void deleteObject(Object o);
}
