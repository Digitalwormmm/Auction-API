package com.didgitalworm.AuctionApi.repository;

import com.didgitalworm.AuctionApi.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {
}
