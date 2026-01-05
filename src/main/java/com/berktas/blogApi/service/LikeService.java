package com.berktas.blogApi.service;

import com.berktas.blogApi.dto.LikeDto;

public interface LikeService {
    LikeDto save(Long userId, Long postId);
    void delete(Long id);

    long countByPostId(Long postId);

    LikeDto getMyLike(Long userId, Long postId);

    void deleteByUserIdAndPostId(Long userId, Long postId);
}

