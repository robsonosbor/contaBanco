package com.dasafio.dio.contaterminal;

import java.util.Scanner;

import com.dasafio.ContaTerminal;

public class Main {
    public static void main(String[] args) {
        // inicia terminal
        Scanner terminal = new Scanner(System.in);


        // inicia o construtor
        ContaTerminal contaTerminal = new ContaTerminal();

        // Numero da conta
        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = terminal.nextInt();
        contaTerminal.setNumero(numeroConta);
        terminal.nextLine(); // Limpa buffer

        // Nome da agencia        
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = terminal.nextLine();
        contaTerminal.setAgencia(agencia);

        // Nome do cliente
        System.out.println("Por favor, digite seu nome:");
        String nomeCliente = terminal.nextLine();
        contaTerminal.setNomeCliente(nomeCliente);

        // atualiza saldo        
        System.out.println("Por favor, digite o saldo disponível:");
        double deposito = terminal.nextDouble();
        contaTerminal.deposito(deposito);

        System.out.println(contaTerminal);

        // Encerra terminal
        terminal.close();

       
    }
}