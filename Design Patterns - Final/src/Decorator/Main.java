package Decorator;

public class Main {
    public static void main(String[] args) {
        String text = "Ana ARE mere";
        System.out.println("Textul original: " + text);

        System.out.println("Textul separat in cuvinte:");
        SecventaCuvant secventaCuvant = new SecventaCuvant(text);
        while (secventaCuvant.hasNext())
            System.out.println(secventaCuvant.parcurge());
        System.out.println();

        System.out.println("Textul separat in litere");
        secventaCuvant = new SecventaCuvant(text);
        Secventa secventaCaracter = new SecventaCaracter(secventaCuvant);
        while (secventaCaracter.hasNext())
            System.out.println(secventaCaracter.parcurge());
        System.out.println();

        System.out.println("Textul separat in litere si cu majuscule:");
        secventaCuvant = new SecventaCuvant(text);
        Secventa secventaMajuscule = new SecventaMajuscule(secventaCuvant);
        while (secventaMajuscule.hasNext())
            System.out.println(secventaMajuscule.parcurge());
    }
}
