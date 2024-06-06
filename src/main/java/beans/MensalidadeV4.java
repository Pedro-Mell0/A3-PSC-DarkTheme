/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author pedro
 */
public class MensalidadeV4 {

    private int RA;
    private int id_mensalidade;
    private String data_emissao;
    private String data_vencimento;
    private String data_pagamento;
    private String valor;

    public int getId_mensalidade() {
        return id_mensalidade;
    }

    public void setId_mensalidade(int id_mensalidade) {
        this.id_mensalidade = id_mensalidade;
    }

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public String getData_emissao() {
        return data_emissao;
    }

    public void setData_emissao(String data_emissao) {
        this.data_emissao = data_emissao;
    }

    public String getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(String data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    public String getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(String data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
