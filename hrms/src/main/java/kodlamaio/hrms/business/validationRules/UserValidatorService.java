package kodlamaio.hrms.business.validationRules;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.abstracts.User;

public interface UserValidatorService {
    Result userNullCheck(User user);
}
