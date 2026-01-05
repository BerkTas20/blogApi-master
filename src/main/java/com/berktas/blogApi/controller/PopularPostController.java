package com.berktas.blogApi.controller;

import com.berktas.blogApi.dto.PopularPostDto;
import com.berktas.blogApi.service.PopularPostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PopularPostController {

    private final PopularPostService popularPostService;

    public PopularPostController(PopularPostService popularPostService) {
        this.popularPostService = popularPostService;
    }

    @GetMapping("/popular")
    public List<PopularPostDto> popular(@RequestParam(defaultValue = "5") int limit) {
        return popularPostService.popular(limit);
    }
}
