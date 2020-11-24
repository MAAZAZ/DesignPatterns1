/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorateur;

import composant.Boisson;

/**
 *
 * @author MAAZAZ
 */
public class Chocolat extends DecorateurIngredient{
    public Chocolat(Boisson boisson) 
    { 
        super(boisson); 
    }
    public double cout() 
    { 
        return 0.3 +boisson.cout(); 
    }
    public String getDescription() {
        return boisson.getDescription()+" au Chocolat";
    }
}