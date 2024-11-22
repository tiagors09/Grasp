package ufc.quixada.es.pds.grasp.controlador;

import ufc.quixada.es.pds.grasp.entidade.RepositorioPosts;

public class PostControlador {
    private RepositorioPosts repositorio;

    public PostControlador(RepositorioPosts repositorio) {
		  this.repositorio = repositorio;
    }

    public void adicionarPostAoRepositorio(String titulo, String corpoTexto) {
		  repositorio.adicionar(
        titulo, 
        corpoTexto
      ); 
    }
}
