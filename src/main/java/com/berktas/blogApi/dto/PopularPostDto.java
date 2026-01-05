package com.berktas.blogApi.dto;

import java.time.LocalDateTime;

public record PopularPostDto(
        Long id,
        String title,
        LocalDateTime createdDateTime,
        Long likeCount
) {}
