package main;

import beans.Cliente;
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

        // Instanciando uma lista de histórico e uma de favoritos
        List<TecnicaSustentavel> historico = new ArrayList<TecnicaSustentavel>();
        List<TecnicaSustentavel> favoritas = new ArrayList<TecnicaSustentavel>();

        // Instanciando as Técnicas Sustentáveis
        TecnicaSustentavel ColetSelResid = new TecnicaSustentavel();
        ColetSelResid.setIdTecnica(random.nextInt(101));
        ColetSelResid.setNome("Coleta Seletiva de Resíduos");
        ColetSelResid.setDescricao("Método de coletar e separar os resíduos de acordo com suas características. Ou seja, se os resíduos possuem características similares são segregados e coletados juntos (papel, plástico, vidro, metal e resíduo orgânico). Isso ajuda a reciclagem, tornando-a mais fácil e viável economicamente.");

        TecnicaSustentavel ReutilObj = new TecnicaSustentavel();
        ReutilObj.setIdTecnica(random.nextInt(101));
        ReutilObj.setNome("Reutilizar Objetos");
        ReutilObj.setDescricao("Sabe aquele pote de requeijão, que é de vidro? Então, você pode reutilizar ele como um copo. Adote esse tipo de pensamento sobre como utilizar uma coisa em outra, tornando o mundo mais sustentável.");

        TecnicaSustentavel EmbRecic = new TecnicaSustentavel();
        EmbRecic.setIdTecnica(random.nextInt(101));
        EmbRecic.setNome("Embalagens Recicláveis");
        EmbRecic.setDescricao("Opte por usar embalagens recicláveis, que possam ser reutilizadas, após serem lavadas.");

        TecnicaSustentavel CapAguChu = new TecnicaSustentavel();
        CapAguChu.setIdTecnica(random.nextInt(101));
        CapAguChu.setNome("Captação de Água da Chuva");
        CapAguChu.setDescricao("A água é um recurso essencial para vida humana, isso é indiscutível, e já existem várias alternativas para suprir a carência de água de qualidade aqui no Brasil, como utilizar os rios e mananciais. E uma excelente alternativa para economizar água em casa e fácil de replicar, que permite o melhor aproveitamento desse recurso natural é a captação de água da chuva e utilizar para tarefas domésticas. \n\nExiste também sistemas de captação de água de chuva, como um tanque de água da chuva usado para coletar e armazenar o escoamento da água da chuva, e outros como uma Cisternas que normalmente é instalada em telhados por meio de tubos, são soluções alternativas eficientes usadas na hora de economizar água. \n\nVale a pena avaliar a possibilidade de instalar um sistema de coleta de água de chuva e/ou simplesmente considerar a possibilidade de armazenar a água de chuva para utilizá-la em tarefas domésticas e assim economizar nosso recurso natural mais importante que é Água. Se cada um contribuir um pouco, o planeta agradece!");

        TecnicaSustentavel RestAlimComp = new TecnicaSustentavel();
        RestAlimComp.setIdTecnica(random.nextInt(101));
        RestAlimComp.setNome("Restos de Alimentos para Compostagem");
        RestAlimComp.setDescricao("Existem várias possibilidades de reaproveitamento dos resíduos de alimentos, e a forma mais comum é através da compostagem doméstica, contribuindo para reduzir gases do efeito estufa e o lixo orgânico.\n\nA compostagem é um processo de reciclagem do lixo orgânico, transforma a matéria orgânica encontrada no lixo em adubo natural, que pode ser usado na agricultura, em jardins e plantas, substituindo o uso de produtos químicos.");

        TecnicaSustentavel InsetNat = new TecnicaSustentavel();
        InsetNat.setIdTecnica(random.nextInt(101));
        InsetNat.setNome("Inseticida Natural");
        InsetNat.setDescricao("Como a sociedade já tem mais conhecimento da necessidade da sustentabilidade, e falamos no tópico acima sobre produzir alimentos orgânicos em casa, então com isso surge também a necessidade de alternativas para o controle biológico de pragas, insetos, pois o tradicional utiliza muita química e que prejudica as plantas e o solo. \n\nOs inseticidas naturais representam essa alternativa para produtores rurais que não querem utilizar agentes químicos em suas lavouras e até mesmo para pessoas comuns que estão em busca de uma solução útil contra a proliferação de insetos em suas residências. \n\nA sugestão é utilizar ingredientes naturais como alho, coentro, hortelã, tabaco, pimenta, essas são algumas opções de inseticidas naturais que podem ser usados para proteger plantações e combater pragas que atacam lavouras ou até mesmo hortas caseiras, contra larvas, borboletas, formigas, pulgões, lagartas, moscas, mosquitos entre outros, ok?");

        TecnicaSustentavel HortOrg = new TecnicaSustentavel();
        HortOrg.setIdTecnica(random.nextInt(101));
        HortOrg.setNome("Horta Orgânica");
        HortOrg.setDescricao("Cultivar vegetais em casa, não é uma exclusividade de fazendas e chácaras, é possível ter uma horta orgânica até em espaços pequenos, além de promover o cultivo sem agredir o solo e o meio ambiente. \n\nPara hortas em ambientes internos e na utilização de vasos, potes, garrafas e outros recipientes, seja em hortas verticais ou horizontais, você não deve esquecer de providenciar furos no fundo para evitar o excesso de água no solo, isso pode contribuir para apodrecer as raízes. \n\nEntão a sugestão é se preocupar primeiro com solo que uma parte muito importante, ele precisa ser fofo e rico em nutrientes, isso deixará seus vegetais saudáveis e uma boa dica é utilizar adubos originados de itens naturais, como cascas e restos de vegetais.");

        // Instanciando o usuário/agricultor
        Cliente cliente1 = new Cliente();

        cliente1.setIdCliente(random.nextInt(1001));

        // Iniciando a simulação:
        System.out.println("Iniciando o cadastro... ");

        System.out.println("Insira seu nome: ");
        cliente1.setNome(scan.nextLine());

        System.out.println("Insira seu sobrenome: ");
        cliente1.setSobreNome(scan.nextLine());

        System.out.println("Insira seu gênero: ");
        cliente1.setGenero(scan.nextLine());

        System.out.println("Insira sua idade: ");
        cliente1.setIdade(scan.nextInt());

        System.out.println("Insira seu cep para o endereço: ");

        // Instanciando o endereço
        Endereco endereco = new Endereco();
        endereco.setIdEndereco(random.nextInt(1001));
        endereco.setCep(scan.nextLine());
        endereco.setCep(scan.nextLine());

        cliente1.setEndereco(endereco);

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

        cliente1.setTelefones(listaTelefonica);

        System.out.println("Nos conte um pouco do seu objetivo: ");
        cliente1.setObjetivo(scan.nextLine());

        System.out.println("Nos conte sobre sua experiência em plantio: ");
        cliente1.setExperiencia(scan.nextLine());

        System.out.println("Qual técnica sustentável você usa em seu plantio: ");

        // Instanciando uma lista de técnicas sustentáveis e a técnica do usuário
        List<TecnicaSustentavel> listaTecSustentaveis = new ArrayList<>();
        TecnicaSustentavel tecnicaSustentavel = new TecnicaSustentavel();

        tecnicaSustentavel.setIdTecnicaSustentavel(random.nextInt());
        tecnicaSustentavel.setNome(scan.nextLine());
        listaTecSustentaveis.add(tecnicaSustentavel);

        cliente1.setTecnicasSustentaveis(listaTecSustentaveis);

        System.out.println("\nConfira suas informações: ");
        System.out.println("ID do Usuário: " + cliente1.getIdCliente());
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Sobrenome: " + cliente1.getSobreNome());
        System.out.println("Idade: " + cliente1.getIdade());
        System.out.println("Gênero: " + cliente1.getGenero());
        System.out.println("Número de telefone: " + cliente1.getTelefones().get(0).getNumero());
        System.out.println("Número do DDD: " + cliente1.getTelefones().get(0).getDdd());
        System.out.println("Número do DDI: " + cliente1.getTelefones().get(0).getDdi());
        System.out.println("Operadora do telefone: " + cliente1.getTelefones().get(0).getOperadora());
        System.out.println("Endereço/CEP: " + cliente1.getEndereco().getCep());
        System.out.println("Objetivo: " + cliente1.getObjetivo());
        System.out.println("Experiência: " + cliente1.getExperiencia());
        System.out.println("Técnica Sustentável: " + cliente1.getTecnicasSustentaveis().get(0).getNome());

        // Iniciando o Menu
        int op = 0;
        while (op != 2) {

            // Opções de ações
            System.out.println("\nComo você deseja prosseguir?");
            System.out.println("1 - Lista de Técnicas\n2 - Encerrar o programa\n3 - Ver histórico\n4 - Lista de favoritas");
            op = scan.nextInt();

            // Lista de Técnicas
            if (op == 1) {
                System.out.println("\nQual técnica você gostaria de conhecer:\n1 - Reciclagem\n2 - Captação de Água da Chuva\n3 - Restos de alimentos para compostagem\n4 - Inseticida Natural\n5 - Horta Orgânica");
                int op1 = scan.nextInt();
                if (op1 == 1) {
                    System.out.println("\nQual técnica de reciclagem você deseja conhecer:\n1 - Coleta seletiva dos resíduos\n2 - Reutilizar Objetos\n3 - Embalagens Recicláveis");
                    int op2 = scan.nextInt();
                    if (op2 == 1) {
                        System.out.println("\n" + ColetSelResid.getDescricao());
                        // Adiciona ao histórico
                        ColetSelResid.Adicionar(historico, ColetSelResid);

                        // Adiciona aos favoritos
                        System.out.println("\nDeseja adicionar aos favoritos? [1 - Sim / 2 - Não]");
                        int fav = scan.nextInt();
                        if (fav == 1){
                            ColetSelResid.Adicionar(favoritas, ColetSelResid);
                        }
                    } else if (op2 == 2) {
                        System.out.println("\n" + ReutilObj.getDescricao());
                        // Adiciona ao histórico
                        ReutilObj.Adicionar(historico, ReutilObj);

                        // Adiciona aos favoritos
                        System.out.println("\nDeseja adicionar aos favoritos? [1 - Sim / 2 - Não]");
                        int fav = scan.nextInt();
                        if (fav == 1){
                            ReutilObj.Adicionar(favoritas, ReutilObj);
                        }
                    } else if (op2 == 3) {
                        System.out.println("\n" + EmbRecic.getDescricao());
                        // Adiciona ao histórico
                        EmbRecic.Adicionar(historico, EmbRecic);

                        // Adiciona aos favoritos
                        System.out.println("\nDeseja adicionar aos favoritos? [1 - Sim / 2 - Não]");
                        int fav = scan.nextInt();
                        if (fav == 1){
                            EmbRecic.Adicionar(favoritas, EmbRecic);
                        }
                    }
                } else if (op1 == 2) {
                    System.out.println("\n" + CapAguChu.getDescricao());
                    // Adiciona ao histórico
                    CapAguChu.Adicionar(historico, CapAguChu);

                    // Adiciona aos favoritos
                    System.out.println("\nDeseja adicionar aos favoritos? [1 - Sim / 2 - Não]");
                    int fav = scan.nextInt();
                    if (fav == 1){
                        CapAguChu.Adicionar(favoritas, CapAguChu);
                    }
                } else if (op1 == 3) {
                    System.out.println("\n" + RestAlimComp.getDescricao());
                    // Adiciona ao histórico
                    RestAlimComp.Adicionar(historico, RestAlimComp);

                    // Adiciona aos favoritos
                    System.out.println("\nDeseja adicionar aos favoritos? [1 - Sim / 2 - Não]");
                    int fav = scan.nextInt();
                    if (fav == 1){
                        RestAlimComp.Adicionar(favoritas, RestAlimComp);
                    }
                } else if (op1 == 4) {
                    System.out.println("\n" + InsetNat.getDescricao());
                    // Adiciona ao histórico
                    InsetNat.Adicionar(historico, InsetNat);

                    // Adiciona aos favoritos
                    System.out.println("\nDeseja adicionar aos favoritos? [1 - Sim / 2 - Não]");
                    int fav = scan.nextInt();
                    if (fav == 1){
                        InsetNat.Adicionar(favoritas, InsetNat);
                    }
                } else if (op1 == 5) {
                    System.out.println("\n" + HortOrg.getDescricao());
                    // Adiciona ao histórico
                    HortOrg.Adicionar(historico, HortOrg);

                    // Adiciona aos favoritos
                    System.out.println("\nDeseja adicionar aos favoritos? [1 - Sim / 2 - Não]");
                    int fav = scan.nextInt();
                    if (fav == 1){
                        HortOrg.Adicionar(favoritas, HortOrg);
                    }
                }
            }
            // Ver histórico
            if (op == 3) {
                System.out.println("\nHISTÓRICO:\n");
                if (historico.isEmpty()){
                    System.out.println("Seu histórico está vazio!!");
                } else {
                    for (TecnicaSustentavel tecSust : historico) {
                        System.out.println("\n[" + tecSust.getNome() + "]\n" + tecSust.getDescricao() + "\n\n");
                    }
                }
            }
            // Lista de favoritos
            if (op == 4) {
                System.out.println("\nTÉCNICAS FAVORITAS:\n");
                if (favoritas.isEmpty()){
                    System.out.println("Sua lista de favoritas está vazia!!");
                } else {
                    for (TecnicaSustentavel tecSust : favoritas) {
                        System.out.println("\n[" + tecSust.getNome() + "]\n" + tecSust.getDescricao() + "\n\n");
                    }
                }
            }
        }
        // Encerrando o Programa
        System.out.println("\nAgradecemos pela visita! Volte quando precisar mais informação para seu plantio!");
    }
}