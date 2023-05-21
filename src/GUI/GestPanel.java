package GUI;

import Dati.Voce;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GestPanel extends JPanel implements ActionListener {

    protected JLabel l;     //probabilmente mi servirà protected perchè verrà modificata all'inserimento di una voce

    private MyTableModel modello;

    public GestPanel() {
        super();

        setLayout(new GridLayout(3,1));

        modello = new MyTableModel();
        JScrollPane s = new JScrollPane(new JTable(modello));

        l = new JLabel("Totale: 0€");

        add(new JLabel("Scelta data da implementare"));
        add(s);

        JPanel p1 = new JPanel();
        JButton b = new JButton("Inserisci voce");
        b.addActionListener(this);

        p1.add(l);
        p1.add(b);

        add(p1);
    }

    public MyTableModel getModel() {
        return modello;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        JFrame prova = new JFrame("Prova");
        prova.setLocationRelativeTo(null);
        prova.setVisible(true);
    }
}
