/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateDAO;


import hibernateModel.Storeitems;
import hibernateUtils.RegisterUtil;
import hibernateModel.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Chris
 */
public class RegisterDAO {
    
    User query = new User();
    
    public void addUser(User user){
        Session session = RegisterUtil.getSessionFactory().openSession();
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
    
    public User checkUsername(String username){
        
        Session session = RegisterUtil.getSessionFactory().openSession();
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
    
    public User checkEmail(String email){
        
        Session session = RegisterUtil.getSessionFactory().openSession();
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
    
}
