package learningJava3;

import java.util.concurrent.locks.Condition;
import java.util.ArrayList;

public class MainJava {
    public static void test() {System.out.println("Testando...");}
    public static void main(String[] args) {
        Carro meuCarro = new Sandero();
        Carro meuCarro2 = new Mobi();

        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro2.acelerar();

        serVivo meuSer = new humano();
        meuSer.respirar();

        Carro meuCarroFurado = null;
        try {
            meuCarroFurado.acelerar();
        } catch (NullPointerException exception) {
            System.out.println("O carro furado não pode acelerar!");
        };
    }
}