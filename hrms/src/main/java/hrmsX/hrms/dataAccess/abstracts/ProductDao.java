package hrmsX.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrmsX.hrms.entities.conretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer> {
	
	
	
	
}
