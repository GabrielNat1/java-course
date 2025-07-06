package academy.devdojo.maratona.javacore.Gassociacao.test;

import academy.devdojo.maratona.javacore.Gassociacao.domain.Aluno;
import academy.devdojo.maratona.javacore.Gassociacao.domain.Local;
import academy.devdojo.maratona.javacore.Gassociacao.domain.Professor;
import academy.devdojo.maratona.javacore.Gassociacao.domain.Seminario;

import java.util.ArrayList;
import java.util.Scanner;

/*
            Crie um sistema que gerencie seminários

            O sistema deverá cadastrar seminarios, estudantes, professores e local aonde sera realizado

            um aluno podera estar em apenas um seminario
            um seminario podera ter nenhum ou varios alunos
            um professor podera ministrar varios seminarios
            um seminario deve ter um local

            campos basicos (excluindo relacionamento)
            seminario: titulo
            aluno: nome e idade
            professor: nome, especialidade
            local: endereço
         */

public class AssociacaoTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Local> locais = new ArrayList<>();
        ArrayList<Professor> professores = new ArrayList<>();
        ArrayList<Seminario> seminarios = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n===== Menu de Cadastro =====");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Local");
            System.out.println("3 - Cadastrar Professor");
            System.out.println("4 - Cadastrar Seminário");
            System.out.println("5 - Listar Eventos Abertos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome do aluno: ");
                    String nome = sc.nextLine();
                    System.out.print("Idade do aluno: ");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    alunos.add(new Aluno(nome, idade));
                    System.out.println("Aluno cadastrado com sucesso!");
                }
                case 2 -> {
                    System.out.print("Endereço do local: ");
                    String endereco = sc.nextLine();
                    locais.add(new Local(endereco));
                    System.out.println("Local cadastrado com sucesso!");
                }
                case 3 -> {
                    System.out.print("Nome do professor: ");
                    String nome = sc.nextLine();
                    System.out.print("Especialidade: ");
                    String esp = sc.nextLine();
                    professores.add(new Professor(nome, esp));
                    System.out.println("Professor cadastrado com sucesso!");
                }
                case 4 -> {
                    System.out.print("Título do seminário: ");
                    String titulo = sc.nextLine();

                    if (locais.isEmpty()) {
                        System.out.println("Cadastre um local primeiro!");
                        break;
                    }
                    System.out.println("Escolha o local:");
                    for (int i = 0; i < locais.size(); i++) {
                        System.out.println(i + " - " + locais.get(i).getEndereço());
                    }
                    int idxLocal = sc.nextInt();
                    sc.nextLine();
                    Local localEscolhido = locais.get(idxLocal);

                    ArrayList<Aluno> alunosDoSeminario = new ArrayList<>();
                    if (!alunos.isEmpty()) {
                        System.out.println("Escolha alunos para o seminário (-1 para sair):");
                        for (int i = 0; i < alunos.size(); i++) {
                            System.out.println(i + " - " + alunos.get(i).getNome());
                        }
                        while (true) {
                            int idxAluno = sc.nextInt();
                            if (idxAluno == -1) break;
                            alunosDoSeminario.add(alunos.get(idxAluno));
                        }
                        sc.nextLine();
                    }

                    Seminario seminario = new Seminario(titulo, alunosDoSeminario.toArray(new Aluno[0]), localEscolhido);
                    seminarios.add(seminario);

                    if (!professores.isEmpty()) {
                        System.out.println("Escolha um professor para esse seminário:");
                        for (int i = 0; i < professores.size(); i++) {
                            System.out.println(i + " - " + professores.get(i).getNome());
                        }
                        int idxProf = sc.nextInt();
                        sc.nextLine();

                        Professor prof = professores.get(idxProf);
                        ArrayList<Seminario> lista = new ArrayList<>();
                        if (prof.getSeminarios() != null) {
                            for (Seminario s : prof.getSeminarios()) {
                                lista.add(s);
                            }
                        }
                        lista.add(seminario);
                        prof.setSeminarios(lista.toArray(new Seminario[0]));
                    }

                    System.out.println("Seminário cadastrado com sucesso!");
                }
                case 5 -> {
                    for (Professor p : professores) {
                        p.imprime();
                    }
                }
                case 0 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }
}
