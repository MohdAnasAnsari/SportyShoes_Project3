package com.sportyshoes.services;

import com.sportyshoes.exceptions.ResourceNotFound;
import com.sportyshoes.models.PurchasedProduct;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPurchasedProductService {

    // CRUD Operations
    public PurchasedProduct insertPurchasedProductInDB(PurchasedProduct product);
    public List<PurchasedProduct> getAllPurchasedProducts();
    public void updatePurchasedProductInDB(PurchasedProduct product,Long productId) throws ResourceNotFound;
    public void deletePurchasedProductInDB(Long productId);
    public PurchasedProduct getPurchasedProductInDB(Long productId) throws ResourceNotFound;
    public List<PurchasedProduct> findByCategory(String category);
    public List<PurchasedProduct> findByCustomerId(@Param("id") Long id);

}
