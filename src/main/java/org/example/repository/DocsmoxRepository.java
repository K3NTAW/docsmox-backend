package org.example.repository;

import org.example.entities.NotesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DocsmoxRepository extends JpaRepository<NotesEntity, UUID> {
}
