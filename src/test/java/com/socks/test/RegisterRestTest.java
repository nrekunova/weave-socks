package com.socks.test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import org.testng.annotations.Test;

public class RegisterRestTest {
        static  {
            RestAssured.baseURI = "http://167.172.110.35/";
            RestAssured.port = 80;
            RestAssured.defaultParser = Parser.JSON;
        }

        @Test
        public void postRegistrationTest() {
            Pojo regi = new Pojo();
            regi.setUserName("testName");
            regi.setFirstName("testFirstName");
            regi.setLastName("testLastName");
            regi.setEmail("test@gmai.com");
            regi.setPassword("testPassword");
            RestAssured.given()
                    .contentType(ContentType.JSON)
                    .body(regi)
                    .log().all()
                    .post("/register")
                    .then()
                    .log().all()
                    .statusCode(200);
        }

}
