package vue;

import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import java.awt.Color;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import modele.ModeleUser;

@SuppressWarnings("serial")
public class Connexion extends JFrame implements ActionListener, KeyListener
{
    private JPanel unPanel = new JPanel();
    private JTextField tfEmail = new JTextField();
    private JPasswordField tfMdp = new JPasswordField();
    private JButton btAnnuler = new JButton("Annuler");
    private JButton btValider = new JButton("Valider");
    
    
    public Connexion() {
        this.setBounds(200,200,400,200);
        this.setTitle("Connexion à la gestion de stock");
        this.setResizable(true);
        this.setLayout(null);
        
        //placement des objets dans le panel
        this.unPanel.setBounds(0,0,400,200);
        this.unPanel.setBackground(Color.cyan);
        this.unPanel.setLayout(new GridLayout(5,2));
        this.unPanel.add(new JLabel(""));
        this.unPanel.add(new JLabel(""));
        this.unPanel.add(new JLabel("Email : "));
        this.unPanel.add(this.tfEmail);
        this.unPanel.add(new JLabel("Mot de passe : "));
        this.unPanel.add(this.tfMdp);
        this.unPanel.add(this.btAnnuler);
        this.unPanel.add(this.btValider);
        this.unPanel.add(new JLabel(""));
        this.unPanel.add(new JLabel(""));
        this.unPanel.setVisible(true);
        this.add(this.unPanel);
        //rendre les boutons cliquables
        this.btAnnuler.addActionListener(this);
        this.btValider.addActionListener(this);
        this.tfMdp.addKeyListener(this);//frappe de touche
        
        
        
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource()==this.btAnnuler)
            {
                this.tfEmail.setText("");
                this.tfMdp.setText("");
            }
            else if (e.getSource()==this.btValider)
            {
                String email = this.tfEmail.getText();
                String mdp = new String(this.tfMdp.getPassword());   //recup le mdp
                //test de connexion
                String tab[] = ModeleUser.selectWhere(email, mdp);
                if (tab[0]==null)
                {
                    JOptionPane.showMessageDialog(null, "Impossible de se connecter", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Bonjour"+tab[0]+" "+tab[1], "Bienvenue", JOptionPane.INFORMATION_MESSAGE);
                    //destruction de l'interface connexion
                    this.dispose();
                    //lancement du menu
                    new VueArticle();

                }
                
            }
    }
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
