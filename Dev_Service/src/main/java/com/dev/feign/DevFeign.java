package com.dev.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dev.dto.ProjectDtoForDev;


@FeignClient("PROJECT-SERVICE")
public interface DevFeign {

	@GetMapping("/project/get/dev/projects/{id}")
	List<ProjectDtoForDev> getDevProjects(@PathVariable int id);
}
