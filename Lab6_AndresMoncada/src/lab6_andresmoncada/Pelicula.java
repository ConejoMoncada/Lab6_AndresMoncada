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
public class Pelicula extends Entretenimiento{

    public Pelicula() {
    }

    public Pelicula(int id, String nombre, String cat, int rating, String productora, String director, String duracion) {
        super(id, nombre, cat, rating, productora, director, duracion);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
