package hibernateModel;
// Generated Dec 16, 2014 10:47:05 PM by Hibernate Tools 4.3.1



/**
 * Orders generated by hbm2java
 */
public class Orders  implements java.io.Serializable {


     private Integer id;
     private int orderCode;
     private int itemId;
     private int quantity;
     private int storeId;
     private boolean delivered;
     private int userId;

    public Orders() {
    }

    public Orders(int orderCode, int itemId, int quantity, int storeId, boolean delivered, int userId) {
       this.orderCode = orderCode;
       this.itemId = itemId;
       this.quantity = quantity;
       this.storeId = storeId;
       this.delivered = delivered;
       this.userId = userId;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public int getOrderCode() {
        return this.orderCode;
    }
    
    public void setOrderCode(int orderCode) {
        this.orderCode = orderCode;
    }
    public int getItemId() {
        return this.itemId;
    }
    
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
    public int getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getStoreId() {
        return this.storeId;
    }
    
    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }
    public boolean isDelivered() {
        return this.delivered;
    }
    
    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }




}


