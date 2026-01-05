package com.berktas.blogApi.mapper;

import com.berktas.blogApi.core.mapper.BaseMapper;
import com.berktas.blogApi.dto.PostDto;
import com.berktas.blogApi.model.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface PostMapper extends BaseMapper<PostDto, Post> {

    @Override
    @Named("entityToDto")
    @Mapping(target = "categoryId", source = "category.id")
    @Mapping(target = "categoryTitle", source = "category.title")
    PostDto entityToDto(Post post);
}
