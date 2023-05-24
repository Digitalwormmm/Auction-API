package com.didgitalworm.AuctionApi.dto;

import com.didgitalworm.AuctionApi.model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuctionDto {
    private long user_id;

    private Product product_id;
    private Date start_now ;
    private Date stop_now;

    private Date start_date;
    private Date end_date;

    private int  start_price;
    private int  reserve_price;
}
