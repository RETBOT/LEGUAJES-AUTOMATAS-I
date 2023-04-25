/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appexpregulaesejedeevaluaciongui;

import java.awt.Color;

/**
 *
 * @author admin
 */
public class JFrame extends javax.swing.JFrame {

    /**
     * Creates new form JFrame
     */
    
    public JFrame() {
        initComponents();
    }
    
    public static boolean validarNumeroEntero(String cadena) {

        //boolean resul = cadena.matches("^-?[0-9]+$");
        //boolean resul = cadena.matches("[+|-]?\\d+$");
        boolean resul = cadena.matches("\\d+$");
        return resul;
        /*Pattern patron = Pattern.compile("-?+[0-9]");
        Matcher matcher = patron.matcher(cadena);
        
        if(matcher.matches())
            return true;
        else 
            return false;
         */
    }

    public static boolean validarNumeroEnteroNegativo(String cadena) {

        boolean resul = cadena.matches("^-[0-9]+$");
        return resul;
    }

    //Diseñe un metodo para validad un numero de control que consta de 8 digitos
    public static boolean validarNumControl(String cadena) {
        boolean resul = cadena.matches("[0-9]{8}$");
        return resul;
    }

    //Diseñe un metodo para validar un numero de control de tec laguna 
    // para los estudiantes que ingresaron en enero del 2021
    // 21130125
    // 2021
    public static boolean validarNumControl2021(String cadena) {
        boolean resul = cadena.matches("^2113[0-9]{4}$");
        return resul;
    }
    // 2020

    public static boolean validarNumControl2020(String cadena) {
        boolean resul = cadena.matches("^2013[0-9]{4}$");
        return resul;
    }

    // 2020 y 2021
//     Para estudiantes que ingresarn en: 2020 y 2021
    public static boolean validarNumControl20y21(String cadena) {
        boolean resul = cadena.matches("^(2113|2013)[0-9]{4}$");
        return resul;
    }
    // diseñe un metodo para validar nombres de personas que inicien con letra mayuscula seguido de minusculas  seguido de minusculas

    public static boolean validarNombres(String cadena) {
        boolean resul = cadena.matches("^([A-Z][a-z]*)\\s?([A-Z][a-z]*)$");
        boolean resul2 = cadena.matches("^([A-Z][a-z]*)$");
        return resul || resul2;

//        
//        Pattern patron = Pattern.compile("^[A-Z][a-z]\\s?[A-Z][a-z]$");
//        Matcher matcher = patron.matcher(cadena);
//  
//        if(matcher.matches())
//            return true;
//        else 
//            return false;
    }

    public static boolean validarCadena(String cadena) {
        boolean resul = cadena.matches("([A-Z]|[a-z]|[0-9]){5,10}");
        return resul;
    }

    public static boolean validarHexadecimal(String cadena) {
        boolean resul = cadena.matches("^([A-F]|[0-9])?([A-F]|[0-9])");
        return resul;
    }

    public static boolean validarBinario(String cadena) {
        boolean resul = cadena.matches("[01]{8}");
        return resul;
    }

    public static boolean validarClaves(String cadena) {
        boolean resul = cadena.matches("([[A-Z]|[a-z]]{2})([0-9]{3})");
        return resul;
    }

    public static boolean validarCURP(String cadena) {
        // 4 iniciales  // 6 Fecha  //1 Hombre  // 2 Entidad // 3 consonante // 2 Homoclave 
        // nombre    // Nacimiento//Mujer //Federativa // nombre
        boolean resul = cadena.matches("^([A-Z]{4})([0-9]{6})([HM])([A-Z]{2})([A-Z]{3})([0-9]{2})");
        return resul;
    }

