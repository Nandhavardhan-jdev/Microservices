package com.project.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dto.ProjectDto;
import com.project.dto.ProjectDto2;
import com.project.feign.ProjectFeign;
import com.project.model.Project;
import com.project.repo.ProjectRepo;
import com.project.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	ProjectRepo projectRepo;

	@Autowired
	ProjectFeign projectFeign;

	public void addProject(ProjectDto projectDto) {
		Project project = dtoToModel(projectDto);
		projectRepo.save(project);

	}

	private Project dtoToModel(ProjectDto projectDto) {
		Project project = new Project();
		project.setProjectName(projectDto.getProjectName());
		return project;
	}

	public String addDevInProject(ProjectDto projectDto) {
		int devId = projectFeign.getDevId(projectDto.getDevId());
		if (devId != 0) {
			Project exProject = projectRepo.findById(projectDto.getId());
			exProject.getDevIds().add(devId);
			projectRepo.save(exProject);
			return "added";
		} else
			return "devId not found";

	}

	public List<ProjectDto2> getDevProjects(int id) {
		List<Project> projects = projectRepo.findByDevIds(id);
		List<ProjectDto2> projectDto2 = new ArrayList<>();
		for (Project project : projects) {
			ProjectDto2 projectDto = new ProjectDto2();
			projectDto.setId(project.getId());
			projectDto.setProjectName(project.getProjectName());
			projectDto2.add(projectDto);
		}
		return projectDto2;
	}

}
