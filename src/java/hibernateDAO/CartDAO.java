/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateDAO;

import hibernateModel.Storeitems;
import hibernateUtils.LoginUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Admin
 */
public class CartDAO {
     public Storeitems getItem(String id){
        Storeitems item = null;
        LoginUtil LU = new LoginUtil();
        Session session = LU.getFactorySession().openSession();
        Transaction tx = null;
        tx = session.beginTransaction();
        item = (Storeitems) session.createQuery ("from Storeitems as storeitems where storeitems.id = '"+id+"'").uniqueResult();    

        return item;
    }
}
