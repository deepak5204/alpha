package OOPS;

public class GettersAndSetters {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.username = "deepak";
        acc1.setPassword("abcdefg");
        System.out.println(acc1.getPassowrd());
    } 
}

class BankAccount{
    String username;
   private String Password;

   //getters - return the value
   String getPassowrd(){
    return Password;
   } 

   //Setters - update/modify the Password
   void setPassword(String password){
        this.Password = password;
   }
}
