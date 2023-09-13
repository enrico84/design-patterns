package comportamentali.chain;

public class OAuth extends Authentication {

    public OAuth(Authentication nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean isAuthorized(AuthProvider authProvider) {
        if (authProvider instanceof OAuthToken) {
            return true;
        } else if (nextProcessor != null) {
            return nextProcessor.isAuthorized(authProvider);
        }
        
        return false;
    }
}