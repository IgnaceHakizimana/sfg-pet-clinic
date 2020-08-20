package rw.aos.sfgpetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.MappedSuperclass;

/**
 * @author : Ignace
 * @date : Mon, 7/13/2020
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity {
    public String firstName;
    public String lastName;

    public Person(Long id, String firstName, String lastName) {
        super(id);
        this.firstName=firstName;
        this.lastName=lastName;
    }
}
