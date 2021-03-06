package fr.bmarsaud.bingoifa.server.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("status")
@Produces(MediaType.APPLICATION_JSON)
public class StatusResource {
    @GET
    public Response getStatus() {
        return Response.ok(true).build();
    }
}
