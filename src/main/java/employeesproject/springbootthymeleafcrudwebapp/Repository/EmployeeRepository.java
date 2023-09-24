package employeesproject.springbootthymeleafcrudwebapp.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import employeesproject.springbootthymeleafcrudwebapp.Model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
