/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Date;

/**
 *
 * @author 20180154
 */
public class ProgrammeurBean {

    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private Date date_naiss;
    private String pseudo;
    private String responsable;
    private Date date_emb;
    private String hobby;
    private int matricule; 

    /**
     *
     */
    public ProgrammeurBean() {
    }

    /**
     *
     * @param id
     * @param nom
     * @param prenom
     * @param adresse
     * @param pseudo
     * @param responsable
     * @param hobby
     * @param date_naiss
     * @param date_emb
     */
    public ProgrammeurBean(int id, String nom, String prenom, String adresse, String pseudo, String responsable, String hobby, Date date_naiss, Date date_emb) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.pseudo = pseudo;
        this.responsable = responsable;
        this.hobby = hobby;
        this.date_naiss = date_naiss;
        this.date_emb = date_emb;
    }

    @Override
    public String toString() {
        String affichage = "Matricule : " + this.getMatricule() + "\n"
                + "Nom : " + this.getNom() + "\n"
                + "Prénom : " + this.getPrenom() + "\n"
                + "Adresse : " + this.getAdresse() + "\n"
                + "Pseudo : " + this.getPseudo() + "\n"
                + "Responsable : " + this.getResponsable() + "\n"
                + "Hobby : " + this.getHobby() + "\n"
                + "Naissance : " + this.getDate_naiss() + "\n"
                + "Embauche : " + this.getDate_emb() + "\n"
                + "\n";

        return affichage;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @return
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     *
     * @param adresse
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     *
     * @return
     */
    public Date getDate_naiss() {
        return date_naiss;
    }

    /**
     *
     * @param date_naiss
     */
    public void setDate_naiss(Date date_naiss) {
        this.date_naiss = date_naiss;
    }

    /**
     *
     * @return
     */
    public String getResponsable() {
        return responsable;
    }

    /**
     *
     * @param responsable
     */
    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    /**
     *
     * @return
     */
    public Date getDate_emb() {
        return date_emb;
    }

    /**
     *
     * @param date_emb
     */
    public void setDate_emb(Date date_emb) {
        this.date_emb = date_emb;
    }

    /**
     *
     * @return
     */
    public String getHobby() {
        return hobby;
    }

    /**
     *
     * @param hobby
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    /**
     *
     * @return
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     *
     * @param prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     *
     * @return
     */
    public String getPseudo() {
        return pseudo;
    }

    /**
     *
     * @param pseudo
     */
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    int getMatricule() {
        return matricule;
    }
    
    /**
     *
     * @param matricule
     */
    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

}
