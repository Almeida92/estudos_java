/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoo;

/**
 * 
 * @author 1700164
 */
public class Aluno {   
    private String name;
    private int idade;
    private int ra;
    
    /**
     * ra
     * @param name
     * @param idade
     * @param ra 
     */
    public Aluno(String name, int idade, int ra) {
        this.name = name;
        this.idade = idade;
        this.ra = ra;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
}
