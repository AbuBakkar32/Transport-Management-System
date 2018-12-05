package transportmanagementsystem;

import javax.swing.JOptionPane;

public class UserLogin {

  private String username;
  private String password;

    public UserLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
        Login l= new Login();
   public void check(String n,String m)
    {
         if (username.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(null, "Any field is empty");
            
        } 
        else if(username.equals(n)  &&  password.equals(m))
        {
       
            JOptionPane.showMessageDialog(l, "Successfully login");
               
        }
        else
        {
              JOptionPane.showMessageDialog(l, "Oops!!! Try Again");
              
        }
            
    }
  
    
}
