package com.dev.service;

import java.util.List;

import com.dev.dto.DevDto;

public interface DevService {

	void addDev(DevDto devDto);

	int getDevIds(int devId);

	DevDto getDevProjects(int id);


}
