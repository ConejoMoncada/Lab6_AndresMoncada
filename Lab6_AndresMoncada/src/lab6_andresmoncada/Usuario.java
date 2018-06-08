/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_andresmoncada;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Dell
 */
public class Usuario {
    private String email;
    private String pass;
    private Date dob;
    private String tarjeta;
    private ArrayList<Entretenimiento> favoritos = new ArrayList();

    public Usuario() {
    }

    public Usuario(String email, String pass, Date dob, String tarjeta) {
        this.email = email;
        this.pass = pass;
        this.dob = dob;
        this.tarjeta = tarjeta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public ArrayList<Entretenimiento> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(ArrayList<Entretenimiento> favoritos) {
        this.favoritos = favoritos;
    }

    @Override
    public String toString() {
        return email;
    }
    
}
