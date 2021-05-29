package kodlamaio.hrms.business.validationRules;

import kodlamaio.hrms.business.constant.Messages;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import org.springframework.stereotype.Component;

@Component
public class AuthValidator implements AuthValidatorService {
    public Result isPasswordConfirmed(String password, String confirmPassword){
        if(password.equals(confirmPassword)){
            return new SuccessResult();
        }
        return new ErrorResult(Messages.PasswordNotConfirmed);
    }
}
