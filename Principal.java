import java.util.Scanner;
public class Principal {
    public static void main(String args []){
        
        Scanner ler=new Scanner(System.in);
        Conta minhaConta=new Conta();
        /*ler.nextLine();//Texto
        ler.nextInt();//Inteiro
        ler.nextDouble();*/
        System.out.println("Digite o número da Conta: ");
        minhaConta.numero=ler.nextInt();
        System.out.println("Digite o Saldo: ");
        minhaConta.saldo=ler.nextDouble();
        ler.nextLine();
        System.out.println("Digite o nome do titular: ");
        minhaConta.titular=ler.nextLine();        
    }
}

