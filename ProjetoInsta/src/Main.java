import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Survival");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Postagens u = new Postagens();
		u.setID_PO(1L);
		u.setMusicas("sdffds");
		em.persist(u);
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
	
}
