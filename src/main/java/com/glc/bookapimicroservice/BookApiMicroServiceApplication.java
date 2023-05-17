package com.glc.bookapimicroservice;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BookApiMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookApiMicroServiceApplication.class, args);
	}

	// @RabbitListener(queues = "hello")
	// public class TutReceiver {
	// 	@RabbitHandler
	// 	public void receive(String in){
	// 		System.out.println(" [x] Received '"+in+"'");
	// 	}
	// }





	@RabbitListener(queues = "hello")
    private void reciever(String in) throws Exception{
			System.out.println(" [x] Received '"+in+"'");
    }
	



}
