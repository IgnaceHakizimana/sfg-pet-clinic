package rw.aos.sfgpetclinic.model;

import java.util.Set;

/**
 * @author : Ignace
 * @date : Mon, 7/13/2020
 **/
public class Owner extends Person {
    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
