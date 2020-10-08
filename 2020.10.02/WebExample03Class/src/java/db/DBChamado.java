/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import core.Chamado;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author edcar
 */
public class DBChamado {
    private static DBChamado instance;
    private EntityManager manager;
    
    public static DBChamado getInstance() {
        if (instance == null) {
            instance = new DBChamado();
        }
        
        return instance;
    }
    
    private DBChamado() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("WebExample03ClassPU");
        
        if (manager == null) {
            manager = factory.createEntityManager();
        }
    }
    
    public void salvar(Chamado chamado){
        try{
            manager.getTransaction().begin();
            manager.persist(chamado);
            manager.getTransaction().commit();
        }catch(Exception e){
            manager.getTransaction().rollback();            
        }    
    }
    
    public List<Chamado> getChamados() {
        List<Chamado> list = null;
        
        try{
            manager.getTransaction().begin();
            list = manager.createNamedQuery("Chamado.findAll").getResultList();
        }catch(Exception e){
                   
        }   
        
        return list;
    }
    
}
