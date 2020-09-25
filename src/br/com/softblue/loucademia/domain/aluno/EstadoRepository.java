package br.com.softblue.loucademia.domain.aluno;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class EstadoRepository {
	/*O EntitiyManager é a porta de entrada para o JPA */
	@PersistenceContext
	private EntityManager em;
	
	
	public List<Estado> listEstados(){
		/*JPQL (JavaPersistence Query Language */
		return em.createQuery("SELECT e FROM Estado e ORDER BY e.nome", Estado.class).getResultList();
	}
	

}
/* Outro opção de como fazer
 * 
 * import javax.persistence.TypedQuery;
public List<Estado> listEstados(){
	 
	TypedQuery<Estado> q = em.createQuery("SELECT e FROM Estado e ORDER BY e.nome", Estado.class);
	return q.getResultList();
}
*/
