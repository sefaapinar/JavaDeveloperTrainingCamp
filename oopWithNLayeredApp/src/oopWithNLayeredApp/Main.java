package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DBLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Product product1 = new Product(1,"Iphone 14",50000);
		
		Logger[] loggers = {new DBLogger(),new FileLogger(),new MailLogger()};
		
		ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers, null);
		productManager.add(product1);
	}

}
