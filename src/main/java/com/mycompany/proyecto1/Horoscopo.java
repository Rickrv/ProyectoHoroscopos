/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.proyecto1;

/**
 *
 * @author Ricardo
 */
public class Horoscopo {
    private String nombre;
    private String signo;

    public Horoscopo() {
    }

    public Horoscopo(String nombre, String signo) {
        this.nombre = nombre;
        this.signo = signo;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Horoscopo{" + "nombre=" + nombre + ", signo=" + signo + '}';
    }
    
    
}
