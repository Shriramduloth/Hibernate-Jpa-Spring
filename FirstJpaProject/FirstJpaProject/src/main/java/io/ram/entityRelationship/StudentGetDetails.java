package io.ram.entityRelationship;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentGetDetails {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("ram2");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		
//		Student s1 = entityManager.find(Student.class, 2);
//		
//		System.out.println(s1);
		StudentIdCard c1 = entityManager.find(StudentIdCard.class, 3);
		System.out.println(c1.getCardNumber()+" "+c1.getSoftVersion()+" "+c1.getStudent().getName()+" ");
		
		
		
	}

}
