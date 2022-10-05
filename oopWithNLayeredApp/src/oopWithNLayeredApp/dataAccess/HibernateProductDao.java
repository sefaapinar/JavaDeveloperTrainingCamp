package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {

	public void add(Product product) {
		//sadece ve sadece DB Erişim Kodları buraya yazılır.../SQL Bilmek gerekir. 
		
		System.out.println("Hibernate ile veri tabanına eklendi...");
	}
}
