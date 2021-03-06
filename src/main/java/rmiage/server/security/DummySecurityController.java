package rmiage.server.security;

import rmiage.common.interfaces.SecurityController;
import rmiage.common.security.Credential;

/**
 * A dummy security manager used for tests,
 * it always allows you to log in.
 */
public class DummySecurityController implements SecurityController {

    /**
     * Check the credential
     * @param c the credential to test.
     * @return Always true.
     */
    public boolean checkCredentials(Credential c) {
        return true;
    }

    /**
     * get the Identity
     * @return 'dummy user'
     */
    public String getIdentity(Credential credential) {
        return ("dummy user");
    }
}