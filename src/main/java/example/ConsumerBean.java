package example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ConsumerBean {
    private static final Logger logger = LoggerFactory.getLogger(ConsumerBean.class);

    private final ExposedBean exposedBean;

    public ConsumerBean(ExposedBean exposedBean) {
        logger.info("Creating instance");
        this.exposedBean = exposedBean;
    }

    public void doSomething() {
        exposedBean.operation("Zzzzz");
    }
}
