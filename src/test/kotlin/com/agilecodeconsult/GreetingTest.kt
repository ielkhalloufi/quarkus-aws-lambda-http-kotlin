package com.agilecodeconsult

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

@QuarkusTest
class GreetingTest {
    @Test
    fun testJaxrs() {
        RestAssured.`when`().get("/hello").then()
                .contentType("text/plain")
                .body(equalTo("hello jaxrs, I love apples"))
    }

}
