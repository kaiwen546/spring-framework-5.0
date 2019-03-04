package aom.conf;

import aom.annotation.EnableMapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("aom")
@EnableMapperScan
public class Appconfig {
}
