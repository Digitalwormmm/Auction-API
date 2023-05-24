package com.didgitalworm.AuctionApi.dto;

import jakarta.persistence.*;
import lombok.*;

import javax.validation.constraints.NotBlank;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {


    private String username;


    private String password;
}
