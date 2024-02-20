
package enkapulasi_user;

public class Enkapulasi_User {

    public static void main(String[] args) {
        
        User AQEEL = new User("Aqeel","Aktif");
        
        AQEEL.setUsername("Aqeel");
        AQEEL.setPassword("Aktif");
        
        System.out.println("Username : "+AQEEL.getUsername());
        System.out.println("Username : "+AQEEL.getPassword());
        
    }
    
}
