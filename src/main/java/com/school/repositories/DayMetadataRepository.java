package com.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DayMetadataRepository extends JpaRepository<Class, UUID> {
}
