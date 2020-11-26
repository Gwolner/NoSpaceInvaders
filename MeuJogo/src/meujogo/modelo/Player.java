/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meujogo.modelo;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author wolner
 */
public class Player {
    
    private int x;
    private int y;
    private int dx;
    private int dy;
    private int altura;        
    private int largura;
    private Image imagem;
    private ArrayList<Tiro> tiros;
    
    public Player(){
        this.x = 450;
        this.y = 600;
        
        this.tiros = new ArrayList<Tiro>();
    }
    
    public void load(){
        ImageIcon referencia = new ImageIcon("res\\nave.PNG");
        imagem = referencia.getImage();
        
        this.altura = imagem.getHeight(null);
        this.largura = imagem.getWidth(null);
    }
    
    public void update(){
        x += dx;
        y += dy;
    }
    
    public void tiroSimples(){
//        this.tiros.add(new Tiro(x+largura, y + (altura/2)));
        this.tiros.add(new Tiro(x, y));
    }
    
    public void keyPressed(KeyEvent tecla){
        int codigo = tecla.getKeyCode();
        
        if(codigo == KeyEvent.VK_SPACE){
            tiroSimples();
        }
        
//        if(codigo == KeyEvent.VK_UP){
//            dy = -3;
//        }
//        
//        if(codigo == KeyEvent.VK_DOWN){
//            dy = 3;
//        }
        
        if(codigo == KeyEvent.VK_LEFT){
            dx = -3;
        }
        
        if(codigo == KeyEvent.VK_RIGHT){
            dx = 3;
        }
    }
    
    public void keyRelease(KeyEvent tecla){
        int codigo = tecla.getKeyCode();
        
//        if(codigo == KeyEvent.VK_UP){
//            dy = 0;
//        }
//        
//        if(codigo == KeyEvent.VK_DOWN){
//            dy = 0;
//        }
        
        if(codigo == KeyEvent.VK_LEFT){
            dx = 0;
        }
        
        if(codigo == KeyEvent.VK_RIGHT){
            dx = 0;
        }
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImagem() {
        return imagem;
    }

    public ArrayList<Tiro> getTiros() {
        return tiros;
    }
    
    
    
}
