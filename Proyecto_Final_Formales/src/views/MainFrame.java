package views;

import controller.Actions;
import modules.expresiones_regulares.src.controllers.Events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    public static final String TITLE = "Proyecto Final";

    public MainFrame(ActionListener listener){
        setTitle(TITLE);
        setSize(200,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(3,1));
        addButtons(listener);
    }

    private void addButtons(ActionListener listener){
        addREBTN(listener);
    }

    private void addREBTN(ActionListener listener){
        JButton reBtn = new JButton("Expresiones regulares");
        reBtn.setActionCommand(Actions.REGULAR_EXPRESSIONS.toString());
        reBtn.addActionListener(listener);
        add(reBtn);

        JButton btnPda = new JButton("Autómata de pila");
        btnPda.setActionCommand(Actions.PDA.toString());
        btnPda.addActionListener(listener);
        add(btnPda);
        
        JButton btnGramReg = new JButton("Gramaticas Regulares");
        btnGramReg.setActionCommand(Actions.REGULAR_GRAMMAR.toString());
        btnGramReg.addActionListener(listener);
        add(btnGramReg);
    }
}
