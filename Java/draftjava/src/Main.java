
//###TIPOS DE DATOS PRIMITIVOS###

//--Enteros--

//"int" = -2b <-> 2b ~ 4 bytes
//"byte" = -128 <-> 128 ~ 1 byte
//"short" = -32768 <-> 32767 ~ 2 bytes
//"long" = -9<16ceros> <-> 9<16ceros> ~ 8 bytes

//--Decimales--

//"float"
//"double"

//--Boolean--

//"true"
//"false"

//--Char--

//"a,b,f,j..." (solo un caracter)

//--(dato primitivo) (nombre de la variable) = (numero,decimal,letra,true,false,etc...)

//  "sout" = atajo pro


////////////////////////////////////////////////////

public class Main {
    public static void main(String[] args) {
        String text = "Hello world!";

        int large = text.length();
        System.out.println(large);

        String newText = text.replace("Hello","Good bye");
        System.out.println(newText);

        System.out.println(newText.endsWith("rld!"));
        System.out.println(newText.startsWith("Good"));
        System.out.println(newText.contains("bye"));
        System.out.println(newText.indexOf("wor"));

        System.out.println(newText.toUpperCase());
        System.out.println(newText.toLowerCase());

        String bad = " happy pig  ";
        System.out.println(bad.trim());
    }
}