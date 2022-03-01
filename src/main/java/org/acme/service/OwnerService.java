package org.acme.service;

import org.acme.model.Address;
import org.acme.model.Owner;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@ApplicationScoped
public class OwnerService {

    @Inject
    EntityManager em;

    public Owner addOwner(Owner owner) {

        em.persist(owner);
        return owner;

    }

    public List listOwners() {

        return em.createQuery("SELECT o FROM Owner o")
                .getResultList();

    }


}
