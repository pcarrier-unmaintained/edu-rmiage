package rmiage.common.security;

public class InvalidCredentialException extends RuntimeException {
    @Override
    public String toString() {
        return "Invalid credentials!";
    }

}