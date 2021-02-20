package co.edu.unicauca.cor.infra;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servicios utilizados por todas las clases
 *
 * @author Jhonny Rosero, Jhonfer Ruiz
 */
public class Utilities {

    public static void sendMail(String email, String to, String body) {
        //Lógica del envio del email
        //...
        
        Logger logger= LoggerFactory.getLogger(Utilities.class); 
        
        logger.info("Email enviado a " + email);
    }


}
