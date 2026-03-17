package learningJava3;

public class Mobi implements Carro {
    @Override
    public void acelerar() {
        System.out.println("Acelerando o Mobi a 30 km/h...");
    }

    @Override
    public void frear() {
        System.out.println("Freando o Mobi...");
    }

    @Override
    public void parar() {
        System.out.println("Parando o Mobi...");
    }

}
