package src.com.codewithmosh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import src.com.codewithmosh.collections.Customer;

public class Main {

    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();

        customers.add(new Customer("b"));
        customers.add(new Customer("a"));
        customers.add(new Customer("c"));
        Collections.sort(customers);
        System.out.println(customers);

    }
}