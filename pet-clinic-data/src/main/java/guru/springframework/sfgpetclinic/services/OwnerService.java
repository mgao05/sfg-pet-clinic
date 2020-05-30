package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;



public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);

    //we can delete these since they are implemented in CrudService already
//    Owner findById(Long id);
//
//    Owner save(Owner owner);
//
//    Set<Owner> findAll();
}
