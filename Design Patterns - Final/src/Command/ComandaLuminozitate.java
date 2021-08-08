package Command;

public class ComandaLuminozitate implements Comanda {
    @Override
    public void executa(Imagine imagine) {
        imagine.crestereLuminozitate();
    }

    @Override
    public void anuleaza(Imagine imagine) {
        imagine.scadereLuminozitate();
    }
}
