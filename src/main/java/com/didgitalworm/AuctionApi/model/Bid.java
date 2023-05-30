package com.didgitalworm.AuctionApi.model;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "bid")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Bid {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private double amount;
    @OneToOne
    @JoinColumn(name = "auction_id",updatable = false,insertable = false)
    private Auction auction;
}
