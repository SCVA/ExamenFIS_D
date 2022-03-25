/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
}
