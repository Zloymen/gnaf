package software.perfekt.gnaf;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"software.perfekt.gnaf.controller", "software.perfekt.gnaf.service" })
@EnableJpaRepositories("software.perfekt.gnaf.dao")
@EnableAutoConfiguration
public class GnafApplication {

    public static void main(String[] args) {
        SpringApplication.run(GnafApplication.class, args);
    }


}
