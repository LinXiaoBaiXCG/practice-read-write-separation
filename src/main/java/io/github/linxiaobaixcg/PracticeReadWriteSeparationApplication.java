package io.github.linxiaobaixcg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,JtaAutoConfiguration.class})
@MapperScan(basePackages = "io.github.linxiaobaixcg.mapper")
public class PracticeReadWriteSeparationApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeReadWriteSeparationApplication.class, args);
    }

}
