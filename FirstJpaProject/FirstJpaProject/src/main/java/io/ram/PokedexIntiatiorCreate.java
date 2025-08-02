package io.ram;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PokedexIntiatiorCreate {
public static void main(String[] args) {
	
	Pokemon p1 = new Pokemon();
	p1.setName("pikachu");
	p1.setPower(100);
	p1.setType("electric");
	p1.setColor("yellow");
	
	Pokemon p2 = new Pokemon();
	p2.setName("chaizard");
	p2.setPower(120);
	p2.setType("Fire");
	p2.setColor("green");
	
	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("ram");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	entityTransaction.begin();
	entityManager.persist(p1);
	entityManager.persist(p2);
	entityTransaction.commit();
}
}
