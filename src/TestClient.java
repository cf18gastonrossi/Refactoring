import org.junit.Test;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class TestClient {

    @Test
    public void testInforme(){
        Client client = GestorLloguersLite.CreaClient();
        assertEquals(client.informe(), "Informe de lloguers del client Gastón Rossi (X5432457H)\n" +
                "\tToyota Tote: 90.0€\n" +
                "\tCitroen C4: 195.0€\n" +
                "\tDora Light: 530.0€\n" +
                "Import a pagar: 825.0€\n" +
                "Punts guanyats: 4\n");

    }

}
