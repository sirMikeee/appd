package banking;


public class bankApp {
    
    int accountNo = 100012;
    String accName;
    float initialBalance = 0;
    int pin = 1234;
    
    public boolean verifyAccount(int acc, int pn){    
        if(acc == accountNo && pn == pin){
            return true;
        }else{
            return false;
        }
    }
    
    public void checkingBalance(){
   
    }
    
    public void deposit(){
        
    }
    
}
