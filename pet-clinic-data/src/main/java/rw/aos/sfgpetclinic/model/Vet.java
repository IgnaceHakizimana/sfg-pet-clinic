package rw.aos.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : Ignace
 * @date : Mon, 7/13/2020
 **/
public class Vet extends Person{
    private Set<Speciality> specialities = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
