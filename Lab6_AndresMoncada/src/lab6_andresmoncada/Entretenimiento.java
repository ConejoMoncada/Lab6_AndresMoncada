/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_andresmoncada;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Entretenimiento {
    protected int id;
    protected String nombre;
    protected String cat;
    protected int rating;
    protected String productora;
    protected String director;
    protected String duracion;
    protected ArrayList<String> idiomas = new ArrayList();
    protected ArrayList<String> subt = new ArrayList();
    protected ArrayList<String> comentarios = new ArrayList();
    protected ArrayList<String> actores = new ArrayList();

    public Entretenimiento() {
    }

    public Entretenimiento(int id, String nombre, String cat, int rating, String productora, String director, String duracion) {
        this.id = id;
        this.nombre = nombre;
        this.cat = cat;
        this.rating = rating;
        this.productora = productora;
        this.director = director;
        this.duracion = duracion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public ArrayList<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<String> idiomas) {
        this.idiomas = idiomas;
    }

    public ArrayList<String> getSubt() {
        return subt;
    }

    public void setSubt(ArrayList<String> subt) {
        this.subt = subt;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
    }

    public ArrayList<String> getActores() {
        return actores;
    }

    public void setActores(ArrayList<String> actores) {
        this.actores = actores;
    }

    @Override
    public String toString() {
        return nombre;
    }
    public String datos(){
        return id + " " + nombre + " Categoria: " + cat + " Rating:" + rating + " actores:" + actores + " duracion:" + duracion;
    }
    
}
