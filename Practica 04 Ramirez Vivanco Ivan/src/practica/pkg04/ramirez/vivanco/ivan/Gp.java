/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg04.ramirez.vivanco.ivan;

/**
 *
 * @author Usuario
 */
public class Gp {
    private String piloto;
    private int numero;
    private int categoria;
    private String moto;

    public Gp(String piloto,
            int numero,
            int categoria,
            String moto) {
        this.piloto = piloto;
        this.numero = numero;
        this.categoria = categoria;
        this.moto = moto;
    }

    
    
    public Gp(){
        
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setMoto(String moto) {
        this.moto = moto;
    }

    public String getPiloto() {
        return piloto;
    }

    public int getNumero() {
        return numero;
    }

    public String getMoto() {
        return moto;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getCategoria() {
        return categoria;
    }
    
    
    
}
