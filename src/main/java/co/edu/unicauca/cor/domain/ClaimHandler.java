package co.edu.unicauca.cor.domain;

/**
 * Abstracción o API de reclamos 
 *
 * @author Jhonny Rosero, Jhonfer Ruiz
 */
public abstract class ClaimHandler {

    private ClaimHandler nextHandler;
    private String email;

    public ClaimHandler(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public abstract boolean attend(Claim request);

    public ClaimHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(ClaimHandler handler) {
        nextHandler = handler;
    }
}
