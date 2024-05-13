package demo.db;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Runner {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo_DB_jar_1.0-SNAPSHOTPU");

    public static List<Show> getShowsByArtist(String artistName) {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Show> query = em.createQuery("SELECT s FROM Show s WHERE s.artName.artistName = :art_name", Show.class);
        query.setParameter("art_name", artistName);
        List<Show> shows = query.getResultList();
        em.close();
        return shows;
    }
    
    
}
