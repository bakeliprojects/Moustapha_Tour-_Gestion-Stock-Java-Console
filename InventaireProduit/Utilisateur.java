/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InventaireProduit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Moustapha
 */
public class Utilisateur {
     ArrayList<Product> listProduit = new ArrayList<Product>();
     public void ajouterProduit(Product produit){
         if(produit!=null)
             listProduit.add(produit);
         
     }
     public void afficherProduits(){
         System.out.println("la liste des produits est");
         for(int i=0;i<listProduit.size();i++){
            System.out.println(listProduit.get(i).getId());
         }
     }
     public void supprimerProduit(Product produit){
         listProduit.remove(produit);
     }
    public Product modifierProduit(Product produit,String id, int prix, int qhantite){
        
        produit.setId(id);
        produit.setPrice(prix);
        produit.setQuantity(qhantite);
        return produit;
    }
}
