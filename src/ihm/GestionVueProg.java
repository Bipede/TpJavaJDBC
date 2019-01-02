/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

import javax.swing.JOptionPane;

/**
 *
 * @author pierre
 */
public class GestionVueProg extends GestionVueAbstraite {

    /**
     * Creates new form GestionVueProg
     */
    public GestionVueProg() {
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

        mainPanel = new javax.swing.JPanel();
        nomLabel = new javax.swing.JLabel();
        adresseLabel = new javax.swing.JLabel();
        responsableLabel = new javax.swing.JLabel();
        hobbyLabel = new javax.swing.JLabel();
        prenomLabel = new javax.swing.JLabel();
        pseudoLabel = new javax.swing.JLabel();
        naissLabel = new javax.swing.JLabel();
        embLabel = new javax.swing.JLabel();
        nomTextField = new javax.swing.JTextField();
        adresseTextField = new javax.swing.JTextField();
        responsableTextField = new javax.swing.JTextField();
        hobbyTextField = new javax.swing.JTextField();
        prenomTextField = new javax.swing.JTextField();
        pseudoTextField = new javax.swing.JTextField();
        jourNaissTextField = new javax.swing.JTextField();
        jourEmbTextField = new javax.swing.JTextField();
        anneeNaissTextField = new javax.swing.JTextField();
        anneeEmbTextField = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        rechercherButton = new javax.swing.JButton();
        reinitButton = new javax.swing.JButton();
        validerButton = new javax.swing.JButton();
        annulerButton = new javax.swing.JButton();
        matriculePanel = new javax.swing.JPanel();
        matriculeLabel = new javax.swing.JLabel();
        matriculeTextField = new javax.swing.JTextField();
        mainMenu = new javax.swing.JMenuBar();
        progMenu = new javax.swing.JMenu();
        afficherMenuItem = new javax.swing.JMenuItem();
        modifierMenuItem = new javax.swing.JMenuItem();
        supprimerMenuItem = new javax.swing.JMenuItem();
        ajouterMenuItem = new javax.swing.JMenuItem();
        actionMenu = new javax.swing.JMenu();
        quitterMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GesProg");

        nomLabel.setText("Nom");

        adresseLabel.setText("Adresse");

        responsableLabel.setText("Responsable");

        hobbyLabel.setText("Hobby");

        prenomLabel.setText("Prénom");

        pseudoLabel.setText("Pseudo");

        naissLabel.setText("Date de naissance");

        embLabel.setText("Date d'embauche");

        jourNaissTextField.setToolTipText("jour");

        jourEmbTextField.setToolTipText("jour");

        anneeNaissTextField.setToolTipText("année");

        anneeEmbTextField.setToolTipText("année");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        rechercherButton.setText("Rechercher");
        rechercherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercherButtonActionPerformed(evt);
            }
        });

        reinitButton.setText("Réinitialiser");
        reinitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reinitButtonActionPerformed(evt);
            }
        });

        validerButton.setText("Valider");
        validerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerButtonActionPerformed(evt);
            }
        });

        annulerButton.setText("Annuler");
        annulerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomLabel)
                            .addComponent(adresseLabel)
                            .addComponent(responsableLabel)
                            .addComponent(hobbyLabel))
                        .addGap(24, 24, 24)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomTextField)
                            .addComponent(adresseTextField)
                            .addComponent(responsableTextField)
                            .addComponent(hobbyTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prenomLabel)
                            .addComponent(pseudoLabel)
                            .addComponent(naissLabel)
                            .addComponent(embLabel))
                        .addGap(21, 21, 21)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(prenomTextField)
                                    .addComponent(pseudoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                    .addComponent(jourNaissTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(jourEmbTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(anneeNaissTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(anneeEmbTextField))
                        .addGap(37, 37, 37))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(rechercherButton)
                        .addGap(18, 18, 18)
                        .addComponent(reinitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(validerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(annulerButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomLabel)
                    .addComponent(prenomLabel)
                    .addComponent(nomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prenomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adresseLabel)
                    .addComponent(pseudoLabel)
                    .addComponent(adresseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pseudoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(responsableLabel)
                    .addComponent(naissLabel)
                    .addComponent(responsableTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jourNaissTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anneeNaissTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hobbyLabel)
                    .addComponent(embLabel)
                    .addComponent(hobbyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jourEmbTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anneeEmbTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rechercherButton)
                    .addComponent(reinitButton)
                    .addComponent(validerButton)
                    .addComponent(annulerButton))
                .addContainerGap())
        );

        matriculePanel.setBackground(new java.awt.Color(0, 0, 0));

        matriculeLabel.setForeground(new java.awt.Color(255, 255, 255));
        matriculeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        matriculeLabel.setText("Matricule");
        matriculeLabel.setAlignmentY(0.0F);

        matriculeTextField.setText("0");

        javax.swing.GroupLayout matriculePanelLayout = new javax.swing.GroupLayout(matriculePanel);
        matriculePanel.setLayout(matriculePanelLayout);
        matriculePanelLayout.setHorizontalGroup(
            matriculePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matriculePanelLayout.createSequentialGroup()
                .addComponent(matriculeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(matriculeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 462, Short.MAX_VALUE))
        );
        matriculePanelLayout.setVerticalGroup(
            matriculePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, matriculePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(matriculeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addComponent(matriculeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        progMenu.setText("Programmeur");

        afficherMenuItem.setText("Afficher");
        afficherMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afficherMenuItemActionPerformed(evt);
            }
        });
        progMenu.add(afficherMenuItem);

        modifierMenuItem.setText("Modifier");
        modifierMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierMenuItemActionPerformed(evt);
            }
        });
        progMenu.add(modifierMenuItem);

        supprimerMenuItem.setText("Supprimer");
        supprimerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerMenuItemActionPerformed(evt);
            }
        });
        progMenu.add(supprimerMenuItem);

        ajouterMenuItem.setText("Ajouter");
        ajouterMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterMenuItemActionPerformed(evt);
            }
        });
        progMenu.add(ajouterMenuItem);

        mainMenu.add(progMenu);

        actionMenu.setText("Action");

        quitterMenuItem.setText("Quitter");
        quitterMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitterMenuItemActionPerformed(evt);
            }
        });
        actionMenu.add(quitterMenuItem);

        mainMenu.add(actionMenu);

        setJMenuBar(mainMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(matriculePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(matriculePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitterMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterMenuItemActionPerformed
        int result = JOptionPane.showConfirmDialog(this,"Vérification" , "Voulez-vous vraiment quitter?",JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.OK_OPTION) {
            //ferme
            this.dispose();
        }
    }//GEN-LAST:event_quitterMenuItemActionPerformed

    private void afficherMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afficherMenuItemActionPerformed
        
    }//GEN-LAST:event_afficherMenuItemActionPerformed

    private void modifierMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierMenuItemActionPerformed
        
    }//GEN-LAST:event_modifierMenuItemActionPerformed

    private void supprimerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerMenuItemActionPerformed
        
    }//GEN-LAST:event_supprimerMenuItemActionPerformed

    private void ajouterMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterMenuItemActionPerformed
        
    }//GEN-LAST:event_ajouterMenuItemActionPerformed

    private void rechercherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercherButtonActionPerformed
        
    }//GEN-LAST:event_rechercherButtonActionPerformed

    private void reinitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reinitButtonActionPerformed
        
    }//GEN-LAST:event_reinitButtonActionPerformed

    private void validerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerButtonActionPerformed
        
    }//GEN-LAST:event_validerButtonActionPerformed

    private void annulerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerButtonActionPerformed
        
    }//GEN-LAST:event_annulerButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    //to delete
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
            java.util.logging.Logger.getLogger(GestionVueProg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionVueProg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionVueProg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionVueProg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionVueProg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu actionMenu;
    private javax.swing.JLabel adresseLabel;
    private javax.swing.JTextField adresseTextField;
    private javax.swing.JMenuItem afficherMenuItem;
    private javax.swing.JMenuItem ajouterMenuItem;
    private javax.swing.JTextField anneeEmbTextField;
    private javax.swing.JTextField anneeNaissTextField;
    private javax.swing.JButton annulerButton;
    private javax.swing.JLabel embLabel;
    private javax.swing.JLabel hobbyLabel;
    private javax.swing.JTextField hobbyTextField;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JTextField jourEmbTextField;
    private javax.swing.JTextField jourNaissTextField;
    private javax.swing.JMenuBar mainMenu;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel matriculeLabel;
    private javax.swing.JPanel matriculePanel;
    private javax.swing.JTextField matriculeTextField;
    private javax.swing.JMenuItem modifierMenuItem;
    private javax.swing.JLabel naissLabel;
    private javax.swing.JLabel nomLabel;
    private javax.swing.JTextField nomTextField;
    private javax.swing.JLabel prenomLabel;
    private javax.swing.JTextField prenomTextField;
    private javax.swing.JMenu progMenu;
    private javax.swing.JLabel pseudoLabel;
    private javax.swing.JTextField pseudoTextField;
    private javax.swing.JMenuItem quitterMenuItem;
    private javax.swing.JButton rechercherButton;
    private javax.swing.JButton reinitButton;
    private javax.swing.JLabel responsableLabel;
    private javax.swing.JTextField responsableTextField;
    private javax.swing.JMenuItem supprimerMenuItem;
    private javax.swing.JButton validerButton;
    // End of variables declaration//GEN-END:variables
}
