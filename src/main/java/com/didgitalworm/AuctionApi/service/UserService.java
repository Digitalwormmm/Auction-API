package com.didgitalworm.AuctionApi.service;


import com.didgitalworm.AuctionApi.dto.UserDto;
import com.didgitalworm.AuctionApi.exception.EntityNotFoundException;
import com.didgitalworm.AuctionApi.model.User;
import com.didgitalworm.AuctionApi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public User getUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        return unwrapUser(user, id);
    }

    public void saveUser(UserDto userDto) {
        User user = User.builder()
                        .username(userDto.getUsername())
                                .password(userDto.getPassword()).build();
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
         userRepository.save(user);
    }

    static User unwrapUser(Optional<User> entity, Long id) {
        if (entity.isPresent()) return entity.get();
        else throw new EntityNotFoundException(id, User.class);
    }
}
