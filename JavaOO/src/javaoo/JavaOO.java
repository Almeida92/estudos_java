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
public class JavaOO {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno = new Aluno("felipe", 12, 15);
       
        System.out.println("nome do aluno é: " + aluno.getName());      
        System.out.println("idade do aluno é: " + aluno.getIdade());
    }
}
