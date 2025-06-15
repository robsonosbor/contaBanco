package com.dasafio;

public class ContaTerminal {

    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    // Construtor
    public ContaTerminal() {      
    }

    // Getters e Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {        
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double deposito) {
        this.saldo += deposito;
    }

    @Override
    public String toString() {
        return "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
               agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
    }
}