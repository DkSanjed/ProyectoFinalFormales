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
        setSize(600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(4,1));
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

        JButton btnDfa = new JButton("Automata finito determinista");
        btnDfa.setActionCommand(Actions.DFA.toString());
        btnDfa.addActionListener(listener);
        add(btnDfa);
    }
}
