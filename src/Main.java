import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);

System.out.println("Ingrese base de rectangulo");
double base=sc.nextDouble();

System.out.println("Ingrese altura");
double altura=sc.nextDouble();

//
        double area = base*altura;

        System.out.println("La cantidad de rectangulo es: "+area);

        sc.close();
System.out.println("la base de rectangulo es: "+base);

    }
}

//