package com.berktas.blogApi.controller;

import com.berktas.blogApi.dto.LikeDto;
import com.berktas.blogApi.service.LikeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/like")
@RequiredArgsConstructor
@Tag(name = "Like")
public class LikeController {
    private final LikeService likeService;
    @PostMapping
    public ResponseEntity<LikeDto> saveLike(
                                            @RequestParam Long userId, @RequestParam Long postId) {
        return ResponseEntity.ok(likeService.save(userId, postId));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        likeService.delete(id);
    }

    // ✅ like count
    @GetMapping("/count")
    public ResponseEntity<Long> count(@RequestParam Long postId) {
        return ResponseEntity.ok(likeService.countByPostId(postId));
    }

    // ✅ bu user bu postu like'lamış mı? -> like dto döner
    @GetMapping("/me")
    public ResponseEntity<LikeDto> myLike(@RequestParam Long userId,
                                          @RequestParam Long postId) {
        return ResponseEntity.ok(likeService.getMyLike(userId, postId));
    }

    // ✅ unlike (likeId bilmeden)
    @DeleteMapping
    public void deleteByUserAndPost(@RequestParam Long userId,
                                    @RequestParam Long postId) {
        likeService.deleteByUserIdAndPostId(userId, postId);
    }

}
