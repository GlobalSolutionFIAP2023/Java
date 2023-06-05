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

        // Instanciando o Scanner e o Random
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        // Instanciando o usuário/agricultor
        Agricultor agricultor1 = new Agricultor();

        // Iniciando a simulação:
        System.out.println("Iniciando o cadastro... ");

        System.out.println("Insira seu nome: ");
        agricultor1.setNome(scan.nextLine());

        System.out.println("Insira seu sobrenome: ");
        agricultor1.setSobreNome(scan.nextLine());

        System.out.println("Insira seu gênero: ");
        agricultor1.setGenero(scan.nextLine());

        System.out.println("Insira sua idade: ");
        agricultor1.setIdade(scan.nextInt());

        System.out.println("Insira seu cep para o endereço: ");

        // Instanciando o endereço
        Endereco endereco = new Endereco();
        endereco.setIdEndereco(random.nextInt(1001));
        endereco.setCep(scan.nextLine());
        endereco.setCep(scan.nextLine());

        agricultor1.setEndereco(endereco);

        System.out.println("Insira seu número de telefone (Sem o DDD ou DDI): ");

        // Instanciando uma lista de telefones e o telefone do usuário
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
        telefone.setOperadora(scan.nextLine());
        listaTelefonica.add(telefone);

        agricultor1.setTelefones(listaTelefonica);

        System.out.println("Nos conte um pouco do seu objetivo: ");
        agricultor1.setObjetivo(scan.nextLine());

        System.out.println("Nos conte sobre sua experiência em plantio: ");
        agricultor1.setExperiencia(scan.nextLine());

        System.out.println("Qual técnica sustentável você usa em seu plantio: ");

        // Instanciando uma lista de técnicas sustentáveis e a técnica do usuário
        List<TecnicaSustentavel> listaTecSustentaveis = new ArrayList<>();
        TecnicaSustentavel tecnicaSustentavel = new TecnicaSustentavel();

        tecnicaSustentavel.setIdTecnicaSustentavel(random.nextInt());
        tecnicaSustentavel.setNome(scan.nextLine());
        listaTecSustentaveis.add(tecnicaSustentavel);

        agricultor1.setTecnicasSustentaveis(listaTecSustentaveis);

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
        System.out.println("Endereço/CEP: " + agricultor1.getEndereco().getCep());
        System.out.println("Objetivo: " + agricultor1.getObjetivo());
        System.out.println("Experiência: " + agricultor1.getExperiencia());
        System.out.println("Técnica Sustentável: " + agricultor1.getTecnicasSustentaveis().get(0).getNome());
    }
}