package nurlanTest.norhtwind2.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import nurlanTest.norhtwind2.business.abstracts.ProductService;
import nurlanTest.norhtwind2.core.utilities.results.DataResult;
import nurlanTest.norhtwind2.core.utilities.results.Result;
import nurlanTest.norhtwind2.entities.concretes.Product;
import nurlanTest.norhtwind2.entities.dtos.ProductWithCategoryDto;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

	private ProductService productService;
	
	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall")
	public DataResult<List<Product>> getAll(){
		
		return  this.productService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Product product) {
		
		return this.productService.add(product);
	}
	
	@GetMapping("/getByProductName")
	public DataResult<Product> getByProductName(@RequestParam String productName){
		
		return productService.getByProductName(productName);
	}
	
	
	@GetMapping("/getByProductNameAndCategoryId")
	DataResult<Product> getByProductNameAndCategoryId(@RequestParam("productName") String productName, @RequestParam("categoryId") int categoryId){
			
		return this.productService.getByProductNameAndCategoryId(productName, categoryId);
	}
	
	@GetMapping("/getByProductNameContains")
	public DataResult<List<Product>> getByProductNameContains(@RequestParam String productName) {
		
		return this.productService.getByProductNameContains(productName);
	}
	
	@GetMapping("/getallByPage")
	public DataResult<List<Product>> getAll(int pageNo, int pageSize){
		
		return this.productService.getAll(pageNo-1, pageSize);
	}
	
	@GetMapping("/getAllDSC")
	DataResult<List<Product>> getAllSorted(){
		
		return this.productService.getAllSorted();
	}
	
	
	@GetMapping("/getProductWithCategorDto")
	public DataResult<List<ProductWithCategoryDto>> getProductWithCategorDto(){
		return this.productService.getProductWithCategorDto();
	}
	
	
}
