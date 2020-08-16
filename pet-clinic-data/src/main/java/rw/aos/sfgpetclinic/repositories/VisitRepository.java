package rw.aos.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import rw.aos.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
