package com.reservationprj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ReservationprjApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservationprjApplication.class, args);
	}

}
