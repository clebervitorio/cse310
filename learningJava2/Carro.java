package learningJava2;

/* contrutor é um metodo especial da classe */
/* Class possuem métodos e atributos */
/* Atributos são como variáveis da class */
/* Metodos são funções da class */
public class Carro {

    String modelo;

    public static void main(String[] args) {
        System.out.println("Teste");
    }

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    // Método sem retorno
    public void acelerar() {
        System.out.println("O carro " + this.modelo + " está acelerando!");
    }

    // Método com retorno
    public String acelerar1() {
        System.out.println("O carro " + this.modelo + " está acelerando!");
        return "Aceleração completa";
    }
}

//Modificadores de acesso: public, private, protected
//Encapsulamento: esconder detalhes internos da classe e fornecer métodos públicos para acessar e modificar os dados
//Herança: permite criar uma nova classe que herda os atributos e métodos de uma classe existente
//Polimorfismo: permite que objetos de diferentes classes sejam tratados como objetos da mesma classe através de uma interface comum