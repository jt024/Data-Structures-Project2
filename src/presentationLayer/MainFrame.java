/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentationLayer;

import dataLayer.Link;
import dataLayer.Stack;
import static java.lang.Integer.parseInt;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Trevi
 */
public class MainFrame extends javax.swing.JFrame {
    Random rn = new Random();
    public Stack numStack = new Stack();
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textFieldInteger = new javax.swing.JTextField();
        buttonAddLink = new javax.swing.JButton();
        buttonDeleteLink = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buttonAbout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        buttonAdd500 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taLinks = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Structures Project #1");
        setBackground(new java.awt.Color(240, 240, 234));
        setPreferredSize(new java.awt.Dimension(300, 340));

        textFieldInteger.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        buttonAddLink.setText("Add Link");
        buttonAddLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddLinkActionPerformed(evt);
            }
        });

        buttonDeleteLink.setText("Delete Link");
        buttonDeleteLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteLinkActionPerformed(evt);
            }
        });

        buttonAbout.setText("About");
        buttonAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAboutActionPerformed(evt);
            }
        });

        jLabel1.setText("Linked List Assignment 2");

        buttonAdd500.setText("500");
        buttonAdd500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdd500ActionPerformed(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        taLinks.setEditable(false);
        taLinks.setColumns(20);
        taLinks.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        taLinks.setRows(5);
        taLinks.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        taLinks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                taLinksMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(taLinks);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buttonAddLink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textFieldInteger)
                                    .addComponent(buttonAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonDeleteLink))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(14, 14, 14)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonAdd500, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel3)
                        .addGap(0, 198, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textFieldInteger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonAddLink, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buttonDeleteLink, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonAdd500)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addComponent(buttonAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddLinkActionPerformed
        textFieldInteger.requestFocusInWindow();
        try
        {
            numStack.addLink(parseInt(textFieldInteger.getText()));
            textFieldInteger.setText("");
            if(taLinks.getText()=="")
                taLinks.setText(Integer.toString(numStack.getRoot().getValue()));
            else
            {
                taLinks.setText("");
                update(numStack.getRoot());
//                taLinks.append(Integer.toString(numStack.getTopOfStack().getValue()));
            }            
            
        }
        catch(IllegalArgumentException iex)
        {
            JOptionPane.showMessageDialog(null, "Please enter a 10 digit whole "
                + "number before adding a Link", "Error", JOptionPane.ERROR_MESSAGE);
            textFieldInteger.setText("");
        }



        
    }//GEN-LAST:event_buttonAddLinkActionPerformed

    private void buttonDeleteLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteLinkActionPerformed
//        if(numStack.getRoot().getValue()==(parseInt(textFieldInteger.getText()))&&numStack.getRoot().getNextLink()==null) {
//            textFieldInteger.setText("");
//            numStack = new Stack();
//            return;
//        }
        
    try
    {
        Link toDelete; 
        toDelete = numStack.searchLinkList((parseInt(textFieldInteger.getText())), numStack.getRoot());
        textFieldInteger.setText("");
        textFieldInteger.requestFocusInWindow();
        numStack.deleteLink(toDelete);
                
//        if (numStack.getTopOfStack().getNextLink()!=null) {
//            numStack.setTopOfStack(numStack.getTopOfStack().getNextLink());
                taLinks.setText("");
                update(numStack.getRoot());


//        }        
    }
    catch(NullPointerException nex){
        JOptionPane.showMessageDialog(null, "No link with that value could be located"
            , "Error", JOptionPane.ERROR_MESSAGE);
        textFieldInteger.requestFocusInWindow();
    }
    catch(Exception ex){
        JOptionPane.showMessageDialog(null, 
                "There are no links in the list", 
                "INFORMATION", 
                JOptionPane.INFORMATION_MESSAGE);
        taLinks.setText("");
        textFieldInteger.requestFocusInWindow();        
    }

    
//    if(taLinks.getText().equalsIgnoreCase(""))
//        numStack = new Stack();
        



            


        
//        try
//        {
//            parseInt(textFieldInteger.getText());
//        }catch(IllegalArgumentException iex){
//            JOptionPane.showMessageDialog(null, "Please enter a whole number before adding a Link", "Error", JOptionPane.ERROR_MESSAGE);
//        }
    }//GEN-LAST:event_buttonDeleteLinkActionPerformed

    private void buttonAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAboutActionPerformed
                JOptionPane.showMessageDialog(null, 
                  "Assigment:      Data Structures Project #2 \n"
                + "Author:              Johnny Trevino\n"
                + "Project Due:    Sept. 20 2017 NLT 11:59 pm CST\n\n",
                "About", 
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_buttonAboutActionPerformed

    private void buttonAdd500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdd500ActionPerformed
        populateList(500);
    }//GEN-LAST:event_buttonAdd500ActionPerformed

    private void taLinksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taLinksMouseClicked
        
//        System.out.print(taLinks.getSelectedText());
    }//GEN-LAST:event_taLinksMouseClicked
    
    private void populateList(int count){
        if (count!=0) {
            numStack.addLink(rn.nextInt(9999 - 1 + 1) + 1);
            update(numStack.getRoot());
            count--;
            populateList(count);
        }
        
    }
    
    private void update(Link next){
        taLinks.append(Integer.toString(next.getValue()));
        taLinks.append("\n");                
        if (next.getNextLink()!=null) 
            update(next.getNextLink());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAbout;
    private javax.swing.JButton buttonAdd500;
    private javax.swing.JButton buttonAddLink;
    private javax.swing.JButton buttonDeleteLink;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea taLinks;
    private javax.swing.JTextField textFieldInteger;
    // End of variables declaration//GEN-END:variables
}
