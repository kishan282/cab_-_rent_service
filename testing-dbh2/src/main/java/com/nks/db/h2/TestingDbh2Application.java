package com.nks.db.h2;

import java.sql.SQLException;

import org.h2.tools.Server;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestingDbh2Application {

	public static void main(String[] args) {
		SpringApplication.run(TestingDbh2Application.class, args);
	}
	
	@Bean(initMethod = "start", destroyMethod = "stop")
	public Server inMemoryH2DatabaseaServer() throws SQLException {
	    return Server.createTcpServer(
	      "-tcp", "-tcpAllowOthers", "-tcpPort", "8123");
	}
	

}
