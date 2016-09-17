/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 *
 * @author Aluno
 */
public class Empresa {

    private String nome;
    private String endereco;
    private String num;
    private String cnpj;
    private String cidade;
    private String cpf;
    private String estado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void mostrarEmpresa() {
        System.out.println("\n");
        System.out.println("Nome: " + getNome());
        System.out.println("CNPJ: " + getCnpj());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Número Endereço: " + getNum());
        System.out.println("Cidade: " + getCidade());
        System.out.println("Estado: " + getEstado());
        System.out.println("CPF: " + getCpf());
        System.out.println("----------------------------------------------------");
    }

}
