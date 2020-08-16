package rw.aos.sfgpetclinic.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author : Ignace
 * @date : Mon, 7/13/2020
 **/
@Entity
@Table(name = "types")
public class PetType extends BaseEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PetType{" +
                "name='" + name + '\'' +
                '}';
    }
}
