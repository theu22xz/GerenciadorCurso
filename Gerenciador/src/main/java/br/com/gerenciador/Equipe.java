
package br.com.gerenciador;

public class Equipe {
    private String nomeEquipe;
    private String descricao;
    private String membros;
    
public Equipe(String nomeEquipe, String descricao, String membros){
    this.nomeEquipe = nomeEquipe;
    this.descricao = descricao;
    this.membros = membros;
    }

    public String toString(){
    return "Cadastro da Equipe\n"+
            "Nome da Equipe: " + nomeEquipe + "\n" +
            "Descrição: " + descricao + "\n" +
            "Membros da Equipe: " + membros;
    }
}
