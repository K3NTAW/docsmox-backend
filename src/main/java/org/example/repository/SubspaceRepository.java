package org.example.repository;

import org.example.entities.Subspace;
import org.example.entities.User;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface SubspaceRepository extends CassandraRepository<Subspace, Integer> {
}

