package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.entities.concretes.Brand;

public interface BrandService {

	//iş kurallarını buraya yazarız. 
	List<Brand> getAll();
}
