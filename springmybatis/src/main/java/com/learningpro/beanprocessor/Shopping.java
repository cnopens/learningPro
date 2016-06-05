package com.learningpro.beanprocessor;

/**
 * Created with IntelliJ IDEA.
 * Author:<H3>Gavin.C</H3>
 * Date: 14-2-26
 * Time: 下午5:28
 * Email:cnopens@163.com
 * Comment:-
 */
public interface Shopping {



    public String buySomething(String type);
    public String buyAnything(String type);
    public String sellAnything(String type);
    public String sellSomething(String type);

}



class ShoppingIA implements Shopping{

    private Customer customer;


    ShoppingIA() {
    }

    Customer getCustomer() {
        return customer;
    }

    void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String buySomething(String type) {
        System.out.println(this.getCustomer().getName()+"hello"+type+"Success!");
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String buyAnything(String type) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String sellAnything(String type) {
        System.out.println(this.getCustomer().getName()+"hello"+type+"Success!");
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String sellSomething(String type) {
        System.out.println(this.getCustomer().getName()+"hello"+type+"Success!");
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}

class Customer{

    private String name;


    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}