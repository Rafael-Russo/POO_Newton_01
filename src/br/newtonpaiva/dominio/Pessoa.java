package br.newtonpaiva.dominio;

import java.util.List;
import java.util.Objects;

public abstract class Pessoa {
    private String nome;

    private List contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List getContas() {
        return contas;
    }

    public void setContas(List contas) {
        this.contas = contas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return nome.equals(pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    public abstract void validarDocumento();
}
