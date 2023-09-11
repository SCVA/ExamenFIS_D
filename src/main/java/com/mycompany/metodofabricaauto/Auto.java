package com.mycompany.metodofabricaauto;

import java.awt.Color;

/**
 *
 * @author Sebastian
 */
public abstract class Auto {
    private Color color;
    private String marca;
    
    public abstract void arrancar();
    public abstract void frenar();

    public Auto(Color color, String marca) {
        this.color = color;
        this.marca = marca;
    }
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}
