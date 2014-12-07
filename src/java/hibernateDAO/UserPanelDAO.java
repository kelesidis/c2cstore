/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateDAO;

import hibernateModel.Storeitems;
import hibernateUtils.RegisterUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Chris
 */
public class UserPanelDAO {
    
    public List<Storeitems> retrieveItems(){
        Session session = RegisterUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        List<Storeitems> item = new ArrayList<Storeitems>();
        try{
            transaction = session.beginTransaction();
            item = (List<Storeitems>) session.createQuery ("from Storeitems as storeitems order by rand()").setMaxResults(3).list();
            transaction.commit();
            
        }catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        }
        finally {
        session.close();
        }
        return item;
    }
    
}
