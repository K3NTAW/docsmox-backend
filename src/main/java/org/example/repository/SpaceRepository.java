package org.example.repository;

import org.example.entities.Space;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface SpaceRepository extends CassandraRepository<Space, String> {
}

