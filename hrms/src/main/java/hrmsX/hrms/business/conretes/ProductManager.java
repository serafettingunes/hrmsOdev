package hrmsX.hrms.business.conretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return this.productDao.findAll();
	}

}
