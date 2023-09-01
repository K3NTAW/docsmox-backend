package org.example.repository;

import org.example.entities.Team;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface TeamRepository extends CassandraRepository<Team, UUID> {
}

