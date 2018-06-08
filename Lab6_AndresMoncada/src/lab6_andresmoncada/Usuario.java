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
}
