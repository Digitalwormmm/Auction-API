package com.didgitalworm.AuctionApi.controller;

import com.didgitalworm.AuctionApi.dto.UserDto;
import com.didgitalworm.AuctionApi.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<String> findById(@PathVariable Long id) {
        return new ResponseEntity<>(userService.getUser(id).getUsername(), HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity<HttpStatus> createUser(@RequestBody UserDto userDto) {
        userService.saveUser(userDto);
        return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
    }
}
