package org.example.repository;

import org.example.entities.Space;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface SpaceRepository extends CassandraRepository<Space, UUID> {
}


