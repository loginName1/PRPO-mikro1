package si.fri.prpo.polnilnepostaje.katalogpostaj.api.v1.viri;

import com.kumuluz.ee.configuration.utils.ConfigurationUtil;
import si.fri.prpo.polnilnepostaje.katalogpostaj.api.v1.dtos.Postaja;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.*;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Logger;

@ApplicationScoped
@Path("katalog")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PostajeVir {

    private List<Postaja> postaje = null;
    private Client httpCLient;
    private String baseUrl;
    private Logger log = Logger.getLogger(this.getClass().getName());
    @PostConstruct
    private void init() {
        httpCLient = ClientBuilder.newClient();
        baseUrl = ConfigurationUtil.getInstance()
                .get("integrations.polnilnepostaje.base-url")
                .orElse("http://localhost:8080/v1");
    }

    @GET
    public Response pridobiPostaje() {
        try {
            postaje = httpCLient
                    .target(baseUrl + "/postaje/")
                    .request(MediaType.APPLICATION_JSON)
                    .get(new GenericType<List<Postaja>>(){
                    });
        } catch (Exception e) {
            log.severe(e.getMessage());
        }
        return Response
                .status(Response.Status.OK).entity(postaje)
                .build();
    }

    @POST
    public Response posodobiPostaje(Postaja postaja) {
        postaje.add(postaja);
        return Response.ok().build();
    }
}
