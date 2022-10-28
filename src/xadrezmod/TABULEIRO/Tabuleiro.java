package xadrezmod.TABULEIRO;

public class Tabuleiro 
{
      private Enderecos end[][];
  
    public Tabuleiro() 
    {
        this.end = new Enderecos[8][8];
        for(int i = 0; i < 8; i++)
        {
            for(int j = 0; j < 8; j++)
            {
                this.end[i][j] = new Enderecos();
            }
        }
    }

  public boolean checkEnd( int xi, int yi, int xf, int yf)
  {
     if(this.end[xf][yf].isOcupado() == false)
     {
         System.out.println("Movimento permitido");
         return true;
     }
     else
     {
         if(this.end[xi][yi].getPeca().getColor() == this.end[xf][yf].getPeca().getColor())
         {
             System.out.println("Tentando comer o amigo??????????");
             return false;
         }
         else
         {
             System.out.println("Vc capturou uma peca inimiga!");
             return true;
         }
     }
  }
    /**
     * @return the end
     */
    public Enderecos[][] getEnd() {
        return end;
    }

    /**
     * @param end the end to set
     */
    public void setEnd(Peca peca, boolean ocup) 
    {
        this.end[peca.getPogX()][peca.getPogY()].setPeca(peca);
        this.end[peca.getPogX()][peca.getPogY()].setOcupado(ocup);
    }
      
  
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
    
}
