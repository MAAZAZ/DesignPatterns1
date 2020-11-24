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
public abstract class DecorateurIngredient extends Boisson {
    protected Boisson boisson;
    public DecorateurIngredient(Boisson boisson) {
        this.boisson= boisson;
    }
    public abstract String getDescription();
}
