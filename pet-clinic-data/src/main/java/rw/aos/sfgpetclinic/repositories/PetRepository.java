package rw.aos.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import rw.aos.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
