   import java.util.*;
   public class Customer
   {
   
      public String name;
      public String idNumber;
      public ArrayList<Account> accountsList;
      private static int nr=1111; 
    
    //-------------------------------------------------------------------
   //Constructor -- initializes name, idNumber, and
   // create an empty ArrayList-object ready to store the Accouts  
   //-----------------------------------------------------------------------
   
      public Customer( String thename, String theidNumber)
      {
         name=thename;
         idNumber=theidNumber;
         accountsList=new ArrayList<Account>();
      
      }
    //--------------------------------------------------------------
   // create an new Account-object and add it to the list of accounts 
   //---------------------------------------------------------------
   
      public String openNewAccount()
      {
      
         String information=""; 
         String accNumber="3700-"+nr ; 
         nr++;       
         accountsList.add(new Account (accNumber, 0));
         return information;
      }
   //--------------------------------------------------------------
   //Search for the account in the list that has the right account number. 
   //if found, do deposit 
   //--------------------------------------------------------------
   
      public String findAndDeposit ( String accNr, int amount)
      {
         String info="Accout number not found";
         for(int i=0;i<accountsList.size();i++){
            Account temp=accountsList.get(i);
            if(temp.getAcctNum().equals(accNr)){
               temp.deposit(amount);
               info=temp.toString();
            }	 }
      
         return info;	 
      
      
      } 
   //----------------------------------------------
   // Returns a string containing the name, id, and all information 
   // from the accountsList
   //----------------------------------------------
   
      public String toString()
      {
      // skall returnera en string som innehåller kund namn och id 
      // samt info om alla sina konton 
         return "?";
      }
   
   
   }
  
  
  
  



