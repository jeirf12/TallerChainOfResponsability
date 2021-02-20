package co.edu.unicauca.cor.domain;

import co.edu.unicauca.cor.infra.Utilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Nivel de atención 1 de reclamo
 *
 * @author Jhonny Rosero, Jhonfer Ruiz
 */
public class LevelOne extends ClaimHandler {

    public LevelOne(String email) {
        super(email);
    }

    @Override
    public boolean attend(Claim claim) {
        if (claim.getType().equals(TypeEnum.BASIC)) {
            Logger logger = LoggerFactory.getLogger(Utilities.class);
            logger.info("El reclamo será atendido en el nivel 1 por " + getEmail());
            Utilities.sendMail(getEmail(), claim.getTitle(), claim.getDescription());

            claim.setAttended(true);
            return true;

        } else {
            return getNextHandler().attend(claim);
        }
    }

}
