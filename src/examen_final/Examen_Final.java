/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_final;

import java.util.Scanner;

/**
 *
 * @author OscarRuiz
 */
public class Examen_Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        examenFinal Examen_Final = new examenFinal();
        Scanner dato = new Scanner (System.in);
        
        Examen_Final.setNro_Hc(dato.nextLine());
        Examen_Final.setCod_Loc(dato.nextLine());
        Examen_Final.setDescripcion(dato.nextLine());
        
        System.out.println("Nro_Hc: " + Examen_Final.getNro_Hc());
        System.out.println("Cod_Loc: " + Examen_Final.getCod_Loc());
        System.out.println("Descripcion: " + Examen_Final.getDescripcion());
    }
    
}
