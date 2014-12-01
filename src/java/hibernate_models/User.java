package hibernate_models;
// Generated Nov 30, 2014 2:43:46 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String lastname;
     private String username;
     private String rank;
     private String email;
     private String secretQ;
     private String secretA;
     private String password;
     private String city;
     private String country;
     private String state;
     private String address;
     private String postalCode;
     private String phone;
     private Set<Store> stores = new HashSet<Store>(0);

    public User() {
    }

	
    public User(String name, String lastname, String username, String rank, String email, String secretQ, String secretA, String password, String city, String country, String state, String address, String postalCode, String phone) {
        this.name = name;
        this.lastname = lastname;
        this.username = username;
        this.rank = rank;
        this.email = email;
        this.secretQ = secretQ;
        this.secretA = secretA;
        this.password = password;
        this.city = city;
        this.country = country;
        this.state = state;
        this.address = address;
        this.postalCode = postalCode;
        this.phone = phone;
    }
    public User(String name, String lastname, String username, String rank, String email, String secretQ, String secretA, String password, String city, String country, String state, String address, String postalCode, String phone, Set<Store> stores) {
       this.name = name;
       this.lastname = lastname;
       this.username = username;
       this.rank = rank;
       this.email = email;
       this.secretQ = secretQ;
       this.secretA = secretA;
       this.password = password;
       this.city = city;
       this.country = country;
       this.state = state;
       this.address = address;
       this.postalCode = postalCode;
       this.phone = phone;
       this.stores = stores;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getRank() {
        return this.rank;
    }
    
    public void setRank(String rank) {
        this.rank = rank;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSecretQ() {
        return this.secretQ;
    }
    
    public void setSecretQ(String secretQ) {
        this.secretQ = secretQ;
    }
    public String getSecretA() {
        return this.secretA;
    }
    
    public void setSecretA(String secretA) {
        this.secretA = secretA;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPostalCode() {
        return this.postalCode;
    }
    
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Set<Store> getStores() {
        return this.stores;
    }
    
    public void setStores(Set<Store> stores) {
        this.stores = stores;
    }




}


