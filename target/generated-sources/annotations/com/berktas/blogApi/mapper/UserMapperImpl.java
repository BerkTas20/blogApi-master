package com.berktas.blogApi.mapper;

import com.berktas.blogApi.dto.UserDto;
import com.berktas.blogApi.enums.Role;
import com.berktas.blogApi.model.User;
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
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto entityToDto(User entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        String firstName = null;
        String lastName = null;
        String username = null;
        String phone = null;
        String email = null;
        String password = null;
        Role role = null;

        id = entity.getId();
        firstName = entity.getFirstName();
        lastName = entity.getLastName();
        username = entity.getUsername();
        phone = entity.getPhone();
        email = entity.getEmail();
        password = entity.getPassword();
        role = entity.getRole();

        UserDto userDto = new UserDto( id, firstName, lastName, username, phone, email, password, role );

        return userDto;
    }

    @Override
    public List<UserDto> entityListToDtoList(List<User> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<UserDto> list = new ArrayList<UserDto>( entityList.size() );
        for ( User user : entityList ) {
            list.add( entityToDto( user ) );
        }

        return list;
    }
}
