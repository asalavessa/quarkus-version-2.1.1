package org.acme.service;

import org.acme.model.Address;
import org.acme.model.Owner;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Transactional
@ApplicationScoped
public class OwnerService {

    @Inject
    EntityManager em;

    public Owner addOwner(Owner owner) {

        return owner;

    }

    public void persistOwner(Owner owner) {

        em.persist(owner);
    }


}
