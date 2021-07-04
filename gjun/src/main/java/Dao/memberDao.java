package Dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Model.member;

public class memberDao implements implDao {
	public static void main(String args[]) {
      /*member m=new member("Jhabib","123456","0000");
      new memberDao().add(m);*/
}
    public static Integer queryUser(String username,String password)
    {
    	EntityManager em=implDao.getDb();
		String JPQL="select m from member m where m.username=?1 and m.password=?2";
		Query q=em.createQuery(JPQL,member.class);		
		q.setParameter(1, username);
		q.setParameter(2, password);
		
		
		List<member> l=q.getResultList();
		return l.size();
    }
    public static Integer queryUser(String username)
    {
    	EntityManager em=implDao.getDb();
		String JPQL="select m from member m where m.username=?1";
		Query q=em.createQuery(JPQL,member.class);		
		q.setParameter(1, username);
		
		
		
		List<member> l=q.getResultList();
		return l.size();
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
        member m=em.find(member.class,id);
		return m;
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
		member m=em.find(member.class,id);
		t.begin();
		em.remove(m);
		t.commit();
		em.close();
		
	}
	
}
