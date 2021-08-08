package Command;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Imagine imagine = new Imagine(1000, 1000, 5);
        System.out.println("Imaginea originala:\n" + imagine);
        editor.adaugaComanda(new ComandaRedimensionare());
        editor.adaugaComanda(new ComandaLuminozitate());
        editor.adaugaComanda(new ComandaDecupare());

        editor.executaComenzi(imagine);
        System.out.println("Imaginea dupa executarea comenzilor din coada:\n" + imagine);

        editor.anuleaza(imagine);
        System.out.println("Imaginea dupa anularea ultimei comenzi executate:\n" + imagine);

        editor.anuleaza(imagine);
        System.out.println("Imaginea dupa anularea ultimei comenzi executate:\n" + imagine);

        editor.reexecuta(imagine);
        System.out.println("Imaginea dupa reexecutarea ultimei comenzi:\n" + imagine);

        editor.anuleaza(imagine);
        editor.anuleaza(imagine);
        editor.anuleaza(imagine);
        editor.anuleaza(imagine);
        editor.anuleaza(imagine);
        System.out.println("Imaginea dupa anularea tuturor comenzilor:\n" + imagine);
    }
}