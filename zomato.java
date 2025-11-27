import java.util.*;
public class zomato {
    int orderid,del_time;
    double price;
    String customer_name,shop_name,customer_addr,shop_add,order_item;
    public zomato(int orderid, double price, int del_time, String customer_name, String shop_name, String customer_addr,
            String shop_add, String order_item) {
        this.orderid = orderid;
        this.price = price;
        this.del_time = del_time;
        this.customer_name = customer_name;
        this.shop_name = shop_name;
        this.customer_addr = customer_addr;
        this.shop_add = shop_add;
        this.order_item = order_item;
    }
    @Override
    public String toString() {
        return "zomato [orderid=" + orderid + ", del_time=" + del_time + ", price=" + price + ", customer_name="
                + customer_name + ", shop_name=" + shop_name + ", customer_addr=" + customer_addr + ", shop_add="
                + shop_add + ", order_item=" + order_item + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + orderid;
        result = prime * result + del_time;
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((customer_name == null) ? 0 : customer_name.hashCode());
        result = prime * result + ((shop_name == null) ? 0 : shop_name.hashCode());
        result = prime * result + ((customer_addr == null) ? 0 : customer_addr.hashCode());
        result = prime * result + ((shop_add == null) ? 0 : shop_add.hashCode());
        result = prime * result + ((order_item == null) ? 0 : order_item.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        zomato other = (zomato) obj;
        if (orderid != other.orderid)
            return false;
        if (del_time != other.del_time)
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        if (customer_name == null) {
            if (other.customer_name != null)
                return false;
        } else if (!customer_name.equals(other.customer_name))
            return false;
        if (shop_name == null) {
            if (other.shop_name != null)
                return false;
        } else if (!shop_name.equals(other.shop_name))
            return false;
        if (customer_addr == null) {
            if (other.customer_addr != null)
                return false;
        } else if (!customer_addr.equals(other.customer_addr))
            return false;
        if (shop_add == null) {
            if (other.shop_add != null)
                return false;
        } else if (!shop_add.equals(other.shop_add))
            return false;
        if (order_item == null) {
            if (other.order_item != null)
                return false;
        } else if (!order_item.equals(other.order_item))
            return false;
        return true;
    }
    
    }
