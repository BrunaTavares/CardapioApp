package br.com.bzet.cardapio.modelo;

/**
 * Classe do Objeto Item do Cardapio
 */
public class Item {

    private String nome;
    private String preco;
    private String descricao;
    private Integer imagemUrl;
    private String tipo;
    private Boolean ativo;

    public Item(String nome, String preco, String descricao, Integer imagemUrl, String tipo, Boolean ativo) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.imagemUrl = imagemUrl;
        this.tipo = tipo;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(Integer imagemUrl) {
        this.imagemUrl = imagemUrl;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}

