package org.example.repository;

import org.example.entities.Note;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface NoteRepository extends CassandraRepository<Note, UUID> {
}
