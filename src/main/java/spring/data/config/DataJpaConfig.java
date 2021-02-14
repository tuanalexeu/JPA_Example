package spring.data.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = {"spring.data"})
@EnableJpaRepositories(basePackages = {"spring.data.repository"})
@EnableJpaAuditing(auditorAwareRef = "auditorAwareBean")
public class DataJpaConfig {

}
