package learningJava3;

public class humano extends serVivo {
    public humano() {
        super(42);
    }

    @Override
    public void respirar() {
        System.out.println(this.idade);
        System.out.println("Respirando...");
    }

}
