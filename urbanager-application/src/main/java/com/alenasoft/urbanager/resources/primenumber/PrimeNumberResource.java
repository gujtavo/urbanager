package com.alenasoft.urbanager.resources.primenumber;

import com.alenasoft.urbanager.api.Result;
import io.dropwizard.hibernate.UnitOfWork;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;

@Path("primo")
public class PrimeNumberResource {

    @Inject
    private PrimeNumberService service;


    @GET
    @UnitOfWork
    @Path("{num1}")
    public String sumNumbers(@PathParam("num1") int num1) {
        String data = this.service.check(num1);
        return data;
    }

}
