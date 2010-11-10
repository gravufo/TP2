package TP2;


import java.awt.Color;
import java.awt.Graphics;
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
public class Cases extends JPanel
{
    private boolean couleur;

    public Cases(boolean couleur)
    {
        super(new GridLayout(1,0));
        this.couleur = couleur;
    }
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if(couleur)
        {
            g.setColor(Color.WHITE);
        }
        else
        {
            g.setColor(Color.BLACK);
        }
        g.fillRect(0,0,this.getWidth(),this.getHeight());
    }
}
