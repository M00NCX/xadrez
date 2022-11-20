package xadrezmod.PIECES;


public class Rei extends Peca {
    
    public Rei(int pogX, int pogY, Color cor){
        this.setPogX(pogX);
        this.setPogY(pogY);
        this.setColor(cor);
    }
    
    @Override
    public boolean movimento(int poginX, int poginY, int pogfinX, int pogfinY){
        if((poginX - pogfinX)==1 || (poginY - pogfinY) == 1){
            System.out.println("Moviemnto permitido");
            return true;
        }else{
            System.out.println("Movimento ILEGAL");
            return false;
        }
    }
    
}
