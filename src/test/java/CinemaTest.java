import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class CinemaTest {

    @Test
    void deveRetornarIngressoVálido() {
        CinemaBuilder cinemaBuilder = new CinemaBuilder();
        Cinema cinema = cinemaBuilder
                .setPoltrona("Poltrona 2")
                .setPipoca("Média")
                .setBebida("Água")
                .build();

        assertNotNull(cinema);
    }

}
