package org.example.repository;

import org.example.entities.User;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface UserRepository extends CassandraRepository <User, UUID> {

}
