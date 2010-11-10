package TP2;


import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gravufo
 */
public class Fenetre extends JFrame
{
    private Damier damier;

    public Fenetre()
    {
        super("Super damier de Christian!");

        damier = new Damier();


        
        this.setLayout(new GridLayout(1,0));
        this.setPreferredSize(new Dimension(600,600));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(damier);
        this.pack();
        this.setVisible(true);
    }
}
