package com.didgitalworm.AuctionApi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuctionDto {
    private String name;
    private String discription;
    private Timestamp start_now;
    private Timestamp stop_now;
    private LocalDate start_date;
    private LocalDate end_date;
    private int start_price;
    private int reserve_price;
}
