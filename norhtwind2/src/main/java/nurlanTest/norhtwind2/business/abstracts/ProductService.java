package nurlanTest.norhtwind2.business.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import nurlanTest.norhtwind2.core.utilities.results.DataResult;
import nurlanTest.norhtwind2.core.utilities.results.Result;
import nurlanTest.norhtwind2.entities.concretes.Product;
import nurlanTest.norhtwind2.entities.dtos.ProductWithCategoryDto;

public interface ProductService {

	DataResult<List<Product>> getAll();
	
	DataResult<List<Product>> getAll(int pageNo, int pageSize);
	
	DataResult<List<Product>> getAllSorted();
	
	Result add(Product product);
	
	DataResult<Product> getByProductName(String productName);
	
	DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);
	
	DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId);
	
	DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories);
	
	DataResult<List<Product>> getByProductNameContains(String productName);
	
	DataResult<List<Product>> getByProductNameStartsWith(String productName);
	
	DataResult<List<Product>> getByNameAndCategory(String productName,Integer categoryId);
	
	DataResult<List<ProductWithCategoryDto>> getProductWithCategorDto();
}
