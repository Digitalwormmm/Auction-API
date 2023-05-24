package com.didgitalworm.AuctionApi.service;

import com.didgitalworm.AuctionApi.repository.AuctionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuctionService {
    private final AuctionRepository auctionRepository;
}
