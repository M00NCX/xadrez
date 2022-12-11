/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xadrezmod.TABULEIRO;
import javax.swing.JLabel;
import xadrezmod.PIECES.*;
import javax.swing.*;

/**
 *
 * @author Dry
 */
public class JPeca extends JLabel{
    private Peca peca;

    public JPeca(Peca peca) {
        this.peca = peca;
        this.setIcon(new ImageIcon(peca.getImagem()));
    }

    
    /**
     * @return the peca
     */
    public Peca getPeca() {
        return this.peca;
    }

    /**
     * @param peca the peca to set
     */
    public void setPeca(Peca peca) {
        this.peca = peca;
    }
}
