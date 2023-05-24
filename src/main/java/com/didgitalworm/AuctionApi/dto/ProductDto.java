package com.didgitalworm.AuctionApi.dto;

import com.didgitalworm.AuctionApi.model.Categories;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

    private String title;
    private String description;
    @ManyToOne()
    @JoinColumn(name="category_id", referencedColumnName = "id")
    private Categories category;
    private String image_url;
    private long user_id;
}
