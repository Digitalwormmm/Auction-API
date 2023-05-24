package com.didgitalworm.AuctionApi.repository;

import com.didgitalworm.AuctionApi.model.Auction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuctionRepository extends JpaRepository<Auction,Long> {
}
