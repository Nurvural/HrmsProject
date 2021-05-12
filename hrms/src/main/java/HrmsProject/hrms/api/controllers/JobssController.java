package HrmsProject.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HrmsProject.hrms.business.abstracts.JobsService;
import HrmsProject.hrms.entities.concretes.Jobs;

@RestController
@RequestMapping("/api/jobs")
public class JobssController {
	
   private JobsService jobsService;
   
   @Autowired
   public JobssController(JobsService jobsService) {
		super();
		this.jobsService = jobsService;
	}

   @GetMapping("/getall")
   public List<Jobs> getAll(){
	  return this.jobsService.getAll();
   }
}
