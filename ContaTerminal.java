import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        String NomeCliente;
        int Numero;
        String Agencia;
        double Saldo;

        Scanner sc = new  Scanner(System.in);

        System.out.println("--------------------------");
        System.out.print("Por favor, digite o número da Agência: ");
        Agencia = sc.next();

        while (true) {

        try {
            System.out.print("Por favor, digite o número da conta:");
            Numero= sc.nextInt();
            break;
        } catch (Exception e) {

            System.out.println("Entrada inválida. Digite apenas números.");
            sc.nextLine();

          }
            
        }

        while (true) {

            try {
                System.out.print("Por favor, digite o saldo da conta "+ Numero+": ");
                Saldo = sc.nextDouble();
                sc.nextLine();// para limpar o bufe do sc
                break;
            } catch (Exception e) {
    
                System.out.println("Entrada inválida. Digite apenas números."); // para limpar o bufe do sc
                sc.nextLine();
    
            }
                
        }

        System.out.println("Por favor, digite o nome do dono da conta "+Numero+": ");
        NomeCliente = sc.nextLine();


        System.out.print("Olá "+NomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+Agencia+", conta "+Numero+" e seu saldo de R$"+Saldo+" já está disponível para saque.");
        
        sc.close();
    }

}