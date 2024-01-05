package com.algaworks.algaworkscontatos;

/**
 * Esta classe representa um contato no sistema.
 *
 * @author victor
 */
public class Contato {

    /**
     * O identificador único do contato.
     */
    private String id;

    /**
     * O nome do contato.
     */
    private String nome;

    public Contato() {
    }

    /**
     * Cria um novo objeto Contato com o ID, nome e número de telefone especificados.
     *
     * @param id       o identificador único do contato
     * @param nome     o nome do contato
     * @param telefone o número de telefone do contato
     */
    public Contato(String id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    public boolean isNovo() {
        return id == null;
    }

    /**
     * O número de telefone do contato.
     */
    private String telefone;

    /**
     * Retorna o identificador único do contato.
     *
     * @return o identificador único do contato
     */
    public String getId() {
        return id;
    }

    /**
     * Define o identificador único do contato.
     *
     * @param id o identificador único do contato
     * @return a instância atual do contato
     */
    public Contato setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Retorna o nome do contato.
     *
     * @return o nome do contato
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do contato.
     *
     * @param nome o nome do contato
     * @return a instância atual do contato
     */
    public Contato setNome(String nome) {
        this.nome = nome;
        return this;
    }

    /**
     * Retorna o número de telefone do contato.
     *
     * @return o número de telefone do contato
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o número de telefone do contato.
     *
     * @param telefone o número de telefone do contato
     * @return a instância atual do contato
     */
    public Contato setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

}
