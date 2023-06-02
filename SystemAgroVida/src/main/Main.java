package main;

import beans.Endereco;
import beans.Telefone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Instanciano o Scanner
        Scanner scan = new Scanner(System.in);

        // Iniciando o programa:
        System.out.println("Iniciando o cadastro... ");

        System.out.println("Insira seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Insira seu sobrenome: ");
        String sobrenome = scan.nextLine();

        System.out.println("Insira sua idade: ");
        int idade = scan.nextInt();

        System.out.println("Insira seu gênero: ");
        String genero = scan.nextLine();

        System.out.println("Insira seu telefone: ");
        // Revisar

        System.out.println("Insira seu endereço: ");
        // Revisar

        System.out.println("Qual o seu objetivo: ");
        String objetivo = scan.nextLine();

        System.out.println("Qual sua experiência: ");
        String experiencia = scan.nextLine();

        System.out.println("Qual técnica sustentável você usa: ");
        // Revisar
    }
}