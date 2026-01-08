package com.berktas.blogApi.mapper;

import com.berktas.blogApi.dto.PostDto;
import com.berktas.blogApi.model.Category;
import com.berktas.blogApi.model.Post;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-09T01:19:44+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.17 (Microsoft)"
)
@Component
public class PostMapperImpl implements PostMapper {

    @Override
    public List<PostDto> entityListToDtoList(List<Post> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PostDto> list = new ArrayList<PostDto>( entityList.size() );
        for ( Post post : entityList ) {
            list.add( entityToDto( post ) );
        }

        return list;
    }

    @Override
    public PostDto entityToDto(Post post) {
        if ( post == null ) {
            return null;
        }

        Long categoryId = null;
        String categoryTitle = null;
        Long id = null;
        String title = null;
        String description = null;
        LocalDateTime createdDateTime = null;
        LocalDateTime updatedDateTime = null;

        categoryId = postCategoryId( post );
        categoryTitle = postCategoryTitle( post );
        id = post.getId();
        title = post.getTitle();
        description = post.getDescription();
        createdDateTime = post.getCreatedDateTime();
        updatedDateTime = post.getUpdatedDateTime();

        PostDto postDto = new PostDto( id, title, description, createdDateTime, updatedDateTime, categoryId, categoryTitle );

        return postDto;
    }

    private Long postCategoryId(Post post) {
        if ( post == null ) {
            return null;
        }
        Category category = post.getCategory();
        if ( category == null ) {
            return null;
        }
        Long id = category.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String postCategoryTitle(Post post) {
        if ( post == null ) {
            return null;
        }
        Category category = post.getCategory();
        if ( category == null ) {
            return null;
        }
        String title = category.getTitle();
        if ( title == null ) {
            return null;
        }
        return title;
    }
}
