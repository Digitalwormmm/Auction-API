package com.didgitalworm.AuctionApi.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Table(name = "auction")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Auction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private  String name;
    private String discription;
    private Timestamp start_now ;
    private Timestamp stop_now;
    private LocalDate start_date;
    private LocalDate end_date;
    private int  start_price;
    private int  reserve_price;
}
