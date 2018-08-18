package example;

import io.micronaut.spring.beans.MicronautBeanProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.inject.Singleton;

@Configuration
@ComponentScan
public class Config {
    @Bean
    public MicronautBeanProcessor micronautBeanProcessor() {
        //Micronaut.run(ExposedBean.class);
        return new MicronautBeanProcessor(Singleton.class);
    }
}
