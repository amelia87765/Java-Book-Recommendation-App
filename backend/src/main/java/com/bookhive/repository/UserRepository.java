package com.bookhive.repository;

import com.bookhive.models.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends Neo4jRepository<User, String> {
    Optional<User> findByEmail(String email);

    List<User> findByIsFriendsWithEmail(String friendEmail);
}
