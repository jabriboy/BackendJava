import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int num1, num2;

        System.out.print("digite o numero 1: ");
        num1 = sc.nextInt();
        
        System.out.print("digite o numero 2: ");
        num2 = sc.nextInt();

        try{
            contar(num1, num2);
        } catch (ParametrosInvalidosException exception){
            System.out.println("O número 1 não pode ser maior que o número 2");
        }

    }

    static public void contar(int num1, int num2) throws ParametrosInvalidosException {
        if(num1 > num2) throw new ParametrosInvalidosException();

        int count = num2 - num1;

        for(int i = 1; i <= count; i++){
            System.out.println("Imprimindo numero: "+i);
        }
    }
}
