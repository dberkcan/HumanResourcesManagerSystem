package kodlamaio.hrms.core.utilities.verificationtool;

import java.util.UUID;


public class CodeGenerator {
    public static String generateUuidCode() {
        return UUID.randomUUID().toString();
    }
}
