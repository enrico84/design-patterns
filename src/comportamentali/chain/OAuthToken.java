package comportamentali.chain;

public class OAuthToken implements AuthProvider {

    @Override
    public boolean checkToken(Object token) {
        if(token == null) {
            return false;
        } 
        return true;
    }
    
}
