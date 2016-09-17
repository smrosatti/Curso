/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class FakeBD {

    public static ArrayList<Pessoa> pessoas = new ArrayList<>();
    public static ArrayList<Empresa> empresas = new ArrayList<>();

    /**
     * @return the pessoas
     */
    public static ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    /**
     * @param aPessoas the pessoas to set
     */
    public static void setPessoas(ArrayList<Pessoa> pes) {
        pessoas = pes;
    }

    /**
     * @return the empresas
     */
    public static ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    /**
     * @param aEmpresas the empresas to set
     */
    public static void setEmpresas(ArrayList<Empresa> emp) {
        empresas = emp;
    }

}
