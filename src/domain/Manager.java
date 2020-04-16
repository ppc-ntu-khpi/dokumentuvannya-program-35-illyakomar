package domain;

/**
 * Manager of the company
 * @author i-kom
 */
public class Manager extends Employee {
    
    /**
     * Constructor with information about manager
     * @param employees employees manager
     * @param name name manager
     * @param jobTitle job titile manager
     * @param level level manager
     * @param dept department manager
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }
    
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }
    
    /**
     * Constructor with information about manager`s employee
     * @param employees employees of the manager 
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * Constructor for the manager
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;
    
    /**
     * Method returns manager`s employees information
     * @return manager`s employees string
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }
    
    /**
     * Method that set employees to the manager
     * @param employees employees of the manager 
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Method that returns employee of the manager
     * @return array of the manager employee
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
