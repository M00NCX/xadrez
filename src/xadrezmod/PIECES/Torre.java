package xadrezmod.PIECES;

import xadrezmod.Posicao;

public class Torre extends Peca{   

    public Torre(int pogX, int pogY, Color cor) {
        this.setPogX(pogX);
        this.setPogY(pogY);
        this.setColor(cor);
    }
    
    public boolean movimento(int poginX, int poginY, int pogfinX, int pogfinY)
    {
        if( (poginX == pogfinX && poginY != pogfinY) || (poginX != pogfinX && poginY == pogfinY) )
        {
            System.out.println("Movimento permitido");
            return true;
        }
        else 
        {
            System.out.println("Movimento ILEGAL");
            return false;
        }
    }
}
