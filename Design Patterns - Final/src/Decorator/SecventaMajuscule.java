package Decorator;

public class SecventaMajuscule extends SecventaDecorator {
    private int index = -1;
    private String cuv = super.parcurge();

    public SecventaMajuscule(SecventaCuvant s) {
        super(s);
    }

    @Override
    public String parcurge() {
        if (this.hasNext()) {
            if (index == cuv.length() - 1) {
                cuv = super.parcurge();
                index = -1;
            }
            index++;
            return (cuv.charAt(index)+ "").toUpperCase();
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return super.hasNext() || index + 1 < cuv.length();
    }
}
