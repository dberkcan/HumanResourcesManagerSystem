package kodlamaio.hrms.business.validationRules;

import kodlamaio.hrms.business.constant.Messages;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.entities.abstracts.User;
import com.google.common.base.Strings;

public class UserValidator implements UserValidatorService {

    public Result userNullCheck(User user) {

        if (Strings.isNullOrEmpty(user.getEmail()) || Strings.isNullOrEmpty(user.getPassword())) {
            return new ErrorResult(Messages.notNull);
        }
        return new SuccessResult();
    }
}
