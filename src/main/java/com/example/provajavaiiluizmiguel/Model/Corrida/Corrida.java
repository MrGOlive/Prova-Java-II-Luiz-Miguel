package com.example.provajavaiiluizmiguel.Model.Corrida;

import javafx.application.Application;
import javafx.stage.Stage;

public abstract class Corrida {
    // DECLARAÇÃO DE VARIÁVEIS
    private String nomePassageiro;
    private String CPF;
    private String origem;
    private String destino;
    private String dataCorrida;
    private Integer distanciaCorrida;
    private String veiculoUtilizado;
    private String condicaoDemanda;
    private String cupomDesconto;
    private String valorAcrescimo;

    // GETTERS
    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public String getCPF() {
        return CPF;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public String getDataCorrida() {
        return dataCorrida;
    }

    public Integer getDistanciaCorrida() {
        return distanciaCorrida;
    }

    public String getVeiculoUtilizado() {
        return veiculoUtilizado;
    }

    public String getCondicaoDemanda() {
        return condicaoDemanda;
    }

    public String getCupomDesconto() {
        return cupomDesconto;
    }

    public String getValorAcrescimo() {
        return valorAcrescimo;
    }
    
    // CONSTRUTORES
    public Corrida(String nomePassageiro, String CPF, String origem, String destino, String dataCorrida, Integer distanciaCorrida, String veiculoUtilizado, String condicaoDemanda, String cupomDesconto, String valorAcrescimo) {
        this.nomePassageiro = nomePassageiro;
        this.CPF = CPF;
        this.origem = origem;
        this.destino = destino;
        this.dataCorrida = dataCorrida;
        this.distanciaCorrida = distanciaCorrida;
        this.veiculoUtilizado = veiculoUtilizado;
        this.condicaoDemanda = condicaoDemanda;
        this.cupomDesconto = cupomDesconto;
        this.valorAcrescimo = valorAcrescimo;
    }

    // METHODS
    // METHOD PARA VERIFICAR SE TODOS OS CAMPOS ESTÃO PREENCHIDOS
    public void camposPreenchidos(){
        if (getNomePassageiro().isBlank() || getCPF().isBlank() || getOrigem().isBlank() || getDestino().isBlank() || getDataCorrida().isBlank() 
                || getDistanciaCorrida() == null || getVeiculoUtilizado().isBlank() || getCondicaoDemanda().isBlank()){
            if (getCondicaoDemanda().equals("Dinâmica")){
                throw 
            }
        }
    }

    public void distanciaMaiorQueZero(){
        if (getDistanciaCorrida() <= 0){
            throw new IllegalArgumentException("A distância da corrida não pode ser menor ou igual a zero.");
        }
    }

    public void demandaNaoInformada(){
        if (getCondicaoDemanda().isBlank()){
            throw new IllegalArgumentException("É necessário informar a condição de demanda.");
        }
    }
}
