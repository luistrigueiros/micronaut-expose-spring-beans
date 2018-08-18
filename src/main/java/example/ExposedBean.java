package example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Singleton;

@Singleton
public class ExposedBean {

    private static final Logger logger = LoggerFactory.getLogger(ExposedBean.class);

    public ExposedBean() {
        logger.info("Creating instance");
    }

    public void operation(String arg) {
        System.out.println("Executing operation " + arg);
    }
}
