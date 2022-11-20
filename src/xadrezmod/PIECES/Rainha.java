package xadrezmod.PIECES;

public class Rainha extends Peca{

        public Rainha(int pogX, int pogY, Color cor){
        this.setPogX(pogX);
        this.setPogY(pogY);
        this.setColor(cor);
    }
    
        @Override
    public boolean movimento(int poginX, int poginY, int pogfinX, int pogfinY){
        if((poginX != pogfinX) || (poginY != pogfinY)){
            System.out.println("Moviemnto permitido");
            return true;
        }else{
            System.out.println("Movimento ILEGAL");
            return false;
        }
    }
}
