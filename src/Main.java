import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        //tudo que tem dentro de Conteudo tem em Curso, mas tudo que tem em Curso não tem em Conteúdo
        Conteudo conteudo = new Curso();
        //conteudo.toString();


        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria do java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        System.out.println(conteudo);
    }
}
