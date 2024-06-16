package com.dev.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.dto.DevDto;
import com.dev.dto.ProjectDtoForDev;
import com.dev.feign.DevFeign;
import com.dev.model.Dev;
import com.dev.repo.DevRepo;
import com.dev.service.DevService;

@Service
public class DevServiceImpl implements DevService{
	
	@Autowired
	DevRepo devRepo;
	
	@Autowired
	DevFeign devFeign;

	public void addDev(DevDto devDto) {
		Dev dev = dtoToModel(devDto);
		devRepo.save(dev);
	}

	private Dev dtoToModel(DevDto devDto) {
		Dev dev = new Dev();
		dev.setDevName(devDto.getDevName());
		return dev;
	}

	public List<Integer> getDevIds(List<Integer> devIds) {
		List<Integer> devList = new ArrayList<>();
		for (Integer devId : devIds) {
			Optional<Dev> id = devRepo.findById(devId);
			if(id.isPresent())
				devList.add(devId);
			else
				System.out.println(devId+" doesn't exists");
		}
		return devList;
	}

	public int getDevIds(int devId) {
		Optional<Dev> id = devRepo.findById(devId);
		if(id.isPresent())
			return id.get().getId();
		return 0;
	}

	public DevDto getDevProjects(int id) {
		Optional<Dev> devId = devRepo.findById(id);
		if(devId.isPresent()) {
			DevDto devDto = new DevDto();
			devDto.setId(id);
			devDto.setDevName(devId.get().getDevName());
			List<ProjectDtoForDev> projectDtos = devFeign.getDevProjects(id);
			devDto.setProjectDtos(projectDtos);
			return devDto;
		}
		else
			System.out.println(id+" doesn't exists");
		return null;
	}

	
}
