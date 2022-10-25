package kodlama.io.rentACar.dataAccess.abstracts;
//BrandDao olarak da kullanılabilir. 

import java.util.List;

import kodlama.io.rentACar.entities.concretes.Brand;

public interface BrandRepository {

	List<Brand> getAll();
	
}
