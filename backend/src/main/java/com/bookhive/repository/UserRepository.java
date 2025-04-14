package com.bookhive.repository;

import com.bookhive.models.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends Neo4jRepository<User, String> {
    Optional<User> findByUsername(String username);

    List<User> findByIsFriendsWithUsername(String friendUsername);
}
