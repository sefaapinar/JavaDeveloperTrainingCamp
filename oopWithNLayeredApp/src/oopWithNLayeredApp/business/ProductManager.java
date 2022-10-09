package oopWithNLayeredApp.business;

import java.util.Iterator;
import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private HibernateProductDao hibernateProductDao;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao, Logger[] loggers,HibernateProductDao hibernateProductDao) {
	
		this.productDao = productDao;
		this.hibernateProductDao = hibernateProductDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception { //reponse request
		//iş kuralları
		
		if (product.getUnitPrice() < 10) {
			
			throw new Exception("Ürün Fiyatı 10 dan küçük olamaz");
		}
		
//		ProductDao productDao = new HibernateProductDaoo();
		productDao.add(product);
		
		for(Logger logger:loggers) {
			logger.log(product.getName());
		}
	}
	

}
