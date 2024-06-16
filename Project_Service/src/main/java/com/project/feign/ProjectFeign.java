package com.project.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "DEV-SERVICE")
public interface ProjectFeign {

	@GetMapping("/dev/get/dev/id/{id}")
	int getDevId(@PathVariable("id") int devId);

	
}
