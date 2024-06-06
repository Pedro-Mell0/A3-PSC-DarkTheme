    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package beans;

import javax.swing.JOptionPane;

    /**
     *
     * @author pedro
     */
    public class AlunoV4 {


        private int id_curso; 
        private int RA;
        private String Nome_aluno;
        private String Data_nascimento_aluno;
        private String Nome_responsavel_aluno;
        private String Telefone_aluno;
        private String Email_aluno;
        private String Endereco_aluno;
        private String Senha_aluno;
        private String Presenca;
        private String Nota_A1;   
        private String Nota_A2;
        private String Nota_A3;
        
        

        
        public String getNota_A1() {
        return Nota_A1;
        }

        public void setNota_A1(String Nota_A1) {
        this.Nota_A1 = Nota_A1;
        }

        public String getNota_A2() {
        return Nota_A2;
        }

        public void setNota_A2(String Nota_A2) {
        this.Nota_A2 = Nota_A2;
        }

        public String getNota_A3() {
        return Nota_A3;
        }

        public void setNota_A3(String Nota_A3) {
        this.Nota_A3 = Nota_A3;
        }
        
        
        public String getPresenca() {
        return Presenca;
        }

        public void setPresenca(String Presenca) {
        this.Presenca = Presenca;
        }
        
        public String getSenha_aluno() {
        return Senha_aluno;
        }

        public void setSenha_aluno(String Senha) {
        this.Senha_aluno = Senha;
        }
        
        
        public int getId_curso() {
        return id_curso;
        }

        public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
        }
         
        public int getRA() {
        return RA;
        }

        public void setRA(int RA) {
        this.RA = RA;
        }
        
        public String getNome_aluno() {
            return Nome_aluno;
        }

        public void setNome_aluno(String nome_aluno) {
            this.Nome_aluno = nome_aluno;
        }

        public String getData_nascimento_aluno() {
            return Data_nascimento_aluno;
        }

        public void setData_nascimento_aluno(String data_nascimento_aluno) {
            this.Data_nascimento_aluno = data_nascimento_aluno;
        }

        public String getNome_responsavel_aluno() {
            return Nome_responsavel_aluno;
        }

        public void setNome_responsavel_aluno(String nome_responsavel_aluno) {
            this.Nome_responsavel_aluno = nome_responsavel_aluno;
        }

        public String getTelefone_aluno() {
            return Telefone_aluno;
        }

        public void setTelefone_aluno(String telefone_aluno) {
            this.Telefone_aluno = telefone_aluno;
        }

        public String getEmail_aluno() {
            return Email_aluno;
        }

        public void setEmail_aluno(String email_aluno) {
            this.Email_aluno = email_aluno;
        }

        public String getEndereco_aluno() {
            return Endereco_aluno;
        }

        public void setEndereco_aluno(String endereco_aluno) {
            this.Endereco_aluno = endereco_aluno;
        }



    }




