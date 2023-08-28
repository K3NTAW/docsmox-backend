package org.example.repository;

import org.example.entities.Team;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface TeamRepository extends CassandraRepository<Team, String> {
}
