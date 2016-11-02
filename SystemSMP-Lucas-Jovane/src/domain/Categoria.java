/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Jovane
 */
public class Categoria {
    private static int NextId = 0;
    private int id;
    private String categoria;
    private String desc;
    private float valorHora;

    public Categoria(String categoria, String desc, float valorHora) {
        NextId++;
        this.id = NextId;
        this.categoria = categoria;
        this.desc = desc;
        this.valorHora = valorHora;
    }

    public Categoria(float valorHora, String desc, String categoria) {
        this.id = NextId;
        this.categoria = categoria;
        this.desc = desc;
        this.valorHora = valorHora;
    }

    public static int getNextId() {
        return NextId;
    }

    public static void setNextId(int NextId) {
        Categoria.NextId = NextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }


}
