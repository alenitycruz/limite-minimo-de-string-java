package revisao.repeticao.exercicio;

import java.util.Scanner;

/*
Faça um programa que leia e valide as seguintes informações:

a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';
 */


public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        int salario;
        String sexo;
        String estadoCivil;


        do {
            System.out.println("Digite seu nome(minimo 3 letras): ");
            nome = scan.next();
            if (nome.length() <= 2) {
                System.out.println("Quantidade de caracteres inválida! Digite novamente: ");
            }
        } while (nome.length() <= 2);


        /*
        Deu errado!
        System.out.println("Digite seu nome(minimo 3 letras): ");
        nome = scan.next();
        if (nome.length() >= 2){
            nome = scan.next();
        } else {
            System.out.println("Quantidade de caracteres inválida!");
        }

         */

        do {

            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();

            if (idade < 0 & idade > 150){
                System.out.println("Idade inválida! Digite novamente: ");
            }

        } while ( idade <= 0 & idade >= 150);

        do {
            System.out.println("Salário: ");
            salario = scan.nextInt();
        } while ( salario <= 0);

        System.out.println("Sexo(f/m): ");
        sexo = scan.next();

        switch (sexo){
            case "f":
                System.out.println("Feminino");
                break;
            case "m":
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        System.out.println("Estado Civil(s/c/v/d): ");
        estadoCivil = scan.next();

        switch (estadoCivil) {
            case "s":
                System.out.println("Solteiro(a)");
                break;
            case "c":
                System.out.println("Casado(a)");
                break;
            case "v":
                System.out.println("Viúvo(a)");
                break;
            case "d":
                System.out.println("Divorciado(a)");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }




    }

}
