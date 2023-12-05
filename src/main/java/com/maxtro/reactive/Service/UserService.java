package com.maxtro.reactive.Service;

import com.maxtro.reactive.Entity.User;
import com.maxtro.reactive.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;


    public Mono<User> getUserById(int id) {
        return userRepo.findById(id);
    }
}
