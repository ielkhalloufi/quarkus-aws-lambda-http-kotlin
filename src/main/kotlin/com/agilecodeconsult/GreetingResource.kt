package com.agilecodeconsult

import com.agilecodeconsult.service.FruitService
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class GreetingResource {

    @Inject
    @field: ApplicationScoped
    lateinit var fruitService: FruitService

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello(): String {
        return "hello jaxrs, I love ${fruitService.taste()}"
    }
}
