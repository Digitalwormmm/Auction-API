package com.didgitalworm.AuctionApi.service;

import com.didgitalworm.AuctionApi.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoriesService {
    private final ProductRepository productRepository;
}
