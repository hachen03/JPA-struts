package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import Model.member;
import Model.porder;

public class porderDao implements implDao {

	public static void main(String args[]) {   
         new porderDao().delete(2);
}

	@Override
	public void add(Object o) {
		EntityManager em=implDao.getDb();
		EntityTransaction t=em.getTransaction();
		t.begin();
		em.persist(o);
		t.commit();
		em.close();	
	}

	@Override
	public Object queryId(int id) {
		EntityManager em=implDao.getDb();
        porder p=em.find(porder.class,id);
		return p;
	}

	@Override
	public void update(Object o) {
		    EntityManager em=implDao.getDb();
		    EntityTransaction t=em.getTransaction();
		    t.begin();
		    em.merge(o);
		    t.commit();
		    em.close();
	}

	@Override
	public void delete(int id) {
		EntityManager em=implDao.getDb();
		EntityTransaction t=em.getTransaction();
		porder p=em.find(porder.class,id);
		t.begin();
		em.remove(p);
		t.commit();
		em.close();
		
	}

}
