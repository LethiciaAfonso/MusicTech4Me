package com.musictech4me.repository;

import com.musictech4me.model;

import org.springframework.data.mongdb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends MongoRepository<music, String> {

}
