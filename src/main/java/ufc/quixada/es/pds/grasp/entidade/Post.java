package ufc.quixada.es.pds.grasp.entidade;

public class Post {

	private Integer id;
	private String titulo;
	private String corpoTexto;

	public Post(String titulo, String corpoTexto) {
		this.titulo = titulo;
		this.corpoTexto = corpoTexto;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setCorpoTexto(String corpoTexto) {
		this.corpoTexto = corpoTexto;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public String getCorpoTexto(){
		return corpoTexto;
	}

	public void setId(Integer idSequence) {
		this.id = idSequence;
	}
	
	public Integer getId(){
		return id;
	}

}
