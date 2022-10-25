package kodlama.io.rentACar.webApi.controllers;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.entities.concretes.Brand;

@RestController  //annotation = bilgilendirme ifadesidir. Bu uygulamayı derlediğinde veya çalışırken kullanır.
@RequestMapping("/api/brands")  // Adresimizin sonuna brands api derse bu kontrolü çalıştırır.

public class BrandsController {
	//API isimlerinde çoğul isimler kullanılır.
	
	private BrandService brandService;

	  //Git parametrelerine bak. +
	public BrandsController(BrandService brandService) {
		super();
		this.brandService = brandService;
	}
	
	@GetMapping("/getAll")
	public List<Brand> getAll(){
		//IoC Default gelir springbootta.
		return brandService.getAll();
	}
	
}
