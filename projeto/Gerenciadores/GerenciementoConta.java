package Gerenciadores;
import java.util.ArrayList;
import java.util.List;

import Conta.Conta;
import Conta.ContaCorrente;
import Conta.ContaPoupaca;

public class GerenciementoConta {

     List <ContaCorrente> conta = new ArrayList<>();
     List <ContaPoupaca> contaPop = new ArrayList<>();

    public ContaCorrente contaCorrente( String cpf, int numeroConta, String nome, Double valordep){
        return new ContaCorrente(cpf, numeroConta,  nome, valordep);
    }

    public ContaPoupaca contaPoupaca(String cpf, int numeroConta, String nome, Double valordep){
        return new ContaPoupaca(cpf, numeroConta,  nome, valordep);
    }

    public void criaConta(int esc, String cpf, int numeroConta, String nome, Double valordep){
        if(esc == 1){
            ContaPoupaca cont = contaPoupaca(cpf, numeroConta,  nome, valordep);
            contaPop.add(cont);
        }else {
            ContaCorrente cont = contaCorrente(cpf, numeroConta, nome, valordep);
            conta.add(cont);
        }
    }

    public Conta buscarConta(int numConta){
    
        Conta contaEncontrada = conta.stream()
         .filter(contaatual -> numConta == contaatual.getNumeroConta())
         .findFirst()
         .orElse(null);
         if (contaEncontrada == null){
            return buscarContaPop(numConta);
         }
        return contaEncontrada;

    }

    public ContaPoupaca buscarContaPop(int numConta){
        ContaPoupaca contaEncontrada = contaPop.stream()
        .filter(contaatual -> numConta == contaatual.getNumeroConta())
         .findFirst()
         .orElse(null);
         return contaEncontrada;
    }

    public void depositar(double valor, int numeroConta){
        Conta contaEncontrada = this.buscarConta(numeroConta);
        if (contaEncontrada != null){
        contaEncontrada.deposito(valor);
    }
    }

    public void sacar(double valor, int numeroConta){
        Conta contaEncontrada = this.buscarConta(numeroConta);
        contaEncontrada.sacar(valor);
    }


}
