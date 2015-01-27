package com.bitcubit.zero.db;

/**
 * Created by pablocasadovarela on 27/01/15.
 */
public class zero_db {
    private int id;
    private int sesion;
    private int evento;
    private int inicial;
    private int ultimo;
    private int avance;
    private int duracion;
    private float energia;
    private float energia_duracion;
    private float avance_duracion;
    private float promedio_e_d;
    private float desviacion_e_d;
    private float promedio_a_d;
    private float desviacion_a_d;
    private float prediccion_duracion;
    private float error_duracion;
    private float prediccion_avance;
    private float error_avance;
    private float porc_acierto;

    public zero_db() {
    }

    @Override
    public String toString() {
        return "zero_db{" +
                "id=" + id +
                ", sesion=" + sesion +
                ", evento=" + evento +
                ", inicial=" + inicial +
                ", ultimo=" + ultimo +
                ", avance=" + avance +
                ", duracion=" + duracion +
                ", energia=" + energia +
                ", energia_duracion=" + energia_duracion +
                ", avance_duracion=" + avance_duracion +
                ", promedio_e_d=" + promedio_e_d +
                ", desviacion_e_d=" + desviacion_e_d +
                ", promedio_a_d=" + promedio_a_d +
                ", desviacion_a_d=" + desviacion_a_d +
                ", prediccion_duracion=" + prediccion_duracion +
                ", error_duracion=" + error_duracion +
                ", prediccion_avance=" + prediccion_avance +
                ", error_avance=" + error_avance +
                ", porc_acierto=" + porc_acierto +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSesion() {
        return sesion;
    }

    public void setSesion(int sesion) {
        this.sesion = sesion;
    }

    public int getEvento() {
        return evento;
    }

    public void setEvento(int evento) {
        this.evento = evento;
    }

    public int getInicial() {
        return inicial;
    }

    public void setInicial(int inicial) {
        this.inicial = inicial;
    }

    public int getUltimo() {
        return ultimo;
    }

    public void setUltimo(int ultimo) {
        this.ultimo = ultimo;
    }

    public int getAvance() {
        return avance;
    }

    public void setAvance(int avance) {
        this.avance = avance;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public float getEnergia() {
        return energia;
    }

    public void setEnergia(float energia) {
        this.energia = energia;
    }

    public float getEnergia_duracion() {
        return energia_duracion;
    }

    public void setEnergia_duracion(float energia_duracion) {
        this.energia_duracion = energia_duracion;
    }

    public float getAvance_duracion() {
        return avance_duracion;
    }

    public void setAvance_duracion(float avance_duracion) {
        this.avance_duracion = avance_duracion;
    }

    public float getPromedio_e_d() {
        return promedio_e_d;
    }

    public void setPromedio_e_d(float promedio_e_d) {
        this.promedio_e_d = promedio_e_d;
    }

    public float getDesviacion_e_d() {
        return desviacion_e_d;
    }

    public void setDesviacion_e_d(float desviacion_e_d) {
        this.desviacion_e_d = desviacion_e_d;
    }

    public float getPromedio_a_d() {
        return promedio_a_d;
    }

    public void setPromedio_a_d(float promedio_a_d) {
        this.promedio_a_d = promedio_a_d;
    }

    public float getDesviacion_a_d() {
        return desviacion_a_d;
    }

    public void setDesviacion_a_d(float desviacion_a_d) {
        this.desviacion_a_d = desviacion_a_d;
    }

    public float getPrediccion_duracion() {
        return prediccion_duracion;
    }

    public void setPrediccion_duracion(float prediccion_duracion) {
        this.prediccion_duracion = prediccion_duracion;
    }

    public float getError_duracion() {
        return error_duracion;
    }

    public void setError_duracion(float error_duracion) {
        this.error_duracion = error_duracion;
    }

    public float getPrediccion_avance() {
        return prediccion_avance;
    }

    public void setPrediccion_avance(float prediccion_avance) {
        this.prediccion_avance = prediccion_avance;
    }

    public float getError_avance() {
        return error_avance;
    }

    public void setError_avance(float error_avance) {
        this.error_avance = error_avance;
    }

    public float getPorc_acierto() {
        return porc_acierto;
    }

    public void setPorc_acierto(float porc_acierto) {
        this.porc_acierto = porc_acierto;
    }
}
