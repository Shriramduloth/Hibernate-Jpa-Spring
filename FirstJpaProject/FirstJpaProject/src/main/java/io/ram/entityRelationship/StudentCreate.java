package io.ram.entityRelationship;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentCreate {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Diyan");
		
		Student s2 = new Student();
		s2.setName("Ram");

		StudentIdCard c1 = new StudentIdCard();
		c1.setSoftVersion("1.0.1");
		c1.setStudent(s1);

		StudentIdCard c2 = new StudentIdCard();
		c2.setSoftVersion("1.2.0");
		c2.setStudent(s2);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ram2");
		
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		
		s1.setCard(c1);
		s2.setCard(c2);
		entityTransaction.begin();
		entityManager.persist(s1);
		entityManager.persist(s2);
		entityManager.persist(c1);
		entityManager.persist(c2);
		entityTransaction.commit();

	}

}
