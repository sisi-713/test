package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import java.awt.Color;

public class touchus extends JInternalFrame {

    /**
     * Launch the application.
     */
    /**
     * Create the frame.
     */
    public touchus() {
        setClosable(true);
        getContentPane().setBackground(Color.BLUE);
        setIconifiable(true);
        setTitle("关于我们");
        setBounds(100, 100, 707, 437); 
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(touchus.class.getResource("/images/shida.jpg")));
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
                    .addContainerGap(31, Short.MAX_VALUE)
                    .addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 645, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGap(117)
                    .addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(165, Short.MAX_VALUE))
        );
        getContentPane().setLayout(groupLayout);

    }

}
