/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 20180154
 */
public interface ActionsDB {

    
    public ResultSet getResultSet(String req);
    public ArrayList getProgrammeurs();
    public ProgrammeurBean getProgrammeur(int id);
    public void deleteProgrammeur(int id) throws SQLException;
    public void addProgrammeur(ProgrammeurBean prog) throws SQLException;
    public String afficherProgrammeurs();
    public void fermerRessources();
    public void modifyProgrammeur(ProgrammeurBean prog) throws SQLException;
}
