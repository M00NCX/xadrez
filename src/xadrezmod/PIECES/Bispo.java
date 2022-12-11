package xadrezmod.PIECES;

public class Bispo extends Peca{
       
    public Bispo (int pogX, int pogY, Color cor) {
        this.setPogX(pogX);
        this.setPogY(pogY);
        this.setColor(cor);
        this.setImagem("D:\\img\\BISPO"+cor+".gif");
    }
    
    @Override
    public boolean movimento(int poginX, int poginY, int pogfinX, int pogfinY)
    {
        if((poginX != pogfinX) && (poginY != pogfinY))
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
