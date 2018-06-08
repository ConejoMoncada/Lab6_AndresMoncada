/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_andresmoncada;

/**
 *
 * @author Dell
 */
public class Serie extends Entretenimiento{
    private int temporadas;

    public Serie() {
    }

    public Serie(int temporadas, int id, String nombre, String cat, int rating, String productora, String director, String duracion) {
        super(id, nombre, cat, rating, productora, director, duracion);
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return super.toString() + " temporadas: " + temporadas;
    }
    
}
