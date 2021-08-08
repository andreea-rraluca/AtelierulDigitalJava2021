package Decorator;

abstract class SecventaDecorator implements Secventa {
    private final SecventaCuvant cuv;

    public SecventaDecorator(SecventaCuvant cuv) {
        this.cuv = cuv;
    }

    @Override
    public String parcurge() {
        return cuv.parcurge();
    }

    @Override
    public boolean hasNext() {
        return cuv.hasNext();
    }
}