package Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import Model.student;


public class studentDao implements implDao {

	public static void main(String[] args) {         
	}

	@Override
	public void add(Object o) {
		Session se=implDao.getDb();
		Transaction t=se.beginTransaction();
		se.save(o);
		t.commit();
		se.close();
		
	}

	@Override
	public Object query(int id) {
		Session se=implDao.getDb();
		student s=se.get(student.class,id);
		return s;
	}

	@Override
	public List<Object> queryAll() {
		  Session se=implDao.getDb();
		  String HQL="from student";
		  Query q=se.createQuery(HQL);
		  List<Object> l=q.list();
		  return l;
	}

	@Override
	public List<Object> query(int start, int end) {
		Session se=implDao.getDb();
		String HQL="from student as p where p.id>=?1 and p.id<=?2";
		Query q=se.createQuery(HQL);
		q.setParameter(1,start);
		q.setParameter(2,end);
		List<Object> l=q.list();
		return l;
	}

	@Override
	public void updateObject(Object o) {
		Session se=implDao.getDb();
		Transaction t=se.beginTransaction();
		se.update(o);
		t.commit();
		se.close();
		
	}

	@Override
	public void deleteObject(Object o) {
		Session se=implDao.getDb();
		Transaction t=se.beginTransaction();
		se.delete(o);
		t.commit();
		se.close();
		
	}

}
