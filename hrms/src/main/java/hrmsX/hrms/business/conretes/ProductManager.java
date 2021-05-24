package hrmsX.hrms.business.conretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrmsX.hrms.Core.utilies.result.DataResult;
import hrmsX.hrms.Core.utilies.result.SuccessDataResult;
import hrmsX.hrms.Core.utilies.result.SuccessResult;
import hrmsX.hrms.Core.utilies.result.result;
import hrmsX.hrms.business.abstracts.ProductService;
import hrmsX.hrms.dataAccess.abstracts.ProductDao;
import hrmsX.hrms.entities.conretes.Product;


@Service
public class ProductManager implements ProductService {

	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	private ProductDao productDao;
	
	

	
	@Override
	public DataResult<List<Product>>  getAll() {
	
		return new SuccessDataResult<List<Product>>(this.productDao.findAll());
				
				
	}




	@Override
	public result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün eklendi...");
	}

}
