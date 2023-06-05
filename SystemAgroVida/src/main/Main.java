package main;

import beans.Agricultor;
import beans.Endereco;
import beans.TecnicaSustentavel;
import beans.Telefone;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Instanciano o Scanner e o Random
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        // Iniciando o programa:
        System.out.println("Iniciando o cadastro... ");

        System.out.println("Insira seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Insira seu sobrenome: ");
        String sobrenome = scan.nextLine();

        System.out.println("Insira seu gênero: ");
        String genero = scan.nextLine();

        System.out.println("Insira sua idade: ");
        int idade = scan.nextInt();

        System.out.println("Insira seu cep para o endereço: ");
        Endereco endereco = new Endereco(random.nextInt(1001), scan.nextLine());

        System.out.println("Insira seu número de telefone (Sem o DDD ou DDI): ");
        List<Telefone> listaTelefonica = new ArrayList<>();
        Telefone telefone = new Telefone();

        telefone.setIdTelefone(random.nextInt(1001));
        telefone.setNumero(scan.nextInt());
        System.out.println("Insira seu DDD: ");
        telefone.setDdd(scan.nextInt());
        System.out.println("Insira seu DDI: ");
        telefone.setDdi(scan.nextInt());
        System.out.println("Insira sua operadora: ");
        telefone.setOperadora(scan.nextLine());

        listaTelefonica.add(telefone);

        System.out.println("Nos conte um pouco do seu objetivo: ");
        String objetivo = scan.nextLine();

        System.out.println("Nos conte sobre sua experiência em plantio: ");
        String experiencia = scan.nextLine();

        System.out.println("Qual técnica sustentável você usa em seu plantio: ");
        List<TecnicaSustentavel> listaTecSustentaveis = new ArrayList<>();
        TecnicaSustentavel tecnicaSustentavel = new TecnicaSustentavel(random.nextInt(), scan.nextLine());
        listaTecSustentaveis.add(tecnicaSustentavel);

        Agricultor agricultor1 = new Agricultor(nome, sobrenome, idade, genero, listaTelefonica, endereco, random.nextInt(1001), objetivo, experiencia, listaTecSustentaveis);

        System.out.println(" ");
        System.out.println("Confira suas informações: ");
        System.out.println("ID do Usuário: " + agricultor1.getIdAgricultor());
        System.out.println("Nome: " + agricultor1.getNome());
        System.out.println("Sobrenome: " + agricultor1.getSobreNome());
        System.out.println("Idade: " + agricultor1.getIdade());
        System.out.println("Gênero: " + agricultor1.getGenero());
        System.out.println("Número de telefone: " + agricultor1.getTelefones().get(0).getNumero());
        System.out.println("Número do DDD: " + agricultor1.getTelefones().get(0).getDdd());
        System.out.println("Número do DDI: " + agricultor1.getTelefones().get(0).getDdi());
        System.out.println("Operadora do telefone: " + agricultor1.getTelefones().get(0).getOperadora());
        System.out.println("Endereço/CEP: " + agricultor1.getEndereco());
        System.out.println("Objetivo: " + agricultor1.getObjetivo());
        System.out.println("Experiência: " + agricultor1.getExperiencia());
        System.out.println("Técnica Sustentável: " + agricultor1.getTecnicasSustentaveis().get(0).getNome());
    }
}