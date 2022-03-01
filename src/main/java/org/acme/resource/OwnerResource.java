package org.acme.resource;

import org.acme.model.Owner;
import org.acme.service.OwnerService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


@Path("/owner")
public class OwnerResource {

    @Inject
    OwnerService ownerService;



    @POST
    @Path("/addowner")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addOwner(Owner owner){

        ownerService.addOwner(owner);

        return Response.ok(owner).build();
    }

    @GET
    @Path("/listowners")
    @Produces(MediaType.APPLICATION_JSON)
    public List listOwner(){

        List ownerList = ownerService.listOwners();

        return (List) ownerList;
    }


}
