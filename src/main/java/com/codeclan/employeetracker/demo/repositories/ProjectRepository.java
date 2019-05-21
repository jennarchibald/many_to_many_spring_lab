package com.codeclan.employeetracker.demo.repositories;

import com.codeclan.employeetracker.demo.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
