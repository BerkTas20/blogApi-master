package com.berktas.blogApi.repository;

import com.berktas.blogApi.core.repository.BaseRepository;
import com.berktas.blogApi.model.Photo;

import java.util.Optional;

public interface PhotoRepository extends BaseRepository<Photo> {
    Optional<Photo> findTopByPostIdOrderByIdDesc(Long postId);

}