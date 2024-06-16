package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dto.ProjectDto;
import com.project.dto.ProjectDto2;
import com.project.service.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectController {

	@Autowired
	ProjectService projectService;
	
	@PostMapping("/add")
	public ResponseEntity<String> addProject(@RequestBody ProjectDto projectDto){
		projectService.addProject(projectDto);
		return new ResponseEntity<String>("Created",HttpStatus.CREATED);
	}
	
	@PutMapping("/add/dev")
	public ResponseEntity<String> addDevInProject(@RequestBody ProjectDto projectDto){
		String res = projectService.addDevInProject(projectDto);
		return new ResponseEntity<>(res,HttpStatus.OK);
	}
	
	@GetMapping("/get/dev/projects/{id}")
	List<ProjectDto2> getDevProjects(@PathVariable int id){
		List<ProjectDto2> projectDtos = projectService.getDevProjects(id);
		return projectDtos;
	}
}
