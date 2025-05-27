package com.example.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.workshopmongo.domain.Post;
import com.example.workshopmongo.domain.User;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{


}
