package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.auth.UserAuthService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.dtos.RegisterForCandidateDto;

public interface CandidateAuthService extends UserAuthService<RegisterForCandidateDto, Candidate>{
}
