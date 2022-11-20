/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xadrezmod.TABULEIRO;
import javax.swing.JPanel;

/**
 *
 * @author Dry
 */
public class JCasa extends JPanel {
    
    private int i, j;
    private JPeca pecaJ;

    public JCasa(int i, int j) {
        this.i = i;
        this.j = j;
    }

    /**
     * @return the i
     */
    public int getI() {
        return i;
    }

    /**
     * @param i the i to set
     */
    public void setI(int i) {
        this.i = i;
    }

    /**
     * @return the j
     */
    public int getJ() {
        return j;
    }

    /**
     * @param j the j to set
     */
    public void setJ(int j) {
        this.j = j;
    }

    /**
     * @return the pecaJ
     */
    public JPeca getPecaJ() {
        return pecaJ;
    }

    /**
     * @param pecaJ the pecaJ to set
     */
    public void setPecaJ(JPeca pecaJ) {
        this.pecaJ = pecaJ;
    }
}
