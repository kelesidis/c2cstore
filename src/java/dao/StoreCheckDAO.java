/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import hibernateModel.Categories;
import hibernateModel.Store;
import hibernateModel.Storeitems;
import hibernateModel.User;
import hibernateUtil.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class StoreCheckDAO{
    
    
    public Store checkForStore(User user){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        tx = session.beginTransaction();
        Store store =  (Store) session.createQuery("from Store as store where store.user = "+"'"+user.getId()+"'").uniqueResult();
        tx.commit();
        session.close(); 
        return store;
        
     
    }
    
   
    public boolean checkForStoreName(String storeName){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        tx = session.beginTransaction();
        Store store =  (Store) session.createQuery("from Store as store where store.storename = "+"'"+storeName+"'").uniqueResult();
        tx.commit();
        session.close(); 
        if(store == null){
            return false;
        }
        else{
            return true;
        }
        
     
    }
     
    
    public Store createStore(String storeName, User ur){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        tx = session.beginTransaction();
        Store store = new Store();
        store.setStorename(storeName);
        store.setUser(ur);
        session.save(store);
        tx.commit();
        session.close(); 
        return store;
        
    }
     
   
    public List getItems(Store store){
        List<Storeitems> itemList = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        tx = session.beginTransaction();
        Query q = session.createQuery ("from Storeitems as storeitems where storeitems.store = " + store.getId() );
        itemList = (List<Storeitems>) q.list();
        itemList =  q.list();
       

        return itemList;
    }
    
   
    public void addItem(String desc,String quantity, Store store, String price, String category){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        tx = session.beginTransaction();
        
        //Store store =  (Store) session.createQuery("from Store as store where store.storename = "+"'"+storeName+"'").uniqueResult();
        Storeitems item = new Storeitems();
        item.setDescription(desc);
        item.setPrice(price);
        item.setPhoto1("1");
        item.setPhoto2("2");
        item.setPhoto3("3");
        item.setQuantity(Integer.parseInt(quantity));
        Categories cat = (Categories) session.createQuery("from Categories as categories where categories.categoriename ='"+category+"'").uniqueResult();
        item.setStore(store);
        item.setCategories(cat);
        session.save(item);
        tx.commit();
        session.close();   
        
    }
    
   
    public List getCategories(){
        List<Categories> categories = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        tx = session.beginTransaction();
        Query q = session.createQuery ("from Categories as categories where categories.id > 0"  );
        categories = (List<Categories>) q.list();
        categories =  q.list();
       

        return categories;
    }

}
