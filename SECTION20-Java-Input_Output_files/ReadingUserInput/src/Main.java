public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account();
       // Account bobsAccount = new Account ("12345", 21000.00, "Bob Brown", "myemail@bob.com","(087) 123435");
      System.out.println(bobsAccount.getNumber());
      System.out.println(bobsAccount.getBalance());
        //  bobsAccount.setNumber("12345");
      //  bobsAccount.setBalance(1000);
      //  bobsAccount.setCustomerEmail("totonlionel@gmail.com");
      //  bobsAccount.setCustomerName("TOTON Lionel");
        bobsAccount.depositFunds(500);
        bobsAccount.withdrawFunds(100.0);
    }
}
