package com.berktas.blogApi.mapper;

import com.berktas.blogApi.dto.TagDto;
import com.berktas.blogApi.model.Tag;
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
public class TagMapperImpl implements TagMapper {

    @Override
    public TagDto entityToDto(Tag entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        String name = null;

        id = entity.getId();
        name = entity.getName();

        TagDto tagDto = new TagDto( id, name );

        return tagDto;
    }

    @Override
    public List<TagDto> entityListToDtoList(List<Tag> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TagDto> list = new ArrayList<TagDto>( entityList.size() );
        for ( Tag tag : entityList ) {
            list.add( entityToDto( tag ) );
        }

        return list;
    }
}
