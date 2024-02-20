package com.example.demo.mapper;

import com.example.demo.entities.Person;
import com.example.demo.model.PersonDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-19T16:27:39+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.9 (Oracle Corporation)"
)
@Component
public class PersonMapperImpl implements PersonMapper {

    @Override
    public PersonDTO personToPersonDto(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonDTO personDTO = new PersonDTO();

        personDTO.setBlabla( person.getFirstName() );
        personDTO.setAge( PersonMapper.convertDateToAge( person.getBirthDate() ) );
        personDTO.setId( person.getId() );
        personDTO.setLastName( person.getLastName() );
        personDTO.setBirthDate( person.getBirthDate() );

        return personDTO;
    }

    @Override
    public Person personDtoToPerson(PersonDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Person person = new Person();

        person.setFirstName( dto.getBlabla() );
        person.setId( dto.getId() );
        person.setLastName( dto.getLastName() );
        person.setBirthDate( dto.getBirthDate() );

        return person;
    }
}
