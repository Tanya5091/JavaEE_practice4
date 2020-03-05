package library;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyLibraryAutoConfig {


    @Bean
    @ConditionalOnProperty(value = "my.property", havingValue = "custom")
    MyLibraryClass custom() {
        return new MyCustomLibraryClass();
    }

    @Bean
    @ConditionalOnProperty(value = "my.property", havingValue = "default", matchIfMissing = true)
    MyLibraryClass defaultComponent() {
        return new MyDefaultLibraryClass();
    }

}
