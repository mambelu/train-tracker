package com.example.meronambelucloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MeronAmbeluCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeronAmbeluCloudConfigServerApplication.class, args);
	}

}
