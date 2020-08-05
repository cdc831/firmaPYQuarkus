package net.sytes.cantero.firma;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class indexController {

    @GET
    public List<schemaFirma> list() {
        return schemaFirma.listAll();
    }


    @POST
    @Transactional
    public void guardardato(schemaFirma objFirma) {
        schemaFirma.persist(objFirma);
    }
}