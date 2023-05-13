package testeManual;

import dao.CidadeDao;
import model.Cidade;
import util.JPAUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class TesteEstadoDao {
    package testeManual;

import java.util.List;

import javax.persistence.EntityManager;

import dao.CidadeDao;
import model.Cidade;
import util.JPAUtil;

    public class TesteEstadoDao {


        private static void inserirDao(){

            EntityManager em = JPAUtil.getEntityManager();
            CidadeDao cidadeDao = new CidadeDao(em);
            EstadoDao estadoDao = new EstadoDao(em);

            Cidade cidade = new Cidade();
            cidade.setNome("Manaus");

            em.getTransaction().begin();
            Estado estado = estadoDao.consultar();
            cidadeDao.inserir(cidade);
            em.getTransaction().commit();

            em.close();


        }

        private static void listarDao() {

            EntityManager em = JPAUtil.getEntityManager();
            CidadeDao cidadeDao = new CidadeDao(em);

            List<Cidade> cidades= cidadeDao.listar();

            for(Cidade c: cidades){
                System.out.println(c.getId()+" - "+c.getNome());
            }

            em.close();

        }


        private static void consultarDao(){

            EntityManager em = JPAUtil.getEntityManager();
            CidadeDao cidadeDao = new CidadeDao(em);

            Cidade cidade = cidadeDao.consultar(9L);

            System.out.println(cidade.getNome());

            em.close();

        }

        private static void removerDao(){

            EntityManager em = JPAUtil.getEntityManager();
            CidadeDao cidadeDao = new CidadeDao(em);

            em.getTransaction().begin();
            cidadeDao.remover(7L);
            em.getTransaction().commit();

            em.close();

        }



        public static void main(String[] args) {

            inserirDao();
            consultarDao();
            removerDao();
            listarDao();


        }
    }

