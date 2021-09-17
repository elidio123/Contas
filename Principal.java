import java.util.Scanner;
public class Principal{
    public static void main(String args[]){
    char caracter = 'A';//codigo relacionada a ela
    String caracteres="A";

    Scanner ler=new Scanner(System.in);
    System.out.println("Digite uma letra");

    //c=next().charAt(0);
    caracter=ler.next().charAt(0);

    switch(caracter){
    case 'A':
    System.out.println("Voce digitou o caracter A");
    break;

    case 'E':
    System.out.println("Voce digitou o caracter E");
    break;

    case 'I':
    System.out.println("Voce digitou o caracter I");
    break;

    case 'O':
    System.out.println("Voce digitou o caracter O");
    break;

    case 'U':
    System.out.println("Voce digitou o caracter U");
    break;


    }
    }
}