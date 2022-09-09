package view;

import entities.Aluno;
import entities.Pessoa;
import entities.Professor;
import java.util.Scanner;

public class interfaceDeUsuario {
    private Pessoa[]  pessoas = new Pessoa[100];
    private int posicaoAtual = 0;
    private Scanner entrada = new Scanner(System.in);

    public void menu(){

        String nome;
        int idade, matricula;
        double cargaHoraria;
        Aluno aluno;
        Professor professor;
        String verifica="";

        mostraMenu();
        int opcao = entrada.nextInt();

        while (opcao != 0){
            switch (opcao){
                case 1:
                    System.out.println("Informe o nome:");
                    entrada.nextLine();
                    nome = entrada.nextLine();
                    System.out.println("Informe a idade:");
                    idade = entrada.nextInt();
                    System.out.println("Informe a matricula:");
                    matricula = entrada.nextInt();
                    aluno = new Aluno(nome, idade, matricula);
                    pessoas[posicaoAtual] = aluno;
                    posicaoAtual++;
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("Informe o nome:");
                    entrada.nextLine();
                    nome = entrada.nextLine();
                    System.out.println("Informe a idade:");
                    idade = entrada.nextInt();
                    System.out.println("Informe a carga horaria:");
                    cargaHoraria = entrada.nextInt();
                    professor = new Professor(nome, idade, cargaHoraria);
                    pessoas[posicaoAtual] = professor;
                    posicaoAtual++;
                    System.out.println("Professor cadastrado com sucesso!");
                    break;
                case 3:
                    int i;
                    for (i=0; i<posicaoAtual; i++){
                        System.out.println(pessoas[i].apresenta());
                    }
                    break;
                case 4:
                    System.out.println("Deseja realmente sair? S-Sim/N-Nao");
                    entrada.nextLine();
                    verifica = entrada.nextLine();
                    break;
            }
            if(verifica.equals("S")||verifica.equals("s")) {
                break;
            }
            mostraMenu();
            opcao = entrada.nextInt();
        }

    }
    public void mostraMenu(){
        System.out.println("1 - Cadastrar Alunos");
        System.out.println("2 - Cadastrar Professores");
        System.out.println("3 - Apresentar Alunos e Professores");
        System.out.println("4 - Sair");
    }
}