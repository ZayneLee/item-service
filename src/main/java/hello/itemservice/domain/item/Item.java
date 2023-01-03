package hello.itemservice.domain.item;

<<<<<<< HEAD
public class Item {
    
=======
import lombok.Data;

@Data
public class Item {
>>>>>>> 2cf132a85680ef864bdbe1e62ae2c1cf6fbeedce
    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;
<<<<<<< HEAD
    
    public Item() {
    }

=======

    public Item() {

    }
    
>>>>>>> 2cf132a85680ef864bdbe1e62ae2c1cf6fbeedce
    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

<<<<<<< HEAD
    
}
=======

    
}
>>>>>>> 2cf132a85680ef864bdbe1e62ae2c1cf6fbeedce
