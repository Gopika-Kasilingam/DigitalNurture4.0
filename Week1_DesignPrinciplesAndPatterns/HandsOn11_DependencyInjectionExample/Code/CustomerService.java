package Week1_DesignPrinciplesAndPatterns.HandsOn11_DependencyInjectionExample.Code;

/*
 * Service class that depends on CustomerRepository.
 * Dependency is injected through the constructor.
 */
public class CustomerService {
    private CustomerRepository customerRepository;

    // Constructor injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void getCustomerDetails(int id) {
        String customer = customerRepository.findCustomerById(id);
        System.out.println("Retrieved: " + customer);
    }
}
