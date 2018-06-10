package example

import groovy.util.logging.Slf4j
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

import javax.inject.Inject

@Slf4j
@ContextConfiguration(classes = [Config])
class ConsumeBeanSpec extends Specification {
    @Inject
    ConsumerBean consumerBean

    def "should be able to do something"(){
        expect:
            consumerBean.doSomething()
    }

}
