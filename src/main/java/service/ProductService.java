package service;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import repository.ProductRepository;

import java.util.List;
import java.util.Optional;

public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
    }

    public void saveProduct(Product product){
        productRepository.save(product);
    }

    public  void saveAllProducts(List<Product> products){
        productRepository.saveAll(products);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(String id, Product product) {
        product.setId(id);
        return productRepository.save(product);
    }

    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}
