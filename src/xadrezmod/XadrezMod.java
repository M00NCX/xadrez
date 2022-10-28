package xadrezmod;
////♔♕♗♘♙♖♚♛♝♞♟♜
import java.util.Scanner;
import xadrezmod.PIECES.Color;
import xadrezmod.PIECES.Torre;
import xadrezmod.TABULEIRO.Tabuleiro;
public class XadrezMod 
{
        public static void main(String[] args) 
    {
        int cfX;
        int cfY;
        Peca torre = new Torre();
        torre.setColor('w');
        
        Peca sp = new Torre();
        sp.setColor('b');
       
        Tabuleiro tab = new Tabuleiro();
        
        Scanner in = new Scanner(System.in);
        Scanner aft = new Scanner(System.in);
     
        System.out.println("Onde esta cordenada X da torre?: ");
        torre.setPogX(in.nextInt());
    
        System.out.println("Onde esta a cordenada Y da torre?: ");
        torre.setPogY(in.nextInt());
        
        tab.setEnd(torre, true);
    
        System.out.println("Para onde vai a cordenada X da torre");
        cfX = aft.nextInt();
    
        System.out.println("Para onde vai a cordenada Y da torre");
        cfY = aft.nextInt();
        
        sp.setPogX(cfX);
        sp.setPogY(cfY);
        tab.setEnd(sp, true);
        
       if(torre.movimento(torre.getPogX(), torre.getPogY(), cfX, cfY))
       {
           if(tab.checkEnd(torre.getPogX(),torre.getPogY(), cfX, cfY))
           {
               tab.setEnd(torre, false);
               torre.setPogX(cfX);
               torre.setPogY(cfY);
               tab.setEnd(torre, true);
               
           }
       }
    }
    
}    
    
