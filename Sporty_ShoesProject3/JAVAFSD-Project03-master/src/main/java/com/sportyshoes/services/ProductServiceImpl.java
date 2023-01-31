package com.sportyshoes.services;

import com.sportyshoes.exceptions.ResourceNotFound;
import com.sportyshoes.models.Product;
import com.sportyshoes.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService  {

    @Autowired
    private ProductRepository productRepo;

    @Override
    public Product insertProductInDB(Product product) {
        return productRepo.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public void updateProductInDB(Product product, Long productId) throws ResourceNotFound {
        Product existingProduct = productRepo.findById(productId).get();
        if(product != null) {
            // Update existing Product Details with new Details.
            existingProduct.setCategory(product.getCategory());
            existingProduct.setCompany(product.getCompany());
            existingProduct.setOrigin(product.getOrigin());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setTag(product.getTag());
            productRepo.save(existingProduct);
        }else {
            throw new ResourceNotFound("Product not found");
        }
    }

    @Override
    public void deleteProductInDB(Long productId) {
        productRepo.deleteById(productId);
    }

    @Override
    public Product getProductInDB(Long productId) throws ResourceNotFound {
        return productRepo.findById(productId).get();
    }
}
