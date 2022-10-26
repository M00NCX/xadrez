package xadrezmod.TABULEIRO;

public class Tabuleiro {
    
    private boolean [][]enderecos = new boolean[8][8];
    public boolean checkEnderecos(int pogX, int pogY)
    {
        if(getEnderecos()[pogX][pogY] == false)
        {
            System.out.println("A peca pode ser colocada nessa posicao!");
            return true;
        }
        else
        {
            System.out.println("A peca nao pode ser colocada nessa posicao!");
            return false;
        }
    }

    /**
     * @return the enderecos
     */
    public boolean[][] getEnderecos() {
        return enderecos;
    }

    /**
     * @param enderecos the enderecos to set
     */
    public void setEnderecos(boolean ocupado, int X, int Y)
    {
        this.enderecos[X][Y] = ocupado;
        System.out.println("DEU BOM");
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
