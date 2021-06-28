package nurlanTest.norhtwind2.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="Products")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ProductID")
	private int id;
	
	//@Column(name="CategoryID")
	//private int categoryId;
	

	@Column(name="SupplierID")
	private int supplieriD;
	
	@Column(name="ProductName")
	private String productName;
	
	@Column(name="UnitPrice")
	private double unitPrice;
	
	@Column(name="UnitsInStock")
	private short unitsInStock;
	
	@Column(name="QuantityPerUnit")
	private String quantityPerUnit;
	
	@Column(name="UnitsOnOrder")
	private short unitsOnOrder;
	
	@Column(name="ReorderLevel")
	private short reorderLevel;
	
	@Column(name="Discontinued")
	private boolean discontinued;
	
	@ManyToOne()
	@JoinColumn(name="CategoryID")
	private Category category;
	
}
