package com.didgitalworm.AuctionApi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Future;
import java.util.Date;

@Entity
@Table(name = "auction")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Auction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long user_id;

    private Product product_id;
    private Date start_now ;
    private Date stop_now;

    private Date start_date;
    private Date end_date;

    private int  start_price;
    private int  reserve_price;
}
