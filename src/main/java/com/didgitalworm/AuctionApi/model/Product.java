package com.didgitalworm.AuctionApi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="category_id", referencedColumnName = "id")
    @JsonIgnore
    private Categories category;
    private String image_url;
    private long user_id;
}
