package com.berktas.blogApi.service.impl;

import com.berktas.blogApi.dto.PopularPostDto;
import com.berktas.blogApi.repository.PostRepository;
import com.berktas.blogApi.service.PopularPostService;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PopularPostServiceImpl implements PopularPostService {
    private final PostRepository postRepository;

    public PopularPostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }


    @Override
    public List<PopularPostDto> popular(int limit) {
        return postRepository.findPopularPosts(PageRequest.of(0, limit));
    }
}
