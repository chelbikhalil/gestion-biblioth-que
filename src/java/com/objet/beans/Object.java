/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objet.beans;

import java.io.Serializable;

/**
 *
 * @author Laptop
 */
public class Object  implements Serializable{
   private int id_doc;
   private String lib_doc;
   private String lib_categorie;
   private String img_doc;
   private String description;
   private String etat;

    /**
     * @return the id_doc
     */
    public int getId_doc() {
        return id_doc;
    }

    /**
     * @param id_doc the id_doc to set
     */
    public void setId_doc(int id_doc) {
        this.id_doc = id_doc;
    }

    /**
     * @return the lib_doc
     */
    public String getLib_doc() {
        return lib_doc;
    }

    /**
     * @param lib_doc the lib_doc to set
     */
    public void setLib_doc(String lib_doc) {
        this.lib_doc = lib_doc;
    }



    /**
     * @return the img_doc
     */
    public String getImg_doc() {
        return img_doc;
    }

    /**
     * @param img_doc the img_doc to set
     */
    public void setImg_doc(String img_doc) {
        this.img_doc = img_doc;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the etat
     */
    public String getEtat() {
        return etat;
    }

    /**
     * @param etat the etat to set
     */
    public void setEtat(String etat) {
        this.etat = etat;
    }

    /**
     * @return the lib_categorie
     */
    public String getLib_categorie() {
        return lib_categorie;
    }

    /**
     * @param lib_categorie the lib_categorie to set
     */
    public void setLib_categorie(String lib_categorie) {
        this.lib_categorie = lib_categorie;
    }
   
}
