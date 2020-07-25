package rw.aos.sfgpetclinic.services;

import rw.aos.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
    Owner findById(Long id);
}
