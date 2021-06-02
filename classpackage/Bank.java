package classpackage;
import java.util.ArrayList;
import interfacePackage.EmployeeOperations;
import interfacePackage.CustomerOperations;
public class Bank implements CustomerOperations, EmployeeOperations{
    Customer customers;
    Employee employees;
	public Bank(){
            
	}
        @Override
	public void setCustomer(Customer c){
            this.customers=c;
             
	}
        
        @Override
	public void getCustomer(int nid,ArrayList<Customer> c,ArrayList<Account> a){
            
          for(int k=0;k<c.size();k++){
            if(c.get(k).getNid()==nid){
             this.removeCustomer(c,k);
             customers.removeAccount(a,k);
            
            }
            else
                  System.out.println("This Nid Number isn't in the DataBase!!!");
          }
            
             
	}
        @Override
	public void insertCustomer(Customer c){
            
         this.customers=c;
            System.out.println("Inserted!!!");
            
	}
        @Override
	public void removeCustomer(ArrayList<Customer> c,int pos){
            c.remove(c.get(pos));
            
            System.out.println("Deleted");
            
	}

   
    @Override
	public void showAllCustomers(ArrayList<Customer> c){
            for(int g=0;g<c.size();g++){
            System.out.println("Name: "+c.get(g).getName());
            System.out.println("ID: "+c.get(g).getNid());
            c.get(g).showAllAccounts();
	}
        }

    @Override
    public void setEmployees(Employee e) {
        this.employees=e;
        System.out.println("Inserted!!!");
    }

    @Override
    public void getEmployee(String empId,ArrayList<Employee> e,ArrayList<Account> a,ArrayList<Customer> c) {
        for(int d=0;d<e.size();d++){
        if(empId.equals(e.get(d).getEmpId())){
            this.removeEmplyee(e,d);
            c.get(d).removeAccount(a, d);
        }
        else 
                System.out.println("This ID Number isn't in the DataBase!!!");
        }
    }

    @Override
    public void insertEmployee(Employee e) {
        this.employees=e;
    }

    @Override
    public void removeEmplyee(ArrayList<Employee> e,int position) {
        e.remove(e.get(position));
        System.out.println("Deleted");
        
    }

    @Override
    public void showAllEmployees(ArrayList<Employee> e,ArrayList<Customer> cForAccount) {
        for(int g=0;g<e.size();g++){
            System.out.println("Name: "+e.get(g).getName());
            System.out.println("EmpID: "+e.get(g).getEmpId());
            System.out.println("Salary: "+e.get(g).getSalary());
            cForAccount.get(g).showAllAccounts();
    }
    }

    

 

}
