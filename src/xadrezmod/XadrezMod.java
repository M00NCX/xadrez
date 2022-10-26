package xadrezmod;
////♔♕♗♘♙♖♚♛♝♞♟♜
import java.util.Scanner;
import xadrezmod.PIECES.Color;
import xadrezmod.PIECES.Torre;
import xadrezmod.TABULEIRO.Tabuleiro;
public class XadrezMod {

    public static void main(String[] args) {
   
        int cfX;
        int cfY;
        
        Color cor = null;
        //CRIANDO AS PEÇAS
        Torre torreW = new Torre(7, 0, cor.WHITE);
        Torre torreW1 = new Torre(7, 7, cor.WHITE);
        Torre torreB = new Torre(0, 0, cor.BLACK);
        Torre torreB1 = new Torre(0, 7, cor.BLACK);
        
        Tabuleiro tab = new Tabuleiro();
        Scanner in = new Scanner(System.in);
        Scanner aft = new Scanner(System.in);
     
        System.out.println("Onde esta cordenada X da torre?: ");
        torreW.setPogX(in.nextInt());
    
        System.out.println("Onde esta a cordenada Y da torre?: ");
        torreW.setPogY(in.nextInt());
    
        System.out.println("Para onde vai a cordenada X da torre");
        cfX = aft.nextInt();
    
        System.out.println("Para onde vai a cordenada Y da torre");
        cfY = aft.nextInt();
    
       if(tab.checkEnderecos(torreW.getPogX(), torreW.getPogY()))
       {
           if(torreW.movimento(torreW.getPogX(), torreW.getPogY(), cfX, cfY))
           {
               torreW.setPogX(cfX);
               torreW.setPogY(cfY);
               tab.setEnderecos(false,torreW.getPogX(), torreW.getPogY());
               tab.setEnderecos(true, cfX, cfY);
           }
           
       }
        
    }
    
        
}
    