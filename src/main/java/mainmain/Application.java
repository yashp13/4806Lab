package mainmain; /**
 * Created by yashpatel on 1/26/2017.
 */

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    //private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    /*@Bean
    public CommandLineRunner demo(BuddyRepository repository) {
        return (args) -> {
            // save a couple of customers
            repository.save(new BuddyInfo("Jack", 123));
            repository.save(new BuddyInfo("Chloe", 456));
            repository.save(new BuddyInfo("Kim", 789));
            repository.save(new BuddyInfo("David", 549));
            repository.save(new BuddyInfo("Jack", 198));

            // fetch all buddies
            log.info("Buddies found with findAll():");
            log.info("-------------------------------");
            for (BuddyInfo buddy : repository.findAll()) {
                log.info(buddy.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            BuddyInfo buddy = repository.findOne(123);
            log.info("Buddy found with findOne(1L):");
            log.info("--------------------------------");
            log.info(buddy.toString());
            log.info("");

            // fetch customers by last name
            log.info("Buddy found with findByName('Jack'):");
            log.info("--------------------------------------------");
            for (BuddyInfo jack : repository.findByName("Jack")) {
                log.info(jack.toString());
            }
            log.info("");
        };
    }*/

}
