package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAccess.HibernateProductDao;

import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	
	public ProductManager(ProductDao productDao) {
	
		this.productDao = productDao;
	}

	public void add(Product product) throws Exception { //reponse request
		//iş kuralları
		
		if (product.getUnitPrice() < 10) {
			
			throw new Exception("Ürün Fiyatı 10 dan küçük olamaz");
		}
		
//		ProductDao productDao = new HibernateProductDaoo();
		productDao.add(product);
	}
	

}
