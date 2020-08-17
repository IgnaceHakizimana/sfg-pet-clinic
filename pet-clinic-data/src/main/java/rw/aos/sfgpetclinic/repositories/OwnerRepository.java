package rw.aos.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import rw.aos.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
