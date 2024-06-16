package com.dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.dto.DevDto;
import com.dev.service.DevService;

@RestController
@RequestMapping("/dev")
public class DevController {

	@Autowired
	DevService devService;
	
	@PostMapping("/add")
	public ResponseEntity<String> addDev(@RequestBody DevDto devDto){
		devService.addDev(devDto);
		return new ResponseEntity<String>("Created",HttpStatus.CREATED);
	}
	
	@GetMapping("/get/dev/id/{id}")
	int getDevIds(@PathVariable("id") int devId){
		int resDevId = devService.getDevIds(devId);
		return resDevId;
	}
	
	@GetMapping("/get/dev/projects/{id}")
	public ResponseEntity<DevDto> getDevProjects(@PathVariable int id){
		DevDto devDto = devService.getDevProjects(id);
		return new ResponseEntity<DevDto>(devDto,HttpStatus.OK);
	}
	
}
