/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.municao;

import java.awt.Color;
import java.awt.Graphics;
import modelo.player.Nave;
import modelo.tiro.Tiro;
import interfaces.strategy.ComportamentoDisparo;

/**
 *
 * @author wolner
 */
public class RaioCosmico implements ComportamentoDisparo {

    @Override
    public void load(Tiro tiro, Graphics g) {
        g.setColor(Color.yellow);
        g.fillRect(tiro.getX() - 2, tiro.getY() + 1, 6, 15);
    }

    @Override
    public void update(Tiro tiro, Nave nave) {
        int tiroY = tiro.getY();
        tiroY += tiro.getVELOCIDADE();
        tiro.setY(tiroY);
        if (tiro.getY() > tiro.getAltura()) {
            tiro.setVisible(false);
        }
    }
    
}
