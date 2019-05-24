import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestInformeHTML {

    @Test
    public void testInformeHTML(){
        Client client = GestorLloguersLite.CreaClient();
        assertEquals(client.informeHTML(), "<h1>Informe de lloguers</h1>\n" +
                "<p>Informe de lloguers del client <em>Gastón Rossi</em> (<strong>X5432457H</strong>)</p>\n" +
                "<table>\n" +
                "<tr><td><strong>Marca</strong></td><td><strong>Model</strong></td><td><strong>Import</strong></td></tr>     <tr><td>Toyota</td><td>Tote</td><td>180.0€</td></tr>\n" +
                "<tr><td>Citroen</td><td>C4</td><td>195.0€</td></tr>\n" +
                "<tr><td>Dora</td><td>Light</td><td>540.0€</td></tr>\n" +
                "</table>\n" +
                "<p>Import a pagar: <em>915.0€</em></p>\n" +
                "<p>Punts guanyats: <em>4</em></p>");

    }
}
