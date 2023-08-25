package org.example;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.CqlSessionBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetSocketAddress;

public class CassandraConnector {
    private static final Logger logger = LoggerFactory.getLogger(CassandraConnector.class);

    public static void main(String[] args) {
        // Cassandra Cluster contact points
        InetSocketAddress contactPoint = new InetSocketAddress("localhost", 9042);

        try (CqlSession session = CqlSession.builder()
                .addContactPoint(contactPoint)
                .withLocalDatacenter("datacenter1")
                .build()) {
            logger.info("Connected to Cassandra");
            // API routes
        } catch (Exception e) {
            logger.error("Error connecting to Cassandra", e);
        }
    }
}
