package com.example.demo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;


@SpringBootTest
class DemoApplicationTests {
private static final PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>(DockerImageName.parse("postgres:14"));

    static {
        postgres.start();
    }
	@Test
	void contextLoads() {
		//Response response = RestAssured.get("http://localhost:8080/api/v1/student");
       // response.getStatusCode();
		//response.getTime();
        System.out.println("JDBC URL: " + postgres.getJdbcUrl());
        System.out.println("Username: " + postgres.getUsername());
        System.out.println("Password: " + postgres.getPassword());
	}

}
