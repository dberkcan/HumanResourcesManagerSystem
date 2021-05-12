package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entties.concretes.JobPosition;

public interface JobPositionService {
	
	List<JobPosition> getAll();

}
