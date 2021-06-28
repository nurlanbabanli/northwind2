package nurlanTest.norhtwind2.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import nurlanTest.norhtwind2.entities.concretes.Product;
import nurlanTest.norhtwind2.entities.dtos.ProductWithCategoryDto;

public interface ProductDao extends JpaRepository<Product,Integer> {

	Product getByProductName(String productName);
	
	Product getByProductNameAndCategory_categoryId(String productName, int categoryId);
	
	List<Product> getByProductNameOrCategory_categoryId(String productName, int categoryId);
	
	List<Product> getByCategoryIn(List<Integer> categories);
	
	List<Product> getByProductNameContains(String productName);
	
	List<Product> getByProductNameStartsWith(String productName);
	
	@Query("From Product where productName=:productName and categoryId=:categoryId")
	List<Product> getByNameAndCategory(String productName,Integer categoryId);
	
	@Query("Select new nurlanTest.norhtwind2.entities.dtos.ProductWithCategoryDto(p.id, p.productName, c.categoryName) From Category c Inner Join c.products p")
	List<ProductWithCategoryDto> getProductWithCategorDto();
}
