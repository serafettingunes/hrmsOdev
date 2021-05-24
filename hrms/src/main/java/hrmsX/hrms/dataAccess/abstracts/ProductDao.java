package hrmsX.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import hrmsX.hrms.entities.conretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer> {
	
	//@Query("SELECT p FROM Product p WHERE LOWER(p.name)=LOWER(:name)")
	//Product retrieveByName(@Param("name") String name);
	
	//List<Product> findByName(String name);
}
