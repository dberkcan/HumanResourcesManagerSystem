package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.auth.UserAuthService;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.dtos.RegisterForEmployerDto;




public interface EmployerAuthService extends UserAuthService<RegisterForEmployerDto, Employer>{
}
