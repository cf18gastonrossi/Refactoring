import org.junit.Test;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class TestClient {

    @Test
    public void testInforme(){
        Client client = GestorLloguersLite.CreaClient();
        assertEquals(client.informe(), "Informe de lloguers del client Gastón Rossi (X5432457H)\n" +
                "\tToyota Tote: 180.0€\n" +
                "\tCitroen C4: 195.0€\n" +
                "\tDora Light: 540.0€\n" +
                "Import a pagar: 915.0€\n" +
                "Punts guanyats: 4\n");

    }

}
