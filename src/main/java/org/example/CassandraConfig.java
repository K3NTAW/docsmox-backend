package org.example;

import com.datastax.oss.driver.api.core.CqlSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories(basePackages = {"org.example.repository"})
public class CassandraConfig {
    @Bean
    public CqlSession cqlSession() {
        return CqlSession.builder().withKeyspace("docsmoxkeyspace").build();
    }
}
