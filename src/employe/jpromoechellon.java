/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author mounsif elkhiyar
 */
public class jpromoechellon extends javax.swing.JInternalFrame {
Myconnection cnx = new Myconnection();
    String datedebut=null;
    int idgrade=0;
    int idechellon=0;
    String gradeact=null;
    int echellon=0;
    String annee=null;
    String matricule=null;
    String datereclasement=null;
    String dateeffectgrade=null;
    /**
     * Creates new form jRecherchechellon
     */
    public jpromoechellon() {
        initComponents();
            Connection c=null;
        Statement s=null;
        ResultSet rs=null;
        String gradeact=null;
        String echelo=null;
        buttonGroup1.add(jRadioechellon12);
        buttonGroup1.add(jRadioechellon23);
        buttonGroup1.add(jRadioechellon34);
        buttonGroup1.add(jRadioechellon45);
        buttonGroup1.add(jRadioechellon56);
        buttonGroup1.add(jRadioechellon67);
        buttonGroup1.add(jRadioechellon78);
        buttonGroup1.add(jRadioechellon89);
        buttonGroup1.add(jRadioechellon910);
        
            try {
                c=cnx.getConnexion();
            String sqlS="SELECT GRADE_ACTUEL FROM grade";
            
                s= c.createStatement();
            
            rs=s.executeQuery(sqlS);
            while(rs.next())
            {
                gradeact=rs.getString("GRADE_ACTUEL");
                                jComboBoxgradeact.addItem(gradeact);
            }
            
             
            
          
            
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(jacceuilGrade.class.getName()).log(Level.SEVERE, null, ex);
            }
                catch (SQLException ex) {
                Logger.getLogger(jacceuilGrade.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jComboBoxgradeact = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioechellon12 = new javax.swing.JRadioButton();
        jRadioechellon23 = new javax.swing.JRadioButton();
        jRadioechellon34 = new javax.swing.JRadioButton();
        jRadioechellon45 = new javax.swing.JRadioButton();
        jRadioechellon56 = new javax.swing.JRadioButton();
        jRadioechellon67 = new javax.swing.JRadioButton();
        jRadioechellon78 = new javax.swing.JRadioButton();
        jRadioechellon89 = new javax.swing.JRadioButton();
        jRadioechellon910 = new javax.swing.JRadioButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 204, 0));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sortie.gif"))); // NOI18N
        jButton8.setText("fermer");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/printer.png"))); // NOI18N
        jButton1.setText("Imprimer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Matricule", "nom", "prenom", "grade actuel", "echellon", "Dare reclassement"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jButton1)
                        .addGap(97, 97, 97)
                        .addComponent(jButton8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Liste d'employe proposer pour la promotion echellon", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(153, 51, 0))); // NOI18N

        jComboBoxgradeact.setBackground(new java.awt.Color(255, 204, 0));
        jComboBoxgradeact.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "selectionner grade" }));
        jComboBoxgradeact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxgradeactActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("Grade actuel");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("la durée passée selon l'echellon");

        jRadioechellon12.setBackground(new java.awt.Color(255, 255, 204));
        jRadioechellon12.setForeground(new java.awt.Color(153, 153, 153));
        jRadioechellon12.setText("echellon 1=>2");
        jRadioechellon12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioechellon12ActionPerformed(evt);
            }
        });

        jRadioechellon23.setBackground(new java.awt.Color(255, 255, 204));
        jRadioechellon23.setForeground(new java.awt.Color(153, 153, 153));
        jRadioechellon23.setText("echellon 2=>3");
        jRadioechellon23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioechellon23ActionPerformed(evt);
            }
        });

        jRadioechellon34.setBackground(new java.awt.Color(255, 255, 204));
        jRadioechellon34.setForeground(new java.awt.Color(153, 153, 153));
        jRadioechellon34.setText("echellon 3=>4");
        jRadioechellon34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioechellon34ActionPerformed(evt);
            }
        });

        jRadioechellon45.setBackground(new java.awt.Color(255, 255, 204));
        jRadioechellon45.setForeground(new java.awt.Color(153, 153, 153));
        jRadioechellon45.setText("echellon 4=>5");
        jRadioechellon45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioechellon45ActionPerformed(evt);
            }
        });

        jRadioechellon56.setBackground(new java.awt.Color(255, 255, 204));
        jRadioechellon56.setForeground(new java.awt.Color(153, 153, 153));
        jRadioechellon56.setText("echellon 5=>6");
        jRadioechellon56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioechellon56ActionPerformed(evt);
            }
        });

        jRadioechellon67.setBackground(new java.awt.Color(255, 255, 204));
        jRadioechellon67.setForeground(new java.awt.Color(153, 153, 153));
        jRadioechellon67.setText("echellon 6=>7");
        jRadioechellon67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioechellon67ActionPerformed(evt);
            }
        });

        jRadioechellon78.setBackground(new java.awt.Color(255, 255, 204));
        jRadioechellon78.setForeground(new java.awt.Color(153, 153, 153));
        jRadioechellon78.setText("echellon 7=>8");
        jRadioechellon78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioechellon78ActionPerformed(evt);
            }
        });

        jRadioechellon89.setBackground(new java.awt.Color(255, 255, 204));
        jRadioechellon89.setForeground(new java.awt.Color(153, 153, 153));
        jRadioechellon89.setText("echellon 8=>9");
        jRadioechellon89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioechellon89ActionPerformed(evt);
            }
        });

        jRadioechellon910.setBackground(new java.awt.Color(255, 255, 204));
        jRadioechellon910.setForeground(new java.awt.Color(153, 153, 153));
        jRadioechellon910.setText("echellon 9=>10");
        jRadioechellon910.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioechellon910ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(26, 26, 26)
                        .addComponent(jComboBoxgradeact, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioechellon34)
                            .addComponent(jRadioechellon12)
                            .addComponent(jRadioechellon56)
                            .addComponent(jRadioechellon78))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioechellon23)
                            .addComponent(jRadioechellon45)
                            .addComponent(jRadioechellon67)
                            .addComponent(jRadioechellon89))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioechellon910)
                .addGap(82, 82, 82))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxgradeact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jRadioechellon12)
                    .addComponent(jRadioechellon23))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioechellon34)
                    .addComponent(jRadioechellon45))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioechellon56)
                    .addComponent(jRadioechellon67))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioechellon78)
                    .addComponent(jRadioechellon89))
                .addGap(18, 18, 18)
                .addComponent(jRadioechellon910)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Commune Ait Melloul \n Liste des employés proposer pour la promotion \n");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            jTable2.print(JTable.PrintMode.FIT_WIDTH, header, footer);

        } catch (java.awt.print.PrinterException e) {
            System.err.format("Erreur d'impression ", e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:

        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jRadioechellon12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioechellon12ActionPerformed
        // TODO add your handling code here:
      Recherchechellon();
    }//GEN-LAST:event_jRadioechellon12ActionPerformed

    private void jRadioechellon23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioechellon23ActionPerformed
        // TODO add your handling code here:
         Recherchechellon();
    }//GEN-LAST:event_jRadioechellon23ActionPerformed

    private void jRadioechellon34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioechellon34ActionPerformed
        // TODO add your handling code here:
         Recherchechellon();
    }//GEN-LAST:event_jRadioechellon34ActionPerformed

    private void jRadioechellon45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioechellon45ActionPerformed
        // TODO add your handling code here:
         Recherchechellon();
    }//GEN-LAST:event_jRadioechellon45ActionPerformed

    private void jRadioechellon56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioechellon56ActionPerformed
        // TODO add your handling code here:
         Recherchechellon();
    }//GEN-LAST:event_jRadioechellon56ActionPerformed

    private void jRadioechellon67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioechellon67ActionPerformed
        // TODO add your handling code here:
         Recherchechellon();
    }//GEN-LAST:event_jRadioechellon67ActionPerformed

    private void jRadioechellon78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioechellon78ActionPerformed
        // TODO add your handling code here:
         Recherchechellon();
    }//GEN-LAST:event_jRadioechellon78ActionPerformed

    private void jRadioechellon89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioechellon89ActionPerformed
        // TODO add your handling code here:
         Recherchechellon();
    }//GEN-LAST:event_jRadioechellon89ActionPerformed

    private void jRadioechellon910ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioechellon910ActionPerformed
        // TODO add your handling code here:
         Recherchechellon();
    }//GEN-LAST:event_jRadioechellon910ActionPerformed

    private void jComboBoxgradeactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxgradeactActionPerformed
        // TODO add your handling code here:
         Recherchechellon();
    }//GEN-LAST:event_jComboBoxgradeactActionPerformed

    /**
     * @param args the command line arguments
     */
    public void Recherchechellon()
    {
         DefaultTableModel model = (DefaultTableModel) jTable2.getModel();

        while(jTable2.getRowCount()>0) // pour supprimer l'encien table
        model.removeRow(0);
        
         Connection c=null;
        Statement s=null;
        ResultSet rs=null;
                 ResultSet rs1=null;
                 int idgradeactu=0;
                 int duree=0;
                 int idur=0;
                 int nbans=365;

                 
                   gradeact= jComboBoxgradeact.getSelectedItem().toString();
                  
                  
       int gradeactindice= jComboBoxgradeact.getSelectedIndex();
             
              
              SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
              
              Date dc= new Date();
           
              
  
              if(jRadioechellon12.isSelected())
              {
                  echellon=1;
                  duree=1;
              }
              else if(jRadioechellon23.isSelected())
                      {
                          echellon=2;
                          duree=1;
                      }
              else if(jRadioechellon34.isSelected())
                      {
                           echellon=3;
                          duree=2;
                      }
             else if(jRadioechellon45.isSelected())
                      {
                           echellon=4;
                          duree=2;
                      }
              else if(jRadioechellon56.isSelected())
                      {
                           echellon=5;
                          duree=2;
                      }
              else if(jRadioechellon67.isSelected())
                      {
                           echellon=6;
                          duree=3;
                      }
               else if(jRadioechellon78.isSelected())
                      {
                           echellon=7;
                          duree=3;
                      }
               else if(jRadioechellon89.isSelected())
                      {
                           echellon=8;
                          duree=3;
                      }
              else if(jRadioechellon910.isSelected())
                      {
                           echellon=9;
                          duree=4;
                      }
              else
              {
                  echellon=0;
              }
              
              
               if(duree==1)
                  {
                      idur=nbans;
                  }
                      else if(duree==2)
                              {
                              idur=nbans*2;
                              }
                      else if(duree==3)
                              {
                              idur=nbans*3;
                              }
                  else
                      {
                          idur=nbans*4;
                  }
              
               
                  {
         
                 
                      
             try {
                if(gradeactindice!=0)
                {
                    c=cnx.getConnexion();
             
                 String sqlS="SELECT ID_GRADE  FROM grade where GRADE_ACTUEL='"+gradeact+"'";
            s= c.createStatement();
            rs=s.executeQuery(sqlS);
                 rs.first();
        idgradeactu=rs.getInt("ID_GRADE");
if(echellon!=0)
{
                  sqlS="SELECT MATRICULE,NOM_EMPLOYE,PRENOM_EMPLYE,ID_GRADE,ID_ECHELLON,date_reclassement,date_effectgrade FROM employe WHERE ID_ECHELLON='"+echellon+"' AND ID_GRADE='"+idgradeactu+"'";
}
else
{
    sqlS="SELECT MATRICULE,NOM_EMPLOYE,PRENOM_EMPLYE,ID_GRADE,ID_ECHELLON,date_reclassement,date_effectgrade FROM employe WHERE ID_GRADE='"+idgradeactu+"'";
}
         
        s= c.createStatement();
                    rs=s.executeQuery(sqlS);
                     long diff=0;
                     Date dRec;
                while(rs.next())
                {
                    idechellon=rs.getInt("ID_ECHELLON");
                     idgrade=rs.getInt("ID_GRADE");
                  String dreclasse=rs.getString("date_reclassement");
                  dRec=f.parse(dreclasse);
                   diff=dc.getTime()-dRec.getTime();
                    diff=diff/24/60/60/1000;
                    //JOptionPane.showMessageDialog(this, diff+"---"+dRec+"--"+dc.getTime());
                 if(diff>nbans) 
                 {
                 sqlS="SELECT GRADE_ACTUEL,ECHEL FROM grade WHERE  ID_GRADE='"+idgrade+"'";
                s= c.createStatement();
                rs1=s.executeQuery(sqlS);
                rs1.first();
                gradeact=rs1.getString("GRADE_ACTUEL");
                  
                  
                 
                       model.addRow(new Object[]{rs.getString("MATRICULE"),rs.getString("NOM_EMPLOYE"),rs.getString("PRENOM_EMPLYE"),gradeact,idechellon,rs.getString("date_reclassement")});
                }
             }
                 
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Vous devez selectionner un grade");
                }
                    
                 
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(jacceuilGrade.class.getName()).log(Level.SEVERE, null, ex);
             } catch (SQLException ex) {
            Logger.getLogger(jacceuilGrade.class.getName()).log(Level.SEVERE, null, ex);
}           catch (ParseException ex) {
                Logger.getLogger(jpromoechellon.class.getName()).log(Level.SEVERE, null, ex);
            }
                  }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBoxgradeact;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioechellon12;
    private javax.swing.JRadioButton jRadioechellon23;
    private javax.swing.JRadioButton jRadioechellon34;
    private javax.swing.JRadioButton jRadioechellon45;
    private javax.swing.JRadioButton jRadioechellon56;
    private javax.swing.JRadioButton jRadioechellon67;
    private javax.swing.JRadioButton jRadioechellon78;
    private javax.swing.JRadioButton jRadioechellon89;
    private javax.swing.JRadioButton jRadioechellon910;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
