
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guillermo.islas
 */
public class Cliente_JPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

                
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyPersistenceUnit");
        EntityManager manager = emf.createEntityManager();
        // manager.getTransaction().begin();

        //Query query = manager.createQuery("SELECT e FROM Cliente e");

        Cliente c1 = manager.find(Cliente.class, 5);
        c1.setApellido("Perez Companc");
        //manager.persist(c1);
        System.out.println(manager.find(Cliente.class, 5));
        
       /* Cliente c2 = new Cliente();
        c2.setNro_cliente(8);
        c2.setActivo(1);
        
manager.persist(c2);*/
        /*System.out.println((Collection<Cliente>)  query.getResultList());

            for (Cliente cli: (Collection<Cliente>) query.getResultList()) {
                System.out.println(cli);
            }        
        */
        manager.close();
        emf.close();
                
 
    }
    
}
