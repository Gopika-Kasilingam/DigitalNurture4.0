package Week1_DesignPrinciplesAndPatterns.HandsOn11_DependencyInjectionExample.Code;

/*
 * Concrete implementation of CustomerRepository.
 * Simulates fetching customer data.
 */
public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(int id) {
        // Simulated data source
        return "Customer#" + id + ": John Doe";
    }
}
