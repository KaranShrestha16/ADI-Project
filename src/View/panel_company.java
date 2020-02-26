/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import controller.CompanyController;
import Model.Company;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Karan
 */
public class panel_company extends javax.swing.JPanel {

    /**
     * Creates new form panel_company
     */
    public panel_company() {
        initComponents();
     
        ComboxView();
        TableView();
    }
    
    public void ComboxView(){
       
     CompanyController contro= new CompanyController();
        ResultSet rs= contro.companyId();
        try {
             while (rs.next()) {
                String id = rs.getString("cid");
               
                jComboBox_id.addItem(id);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(panel_company.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
       public void TableView(){
     CompanyController contro= new CompanyController();
        ResultSet rs= contro.companyId();
        try {
             while (rs.next()) {
            
                jTable_view.setModel(DbUtils.resultSetToTableModel(rs));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(panel_company.class.getName()).log(Level.SEVERE, null, ex);
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

        txt_email2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_contact = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_delete = new javax.swing.JButton();
        btn_modify = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_goback = new javax.swing.JButton();
        jComboBox_id = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_view = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        txt_email2.setBackground(new java.awt.Color(0, 51, 204));
        txt_email2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_email2.setForeground(new java.awt.Color(255, 255, 255));

        setBackground(new java.awt.Color(51, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Company");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(333, 333, 333))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Comapny Name:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Email:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Address:");

        txt_name.setBackground(new java.awt.Color(0, 51, 204));
        txt_name.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        txt_name.setForeground(new java.awt.Color(255, 255, 255));
        txt_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nameKeyTyped(evt);
            }
        });

        txt_address.setBackground(new java.awt.Color(0, 51, 204));
        txt_address.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        txt_address.setForeground(new java.awt.Color(255, 255, 255));
        txt_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addressActionPerformed(evt);
            }
        });
        txt_address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_addressKeyTyped(evt);
            }
        });

        txt_email.setBackground(new java.awt.Color(0, 51, 204));
        txt_email.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        txt_email.setForeground(new java.awt.Color(255, 255, 255));

        txt_contact.setBackground(new java.awt.Color(0, 51, 204));
        txt_contact.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        txt_contact.setForeground(new java.awt.Color(255, 255, 255));
        txt_contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_contactKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Contact No:");

        btn_delete.setBackground(new java.awt.Color(0, 0, 0));
        btn_delete.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/rubbish-bin.png"))); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_modify.setBackground(new java.awt.Color(0, 0, 0));
        btn_modify.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_modify.setForeground(new java.awt.Color(255, 255, 255));
        btn_modify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-anchor-point (1).png"))); // NOI18N
        btn_modify.setText("Modify");
        btn_modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifyActionPerformed(evt);
            }
        });

        btn_add.setBackground(new java.awt.Color(0, 0, 0));
        btn_add.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/submit.png"))); // NOI18N
        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_goback.setBackground(new java.awt.Color(0, 0, 0));
        btn_goback.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_goback.setForeground(new java.awt.Color(255, 255, 255));
        btn_goback.setText("Clear");
        btn_goback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gobackActionPerformed(evt);
            }
        });

        jComboBox_id.setBackground(new java.awt.Color(0, 51, 204));
        jComboBox_id.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        jComboBox_id.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_idActionPerformed(evt);
            }
        });

        jTable_view.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable_view);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Comapny ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_delete)
                            .addComponent(btn_goback)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_id, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_add)
                            .addComponent(btn_modify))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox_id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(btn_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(23, 23, 23))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btn_delete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txt_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btn_goback))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addressActionPerformed
       
        
    }//GEN-LAST:event_txt_addressActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        String name=txt_name.getText();
        String address=txt_address.getText();
        String email=txt_email.getText();
        String contact=txt_contact.getText();
         int  id=  Integer.parseInt((String) jComboBox_id.getSelectedItem());
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher=pattern.matcher(email);
        
        Company c =new Company();
        c.setId(id);
        
         if (email.isEmpty() || name.isEmpty()|| address.isEmpty() || contact.isEmpty()) {
                 JOptionPane.showMessageDialog(null, "Please Enter All Text Field");
        } else if(!matcher.matches()){
                JOptionPane.showMessageDialog(null, "Please Enter Email Correctly");
                txt_email.setText(null);
        } else{
                CompanyController cc = new CompanyController();       
                int res = cc.DeleteCompany(c);
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Compnay Delete Sucessfully");
                    txt_name.setText(null);
                    txt_email.setText(null);
                    txt_contact.setText(null);
                    txt_address.setText(null);
                    
                    jComboBox_id.removeAllItems();
                    ComboxView();
                    TableView();
                } else {
                    JOptionPane.showMessageDialog(null, "Compnay Cannot Delete");
                    txt_name.setText(null);
                    txt_email.setText(null);
                    txt_contact.setText(null);
                    txt_address.setText(null);
                }
        }
        

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifyActionPerformed
        String name=txt_name.getText();
        String address=txt_address.getText();
        String email=txt_email.getText();
        String contact=txt_contact.getText();
        int  id=  Integer.parseInt((String) jComboBox_id.getSelectedItem());
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher=pattern.matcher(email);
        Company c=new Company();
        c.setId(id);
        c.setAddress(address);
        c.setContact(contact);
        c.setEmail(email);
        c.setName(name);
         if (email.isEmpty() || name.isEmpty()|| address.isEmpty() || contact.isEmpty()) {
                 JOptionPane.showMessageDialog(null, "Please Enter All Text Field");
        } else if(!matcher.matches()){
                JOptionPane.showMessageDialog(null, "Please Enter Email Correctly");
                txt_email.setText(null);
        } else{
                CompanyController cc = new CompanyController();       
                int res = cc.UpdateCompany(c);
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Compnay Update Sucessfully");
                    txt_name.setText(null);
                    txt_email.setText(null);
                    txt_contact.setText(null);
                    txt_address.setText(null);
                            
                    jComboBox_id.removeAllItems();
                    ComboxView();
                    TableView();
                } else {
                    JOptionPane.showMessageDialog(null, "Compnay Cannot Update");
                    txt_name.setText(null);
                    txt_email.setText(null);
                    txt_contact.setText(null);
                    txt_address.setText(null);
                }
        }
        
    }//GEN-LAST:event_btn_modifyActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        String name=txt_name.getText();
        String address=txt_address.getText();
        String email=txt_email.getText();
        String contact=txt_contact.getText();
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher=pattern.matcher(email);
        Company company=new Company();
        company.setAddress(address);
        company.setName(name);
        company.setContact(contact);
        company.setEmail(email);
        
        
        
        
           if (email.isEmpty() || name.isEmpty()|| address.isEmpty() || contact.isEmpty()) {
                 JOptionPane.showMessageDialog(null, "Please Enter All Text Field");
        } else if(!matcher.matches()){
                JOptionPane.showMessageDialog(null, "Please Enter Email Correctly");
                txt_email.setText(null);
        } else{
                CompanyController cc = new CompanyController();       
                int res = cc.InsertCompany(company);
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Compnay ADD Sucessfully");
                     jComboBox_id.removeAllItems();
                    ComboxView();
                    TableView();
                     txt_name.setText(null);
                    txt_email.setText(null);
                    txt_contact.setText(null);
                    txt_address.setText(null);
                } else {
                    JOptionPane.showMessageDialog(null, "Compnay Cannot ADD");
                    txt_name.setText(null);
                    txt_email.setText(null);
                    txt_contact.setText(null);
                    txt_address.setText(null);
                }
        }
        
                
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_gobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gobackActionPerformed
                    txt_name.setText(null);
                    txt_email.setText(null);
                    txt_contact.setText(null);
                    txt_address.setText(null);
    }//GEN-LAST:event_btn_gobackActionPerformed

    private void txt_contactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contactKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_SPACE) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
            JOptionPane
                    .showMessageDialog(null, "Please input valid phone numbers with only digit numbers");
        }
    }//GEN-LAST:event_txt_contactKeyTyped

    private void txt_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nameKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isAlphabetic(c)|| (c == KeyEvent.VK_SPACE) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Please input valid Comapny name Category");
        }
    }//GEN-LAST:event_txt_nameKeyTyped

    private void txt_addressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_addressKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isAlphabetic(c)|| (c == KeyEvent.VK_SPACE) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
            JOptionPane
                    .showMessageDialog(null, "Please input valid Book Category");
        }
    }//GEN-LAST:event_txt_addressKeyTyped

    private void jComboBox_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_idActionPerformed
        if (jComboBox_id.getSelectedItem()!=null) {
                     
          if (jComboBox_id.getSelectedItem().equals("Select ID")){
        
            JOptionPane.showMessageDialog(null, "Please Select Comapany ID for Search");
        }else{
           int  id=  Integer.parseInt((String) jComboBox_id.getSelectedItem());
         Company c=new Company();
         c.setId(id);
        CompanyController contro= new CompanyController();
    
        ResultSet rs= contro.getCompanyDetails(c);
        try {
            if (rs.next()) {
                String name = rs.getString("name");
                txt_name.setText(name);
                String address = rs.getString("address");
                txt_address.setText(address);
                String email = rs.getString("email");
                txt_email.setText(email);
                String contact = rs.getString("contact");
                txt_contact.setText(contact);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(panel_company.class.getName()).log(Level.SEVERE, null, ex);
        }
          
          
          }

        }
       
    }//GEN-LAST:event_jComboBox_idActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_goback;
    private javax.swing.JButton btn_modify;
    private javax.swing.JComboBox<String> jComboBox_id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_view;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_contact;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_email2;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}
