package classpackage;
import interfacePackage.AccountOperations;
import java.util.ArrayList;
public class Customer implements AccountOperations {

    public String name;
    public int nid;
    Account accounts;
    //Account accounts = new Account();

    public void setName(String name) {
        this.name = name;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }


    public String getName() {
        return name;
    }

    public int getNid() {
        return nid;
    }
@Override
    public void insertAccount(Account a) {
        this.accounts=a;
        
    }

    @Override
    public void removeAccount(ArrayList<Account> a,int p) {
        a.remove(a.get(p));
        System.out.println("Deleted Account Too!!!");
    }

    @Override
    public Account getAccount(int accountNumber,ArrayList<Account> a) {
        for(int i=0;i<a.size();i++){
        if(a.get(i).getAccountNumber()==accountNumber){
           this.removeAccount(a,i);
       }
        }
       
       
  
       return accounts;
    }

    @Override
    public void showAllAccounts() {
            System.out.println("AccountNumber: "+accounts.getAccountNumber());
            System.out.println("Balance: "+accounts.getBalance());
            System.out.println("\n\n\n");
        }
	   
    

   

    
}