    public static boolean validarRFC(String cadena) { //MELM8305281HO
        // 2 Letras // 1 letra // 1 letra  //Fecha nacimiento // 3 Homoclave   
        // Apellido // Apellido // Nombre // Año //Mes // Dia // letras y numeros 
        // Paterno // MAterno  
        boolean resul = cadena.matches("^([A-Z]{4})([0-9]{6})(([A-Z]|[0-9]){3})");
        return resul;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextCadena = new javax.swing.JTextField();
        jButValidar = new javax.swing.JButton();
        jRadioButHexadecimales = new javax.swing.JRadioButton();
        jRadioButBinarios = new javax.swing.JRadioButton();
        jRadioButClave = new javax.swing.JRadioButton();
        jRadioButCURP = new javax.swing.JRadioButton();
        jRadioButRFC = new javax.swing.JRadioButton();
        jRadioButNumeroEntero = new javax.swing.JRadioButton();
        jRadioButNumeroEnteroNegativo = new javax.swing.JRadioButton();
        jRadioButNumControl = new javax.swing.JRadioButton();
        jRadioButNumControl20y21 = new javax.swing.JRadioButton();
        jRadioButNombres = new javax.swing.JRadioButton();
        jRadioButCad5a10 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabResultado = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EXPRESIONES REGULARES");

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setText("Introduce la cadena :");

        jTextCadena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCadenaActionPerformed(evt);
            }
        });

        jButValidar.setText("Validar");
        jButValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButValidarActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButHexadecimales);
        jRadioButHexadecimales.setText("Hexadecimales");

        buttonGroup1.add(jRadioButBinarios);
        jRadioButBinarios.setText("Binarios");

        buttonGroup1.add(jRadioButClave);
        jRadioButClave.setText("Claves 2 letras y seguido de 3 numeros");

        buttonGroup1.add(jRadioButCURP);
        jRadioButCURP.setText("CURP");

        buttonGroup1.add(jRadioButRFC);
        jRadioButRFC.setText("RFC");

        buttonGroup1.add(jRadioButNumeroEntero);
        jRadioButNumeroEntero.setSelected(true);
        jRadioButNumeroEntero.setText("Numero entero");

        buttonGroup1.add(jRadioButNumeroEnteroNegativo);
        jRadioButNumeroEnteroNegativo.setText("Numero entero negativo");

        buttonGroup1.add(jRadioButNumControl);
        jRadioButNumControl.setText("Numero de control");

        buttonGroup1.add(jRadioButNumControl20y21);
        jRadioButNumControl20y21.setText("Numero de control alumnos 2020 y 20201");

        buttonGroup1.add(jRadioButNombres);
        jRadioButNombres.setText("Nombres");

        buttonGroup1.add(jRadioButCad5a10);
        jRadioButCad5a10.setText("Cadenas de 5 a 10 caracteres");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButValidar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButCURP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButRFC))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButNumeroEntero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButNumeroEnteroNegativo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButNumControl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButNumControl20y21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButNombres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButCad5a10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButHexadecimales)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButBinarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButClave)))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextCadena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButValidar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButNumeroEntero)
                    .addComponent(jRadioButNumeroEnteroNegativo)
                    .addComponent(jRadioButNumControl)
                    .addComponent(jRadioButNumControl20y21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButNombres)
                    .addComponent(jRadioButCad5a10)
                    .addComponent(jRadioButHexadecimales)
                    .addComponent(jRadioButBinarios)
                    .addComponent(jRadioButClave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButCURP)
                    .addComponent(jRadioButRFC))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jLabResultado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabResultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButValidarActionPerformed
        // TODO add your handling code here:
        jLabResultado.setText("");
       
        if(jRadioButNumeroEntero.isSelected()){
            String n = jTextCadena.getText();

            if (validarNumeroEntero(n)) {
                jLabResultado.setForeground(Color.green);
                jLabResultado.setText("El numero "+n+" ingresado es un numero entero");
            } else {
                jLabResultado.setForeground(Color.red);
                jLabResultado.setText("El numero " + n + " ingresado no es un numero entero");
            }
        }
        else if(jRadioButNumeroEnteroNegativo.isSelected()){
            String n = jTextCadena.getText();

            if (validarNumeroEnteroNegativo(n)) {
                jLabResultado.setForeground(Color.green);
                jLabResultado.setText("El numero "+n+" ingresado es un numero entero negativo");
            } else {
                jLabResultado.setForeground(Color.red);
                jLabResultado.setText("El numero "+n+" ingresado no es un numero entero  negativo");
            }
        }
        else if(jRadioButNumControl.isSelected()){
            String n = jTextCadena.getText();

            if (validarNumControl(n)) {
                jLabResultado.setForeground(Color.green);
                jLabResultado.setText("El numero "+n+" ingresado es un numero de control");
            } else {
                jLabResultado.setForeground(Color.red);
                jLabResultado.setText("El numero "+n+" ingresado no es un numero de control");
            }
        }
        else if(jRadioButNumControl20y21.isSelected()){
            String n = jTextCadena.getText();

            if (validarNumControl20y21(n)) {
                jLabResultado.setForeground(Color.green);
                jLabResultado.setText("El numero "+n+" ingresado es un numero de control valido");
            } else {
                jLabResultado.setForeground(Color.red);
                jLabResultado.setText("El numero "+n+" ingresado no es un numero de control valido");
            }
        }else if(jRadioButNombres.isSelected()){
            String n = jTextCadena.getText();

            if (validarNombres(n)) {
                jLabResultado.setForeground(Color.green);
                jLabResultado.setText("El Nombre "+n+" ingresado es un nombre valido");
            } else {
                jLabResultado.setForeground(Color.red);
                jLabResultado.setText("El Nombre "+n+" ingresado no es un nombre valido");
            }
        }else if(jRadioButCad5a10.isSelected()){
            String n = jTextCadena.getText();

            if (validarCadena(n)) {
                jLabResultado.setForeground(Color.green);
                jLabResultado.setText("La cadena "+n+" ingresada es una cadena valida");
            } else {
                jLabResultado.setForeground(Color.red);
                jLabResultado.setText("La cadena "+n+" ingresada no es una cadena valida");
            }
        }else if(jRadioButHexadecimales.isSelected()){
            String n = jTextCadena.getText();

            if (validarHexadecimal(n)) {
                jLabResultado.setForeground(Color.green);
                jLabResultado.setText("El numero "+n+" ingresado es un numero hexadecimal valido");
            } else {
                jLabResultado.setForeground(Color.red);
                jLabResultado.setText("El numero "+n+" ingresado no es un numero hexadecimal valido");
            }
        }else if(jRadioButBinarios.isSelected()){
            String n = jTextCadena.getText();

            if (validarBinario(n)) {
                jLabResultado.setForeground(Color.green);
                jLabResultado.setText("El numero "+n+" ingresado es un numero binario valido");
            } else {
                jLabResultado.setForeground(Color.red);
                jLabResultado.setText("El numero "+n+" ingresado no es un numero binario valido");
            }
        }else if(jRadioButClave.isSelected()){
            String n = jTextCadena.getText();

            if (validarClaves(n)) {
                jLabResultado.setForeground(Color.green);
                jLabResultado.setText("La clave "+n+" ingresada es una clave valida");
            } else {
                jLabResultado.setForeground(Color.red);
                jLabResultado.setText("La clave "+n+" ingresada no es una clave valida");
            }
        }else if(jRadioButCURP.isSelected()){
            String n = jTextCadena.getText();

            if (validarCURP(n)) {
                jLabResultado.setForeground(Color.green);
                jLabResultado.setText("La CURP "+n+" ingresada es una CURP valida");
            } else {
                jLabResultado.setForeground(Color.red);
                jLabResultado.setText("La CURP "+n+" ingresada no es una CURP valida");
            }
        }
        else if(jRadioButRFC.isSelected()){
            String n = jTextCadena.getText();

            if (validarRFC(n)) {
                jLabResultado.setForeground(Color.green);
                jLabResultado.setText("El RFC "+n+" ingresado es un RFC valido");
            } else {
                jLabResultado.setForeground(Color.red);
                jLabResultado.setText("El RFC "+n+" ingresado no es un RFC valido");
            }
        }
         jTextCadena.setText("");
    }//GEN-LAST:event_jButValidarActionPerformed

    private void jTextCadenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCadenaActionPerformed
        // TODO add your handling code here:
        jButValidar.doClick();
    }//GEN-LAST:event_jTextCadenaActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButValidar;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabResultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButBinarios;
    private javax.swing.JRadioButton jRadioButCURP;
    private javax.swing.JRadioButton jRadioButCad5a10;
    private javax.swing.JRadioButton jRadioButClave;
    private javax.swing.JRadioButton jRadioButHexadecimales;
    private javax.swing.JRadioButton jRadioButNombres;
    private javax.swing.JRadioButton jRadioButNumControl;
    private javax.swing.JRadioButton jRadioButNumControl20y21;
    private javax.swing.JRadioButton jRadioButNumeroEntero;
    private javax.swing.JRadioButton jRadioButNumeroEnteroNegativo;
    private javax.swing.JRadioButton jRadioButRFC;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextCadena;
    // End of variables declaration//GEN-END:variables
}