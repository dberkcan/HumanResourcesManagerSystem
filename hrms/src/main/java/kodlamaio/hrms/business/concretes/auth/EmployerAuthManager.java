package kodlamaio.hrms.business.concretes.auth;

import kodlamaio.hrms.business.abstracts.ActivationCodeService;
import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.business.abstracts.auth.CandidateAuthService;
import kodlamaio.hrms.business.abstracts.auth.EmployerAuthService;
import kodlamaio.hrms.business.constant.Messages;
import kodlamaio.hrms.business.validationRules.AuthValidatorService;
import kodlamaio.hrms.core.utilities.business.BusinessEngine;
import kodlamaio.hrms.core.utilities.email.EmailSenderService;
import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.core.utilities.verificationtool.CodeGenerator;
import kodlamaio.hrms.entities.abstracts.User;
import kodlamaio.hrms.entities.concretes.ActivationCode;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.dtos.RegisterForCandidateDto;
import kodlamaio.hrms.entities.dtos.RegisterForEmployerDto;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class EmployerAuthManager extends UserAuthManager<RegisterForEmployerDto, Employer>implements EmployerAuthService {

    public EmployerAuthManager(AuthValidatorService authValidatorService, UserService<Employer> userService, ActivationCodeService activationCodeService, EmailSenderService emailSenderService) {
        super(authValidatorService, userService, activationCodeService, emailSenderService);
    }

    @Override
    public Employer newUserInstance(RegisterForEmployerDto registerForEmployerDto) {
        return new Employer(registerForEmployerDto.getCompanyName(), registerForEmployerDto.getWebAdress(), registerForEmployerDto.getPhoneNumber(), registerForEmployerDto.getEmail(), registerForEmployerDto.getPassword());
    }
}
