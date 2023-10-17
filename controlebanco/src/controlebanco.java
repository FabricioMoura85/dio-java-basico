import java.util.Scanner;
public class controlebanco {
    public static void main(String[] args) throws Exception {
        Integer Numero = 0;
        String Agencia;
        String NomeCliente;
        float Saldo;

        Scanner sc = new Scanner(System.in);
        System.out.println("Por Favor, digite o numero da agencia");
        Agencia = sc.next();
         System.out.println("Por Favor, digite o seu nome");
        NomeCliente = sc.next();
         System.out.println("Por Favor, digite o seu saldo");
        Saldo = sc.nextFloat();
        Numero++;
       
    System.out.println("Ola "+ NomeCliente +", Obrigado por criar uma conta em nosso banco. sua agencia é "+Agencia+",conta " +Numero+",e seu saldo "+Saldo+" já está disponivél para Saque" );
 sc.close();
    }
}
