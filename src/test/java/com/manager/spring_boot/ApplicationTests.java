package com.manager.spring_boot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
class ApplicationTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    private Environment env;


	@Test
	void contextLoads() {
	}

    @Test
    void testConnection() throws Exception {
        try (Connection conn = dataSource.getConnection()) {
            assertFalse(conn.isClosed());
        }
    }

    @Test
    void printConfig() {
        System.out.println(env.getProperty("spring.datasource.url"));
    }

}
