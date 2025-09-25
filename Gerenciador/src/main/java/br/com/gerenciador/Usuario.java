
package br.com.gerenciador;


public class Usuario {
    private String nome;
    private String cpf;
    private String email;
    private String cargo;
    private String login;
    private String senha;
 
 public Usuario (String nome, String cpf, String email, String cargo,
         String login, String senha){
     
     this.nome = nome;
     this.cpf = cpf;
     this.cargo = cargo;
     this.email = email;
     this.senha = senha;
     this.login = login;
 }
 
 public String toString(){
 return "Cadastro do Usuário\n" +
         "Nome do Usuário: " + nome + "\n" +
         "Cpf: " + cpf + "\n" +
         "E-mail: " + email + "\n" +
         "Cargo: " + cargo + "\n" +
         "Login: " + login + "\n" +
         "Senha: " + senha;
 }
 
}
