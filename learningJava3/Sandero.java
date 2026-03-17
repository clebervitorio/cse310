package learningJava3;

public class Sandero implements Carro {
    final int velocidadeMaxima = 150;

    public int velocidadeAtual = 0;

    @Override
    public void acelerar() {
        if (this.velocidadeAtual < this.velocidadeMaxima) {
            this.velocidadeAtual += 10;
            System.out.println("Velocidade atual: " + this.velocidadeAtual + " km/h");
        } else {
            System.out.println("Velocidade máxima atingida!");
        }
    }

    @Override
    public void frear() {
        System.out.println("Freando o Sandero...");
    }

    @Override
    public void parar() {
        System.out.println("Parando o Sandero...");
    }

}
