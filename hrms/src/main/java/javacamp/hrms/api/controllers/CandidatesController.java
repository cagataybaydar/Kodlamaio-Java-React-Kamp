package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javacamp.hrms.business.abstracts.CandidatesService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.Candidates;
import javacamp.hrms.entities.dtos.CandidateCvDto;


@RestController
@RequestMapping("/api/candidates")
@CrossOrigin
public class CandidatesController {
	
	private CandidatesService candidatesService;
	
	@Autowired
	public CandidatesController(CandidatesService candidatesService) {
		super();
		this.candidatesService = candidatesService;
	}


	@GetMapping("/getAll")
	public DataResult<List<Candidates>> getAll() {

		return this.candidatesService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Candidates candidates) {
		return this.candidatesService.add(candidates);
	}
	
	@GetMapping("/getCandidateCvById")
	public DataResult<CandidateCvDto> getCandidateCvById(@RequestParam int id){
		return this.candidatesService.getCandidateCvById(id);
	}

}
