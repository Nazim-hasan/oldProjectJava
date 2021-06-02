
package interfacePackage;
import java.util.ArrayList;
import classpackage.Account;

public interface AccountOperations {
        void insertAccount(Account a);
	void removeAccount(ArrayList<Account> a,int p);
	Account getAccount(int accountNumber,ArrayList<Account> a);
	void showAllAccounts();
}
