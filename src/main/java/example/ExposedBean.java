package example;

import io.micronaut.context.annotation.Prototype;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Prototype
public class ExposedBean {

    private static final Logger logger = LoggerFactory.getLogger(ExposedBean.class);

    public ExposedBean() {
        logger.info("Creating instance");
    }

    public void operation(String arg) {
        System.out.println("Executing operation " + arg);
    }
}
