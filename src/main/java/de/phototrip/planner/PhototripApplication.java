package de.phototrip.planner;

import de.phototrip.planner.controller.PhotoTripController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = PhotoTripController.class)
public class PhototripApplication {

    private static final Logger log = LoggerFactory.getLogger(PhototripApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(PhototripApplication.class, args);
    }


   /* @Bean
    public CommandLineRunner demo(TripRepository repository) {
        return (args) -> {

            Timestamp norwayStartDate = Timestamp.valueOf("2015-05-01 00:00:00");
            norwayStartDate.setTime(new Date().getTime());

            Timestamp norwayEndDate = Timestamp.valueOf("2015-05-15 00:00:00");
            norwayEndDate.setTime(new Date().getTime());

            Timestamp irelandStartDate = Timestamp.valueOf("2016-07-03 00:00:00");
            irelandStartDate.setTime(new Date().getTime());

            Timestamp irelandEndDate = Timestamp.valueOf("2016-07-13 00:00:00");
            irelandEndDate.setTime(new Date().getTime());

            // save a couple of customers
            repository.save(new Trip("Norway", norwayStartDate, norwayEndDate));
            repository.save(new Trip("Irland", irelandStartDate, irelandEndDate));


            // fetch all customers
            log.info("Trip found with findAll():");
            log.info("-------------------------------");
            for (Trip trip : repository.findAll()) {
                log.info(trip.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            Trip trip = repository.findOne(1L);
            log.info("Trip found with findOne(1L):");
            log.info("--------------------------------");
            log.info(trip.toString());
            log.info("");

            // fetch customers by last name
            log.info("Trip found with findByCountry('Norway'):");
            log.info("--------------------------------------------");
            for (Trip norway : repository.findByCountry("Norway")) {
                log.info(norway.toString());
            }
            log.info("");
        };
    }*/
}
