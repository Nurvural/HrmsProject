package HrmsProject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HrmsProject.hrms.business.abstracts.JobsService;
import HrmsProject.hrms.dataAccess.abstracts.JobsDao;
import HrmsProject.hrms.entities.concretes.Jobs;

@Service
public class JobsManager implements JobsService{

	private JobsDao jobsDao;
	
	@Autowired
	public JobsManager(JobsDao jobsDao) {
		super();
		this.jobsDao = jobsDao;
	}

	@Override
	public List<Jobs> getAll() {
		
		return this.jobsDao.findAll();
	}

}
