package importSelector.config;

import importSelector.annotation.EnableMySelector;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("importSelector")
@EnableMySelector
public class ImportConfig {
}
