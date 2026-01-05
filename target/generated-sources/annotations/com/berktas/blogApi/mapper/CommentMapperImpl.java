package com.berktas.blogApi.mapper;

import com.berktas.blogApi.dto.CommentDto;
import com.berktas.blogApi.model.Comment;
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
public class CommentMapperImpl implements CommentMapper {

    @Override
    public CommentDto entityToDto(Comment entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        String description = null;

        id = entity.getId();
        description = entity.getDescription();

        Long userId = null;
        String userName = null;

        CommentDto commentDto = new CommentDto( id, description, userId, userName );

        return commentDto;
    }

    @Override
    public List<CommentDto> entityListToDtoList(List<Comment> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<CommentDto> list = new ArrayList<CommentDto>( entityList.size() );
        for ( Comment comment : entityList ) {
            list.add( entityToDto( comment ) );
        }

        return list;
    }
}
