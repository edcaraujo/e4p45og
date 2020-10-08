/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import core.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author edcar
 */
public class DBPessoa {
    private static DBPessoa instance;
    private EntityManager entityManager;
    
    public static DBPessoa getInstance() {
        if (instance == null) {
            instance = new DBPessoa();
        }
        
        return instance;
    }
    
    private DBPessoa() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("WebExample02ClassPU");
        
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
    }
    
    public void salvar(Pessoa pessoa){
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(pessoa);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        } 
    }
}
