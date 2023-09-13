package comportamentali.chain;

public class UsernamePassword extends Authentication {

    public UsernamePassword(Authentication nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean isAuthorized(AuthProvider authProvider) {
        if (authProvider instanceof UserPassProvider) {
            return true;
        } else if (nextProcessor != null) {
            return nextProcessor.isAuthorized(authProvider);
        }
    return false;
    }
}

