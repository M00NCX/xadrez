package xadrezmod.PIECES;

public class Peao extends Peca {

    public Peao(int pogX, int pogY, Color cor, String imagem){
        this.setPogX(pogX);
        this.setPogY(pogY);
        this.setColor(cor);
        this.setImagem(imagem);
    }
    
    private boolean firstMov = true;
    
    @Override
    public boolean movimento(int poginX, int poginY, int pogfinX, int pogfinY){
        if((poginY - pogfinY)==1){
            System.out.println("Moviemnto permitido");
            return true;
        }else{
            System.out.println("Movimento ILEGAL");
            return false;
        }
    }
}
