/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import hibernateModel.Store;
import hibernateModel.Storeitems;
import hibernateModel.User;
import java.util.List;

/**
 *
 * @author Chris
 */
public interface IHibernateDAO {
    
    public Storeitems getItem(String id);
    public List getItems();
    public User getDBUser(String ungiven);
    public void addUser(User user);
    public User checkUsername(String username);
    public User checkEmail(String email);
    public Store checkForStore(User user);
    public boolean checkForStoreName(String storeName);
    public Store createStore(String storeName, User ur);
    public List getItems(Store store);
    public void addItem(String desc,String quantity, Store store, String price, String category);
    public List getCategories();
    public List<Storeitems> retrieveItems();
    
}
