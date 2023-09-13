package comportamentali.chain;

public abstract class Authentication {

    public Authentication nextProcessor;
    
    // standard constructors
    public Authentication(Authentication nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public abstract boolean isAuthorized(AuthProvider authProvider);
    
}
