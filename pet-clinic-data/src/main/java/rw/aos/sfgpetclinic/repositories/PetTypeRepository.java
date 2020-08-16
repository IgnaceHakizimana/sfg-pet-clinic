package rw.aos.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import rw.aos.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository <PetType,Long> {
}
