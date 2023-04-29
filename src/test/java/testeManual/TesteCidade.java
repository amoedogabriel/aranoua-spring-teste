package TesteManual;

import model.Cidade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class TesteCidade {
    public static void main(String[] args) {

//        Cidade cidade = new Cidade();
//        cidade.setNome("Amazonas");
//        cidade.setEstado("Manaus");
//
       EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("springtestes-jpa-pu");
//
       EntityManager em = fabrica.createEntityManager();
//
//        em.getTransaction().begin();
//
//        em.persist(cidade);
//
//        em.getTransaction().commit();
//


        Query consulta = em.createQuery("select cidade from Cidade cidade");
        List<Cidade> cidades = consulta.getResultList();

        for(Cidade c:cidades){
            System.out.println("Nome: "+c.getNome()+" Estado:"+c.getEstado());
        }

        em.close();


    }

}
