import classpackage.*;
import interfacePackage.*; 
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Start{
	public static void main(String args[]){
		
            
            
		Scanner input=new Scanner(System.in);
		int option = 0;
                ArrayList<Customer> c=new ArrayList<Customer>();
                ArrayList<Employee> e=new ArrayList<Employee>();
                ArrayList<Customer> CustomerOfEmpAccount=new ArrayList<Customer>();
                
                ArrayList<Account> aa=new ArrayList<Account>();
                Bank b=new Bank();
                Bank BankForEmp=new Bank();
                Account a=new Account();
                
                int AccNumber;
                double amount;
		System.out.println("\n\n\n-------------------------Welcome to The Project----------------------");
		System.out.println("----------------Application is based on user as per the choice--------------");
		boolean Continue=true;
		
		while(Continue)
		{
                    
                    System.out.println("1)Employee Management"+"\t"+"2)Customer Management \t 3)Account Transactions 4)Exit");
                                        System.out.print("Choose Option: ");
			
                                        try{ 
                                        option=input.nextInt();
                                        }catch(Exception exp){
                                         System.out.println(exp);
                                         input.next();// clear scanner wrong input
                                         continue; // continues to loop if exception is found
                                        }
                        
                        
                        
                        
			switch(option)
                        {
			case 1:
                            
				boolean GoForword=true;
				while(GoForword){
				System.out.println("1)Insert New Employee"+"\t"+"2)Remove Existing Employee\t 3)Show All Employee\t 4)Going Back");
				System.out.print("Choose Option: ");
				int optionInEmployee,indexControlEmp=0;
				String name,empId;
				double salary;
                                try{
				optionInEmployee=input.nextInt();
                                }catch(Exception exp){
                                             System.out.println(exp);
                                             input.next();// clear scanner wrong input
                                             continue; // continues to loop if exception is found
                                        }
				switch(optionInEmployee){
				case 1:
					e.add(indexControlEmp,new Employee());
                                        CustomerOfEmpAccount.add(indexControlEmp,new Customer());
                                        aa.add(indexControlEmp,new Account());
                                        
					System.out.print("Employee's Name: ");
                                      
					input.nextLine();
					name=input.nextLine();
                                        e.get(indexControlEmp).setName(name);
                                       
					
					
					System.out.print("Employee's ID: ");
                                        try{
					empId=input.nextLine();
                                        }catch(Exception exp){
                                            System.out.println(exp);
                                            input.next();// clear scanner wrong input
                                            continue; // continues to loop if exception is found
                                        }
					e.get(indexControlEmp).setEmpId(empId);
                                        
                                        
                                        
					
					System.out.print("Employee's Salary: ");
                                        try{
					salary=input.nextDouble();
                                        }catch(Exception exp){
                                            System.out.println(exp);
                                            input.next();// clear scanner wrong input
                                            continue; // continues to loop if exception is found
                                        }
					e.get(indexControlEmp).setSalary(salary);
					
                                        
                                        
                                        
                                        
                                        System.out.print("Account Number: ");
                                        try{
                                            AccNumber=input.nextInt();
                                            }
                                        catch(Exception exp){
                                            System.out.println(exp);
                                            input.next();// clear scanner wrong input
                                            continue; // continues to loop if exception is found
                                        }
                                                aa.get(indexControlEmp).setAccountNumber(AccNumber);
                                                System.out.print("Balance: ");
                                                try{
                                                amount=input.nextDouble();
                                                }
                                                catch(Exception exp){
                                                System.out.println(exp);
                                                input.next();// clear scanner wrong input
                                                continue; // continues to loop if exception is found
                                        }
                                                aa.get(indexControlEmp).setBalance(amount);
                                                CustomerOfEmpAccount.get(indexControlEmp).insertAccount(aa.get(indexControlEmp));
                                                   
                                        
                                        
                                        
                                        
                                        
                                        
					BankForEmp.insertEmployee(e.get(indexControlEmp));
					
					indexControlEmp++;										
					break;
				case 2:
					String ID;
                                        System.out.print("Enter Employee's NID to delete: ");
                                        try{
					input.nextLine();
                                        ID=input.nextLine(); 
                                        }
                                        catch(Exception exp){
                                        System.out.println(exp);
                                        input.next();// clear scanner wrong input
                                        continue; // continues to loop if exception is found
                                        }
					 
                                        BankForEmp.getEmployee(ID, e,aa,CustomerOfEmpAccount);
				
				
				
					break;
				case 3:
					System.out.println("\n\n--------Printing Avilable Employees in the DataBase---------\n");
					BankForEmp.showAllEmployees(e,CustomerOfEmpAccount);
				
				
					break;
				case 4:
					GoForword=false;
					break;
				default:
					System.out.println("Invalid Input");
					
				}
			}
			break;
			case 2:
				boolean GoBackOrNot=true;
				while(GoBackOrNot){
				System.out.println("1)Insert New Customer"+"\t"+"2)Remove Existing Customer\t 3)Show All Customer\t 4)Going Back");
				System.out.print("Choose Option: ");
                                
				int optionInCustomer;
                                
				String name;
				int Nid,idnexControl=0;
                                try{
				optionInCustomer=input.nextInt();
                                }catch(Exception exp){
                                        System.out.println(exp);
                                        input.next();// clear scanner wrong input
                                        continue; // continues to loop if exception is found
                                        }
				switch(optionInCustomer){
					case 1:	
						
						
                                         
                                                c.add(idnexControl,new Customer());
                                                aa.add(idnexControl,new Account());
						System.out.print("Customer's Name: ");
                                                try{
						input.nextLine();
						name=input.nextLine();
                                                }catch(Exception exp){
                                            System.out.println(exp);
                                             input.next();// clear scanner wrong input
                                              continue; // continues to loop if exception is found
                                        }
						c.get(idnexControl).setName(name);
						System.out.print("Customer's NID: ");
                                                try{
						Nid=input.nextInt();
                                                }catch(Exception exp){
                                            System.out.println(exp);
                                             input.next();// clear scanner wrong input
                                              continue; // continues to loop if exception is found
                                        }
                                                c.get(idnexControl).setNid(Nid);
                                                b.insertCustomer(c.get(idnexControl));
                                                
                                                
                                                
                                                System.out.print("Account Number: ");
                                                try{
                                                AccNumber=input.nextInt();
                                                }catch(Exception exp){
                                            System.out.println(exp);
                                             input.next();// clear scanner wrong input
                                              continue; // continues to loop if exception is found
                                        }
                                                aa.get(idnexControl).setAccountNumber(AccNumber);
                                                System.out.print("Balance: ");
                                                try{
                                                amount=input.nextDouble();
                                                }catch(Exception exp){
                                            System.out.println(exp);
                                             input.next();// clear scanner wrong input
                                              continue; // continues to loop if exception is found
                                        }
                                                aa.get(idnexControl).setBalance(amount);
                                                c.get(idnexControl).insertAccount(aa.get(idnexControl));
                                                
                                                
                                                
                                                
						idnexControl++;
						break;
					
					case 2:
                                            int nid,AccNumberToDelete;
                                            System.out.print("Enter Customer's NID to delete: ");
                                            try{
                                            nid=input.nextInt();
                                            }catch(Exception exp){
                                            System.out.println(exp);
                                             input.next();// clear scanner wrong input
                                              continue; // continues to loop if exception is found
                                        }
                                            b.getCustomer(nid,c,aa);
                                            
                                            
					break;
                                   
				case 3:
					System.out.println("\n\n--------Printing Avilable Customer's in the DataBase---------\n");
                                           
                                       
                                      b.showAllCustomers(c);
                                      
                                      
                                     
                                       
					
				
					break;
				case 4:
						GoBackOrNot=false;
				break;
				default:
						System.out.println("Invalid Input");
				}
			
			}
			break;
			
		case 3:
			
			boolean GoNext=true;
			while(GoNext){
				int OptionInAT;
				
				double Damount,Wamount;
				System.out.println("1.Deposit Money\t 2.Withdraw Money\t 3.Going Back");
				OptionInAT=input.nextInt();
				switch(OptionInAT){
					case 1:
                                                
                                                
						System.out.println("Deposit Amount :");
                                                try{
						Damount=input.nextDouble();}
                                                catch(Exception exp){
                                            System.out.println(exp);
                                             input.next();// clear scanner wrong input
                                              continue; // continues to loop if exception is found
                                        }
						a.deposit(Damount);
                                                System.out.println("Printing Data From file History");
												try{
                                                a.showInfo();
												}
												catch(Exception expp){
													
													expp.printStackTrace();
												}
						
					break;
					case 2:
						
						System.out.println("Withdraw Amount :");
                                                try{
						Wamount=input.nextDouble();}
                                                catch(Exception exp){
                                            System.out.println(exp);
                                             input.next();// clear scanner wrong input
                                              continue; // continues to loop if exception is found
                                        }
						a.withdraw(Wamount);
                                                System.out.println("Printing Data From file History");
												try{
                                                a.showInfo();
												}
												catch(Exception expp){
													
													expp.printStackTrace();
												}
					break;
                                        
					case 3:
                                                
						GoNext=false;
					break;
					default:
					
				}
			}
			break;
            case 4:
                    Continue=false;
                    break;
		default:
			System.out.println("Invalid Input");
		}
                        }
                        
	  
	}
  }