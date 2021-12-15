package pl.codecode.event.driven;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = EventDrivenConfiguration.class)
public class SpringContextTest {

    @Test
    void shouldNotThrowExceptionDuringSpringContextBootstrapping() {
    }
}