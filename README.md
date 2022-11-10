# microservice-learning
## 1. Build a Department Service
### step1. DI:
#### (1). JPA
`it is a Java specification for managing relational data in Java applications. It allows us to access and persist data between Java object/ class and relational database. CRUD`
#### (2). lombok
`it is a Java library tool that generates code for minimizing boilerplate code.`
```
@Getter, @Setter
@NoArgsConstructor, @AllArgsConstructor
@Data
@NotNull
```
#### (3). H2
`H2 is an embedded, open-source, and in-memory database. It is a relational database management system written in Java. It is a client/server application.`
#### (4). Web
### step2. Created a applicationDepartment.yml file
#### (1). Added 
`System.setProperty("spring.config.name", "applicationDepartment");` as below:
```
@SpringBootApplication
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "applicationDepartment");
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}
```
#### (2). Change the port
`added below:`
```
server:
  port: 9001
```
### step3. Added department logic class
#### (1). entity
```
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

}
```
#### (2). repository
```
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
```
#### (3). service
```
@Service
@Slf4j
public class DepartmentService {
    
    @Autowired
    DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        ...
    }

    public Optional<Department> finDepartmentById(Long departmentId) {
        ...
    }

}
```
#### (4). controller
```
@RestController
@RequestMapping("/v1/departments")
@Slf4j
public class DepartmentController {
	...
}
```
### step4. Test by using Postman
#### (1). POST: http://localhost:9001/v1/departments/
```
{
    "departmentName": "Ellinton",
    "departmentAddress": "1100 ne pl",
    "departmentCode": "17402"
}
```
#### (2). GET: http://localhost:9001/v1/departments/1



