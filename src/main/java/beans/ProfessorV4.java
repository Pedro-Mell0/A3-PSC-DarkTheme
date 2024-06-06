/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author pedro
 */
public class ProfessorV4 {

    private int ID;
    private String nome_professor;
    private String telefone_professor;
    private String email_professor;
    private String endereco_professor;
    private int id_curso; 
    private String Senha_professor;
    
    
    public String getSenha_professor() {
        return Senha_professor;
    }

    public void setSenha_professor(String Senha) {
        this.Senha_professor = Senha;
    }
   
 
    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }
   

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome_professor() {
        return nome_professor;
    }

    public void setNome_professor(String nome_professor) {
        this.nome_professor = nome_professor;
    }

    public String getTelefone_professor() {
        return telefone_professor;
    }

    public void setTelefone_professor(String telefone_professor) {
        this.telefone_professor = telefone_professor;
    }

    public String getEmail_professor() {
        return email_professor;
    }

    public void setEmail_professor(String email_professor) {
        this.email_professor = email_professor;
    }

    public String getEndereco_professor() {
        return endereco_professor;
    }

    public void setEndereco_professor(String endereco_professor) {
        this.endereco_professor = endereco_professor;
    }

    
  
    
}
