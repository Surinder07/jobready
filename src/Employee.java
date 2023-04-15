public class Employee {
    private Long id;
    private String name;
    private String email;
    private Double salary;

    Employee(Long id, String name,  Double salary ,String email){
        this.id=id;
        this.name=name;
        this.email=email;
        this.salary=salary;
    }
    public Long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public Double getSalary(){
        return this.salary;
    }


}
