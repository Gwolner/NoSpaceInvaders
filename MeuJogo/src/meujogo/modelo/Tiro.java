/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meujogo.modelo;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author wolner
 */
public class Tiro {
    
    private Image imagem;
    private int x;
    private int y;
    private int largura;
    private int altura;
    private boolean isVisible;
    
    private static final int LARGURA = 938;
    private static int VELOCIDADE = -5;
    
    public Tiro(int x, int y){
        this.x = x;
        this.y = y;
        this.isVisible = true;
    }
    
    public void load(){
        ImageIcon referencia = new ImageIcon("res\\tiro.PNG");
        imagem = referencia.getImage();
        
        this.largura = imagem.getWidth(null);
        this.altura = imagem.getHeight(null);
    }
    
    public void update(){
//        this.x += VELOCIDADE;
//        if(this.x > LARGURA){
//            isVisible = false;
//        }
        
        this.y += VELOCIDADE;
        if(this.y > LARGURA){
            isVisible = false;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isIsVisible() {
        return isVisible;
    }

    public void setIsVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }

    public static int getVELOCIDADE() {
        return VELOCIDADE;
    }

    public static void setVELOCIDADE(int VELOCIDADE) {
        Tiro.VELOCIDADE = VELOCIDADE;
    }

    public Image getImagem() {
        return imagem;
    }
    
    
    
}
