/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xadrezmod.TABULEIRO;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Dry
 */
public class TelaJ extends JFrame{
    
    private static final Dimension DIMENSAO = new Dimension(680,730);
    
    public TelaJ(){
        setTitle("ChessMod Game");
        this.add(new JTabu(new Tabuleiro()));
        this.setSize(DIMENSAO);
        final JMenuBar tableMenuBar = new JMenuBar();
        barraMenu(tableMenuBar);
        this.setJMenuBar(tableMenuBar);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
    
    private void barraMenu(final JMenuBar tableMenuBar){
        tableMenuBar.add(createFileMenu());
    }
    
    private JMenu createFileMenu(){
        final JMenu fileMenu = new JMenu("Jogo");
        
        final JMenuItem opcoes = new JMenuItem("Opções");
        opcoes.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("COLOCAR UM POP-UP");
        }
        });
        fileMenu.add(opcoes);
        
        final JMenuItem regras = new JMenuItem("Regras");
        regras.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("COLOCAR UM POP-UP");
        }
        });
        fileMenu.add(regras);
        
        final JMenuItem sobre = new JMenuItem("Sobre");
        sobre.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("COLOCAR UM POP-UP");
        }
        });
        fileMenu.add(sobre);
        
                
        final JMenuItem sair = new JMenuItem("Sair");
        sair.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
        }
        });
        fileMenu.add(sair);
        
        return fileMenu;      
    }
    
}
