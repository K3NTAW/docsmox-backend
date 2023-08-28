package org.example.repository;

import org.example.entities.Note;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface NoteRepository extends CassandraRepository<Note, String> {
}
