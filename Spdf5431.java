package spdf5431;

import java.util.Scanner;
public class Spdf5431 {
Scanner tcl = new Scanner(System.in);
    public static void main(String[] args) {
        boolean obj1 = true;
        double saldo = 0;
        Scanner tcl = new Scanner(System.in);
        Spdf5431 obj = new Spdf5431();
        while (obj1) {
            obj.menu(); 
            System.out.println("digite a opção: ");
            int valor = tcl.nextInt();         
            switch (valor) {
                case 1:
                   obj.saldo(saldo);
                   break;
                case 2:
                    obj.sacar(saldo);
                    break;
                case 3:
                    obj.depositar(saldo);
                    break;
                case 4:
                    obj.sair();
                    obj1 = false;
                    break;
                default:
                    System.out.println("Digite uma ação válida");
            }
        }
    }
    public void menu() {
        System.out.println("--CAIXA ELETRONICO--");
        System.out.println("1-Saldo");
        System.out.println("2-Sacar");
        System.out.println("3-Deposito");
        System.out.println("4-Salr");
    }

    public void saldo(double saldo) {
        System.out.println("Seu saldo é de " + saldo);
    }public void sacar(double saldo){
        System.out.println("Digite o valor que deseja sacar");  
        Scanner tcl = new Scanner(System.in);        
        int sacar = tcl.nextInt();
        saldo = saldo - sacar;
        System.out.println("Seu saldo atual é de: R$"+saldo);
    }
    public void depositar(double saldo){
    System.out.println("Digite o valor que deseja depositar");  
        Scanner tcl = new Scanner(System.in);        
        int depositar = tcl.nextInt();
        saldo = saldo + depositar;
        System.out.println("Seu saldo atual é de: R$"+ saldo);
    }
    public void sair(){
            System.out.println("Obrigado por trabalhar conosco!"
                    + "Até logo");
    }
}
