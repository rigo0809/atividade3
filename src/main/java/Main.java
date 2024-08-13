import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
    System.out.println("1 - Alcool");
    System.out.println("2 - Gasolina");
    System.out.println("3 - Diesel");
    int Alcool = 0;
    int Gasolina = 1;
    int Diesel = 2;
    int Combustivel = sc.nextInt();
    while (Combustivel > 0 && Combustivel < 4) {
      if (Combustivel != 1 && Combustivel != 2 && Combustivel != 3) {
        System.out.println("Codigo Inválido ");
        Combustivel = sc.nextInt();
      }
      if (Combustivel == 1) {
        Alcool = Alcool + 1;
        System.out.println("Alguma coisa a mais?");
        Combustivel = sc.nextInt();
      }
      if (Combustivel == 2) {
        Gasolina = Gasolina + 1;
        System.out.println("Alguma coisa a mais?");
        Combustivel = sc.nextInt();
      }
      if (Combustivel == 3) {
        Diesel = Diesel + 1;
        System.out.println("Alguma coisa a mais?");
        Combustivel = sc.nextInt();
      }
      while (Combustivel != 1 && Combustivel != 2 && Combustivel != 3) {
        System.out.println(" Código Inválido ");
        Combustivel = sc.nextInt();
      }
    }
    int soma = Alcool + Gasolina + Diesel;
    if (Combustivel == 4) {
      System.out.println("Obrigado");

    }

    sc.close();
  }
}