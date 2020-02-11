package com.luv2tech.functionalinterface;

import java.util.function.Consumer;

public class _Consumer {
    static Consumer<Customer> greetCustomerConsumer =
            customer -> System.out.println(
                    "Hello " + customer.customerName +
                            " , thank for registration phone number " +
                            customer.customerPhoneNumber);

    public static void main(String[] args) {

        // TODO: Normal Java Function

        greetCustomer(new Customer("maria",
                "9999999"));

        // TODO: Consumer Function Interface
        greetCustomerConsumer.accept(
                new Customer("Sushil",
                        "9835")
        );
    }

    static void greetCustomer(Customer customer) {
        System.out.println(
                "Hello " + customer.customerName +
                        " , thank for registration phone number " +
                        customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName,
                        String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
