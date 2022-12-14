/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quizzes4learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static quizzes4learning.login2.username;
import java.util.Random;

/**
 *
 * @author 50250
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
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

        jLabel9 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btn_aleman2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_matematicas = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_historia = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_literatura = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btn_ingles = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_informatica = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Si ya tiene una cuenta, solo ingresar usuario y contrase??a");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel8.setBackground(new java.awt.Color(186, 79, 84));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aleman.png"))); // NOI18N

        btn_aleman2.setBackground(new java.awt.Color(186, 79, 84));
        btn_aleman2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        btn_aleman2.setForeground(new java.awt.Color(255, 255, 255));
        btn_aleman2.setText("Aleman");
        btn_aleman2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aleman2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_aleman2)
                .addGap(57, 57, 57))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_aleman2)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(74, 31, 61));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calculador.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 120, 120));

        btn_matematicas.setBackground(new java.awt.Color(74, 31, 61));
        btn_matematicas.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        btn_matematicas.setForeground(new java.awt.Color(255, 255, 255));
        btn_matematicas.setText("Matem??tica");
        btn_matematicas.setToolTipText("");
        btn_matematicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_matematicasActionPerformed(evt);
            }
        });
        jPanel2.add(btn_matematicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, 40));

        jPanel3.setBackground(new java.awt.Color(186, 79, 84));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/historia.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 8, -1, 120));

        btn_historia.setBackground(new java.awt.Color(186, 79, 84));
        btn_historia.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        btn_historia.setForeground(new java.awt.Color(255, 255, 255));
        btn_historia.setText("Historia");
        btn_historia.setToolTipText("");
        btn_historia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_historiaActionPerformed(evt);
            }
        });
        jPanel3.add(btn_historia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jPanel4.setBackground(new java.awt.Color(74, 31, 61));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/biografia.png"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 120));

        btn_literatura.setBackground(new java.awt.Color(74, 31, 61));
        btn_literatura.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        btn_literatura.setForeground(new java.awt.Color(255, 255, 255));
        btn_literatura.setText("Literatura");
        btn_literatura.setToolTipText("");
        btn_literatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_literaturaActionPerformed(evt);
            }
        });
        jPanel4.add(btn_literatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 110, 40));

        jPanel5.setBackground(new java.awt.Color(186, 79, 84));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_ingles.setBackground(new java.awt.Color(186, 79, 84));
        btn_ingles.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        btn_ingles.setForeground(new java.awt.Color(255, 255, 255));
        btn_ingles.setText("Ingl??s");
        btn_ingles.setToolTipText("");
        btn_ingles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inglesActionPerformed(evt);
            }
        });
        jPanel5.add(btn_ingles, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/traduccion.png"))); // NOI18N
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 130));

        jPanel7.setBackground(new java.awt.Color(74, 31, 61));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/informatica.png"))); // NOI18N
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 120));

        btn_informatica.setBackground(new java.awt.Color(74, 31, 61));
        btn_informatica.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        btn_informatica.setForeground(new java.awt.Color(255, 255, 255));
        btn_informatica.setText("Inform??tica");
        btn_informatica.setToolTipText("");
        btn_informatica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_informaticaActionPerformed(evt);
            }
        });
        jPanel7.add(btn_informatica, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jPanel9.setBackground(new java.awt.Color(244, 244, 241));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        jLabel10.setText("Seleccione una materia");

        jButton1.setBackground(new java.awt.Color(186, 79, 84));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Notas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(186, 79, 84));
        jButton2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Salir");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_literaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_literaturaActionPerformed
         Literatura lecture = new Literatura();
         login2 valu=new login2();
         int chiqui4=valu.estudiante.getGrado();
         lecture.preguntas(chiqui4);
    }//GEN-LAST:event_btn_literaturaActionPerformed

    private void btn_historiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_historiaActionPerformed
            Historia history = new Historia();
            login2 valu=new login2();
            int chiqui3=valu.estudiante.getGrado();
            history.preguntas(chiqui3);
    }//GEN-LAST:event_btn_historiaActionPerformed

    private void btn_inglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inglesActionPerformed
            Ingles ingle = new Ingles();
            login2 valu=new login2();
            int chiqui5=valu.estudiante.getGrado();
            ingle.preguntas(chiqui5);
    }//GEN-LAST:event_btn_inglesActionPerformed

    private void btn_matematicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_matematicasActionPerformed
            Matematica mate = new Matematica();
            login2 valu=new login2();
            int chiqui=valu.estudiante.getGrado();
            mate.preguntas(chiqui);
    }//GEN-LAST:event_btn_matematicasActionPerformed

    private void btn_aleman2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aleman2ActionPerformed
          Aleman ale = new Aleman();
            login2 valu=new login2();
            int chiqui2=valu.estudiante.getGrado();
            ale.preguntas(chiqui2);
    }//GEN-LAST:event_btn_aleman2ActionPerformed

    private void btn_informaticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_informaticaActionPerformed
        Informatica progra = new Informatica();
            login2 valu=new login2();
            int chiqui6=valu.estudiante.getGrado();
            progra.preguntas(chiqui6);
    }//GEN-LAST:event_btn_informaticaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/quizzes4learning","root","");
            Statement stm=con.createStatement();
            String sql="select * from materias where usuario='"+username+"'";
            ResultSet rs=stm.executeQuery(sql);
            System.out.println(username);
            if(rs.next())
            {
                dispose();
                String[][] consingles = {{"Intenta pensar en el idioma Ingles y no tanto traducir del espa??ol", "Pronuncia como te suene bien", "Repite en voz alta las palabras que no conozcas", "Practica mas seguido", "Ponte el chip de modo ingles" , "Crea habitos de estudio", "Realiza en las ma??anas tus examenes, asi le puedes preguntar a tu profesor", "Haz un examen todos los dias", "Lee en ingles y las palabras que no conozcas buscalas en tu diccionario", "Recuerda que escuchando tambien puedes practicar, escucha musica en ingles"}};
                String[][] consmate = {{"Practica todos los dias", "Disfruta estudiar matematicas, crea retos para t?? mismo", "Ayudate de los examenes", "Usa conceptos", "Intenta usar la l??gica ante todo" , "No te quedes con dudas pregunta", "Sigue practicando", "Implementa todo lo que sepas", "Usa tu conocimiento incluso si es de hace a??os", "Recuerda f??rmulas"}};
                String[][] conslite = {{"Practica todos los dias", "Recuerda las relaciones entre las palabras", "Forma tu estilo propio para entender y aplicar", "Habla con todos as?? no te trabas", "Lee suficiente para ser mas fluido" , "Identifica tema y subtemas", "Busca diferentes perspectivas", "Comparalos con temas anteriores", "Contextualiza", "Estructura el texto"}};
                String[][] conshist = {{"Practica todos los dias", "intenta hacer una linea del tiempo", "Llena los acontecimientos segun su gravedad", "Comprende lo que te ense??an", "Lee sobre lo que te guste de historia" , "Intenta que un acontecimiento te lleve a otro", "El mejor consejo para historia, imag??nate que tu estas en el hecho hist??rico", "Intenta generar historias en tu mente", "Apunta los datos clave", "Haz resumenes sobre lo que entendiste"}};
                String[][] consinfo = {{"Practica todos los dias", "Si tienes una duda intenta resolverla, si no puedes preguntale a tu profesor", "Comparte lo que aprendas con tus amigos", "Intenta otros lenguajes de programacion", "Explora otros caminos" , "Mejora tu m??todo de aprendizaje", "Tomate tus descansos, no todo el dia, pero refresca la mente", "Si te encuentras con un problema busca diferentes maneras de resolverlo", "Persevera", "No pierdas la paciencia"}};
                String[][] consalemam = {{"Practica todos los dias", "Habla en aleman con tu profesor", "Entabla conversaciones en aleman", "Aprovecha las lecciones e intenta hacerlas bien", "Repite las palabras en voz alta" , "Implementa lo que aprendas", "Lee libros en aleman", "Escucha a otra gente hablar", "Rodeate del idioma", "Pronuncia como se escuche mejor"}};
                recomendaciones ventana= new recomendaciones();
                ventana.show();
                Random rand = new Random();
                int random = rand.nextInt(9) + 1;
                ventana.text_mate1.setText(consmate[0][random]);
                ventana.text_mate1.setEditable(false);
                ventana.text_literatura.setText(conslite[0][random]);
                ventana.text_literatura.setEditable(false);
                ventana.text_ingles.setText(consingles[0][random]);
                ventana.text_ingles.setEditable(false);
                ventana.text_historia.setText(conshist[0][random]);
                ventana.text_historia.setEditable(false);
                ventana.text_informatica.setText(consinfo[0][random]);
                ventana.text_informatica.setEditable(false);
                ventana.text_aleman.setText(consalemam[0][random]);
                ventana.text_aleman.setEditable(false);
                ventana.lmate.setText(String.valueOf(rs.getInt("matematica"))+"/5");
                ventana.lingles.setText(String.valueOf(rs.getInt("ingles"))+"/5");
                ventana.lliteratura.setText(String.valueOf(rs.getInt("literatura"))+"/5");
                ventana.lhistoria.setText(String.valueOf(rs.getInt("historia"))+"/5");
                ventana.laleman.setText(String.valueOf(rs.getInt("aleman"))+"/5");
                ventana.linformatica.setText(String.valueOf(rs.getInt("informatica"))+"/5");

            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "No se cambio");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aleman2;
    private javax.swing.JButton btn_historia;
    private javax.swing.JButton btn_informatica;
    private javax.swing.JButton btn_ingles;
    private javax.swing.JButton btn_literatura;
    private javax.swing.JButton btn_matematicas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
