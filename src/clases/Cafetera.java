/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author lveloza1
 */
public class Cafetera {

    private long capacidad_maxima;
    private long cantidad_actual;

    public Cafetera(long capacidad_maxima, long cantidad_actual) {
        this.capacidad_maxima = capacidad_maxima;
        this.cantidad_actual = cantidad_actual;

        if (cantidad_actual > capacidad_maxima) {
            capacidad_maxima = cantidad_actual;
        }
    }

    public Cafetera() {
        this.capacidad_maxima = 1000;
        this.cantidad_actual = 0;
    }

    public long getCapacidad_maxima() {
        return capacidad_maxima;
    }

    public long getCantidad_actual() {
        return cantidad_actual;
    }

    public void setCapacidad_maxima(long capacidad_maxima) {
        this.capacidad_maxima = capacidad_maxima;
    }

    public void setCantidad_actual(long cantidad_actual) {
        this.cantidad_actual = cantidad_actual;
    }

    public void llenar_cafetera() {
        this.setCantidad_actual(this.getCapacidad_maxima());

    }

    public void servir_taza(long servir) {
        long aux;

        if (this.getCantidad_actual() < servir) {
            aux = 0;
            this.setCantidad_actual(aux);
        } else {
            aux = this.getCantidad_actual() - servir;
            this.setCantidad_actual(aux);
        }
    }

    public void vaciar_cafetera() {

        this.setCantidad_actual(0);

    }

    public void agregar_cafe(long agregar) {
        long aux;
        aux = this.getCantidad_actual() + agregar;
        this.setCantidad_actual(aux);
    }

}
