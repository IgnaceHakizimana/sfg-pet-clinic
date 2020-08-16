package rw.aos.sfgpetclinic.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author : Ignace
 * @date : Mon, 7/13/2020
 **/
@Entity
@Table(name = "vets")
public class Vet extends Person{
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialities", joinColumns = @JoinColumn(name = "vet_id"), inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Speciality> specialities = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
