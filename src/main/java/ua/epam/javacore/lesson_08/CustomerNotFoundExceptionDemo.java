package ua.epam.javacore.lesson_08;

public class CustomerNotFoundExceptionDemo {
    static String findCustomerById(int id) throws CustomerNotFoundException {
        if (id == 1) {
            System.out.println("Customer details...");
            return "T";
        }
        throw new CustomerNotFoundException(id);
    }

    public static void main(String args[]) {
        try {
            findCustomerById(1);
            findCustomerById(20);
        } catch (CustomerNotFoundException e) {
            System.out.println("Customer not found " + e);
        }
    }
}
