public class CinemaBuilder {
    private Cinema cinema;

    public CinemaBuilder() {
        cinema = new Cinema();
    }

    public Cinema build() {
        if (cinema.getPoltrona().equals("")) {
            throw new IllegalArgumentException("Pedido inválido, a Poltrona é obrigatória.");
        }
        return cinema;
    }

    public CinemaBuilder setPoltrona(String poltrona) {
        cinema.setPoltrona(poltrona);
        return this;
    }

    public CinemaBuilder setPipoca(String pipoca) {
        cinema.setPoltrona(pipoca);
        return this;
    }

    public CinemaBuilder setBebida(String bebida) {
        cinema.setPoltrona(bebida);
        return this;
    }
}
