/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ananu
 */
public class Calculo {
    
    private String nombreOp;
    private int numero1;
    private int numero2;
    private int resultadoOp;

    public Calculo(String nombreOp, int numero1, int numero2, int resultadoOp) {
        this.nombreOp = nombreOp;
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultadoOp = resultadoOp;
    }

    public String getNombreOp() {
        return nombreOp;
    }

    public void setNombreOp(String nombreOp) {
        this.nombreOp = nombreOp;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getResultadoOp() {
        return resultadoOp;
    }

    public void setResultadoOp(int resultadoOp) {
        this.resultadoOp = resultadoOp;
    }
    
    
    
}
