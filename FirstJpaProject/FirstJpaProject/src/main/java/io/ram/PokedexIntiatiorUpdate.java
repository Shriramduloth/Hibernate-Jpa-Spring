package io.ram;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PokedexIntiatiorUpdate {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("ram");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		Pokemon p= entityManager.find(Pokemon.class, "chaizard");
		
		if(p!=null) {
			p.setPower(200);
			entityTransaction.begin();
			entityManager.persist(p);
			entityTransaction.commit();
		}
		else {
			System.out.println("Entry does not exist");
		}

	}

}
