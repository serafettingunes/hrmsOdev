package hrmsX.hrms.business.abstracts;

import java.util.List;

import hrmsX.hrms.entities.conretes.Product;

public interface ProductService {
    List<Product> getAll();
}
