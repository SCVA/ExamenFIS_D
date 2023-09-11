package com.mycompany.metodofabricaauto;

/**
 *
 * @author Sebastian
 */
public class CreadorBus extends CreadorAuto{

    @Override
    public Auto crearAuto() {
        return new Bus(null,null);
    }
    
}
