package org.example.repository;

import org.example.entities.Subspace;
import org.example.entities.User;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface SubspaceRepository extends CassandraRepository<Subspace, UUID> {
}

