package spring.jpa;

import spring.jpa.entities.Singer;
import spring.jpa.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

    private SingerService singerService;

    @Autowired
    public void setSingerService(@Qualifier("jpaSingerService") SingerService singerService) {
        this.singerService = singerService;
    }

    public static void main(String... args) {
        SpringApplication.run(JpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Singer> singers = singerService.findAll();

        for (Singer singer : singers) {
            System.out.println(singer);
        }
    }
}
