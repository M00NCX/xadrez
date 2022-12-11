package xadrezmod.PIECES;

public class Torre extends Peca{   
    
    public Torre(int pogX, int pogY, Color cor) {//OUTRO CONSTRUTOR
        this.setPogX(pogX);
        this.setPogY(pogY);
        this.setColor(cor);
        this.setImagem("D:\\img\\TORRE"+cor+".gif");
    }
    
    @Override
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

    public String getResource(String torrebrancOpng) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
