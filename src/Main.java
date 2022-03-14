import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        //tudo que tem dentro de Conteudo tem em Curso, mas tudo que tem em Curso não tem em Conteúdo
        Conteudo conteudo = new Curso();
        //conteudo.toString();


        curso1.setTitulo("Curso Java");
        curso1.setDescricao("curso Java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso JS");
        curso2.setDescricao("curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria do java");
        mentoria.setDescricao("mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        System.out.println("--------------------");
        Dev devKleber = new Dev();
        devKleber.setNome("Kleber Ferreira");
        devKleber.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos Kleber: " + devKleber.getConteudosInscritos());
        devKleber.progredir();
        devKleber.progredir();
        devKleber.progredir();

        System.out.println("Conteúdos Incritos Kleber: " + devKleber.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Kleber: "+ devKleber.getConteudosConcluidos());
        System.out.println("XP: " + devKleber.calcularTotalXp());

        System.out.println("-------------------");

/*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        System.out.println(conteudo);
  */
    }
}
