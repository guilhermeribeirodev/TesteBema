/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testebema;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author base
 */
public class Tela1 extends JFrame implements ActionListener{
    
    JButton jButton;
    JComboBox combo;
    

    public Tela1() throws HeadlessException {
    }

    public Tela1(String string) throws HeadlessException {
        super(string);
    }
    
    
    public void monta(){
        
        
        setSize(300,300);
        
        GridLayout layout = new GridLayout(2,2);
        
        
        
        setLayout(layout);        
                                    
        jButton = new JButton("OK");
        
        
        String[] itens = {"kajhsdkjasd","ljkhlkjlkjlk"};
        
        combo = new JComboBox(itens);

        
        jButton.addActionListener(this);
  
        add(jButton);
        add(combo);
        add(jButton);
        add(jButton);
        
        layout.setVgap(50);
        layout.setHgap(50);
        
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //throw new UnsupportedOperationException("Not supported yet.");
        
        
        
        System.out.println(""+combo.getSelectedItem().toString());
    }
    
    
    
    
    
    
}
