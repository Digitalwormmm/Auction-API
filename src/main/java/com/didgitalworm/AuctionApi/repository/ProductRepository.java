package com.didgitalworm.AuctionApi.repository;

import com.didgitalworm.AuctionApi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
