package com.mycompany.metodofabricaauto;

/**
 *
 * @author Sebastian
 */
public class CreadorCamioneta extends CreadorAuto{

    @Override
    public Auto crearAuto() {
        return new Camioneta(null,null);
    }
    
}
