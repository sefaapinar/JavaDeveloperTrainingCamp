package kodlama.io.rentACar.dataAccess.abstracts;
//BrandDao olarak da kullanılabilir. 

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.entities.concretes.Brand;

@Repository
public interface BrandRepository {

	List<Brand> getAll();
	
}
