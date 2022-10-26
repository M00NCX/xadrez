package xadrezmod.PIECES;
import java.util.ArrayList;
import xadrezmod.Movimentacao;
import xadrezmod.Posicao;

public class Peca {
  
    Color cor;
    private int pogX;
    private int pogY;
    private Movimentacao mov; 

    /**
     * @param color the color to set
     */
    public void setColor(Color cor) {
        this.cor = cor;
    }

    /**
     * @param pogX the pogX to set
     */
    public void setPogX(int pogX) {
        this.pogX = pogX;
    }

    /**
     * @param pogY the pogY to set
     */
    public void setPogY(int pogY) {
        this.pogY = pogY;
    }

    /**
     * @param mov the mov to set
     */
    public void setMov(Movimentacao mov) {
        this.mov = mov;
    }

    /**
     * @return the color
     */
    public Color getCor() {
        return cor;
    }

    /**
     * @return the pogX
     */
    public int getPogX() {
        return pogX;
    }

    /**
     * @return the pogY
     */
    public int getPogY() {
        return pogY;
    }

    /**
     * @return the mov
     */
    public Movimentacao getMov() {
        return mov;
    }
    
    
}