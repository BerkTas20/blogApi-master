package com.berktas.blogApi.mapper;

import com.berktas.blogApi.dto.CategoryDto;
import com.berktas.blogApi.model.Category;
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
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryDto entityToDto(Category entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        String title = null;
        String description = null;

        id = entity.getId();
        title = entity.getTitle();
        description = entity.getDescription();

        CategoryDto categoryDto = new CategoryDto( id, title, description );

        return categoryDto;
    }

    @Override
    public List<CategoryDto> entityListToDtoList(List<Category> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<CategoryDto> list = new ArrayList<CategoryDto>( entityList.size() );
        for ( Category category : entityList ) {
            list.add( entityToDto( category ) );
        }

        return list;
    }
}
