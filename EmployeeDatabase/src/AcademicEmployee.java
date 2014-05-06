
public class AcademicEmployee extends Employee {
   	
   public AcademicEmployee(String employeeNumber, String name, String role,
			char level, Boolean hasPHD) {
		super(employeeNumber, name, role, level);
		
		this.employeeNumber = employeeNumber;
      this.name = name;
      this.role = role;
      this.level = level;

   }
}
