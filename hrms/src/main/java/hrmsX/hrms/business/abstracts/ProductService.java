package hrmsX.hrms.business.abstracts;

import java.util.List;

import hrmsX.hrms.Core.utilies.result.DataResult;
import hrmsX.hrms.Core.utilies.result.result;
import hrmsX.hrms.entities.conretes.Product;

public interface ProductService {
   DataResult<List<Product>>  getAll();
   result add(Product product);
}
