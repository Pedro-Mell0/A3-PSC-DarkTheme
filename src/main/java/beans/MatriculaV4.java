/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author pedro
 */
public class MatriculaV4 {

    

    private int RA;
    private int id_curso;
    private int id_matricula;
    private String data_efetivacao;
    private String data_termino;

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }
    
    public int getId_matricula() {
        return id_matricula;
    }
    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }
    
    public void setId_matricula(int id_matricula) {
        this.id_matricula = id_matricula;
    }

    public String getData_efetivacao() {
        return data_efetivacao;
    }

    public void setData_efetivacao(String data_efetivacao) {
        this.data_efetivacao = data_efetivacao;
    }

    public String getData_termino() {
        return data_termino;
    }

    public void setData_termino(String data_termino) {
        this.data_termino = data_termino;
    }

}
