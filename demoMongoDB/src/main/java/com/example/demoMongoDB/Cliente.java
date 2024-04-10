package com.example.demoMongoDB;

import org.springframework.data.annotation.Id;

public class Cliente {
    @Id
    private String id;

    private String idade;
    private String genero;
    private String estadoCivil;
    private String profissao;
    private String rendaMensal;
    private String nivelEscolar;
    private String quantidadePessoasFamilia;
    private String latitude;
    private String longitude;
    private String codigoPostal;
    private String saida;
    private String feedback;

    public Cliente(){

    }
    public Cliente(String id, String idade, String genero, String estadoCivil, String profissao, String rendaMensal, String nivelEscolar, String quantidadePessoasFamilia, String latitude, String longitude, String codigoPostal, String saida, String feedback) {
        this.id = id;
        this.idade = idade;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.profissao = profissao;
        this.rendaMensal = rendaMensal;
        this.nivelEscolar = nivelEscolar;
        this.quantidadePessoasFamilia = quantidadePessoasFamilia;
        this.latitude = latitude;
        this.longitude = longitude;
        this.codigoPostal = codigoPostal;
        this.saida = saida;
        this.feedback = feedback;
    }

    public Cliente(String idade, String genero, String estadoCivil, String profissao, String rendaMensal, String nivelEscolar, String quantidadePessoasFamilia, String latitude, String longitude, String codigoPostal, String saida, String feedback) {

        this.idade = idade;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.profissao = profissao;
        this.rendaMensal = rendaMensal;
        this.nivelEscolar = nivelEscolar;
        this.quantidadePessoasFamilia = quantidadePessoasFamilia;
        this.latitude = latitude;
        this.longitude = longitude;
        this.codigoPostal = codigoPostal;
        this.saida = saida;
        this.feedback = feedback;
    }

    public String getId() {
        return id;
    }

    public String getIdade() {
        return idade;
    }

    public String getGenero() {
        return genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getProfissao() {
        return profissao;
    }

    public String getRendaMensal() {
        return rendaMensal;
    }

    public String getNivelEscolar() {
        return nivelEscolar;
    }

    public String getQuantidadePessoasFamilia() {
        return quantidadePessoasFamilia;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public String getSaida() {
        return saida;
    }

    public String getFeedback() {
        return feedback;
    }
}
