/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Const;

/**
 *
 * @author 20180154
 */
public class DataTransac implements ActionsDB {
    private Connection dbConn;
    private Statement stmt;
    private PreparedStatement pstmt;
    private ResultSet rs;
    private ArrayList<ProgrammeurBean> listeProgrammeurs;
    private ProgrammeurBean prog;

    /**
     * Le constructeur permet d'initialiser la connexion
     *
     */
    public DataTransac() {
        try {
            dbConn = DriverManager.getConnection(Const.URL, Const.USER, Const.MDP);
        } catch (SQLException sqle) {
            Logger.getLogger(DataTransac.class.getName()).log(Level.SEVERE, null, sqle);
        }

    }

    /**
     * Lance la récupère passée en paramètre et retourne le ResultSet
     * correspondant à cette requête
     *
     * @param req La requête SQL que l'on souhaite exécuter
     * @return rs Une variable de type ResultSet
     */
    public ResultSet getResultSet(String req) {
        try {
            stmt = dbConn.createStatement();
            rs = stmt.executeQuery(req);
        } catch (SQLException sqle) {
            Logger.getLogger(DataTransac.class.getName()).log(Level.SEVERE, null, sqle);
        }
        return rs;
    }

    /**
     * Cette méthode récupère toutes les infos d'un programmeur et retourne une
     * liste de l'ensemble des programmeurs
     *
     * @return listeProgrammeurs Une variable de type ArryList
     */
    public ArrayList getProgrammeurs() {
        rs = this.getResultSet(Const.REQUETE_TOUS);
        listeProgrammeurs = new ArrayList<>();

        try {
            while (rs.next()) {
                prog = new ProgrammeurBean();
                prog.setId(rs.getInt("MATRICULE"));
                prog.setPrenom(rs.getString("PRENOM"));
                prog.setNom(rs.getString("NOM"));
                prog.setAdresse(rs.getString("ADRESSE"));
                prog.setHobby(rs.getString("HOBBY"));
                prog.setDate_naiss(rs.getDate("DATE_NAISS"));
                prog.setDate_emb(rs.getDate("DATE_EMB"));
                prog.setPseudo(rs.getString("PSEUDO"));
                prog.setResponsable(rs.getString("RESPONSABLE"));
                listeProgrammeurs.add(prog);
            }
        } catch (SQLException sqle) {
            Logger.getLogger(DataTransac.class.getName()).log(Level.SEVERE, null, sqle);
        }
        return listeProgrammeurs;
    }

    /**
     * Cette méthode récupère toutes les infos d'un programmeur et retourne ce
     * programmeur sous la forme d'un Java Bean Cette méthode est utilisée pour
     * rechercher un progammeur via son matricule
     *
     * @param id L'id saisi par l'utilisateur pour lancer la recherche
     * @return prog Une variable de type ProgrammeurBean
     *
     */
    public ProgrammeurBean getProgrammeur(int id) {
        try {
            pstmt = dbConn.prepareStatement(Const.REQUETE_UNIQUE);
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                prog = new ProgrammeurBean();
                prog.setId(rs.getInt("MATRICULE"));
                prog.setPrenom(rs.getString("PRENOM"));
                prog.setNom(rs.getString("NOM"));
                prog.setAdresse(rs.getString("ADRESSE"));
                prog.setHobby(rs.getString("HOBBY"));
                prog.setDate_naiss(rs.getDate("DATE_NAISS"));
                prog.setDate_emb(rs.getDate("DATE_EMB"));
                prog.setPseudo(rs.getString("PSEUDO"));
                prog.setResponsable(rs.getString("RESPONSABLE"));
            }
        } catch (SQLException sqle) {
            Logger.getLogger(DataTransac.class.getName()).log(Level.SEVERE, null, sqle);
        }
        return prog;
    }
    
    public void deleteProgrammeur(int id) {
        try {
            pstmt = dbConn.prepareStatement(Const.REQUETE_DELETE);
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
        } catch (SQLException sqle) {
            Logger.getLogger(DataTransac.class.getName()).log(Level.SEVERE, null, sqle);
        }
    }
    
    public void addProgrammeur(ProgrammeurBean prog) {
 
        try {
            pstmt = dbConn.prepareStatement(Const.REQUETE_INSERT);
            pstmt.setString(1, Integer.toString(prog.getId()));
            pstmt.setString(2, prog.getNom());
            pstmt.setString(3, prog.getPrenom());
            pstmt.setString(4, prog.getAdresse());
            pstmt.setString(5, prog.getPseudo());
            pstmt.setString(6, prog.getResponsable());
            pstmt.setString(7, prog.getHobby());
            pstmt.setDate(8, new java.sql.Date(prog.getDate_naiss().getTime()));
            pstmt.setDate(9, new java.sql.Date(prog.getDate_emb().getTime()));
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void modifyProgrammeur(ProgrammeurBean prog) {
 
        try {
            pstmt = dbConn.prepareStatement(Const.REQUETE_UPDATE);
            pstmt.setString(2, prog.getNom());
            pstmt.setString(3, prog.getPrenom());
            pstmt.setString(4, prog.getAdresse());
            pstmt.setString(5, prog.getPseudo());
            pstmt.setString(6, prog.getResponsable());
            pstmt.setString(7, prog.getHobby());
            pstmt.setDate(8, new java.sql.Date(prog.getDate_naiss().getTime()));
            pstmt.setDate(9, new java.sql.Date(prog.getDate_emb().getTime()));
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Cette méthode permet de construire la chaîne de caractères qui sera
     * affichée lorsqu'on choisit Programmeur - Afficher - Tous
     *
     * @return listeProg Une variable de type String
     *
     */
    public String afficherProgrammeurs() {
        String listeProg = "";

        listeProgrammeurs = this.getProgrammeurs();
        for (ProgrammeurBean progr : listeProgrammeurs) {
            listeProg = listeProg + progr;
        }

        return listeProg;
    }

    /**
     * Cette méthode permet de libérer les ressources liées à la base de données
     * *
     */
    public void fermerRessources() {
        if (dbConn != null) {
            try {
                dbConn.close();
                if (stmt != null) {
                    stmt.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                dbConn = null;
            } catch (SQLException ex) {
                Logger.getLogger(DataTransac.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
