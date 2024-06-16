package com.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.Project;
import java.util.List;


@Repository
public interface ProjectRepo extends JpaRepository<Project, Integer>{

	Project findById(int id);

	List<Project> findByDevIds(int id);
}
