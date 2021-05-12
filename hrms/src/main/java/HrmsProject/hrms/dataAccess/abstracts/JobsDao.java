package HrmsProject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HrmsProject.hrms.entities.concretes.Jobs;

public interface JobsDao extends JpaRepository<Jobs, Integer>{

}
