public class CinemaBuilder {
    private Cinema cinema;

    public CinemaBuilder() {
        cinema = new Cinema();
    }

    public Cinema build() {
        if (cinema.getPoltrona() == 0) {
            throw new IllegalArgumentException("Pedido inválido, a Poltrona é obrigatória.");
        }
        return cinema;
    }

    public CinemaBuilder setPoltrona(int poltrona) {
        cinema.setPoltrona(poltrona);
        return this;
    }

    public CinemaBuilder setPipoca(String pipoca) {
        cinema.setPipoca(pipoca);
        return this;
    }

    public CinemaBuilder setBebida(String bebida) {
        cinema.setBebida(bebida);
        return this;
    }
}
