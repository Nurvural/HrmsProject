package HrmsProject.hrms.business.abstracts;

import java.util.List;

import HrmsProject.hrms.entities.concretes.Jobs;

public interface JobsService {
	
   List<Jobs> getAll();
   
}
