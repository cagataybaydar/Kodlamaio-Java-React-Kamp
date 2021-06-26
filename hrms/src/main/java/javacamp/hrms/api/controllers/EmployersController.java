package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.EmployersService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.Employers;

@RestController
@RequestMapping("/api/employers")
@CrossOrigin
public class EmployersController {
	
	private EmployersService employersService;
	
	@Autowired
	public EmployersController(EmployersService employersService) {
		this.employersService = employersService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employers>> getAll() {

		return this.employersService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Employers employers) {
		return this.employersService.add(employers);
	}
	
	
		
}
