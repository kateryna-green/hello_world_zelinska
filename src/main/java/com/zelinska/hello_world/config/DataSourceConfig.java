package com.zelinska.hello_world.config;

import oracle.jdbc.datasource.OracleDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.sql.SQLException;


@Configuration
@PropertySource({"classpath:application.properties"})
public class DataSourceConfig {

    @Autowired
    Environment environment;

    @Bean
    public DataSource dataSource() throws SQLException {
        OracleDataSource dataSource = new oracle.jdbc.pool.OracleDataSource();
        dataSource.setUser(environment.getProperty("spring.datasource.username"));
        dataSource.setPassword(environment.getProperty("spring.datasource.password"));
        dataSource.setURL(environment.getProperty("spring.datasource.url"));
        dataSource.getConnection();
        System.out.println(environment.getProperty("spring.datasource.username"));
        return dataSource;
    }

}
