package TesteManual;

import model.Cidade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteCidade {
    public static void main(String[] args) {

        Cidade cidade = new Cidade();
        cidade.setNome("Amazonas");
        cidade.setEstado("Manaus");

        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("springtestes-jpa-pu");

        EntityManager em = fabrica.createEntityManager();

        em.getTransaction().begin();

        em.persist(cidade);

        em.getTransaction().commit();

        em.close();
    }

}
