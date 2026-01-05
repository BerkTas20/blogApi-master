package com.berktas.blogApi.mapper;

import com.berktas.blogApi.dto.LikeDto;
import com.berktas.blogApi.model.Like;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-05T23:28:00+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.17 (Microsoft)"
)
@Component
public class LikeMapperImpl implements LikeMapper {

    @Override
    public LikeDto entityToDto(Like entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;

        id = entity.getId();

        Long userId = null;
        Long postId = null;

        LikeDto likeDto = new LikeDto( id, userId, postId );

        return likeDto;
    }

    @Override
    public List<LikeDto> entityListToDtoList(List<Like> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<LikeDto> list = new ArrayList<LikeDto>( entityList.size() );
        for ( Like like : entityList ) {
            list.add( entityToDto( like ) );
        }

        return list;
    }
}
