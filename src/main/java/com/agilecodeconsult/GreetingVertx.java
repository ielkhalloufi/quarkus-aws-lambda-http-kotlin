package com.agilecodeconsult;

import io.quarkus.vertx.web.Route;
import io.vertx.ext.web.RoutingContext;

import static io.vertx.core.http.HttpMethod.GET;

public class GreetingVertx {
    @Route(path = "/vertx/hello", methods = GET)
    void hello(RoutingContext context) {
        context.response().headers().set("Content-Type", "text/plain");
        context.response().setStatusCode(200).end("hello vertx");
    }
}
