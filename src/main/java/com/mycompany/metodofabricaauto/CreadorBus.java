/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.metodofabricaauto;

/**
 *
 * @author Sebastian
 */
public class CreadorBus extends CreadorAuto{

    @Override
    protected Auto crearAuto() {
        return new Bus();
    }
    
}
