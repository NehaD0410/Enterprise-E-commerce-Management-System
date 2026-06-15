package spring.project.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.project.entity.Product;
import spring.project.service.ProductCreateService;
import spring.project.service.ProductDeleteService;
import spring.project.service.ProductFetchAllService;
import spring.project.service.ProductFetchService;
import spring.project.service.ProductUpdateService;

@RestController
@RequestMapping("/product")
public class ProductController {

	private final ProductCreateService productCreateService;
	private final ProductUpdateService productUpdateService;
	private final ProductFetchService productFetchService;
	private final ProductFetchAllService productFetchAllService;
	private final ProductDeleteService productDeleteService;

	public ProductController(ProductCreateService productCreateService, ProductUpdateService productUpdateService,
			ProductFetchService productFetchService, ProductFetchAllService productFetchAllService,
			ProductDeleteService productDeleteService) {
		super();
		this.productCreateService = productCreateService;
		this.productUpdateService = productUpdateService;
		this.productFetchService = productFetchService;
		this.productFetchAllService = productFetchAllService;
		this.productDeleteService = productDeleteService;
	}

	@PostMapping
	public ResponseEntity<Product> createProduct(@RequestBody Product product) {
		Product savedProduct = productCreateService.addProduct(product);
		return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<Product>> getAllProduct() {
		List<Product> products = productFetchAllService.getAllProducts();
		return ResponseEntity.ok(products);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable int id) {
		Product product = productFetchService.getProductByid(id);
		return ResponseEntity.ok(product);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable int id, @RequestBody Product productDetails) {
		Product updatedProduct = productUpdateService.updateProduct(id, productDetails);
		return ResponseEntity.ok(updatedProduct);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable int id) {
		productDeleteService.DeleteProduct(id);
		return ResponseEntity.ok("Product with ID " + id + " was deleted successfully.");
	}
}