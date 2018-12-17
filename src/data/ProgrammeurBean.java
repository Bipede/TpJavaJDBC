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

    public ProgrammeurBean() {
    }

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
        String affichage = "Prénom : " + this.getPrenom() + "\n"
                + "Nom : " + this.getNom() + "\n"
                + "ID : " + this.getId() + "\n"
                + "Pseudo : " + this.getPseudo() + "\n"
                + "Adresse : " + this.getAdresse() + "\n"
                + "Responsable : " + this.getResponsable() + "\n"
                + "Hobby : " + this.getHobby() + "\n"
                + "Naissance : " + this.getDate_naiss() + "\n"
                + "Embauche : " + this.getDate_emb() + "\n"
                + "\n";

        return affichage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Date getDate_naiss() {
        return date_naiss;
    }

    public void setDate_naiss(Date date_naiss) {
        this.date_naiss = date_naiss;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public Date getDate_emb() {
        return date_emb;
    }

    public void setDate_emb(Date date_emb) {
        this.date_emb = date_emb;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

}
