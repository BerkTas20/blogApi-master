package com.berktas.blogApi.service;

import com.berktas.blogApi.dto.PopularPostDto;

import java.util.List;

public interface PopularPostService {
    List<PopularPostDto> popular(int limit);
}
