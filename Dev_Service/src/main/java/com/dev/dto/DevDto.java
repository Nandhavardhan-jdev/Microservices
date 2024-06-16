package com.dev.dto;

import java.util.List;


public class DevDto {

	private int id;
	private String devName;
	private List<ProjectDtoForDev> projectDtos;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDevName() {
		return devName;
	}
	public void setDevName(String devName) {
		this.devName = devName;
	}
	public List<ProjectDtoForDev> getProjectDtos() {
		return projectDtos;
	}
	public void setProjectDtos(List<ProjectDtoForDev> projectDtos) {
		this.projectDtos = projectDtos;
	}
	
}
