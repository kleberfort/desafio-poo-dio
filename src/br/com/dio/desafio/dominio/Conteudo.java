package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    //criação da constante
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    //o método abstrato significa que as minhas classes filhas ou seja as classes que estenderem de conteudo
    //vão ser obrigados a implementar uma lógica nesse método.

    //Quando implemento um método abstrato a minha classe tem que ser abstrata
    //Uma classe abstrata significa que não consigo criar um objeto dessa classe, pois a intenção é fazer a herança
    //Diante disso a classe abstrata será usada apenas para fazer um relacionamento de herança

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
