package org.example.repository;

import org.example.entities.Subspace;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface SubspaceRepository extends CassandraRepository<Subspace, String> {
}
