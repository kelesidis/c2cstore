/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import hibernateModel.Store;
import hibernateModel.Storeitems;
import hibernateModel.User;
import hibernateUtil.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Chris
 */
public class RegisterDAO implements IHibernateDAO{
    
    User query = new User();
    
    @Override
    public void addUser(User user){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
            
            
        }catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        }
        finally {
        session.close();
        }
    }
    
    @Override
    public User checkUsername(String username){
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            query = (User) session.createQuery("from User as user where user.username = '"+username+"'").uniqueResult();
            transaction.commit();
            
            
        }catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        }
        finally {
        session.close();
        }
        return query;
    }
    
    @Override
    public User checkEmail(String email){
        
        Session session = HibernateUtil.getSessionFactory().openSession();;
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            query = (User) session.createQuery("from User as user where user.email = '"+email+"'").uniqueResult();
            transaction.commit();
            
            
        }catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        }
        finally {
        session.close();
        }
        return query;
    }

    @Override
    public Storeitems getItem(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getDBUser(String ungiven) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Store checkForStore(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkForStoreName(String storeName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Store createStore(String storeName, User ur) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getItems(Store store) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addItem(String desc, String quantity, Store store, String price, String category) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getCategories() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Storeitems> retrieveItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
