package ufc.quixada.es.pds.grasp.entidade;

public interface Predicado<T> {
	boolean aplicarA(T type, Object criteria);
}
