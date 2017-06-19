/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InventaireProduit;

import java.util.ArrayList;

/**
 *
 * @author Moustapha
 */
public class Inventory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayList<Product> listProduit = new ArrayList<Product>();
      Product boisson = new Product("boisson", 500, 5);
      Product lait =new Product("lait", 100, 10);
      Product sucre = new Product("sucre", 300, 12);
      listProduit.add(lait);
      listProduit.add(boisson);
      listProduit.add(sucre);
       for(int i=0;i<listProduit.size();i++)
      {
       System.out.println(listProduit.get(i).getId());
      } 
       int quantite=0;
        for(int i=0;i<listProduit.size();i++)
      {
       Product produit= (Product)listProduit.get(i);
       quantite +=produit.getQuantity();
       
    }
        System.out.println("la quantité totale de l'inventaire est :"+quantite);
    }
    
}
