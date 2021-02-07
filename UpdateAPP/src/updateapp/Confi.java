/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package updateapp;

/**
 *
 * @author march
 */
public interface Confi {
    
    //Configuracion de Directorio
    static String SO = System.getProperty("os.name");
    
    //Configuraciones para Update
    static String nameArchivo = "UpdateAPP.zip";
    static String CarpetaUpdate = "Update/";
    static String Version = "1.1";
    static String UrlVersion = "https://raw.githubusercontent.com/marchelo1989/ActualizacionAPP/marchelo/version.txt";
    static String UrlDescarga = "https://github.com/marchelo1989/ActualizacionAPP/releases/download/v1.1/UpdateAPP.zip";
}
