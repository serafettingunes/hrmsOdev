package hrmsX.hrms.API.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrmsX.hrms.business.abstracts.ProductService;
import hrmsX.hrms.entities.conretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
	
	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	private ProductService productService;
	
	@GetMapping("/getall")
	public List<Product> getAll(){
		return this.productService.getAll();
	}
}
//kodlama.io/api/products