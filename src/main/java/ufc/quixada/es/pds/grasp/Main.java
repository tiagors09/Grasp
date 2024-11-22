package ufc.quixada.es.pds.grasp;

import ufc.quixada.es.pds.grasp.controlador.PostControlador;
import ufc.quixada.es.pds.grasp.entidade.RepositorioPosts;
import ufc.quixada.es.pds.grasp.fronteira.PostarBlogJanela;

public class Main {
    public static void main(String[] args){
		PostarBlogJanela postarBlogJanela = new PostarBlogJanela(
			new PostControlador(
				new RepositorioPosts()
			)
		);
		
		postarBlogJanela.mostrar();
	}
}
