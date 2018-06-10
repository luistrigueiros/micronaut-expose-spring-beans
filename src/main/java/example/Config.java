package example;

import io.micronaut.context.annotation.Prototype;
import io.micronaut.runtime.Micronaut;
import io.micronaut.spring.beans.MicronautBeanProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Config {
    @Bean
    public MicronautBeanProcessor micronautBeanProcessor() {
        //Micronaut.run(ExposedBean.class);
        return new MicronautBeanProcessor(Prototype.class);
    }
}
