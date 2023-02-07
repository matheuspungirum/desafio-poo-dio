import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       Curso curso1 = new Curso();
       curso1.setTitulo("Curso Java");
       curso1.setDescricao("Programação Orientada a Objetos");
       curso1.setCargaHoraria(8);

       Curso curso2 = new Curso();
       curso2.setTitulo("Curso JavaScript");
       curso2.setDescricao("implementando itens complexos em páginas web");
       curso2.setCargaHoraria(10);

        Conteudo conteudo1 = new Curso();
        conteudo1.setTitulo("Curso Python");
        conteudo1.setDescricao("Linguagem de programação multiplataforma");



        //System.out.println(curso1);
       // System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Auxílio no desenvolvimento de Java");
        mentoria1.setData(LocalDate.now());

        //System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Propósito para formar profissionais backend na tecnologia de Java.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos do Matheus " + devMatheus.getConteudoInscritos());

        devMatheus.progredir();
        System.out.println(" - ");
        System.out.println("Conteúdos Inscritos do Matheus " + devMatheus.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos de Matheus " + devMatheus.getConteudoConcluidos());
        System.out.println("XP: " + devMatheus.calcularTotalXp() );

        System.out.println("");
        System.out.println("------------");
        System.out.println("");

        Dev devIgor = new Dev();
        devIgor.setNome("Igor");
        devIgor.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos do Igor " + devIgor.getConteudoInscritos());

        devIgor.progredir();
        devIgor.progredir();
        devIgor.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos do Igor " + devIgor.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos do Igor " + devIgor.getConteudoConcluidos());
        System.out.println("XP: " + devIgor.calcularTotalXp());
    }
}