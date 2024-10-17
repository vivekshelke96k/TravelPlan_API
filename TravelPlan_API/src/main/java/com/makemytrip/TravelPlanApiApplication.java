package com.makemytrip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.makemytrip.entity.TravelPlan;

@SpringBootApplication
public class TravelPlanApiApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(TravelPlanApiApplication.class, args);
		TravelPlan travelPlan=new TravelPlan();
		
	}

}
