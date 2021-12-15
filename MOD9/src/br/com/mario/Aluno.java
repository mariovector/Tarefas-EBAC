package br.com.mario;

public class Aluno {
    public static void main(String args[]) {

        long cpf = 87025299120l;
        Long cpf1 = cpf;

        short cpf2 = (short) cpf; //testar a perda de posições
        System.out.println("O CPF do Aluno é: " + cpf1);
        System.out.println("O CPF do Aluno em short é: " + cpf2);




    }

}
