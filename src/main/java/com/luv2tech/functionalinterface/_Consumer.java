package com.luv2tech.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    static Consumer<Customer> greetCustomerConsumer =
            customer -> System.out.println(
                    "Hello " + customer.customerName +
                            " , thank for registration phone number " +
                            customer.customerPhoneNumber);
    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 =
            (customer, showPhone) -> System.out.println(
                    "Hello " + customer.customerName +
                            " , thank for registration phone number " +
                            (showPhone ? customer.customerPhoneNumber : "*********"));

    public static void main(String[] args) {

        // TODO: Normal Java Function

        Customer maria = new Customer("maria",
                "9999999");
        greetCustomer(maria);
        greetCustomerV2(maria, false);
        greetCustomerV2(maria, true);

        // TODO: Consumer Function Interface
        Customer sushil = new Customer("Sushil",
                "9835");
        greetCustomerConsumer.accept(sushil);
        greetCustomerConsumerV2.accept(sushil, false);
        greetCustomerConsumerV2.accept(sushil, true);
    }

    static void greetCustomer(Customer customer) {
        System.out.println(
                "Hello " + customer.customerName +
                        " , thank for registration phone number " +
                        customer.customerPhoneNumber);
    }

    static void greetCustomerV2(Customer customer, boolean showPhoneNumber) {
        System.out.println(
                "Hello " + customer.customerName +
                        " , thank for registration phone number " +
                        (showPhoneNumber ? customer.customerPhoneNumber : "*********"));
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
