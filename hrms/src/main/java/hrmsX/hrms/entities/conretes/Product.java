package hrmsX.hrms.entities.conretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "iss")
@Data
public class Product {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "genelIs")
	private String genelIs;

	public Product() {

	}

	public Product(int id, String genelIs) {
		super();
		this.id = id;
		this.genelIs = genelIs;
	}

}