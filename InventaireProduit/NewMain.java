/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InventaireProduit;

/**
 *
 * @author Moustapha
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Product boisson = new Product("boisson", 500, 5);
      Product lait =new Product("lait", 100, 10);
      Product sucre = new Product("sucre", 300, 12);
       Product pain = new Product("pain", 500, 5);
      Product beurre =new Product("beurre", 100, 10);
      Product riz = new Product("riz", 300, 12);
      Utilisateur user = new Utilisateur();
      user.ajouterProduit(lait);
      user.ajouterProduit(boisson);
      user.ajouterProduit(sucre);
      user.ajouterProduit(pain);
      user.ajouterProduit(beurre);
      user.ajouterProduit(riz);
      user.afficherProduits();
      user.supprimerProduit(lait);
      user.afficherProduits();
      user.modifierProduit(sucre, "bonbon", 100, 10);
      user.afficherProduits();
      user.supprimerProduit(pain);
      user.afficherProduits();
    }
    
}
