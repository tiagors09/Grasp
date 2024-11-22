package ufc.quixada.es.pds.grasp.fronteira;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import ufc.quixada.es.pds.grasp.controlador.PostControlador;

@SuppressWarnings("serial")
public class PostarBlogJanela extends JFrame implements ActionListener {

	JButton publicar;
	JTextField titulo;
	JTextArea corpo;
	PostControlador controlador;
	
	public PostarBlogJanela(PostControlador controlador) {
		titulo = new JTextField("Digite o título...");
		this.add(titulo,BorderLayout.NORTH);
		
		corpo = new JTextArea("Corpo de texto do post...");
		this.add(corpo,BorderLayout.CENTER);
		
		publicar = new JButton("Publicar Post");
		publicar.addActionListener(this);
		this.add(publicar,BorderLayout.SOUTH);

		this.controlador = controlador;
	}

	public void mostrar() {
		this.setSize(400,400);
		this.setLocation(100, 100);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent publicarPost) {
		controlador.adicionarPostAoRepositorio(
			titulo.getText(), 
			corpo.getText()
		);
	}
}
