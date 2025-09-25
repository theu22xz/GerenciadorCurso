
package br.com.gerenciador;

public class Projeto {
    private String nomeProjeto;
    private String descricao;
    private String dataInicial;
    private String dataFinal;
    private String statusProjeto;
 

public Projeto (String nomeProjeto, String descricao, String dataInicial, String dataFinal,
                String statusProjeto){
    this.nomeProjeto = nomeProjeto;
    this.descricao = descricao;
    this.dataInicial = dataInicial;
    this.dataFinal = dataFinal;
    this.statusProjeto = statusProjeto;
    }
    
public String toString(){
    return "Cadastro do Projeto\n" +
    "Nome do Projeto: " + nomeProjeto + "\n" +
    "Descrição do Projeto: " + descricao + "\n" +
    "Data de Início do Projeto: " + dataInicial + "\n" +
    "Data de Finalização do Projeto: " + dataFinal + "\n" +
    "Status do Projeto: " + statusProjeto + "\n";
    }


}
