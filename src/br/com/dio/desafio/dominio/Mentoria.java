package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

   private LocalDate data;

   //A classe Conteudo possui um método abstrato, após o processo de heranção sou obrigado a implementar
    // o método abstrato na minha classe filha, que no caso é Mentoria


    public Mentoria() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
