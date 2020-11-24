/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composant;

/**
 *
 * @author MAAZAZ
 */
public abstract class Boisson {
    String description;
    public String getDescription() {
        return description;
    }
    public abstract double cout();
}

