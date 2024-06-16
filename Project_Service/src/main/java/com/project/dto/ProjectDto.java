package com.project.dto;

import java.util.List;


public class ProjectDto {

	private int id;
	private String projectName;
	private List<Integer> devIds;
	private int devId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public List<Integer> getDevIds() {
		return devIds;
	}
	public void setDevIds(List<Integer> devIds) {
		this.devIds = devIds;
	}
	public int getDevId() {
		return devId;
	}
	public void setDevId(int devId) {
		this.devId = devId;
	}
	
}
