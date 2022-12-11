package xadrezmod.TABULEIRO;
import xadrezmod.PIECES.*;

public final class Tabuleiro 
{
    private Peca end[][];
    private Color jogadorDaVez = Color.WHITE;
    public static final int tempoDeMovimento = 20000; //20s para cada jogada
    private Peca selecionada = null;
    
    public Tabuleiro() 
    {
        this.end = new Peca[8][8];
             
        Torre torreW1 = new Torre(0, 0, Color.WHITE);
        Torre torreW2 = new Torre(0, 7, Color.WHITE);
        this.adiconaPeca(torreW1);
        this.adiconaPeca(torreW2);
        
        Torre torreB1 = new Torre(7, 0, Color.BLACK);
        Torre torreB2 = new Torre(7, 7, Color.BLACK);
        this.adiconaPeca(torreB1);
        this.adiconaPeca(torreB2);
        
        Bispo bispoB1 = new Bispo(7, 2, Color.BLACK);
        Bispo bispoB2 = new Bispo(7, 5, Color.BLACK);
        this.adiconaPeca(bispoB1);
        this.adiconaPeca(bispoB2);
        
        Bispo bispoW1 = new Bispo(0, 2, Color.WHITE);
        Bispo bispoW2 = new Bispo(0, 5, Color.WHITE);
        this.adiconaPeca(bispoW1);
        this.adiconaPeca(bispoW2);
        

    }
    
  public Peca getEnd(int linha, int coluna){
      return this.end[linha][coluna];      
  }
    
  public void selected(Peca peca){//clicando na peça
      if(peca.isSelected()){
          peca.setSelected(false);
          this.selecionada = null;
      }else{
          peca.setSelected(true);
          this.selecionada = peca;
      }
  }
  
  public void adiconaPeca(Peca peca){
      this.end[peca.getPogX()][peca.getPogY()] = peca;
      peca.setTabuleiro(this);  
  }

  /*public boolean checkEnd( int xi, int yi, int xf, int yf)
  {
     if(this.end[xf][yf].isOcupado() == false){
         System.out.println("Movimento permitido");
         return true;
     }
     else
     {
         if(this.end[xi][yi].get.getCor() == this.end[xf][yf].getPeca().getCor())
         {
             System.out.println("Tentando comer o amigo??????????");
             return false;
         }else{
             System.out.println("Vc capturou uma peca inimiga!");
             return true;
         }
     }
    }*/
  
 public void playerT(){//mudando de jogador
     if(this.jogadorDaVez.equals(Color.WHITE)){
         this.jogadorDaVez = Color.BLACK; 
     }else{
         this.jogadorDaVez = Color.WHITE;
     }
 }
  
    /**
     * @return the end
     */
    public Peca[][] getEnd() {
        return end;
    }

    /**
     */
    /*public void setEnd(Peca peca, boolean ocup) 
    {
        this.end[peca.getPogX()][peca.getPogY()].setPeca(peca);
        this.end[peca.getPogX()][peca.getPogY()].setOcupado(ocup);
    }*/
      
    
  
}    

   /* public static Tabuleiro tabuleiro = new Tabuleiro ();
    int [][]square = new int[8][8]; //criação da matriz
    char a = 65; //letra a em ASCII
    char h = 72; //letra h
    public void printTab(){
        System.out.print("#  ");
        for(int c=0 ; c<8 ; c++){
                System.out.printf("%c  ", a); //printar as letras na parte superior
                a++;
        }
        System.out.println("");
    
        for(int i=0 ; i<8 ; i++){
                System.out.print((i+1)+" "); //printar os numeros na lateral esquerda
                for(int j=0 ; j<8 ; j++){				
                        System.out.print("[" + square[i][j] + "]");				
                        if(j == 7){					
                                System.out.println(""); //"quebrar a matriz"
                        }				
                }
        }
        System.out.print("#  ");
        for(int b=0 ; b<8 ; b++){
                System.out.printf("%c  ", h);//printar as letras na parte inferior
                h--;
        }
        System.out.println("");
    }
    
    //printar os numeros na lateral direita

    public static void main(String [] args){			
        tabuleiro.printTab();	
    }*/