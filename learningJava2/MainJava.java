package learningJava2;

import java.util.ArrayList;

public class MainJava {

    public static void main(String[] args) {
        /*
        // number integer = 1000, 23423423, 255, 120, 1, 9989809798797
        byte => 1 byte => -128 to 127    
        short => 2 byte => -32768 to 32767
        int => 4 byte => -2147483648 to 2147483647      
        long => 8 byte => -9223372036854775808 to 9223372036854775807
        // number decimal = 1.5, 
        float => 4 byte => 1.4E-45 to 3.4028235E38 simples precision
        double => 8 byte => 4.9E-324 to 1.7976931348623157E308 double precision 
        // string = represent text and phase, "Hello World", "Java is fun"
        String => 2 byte per character => "Hello World" => 11 characters =>
        char => 2 byte => 'A', 'B', 'C', '1', '2', '3'
        boolean => 1 byte => true or false
        int[] colecaoDeInteiros = {1, 2, 3, 4, 5};
        int[] meusNumeros = new int
        ArrayList<String> minhaLista = new ArrayList<>();
        minhaLista.add("Hello");
        */

        byte b = 100;
        short s = 10000;
        int i = 1000000;
        long l = 1000000000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        String str = "Cleber";
        boolean bool = true;
        int[] colecaoDeInteiros = new int[5];
        ArrayList<String> minhaLista = new ArrayList<>();
        
        Carro meuCarro1 = new Carro("Sedan");
        Carro meuCarro2 = new Carro("SUV");
        Carro meuCarro3 = new Carro("Hatch");

        meuCarro1.acelerar();
        meuCarro2.acelerar();
        meuCarro3.acelerar();

        String result1 = meuCarro1.acelerar1();
        String result2 = meuCarro2.acelerar1();
        String result3 = meuCarro3.acelerar1();

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        /*Conditional */
        if(bool) {
            System.out.println("Condition is true");
        } else {
            System.out.println("Condition is false");   
        }
        minhaLista.add("Cleber");
        minhaLista.add("Giseli");
        minhaLista.add("Clara");
        System.out.println(colecaoDeInteiros[0]);
        System.out.println(colecaoDeInteiros.length);
        System.out.println(minhaLista.get(0));
        minhaLista.remove(0);

        for(int num = 0; num < minhaLista.size(); num++) {
            System.out.println(minhaLista.get(num));
        }

        for(int numi = 0; numi < colecaoDeInteiros.length; numi++) {
            System.out.println(colecaoDeInteiros[numi]);
        }

        for(int numi = 0; numi < colecaoDeInteiros.length; numi++) {
            System.out.println(colecaoDeInteiros[numi]);
        }

        for(int number : colecaoDeInteiros) {
            System.out.println(number);
        }

        int count = 0;
        while(count < 5) {
            System.out.println("Count: " + count);
            count++;

        }

        double result = 0.0;
        int resultInt = (int) result; // Explicit casting
        System.out.println("Result: " + result);
        System.out.println("Result as int: " + resultInt);

        int myInt = 100;
        double myDouble = myInt; // Implicit casting
        System.out.println("My int: " + myInt);
        System.out.println("My double: " + myDouble);

        String myString = "10";
        int myStringInt = Integer.parseInt(myString); // Converting string to integer
        System.out.println("My string as int: " + myStringInt);

        String myString2 = String.valueOf(myInt); // Converting integer to string
        System.out.println("My int as string: " + myString2);

    }
}