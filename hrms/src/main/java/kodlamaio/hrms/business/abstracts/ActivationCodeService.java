package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.ActivationCode;

import java.util.List;
import java.util.Optional;

public interface ActivationCodeService {
    DataResult<List<ActivationCode>> getAll();
    Result add(ActivationCode activationCode);
    Result update(ActivationCode activationCode);
    DataResult<Optional<ActivationCode>> getByUserUid(String uid);
}
