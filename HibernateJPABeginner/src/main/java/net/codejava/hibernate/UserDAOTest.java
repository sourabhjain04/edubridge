package net.codejava.hibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UserDAOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("UsersDB");
	        EntityManager entityManager = factory.createEntityManager();
	         
	        entityManager.getTransaction().begin();
	         
	        User newUser = new User();
	        newUser.setEmail("billjoy@gmail.com");
	        newUser.setFullname("bill Joy");
	        newUser.setPassword("billi");
	         
	        entityManager.persist(newUser);
	         
	        entityManager.getTransaction().commit();
	         
	        entityManager.close();
	        factory.close();
	}

	

}
