/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.controle;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import modelo.player.Nave;

/**
 *
 * @author wolner
 */
public class Joystick extends KeyAdapter {

    Nave nave;

    public Joystick(Nave nave) {
        this.nave = nave;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        nave.keyPressed((e));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        nave.keyRelease(e);
    }
    
}
