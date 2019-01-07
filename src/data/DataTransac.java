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
    @Override
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
    @Override
    public ArrayList getProgrammeurs() {
        rs = this.getResultSet(Const.REQUETE_TOUS);
        listeProgrammeurs = new ArrayList<>();

        try {
            while (rs.next()) {
                prog = new ProgrammeurBean();
                prog.setMatricule(rs.getInt("MATRICULE"));
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
     * @param matricule Le matricule saisi par l'utilisateur pour lancer la recherche
     * @return prog Une variable de type ProgrammeurBean
     *
     */
    @Override
    public ProgrammeurBean getProgrammeur(int matricule) {
        try {
            pstmt = dbConn.prepareStatement(Const.REQUETE_UNIQUE);
            pstmt.setInt(1, matricule);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                prog = new ProgrammeurBean();
                prog.setMatricule(rs.getInt("MATRICULE"));
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
    
    @Override
    public void deleteProgrammeur(int matricule) throws SQLException{
        try {
            pstmt = dbConn.prepareStatement(Const.REQUETE_DELETE);
            pstmt.setInt(1, matricule);
            pstmt.executeUpdate();
        } catch (SQLException sqle) {
            Logger.getLogger(DataTransac.class.getName()).log(Level.SEVERE, null, sqle);
            throw sqle;
        }
    }
    
    @Override
    public void addProgrammeur(ProgrammeurBean prog) throws SQLException{
 
        try {
            pstmt = dbConn.prepareStatement(Const.REQUETE_INSERT);
            pstmt.setString(1, Integer.toString(prog.getMatricule()));
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
            throw e;
        }
    }
    
    @Override
    public void modifyProgrammeur(ProgrammeurBean prog) throws SQLException{
 
        try {
            pstmt = dbConn.prepareStatement(Const.REQUETE_UPDATE);
            pstmt.setString(1, prog.getNom());
            pstmt.setString(2, prog.getPrenom());
            pstmt.setString(3, prog.getAdresse());
            pstmt.setString(4, prog.getPseudo());
            pstmt.setString(5, prog.getResponsable());
            pstmt.setString(6, prog.getHobby());
            pstmt.setDate(7, new java.sql.Date(prog.getDate_naiss().getTime()));
            pstmt.setDate(8, new java.sql.Date(prog.getDate_emb().getTime()));
            pstmt.setInt(9, prog.getMatricule());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    /**
     * Cette méthode permet de construire la chaîne de caractères qui sera
     * affichée lorsqu'on choisit Programmeur - Afficher - Tous
     *
     * @return listeProg Une variable de type String
     *
     */
    @Override
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
    @Override
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
