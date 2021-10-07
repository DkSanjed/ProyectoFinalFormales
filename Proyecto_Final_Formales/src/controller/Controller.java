package controller;

import modules.expresiones_regulares.src.controllers.REController;
import views.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private MainFrame mainFrame;

    public Controller(){
        mainFrame = new MainFrame(this);
        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (Actions.valueOf(e.getActionCommand())){
            case REGULAR_EXPRESSIONS:
                initRegularExpressions();
                break;
        }
    }

    private void initRegularExpressions(){
        new REController();
    }

    public static void main(String[] args) {
        new Controller();
    }
}