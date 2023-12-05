package com.maxtro.reactive.Repo;

import com.maxtro.reactive.Entity.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRepo extends ReactiveMongoRepository<User, Integer> {
}
