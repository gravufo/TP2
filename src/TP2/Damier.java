package TP2;


import java.awt.GridLayout;
import javax.swing.JPanel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gravufo
 */
public class Damier extends JPanel
{

    public Damier()
    {
        super(new GridLayout(8, 8));

        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                boolean couleur;
                if ((i+j) % 2 == 0) // Si nombre pair
                {
                    couleur = true; // Couleur blanche
                }
                else
                {
                    couleur = false; // Couleur noire
                }
                Cases cases = new Cases(couleur);

                this.add(cases);
            }
        }
    }
}
