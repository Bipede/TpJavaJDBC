/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

import data.DataTransac;
import data.ProgrammeurBean;

/**
 *
 * @author 20180154
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        DataTransac dt = new DataTransac();
//        dt.addProgrammeur(new ProgrammeurBean(123, "jean", "sbthre", "18 ruesde", "shsgqz", "gqzgqzgqr", "sdfgergzg", new java.util.Date(), new java.util.Date()));
//        System.out.println(dt.afficherProgrammeurs());
        GestionVue vue = new GestionVue();
        vue.setVisible(true);
    }
    
}
