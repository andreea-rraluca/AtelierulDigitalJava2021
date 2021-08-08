package Command;

public class ComandaRedimensionare implements Comanda{

    @Override
    public void executa(Imagine imagine) {
        imagine.marire();
    }

    @Override
    public void anuleaza(Imagine imagine) {
        imagine.micsorare();
    }

}
