import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class CinemaTest {

    @Test
    void deveRetornarPedidoVálido() {
        CinemaBuilder cinemaBuilder = new CinemaBuilder();
        Cinema cinema = cinemaBuilder
                .setPoltrona(1)
                .setPipoca("Média")
                .setBebida("Água")
                .build();

        assertNotNull(cinema);
    }

    @Test
    void deveRetornarExcecaoPedidoInválido() {
        try {
            CinemaBuilder cinemaBuilder = new CinemaBuilder();
            Cinema cinema = cinemaBuilder
                    .setPipoca("Grande")
                    .setBebida("Refrigerante")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Pedido inválido, a Poltrona é obrigatória.", e.getMessage());
        }
    }

}
