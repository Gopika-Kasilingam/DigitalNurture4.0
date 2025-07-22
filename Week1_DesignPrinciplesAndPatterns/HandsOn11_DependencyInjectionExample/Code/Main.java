package Week1_DesignPrinciplesAndPatterns.HandsOn11_DependencyInjectionExample.Code;

/*
 * Demonstrates Dependency Injection:
 * CustomerRepositoryImpl is injected into CustomerService at runtime.
 */
public class Main {
    public static void main(String[] args) {
        // Create the dependency (repository)
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject dependency into the service
        CustomerService service = new CustomerService(repository);

        // Use the service to fetch customer details
        service.getCustomerDetails(101);
    }
}
