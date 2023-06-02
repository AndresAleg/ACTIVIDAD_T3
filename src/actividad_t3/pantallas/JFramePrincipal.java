package actividad_t3.pantallas;

import actividad_t3.entidades.Ropa;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author Andres
 */
public class JFramePrincipal extends javax.swing.JFrame {

    private final List<Ropa> listaRopa = new ArrayList<>();
    private final DefaultListModel modeloLista = new DefaultListModel();

    /**
     * Creates new form JFramePrincipal
     */
    public JFramePrincipal() {
        initComponents();
        lstRopa.setModel(modeloLista);
    }

    public void actualizarListViewRopa() {

        modeloLista.removeAllElements();

        for (Ropa ropa : listaRopa) {
            modeloLista.addElement(ropa.mostrarInformacion());
        }
    }
    
    public void setNuevaRopa(Ropa ropa) {
        listaRopa.add(ropa);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstRopa = new javax.swing.JList<>();
        btnNuevaRopa = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        lblRopaBuscar = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pantalla Principal");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Lista Ropa");

        jScrollPane1.setViewportView(lstRopa);

        btnNuevaRopa.setBackground(new java.awt.Color(153, 255, 153));
        btnNuevaRopa.setText("Crear Nueva Ropa");
        btnNuevaRopa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaRopaActionPerformed(evt);
            }
        });

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        lblRopaBuscar.setText("Ropa buscar:");

        btnBuscar.setBackground(new java.awt.Color(153, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevaRopa)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblRopaBuscar)
                            .addGap(18, 18, 18)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRopaBuscar)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNuevaRopa)
                .addGap(44, 44, 44))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaRopaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaRopaActionPerformed

        JFrameRopa frameRopa = new JFrameRopa(this);
        frameRopa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNuevaRopaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if (txtBuscar.getText().isEmpty()) {
            actualizarListViewRopa();
            return;
        }

        modeloLista.removeAllElements();

        for (Ropa ropa : listaRopa) {
            if (ropa.getNombre()
                    .toLowerCase()
                    .contains(txtBuscar.getText()
                            .toLowerCase())) {
                
                modeloLista.addElement(ropa.mostrarInformacion());
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        
        if (txtBuscar.getText().isEmpty()) {
            actualizarListViewRopa();
            return;
        }

        modeloLista.removeAllElements();

        for (Ropa ropa : listaRopa) {
            if (ropa.getNombre()
                    .toLowerCase()
                    .contains(txtBuscar.getText()
                            .toLowerCase())) {
                
                modeloLista.addElement(ropa.mostrarInformacion());
            }
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnNuevaRopa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRopaBuscar;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> lstRopa;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
