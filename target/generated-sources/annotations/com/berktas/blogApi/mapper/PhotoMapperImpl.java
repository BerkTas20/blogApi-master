package com.berktas.blogApi.mapper;

import com.berktas.blogApi.dto.PhotoDto;
import com.berktas.blogApi.model.Photo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-09T01:19:44+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.17 (Microsoft)"
)
@Component
public class PhotoMapperImpl implements PhotoMapper {

    @Override
    public PhotoDto entityToDto(Photo entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        byte[] data = null;

        id = entity.getId();
        byte[] data1 = entity.getData();
        if ( data1 != null ) {
            data = Arrays.copyOf( data1, data1.length );
        }

        PhotoDto photoDto = new PhotoDto( id, data );

        return photoDto;
    }

    @Override
    public List<PhotoDto> entityListToDtoList(List<Photo> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PhotoDto> list = new ArrayList<PhotoDto>( entityList.size() );
        for ( Photo photo : entityList ) {
            list.add( entityToDto( photo ) );
        }

        return list;
    }
}
