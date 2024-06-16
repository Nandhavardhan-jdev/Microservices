package com.project.service;

import java.util.List;

import com.project.dto.ProjectDto;
import com.project.dto.ProjectDto2;

public interface ProjectService {

	void addProject(ProjectDto projectDto);

	String addDevInProject(ProjectDto projectDto);

	List<ProjectDto2> getDevProjects(int id);

}
