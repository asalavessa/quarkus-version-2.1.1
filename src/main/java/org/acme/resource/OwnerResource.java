package org.acme.resource;

import org.acme.model.Address;
import org.acme.model.Owner;
import org.acme.service.OwnerService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/owner")
public class OwnerResource {

    @Inject
    OwnerService ownerService;



    @POST
    @Path("/addowner")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addOwner(Owner owner){

        ownerService.persistOwner(owner);

        return Response.ok(owner).build();
    }


}
