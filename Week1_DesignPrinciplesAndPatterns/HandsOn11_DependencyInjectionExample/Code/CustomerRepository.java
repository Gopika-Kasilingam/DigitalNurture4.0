package Week1_DesignPrinciplesAndPatterns.HandsOn11_DependencyInjectionExample.Code;

// Repository interface for data access
public interface CustomerRepository {
    String findCustomerById(int id);
}
