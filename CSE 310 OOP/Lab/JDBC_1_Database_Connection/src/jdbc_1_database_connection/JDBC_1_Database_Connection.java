package jdbc_1_database_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_1_Database_Connection {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/cse_310_demo_project?", "root", "");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT ID, FirstName, Email FROM user_information");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
        }

        Scanner scn = new Scanner(System.in);
        System.out.println("\nPress \n1 for Registration \n2 for Login \n3 for Delete Row \n4 for Update");
        int choice = scn.nextInt();
        PreparedStatement ps;
        if (choice == 1) {

            System.out.println("Please Enter Your First Name");
            String firstName = scn.next();
            System.out.println("Please Enter Your Last Name");
            String lastName = scn.next();
            System.out.println("Please Enter Your Phone No");
            String pno = scn.next();
            System.out.println("Please Enter Your Address");
            String add = scn.next();
            System.out.println("Please Enter Your Email");
            String emailAdd = scn.next();
            System.out.println("Please Enter Your Password");
            String pwd = scn.next();
            System.out.println("Please Enter Your Gender");
            String gender = scn.next();
            System.out.println("Please Enter Your Date of Birth");
            String dob = scn.next();

            ps = con.prepareStatement("SELECT email FROM user_information WHERE email = ?");
            ps.setString(1, emailAdd);
            rs = ps.executeQuery();

            if (rs.next() == true) {
                System.out.println("Your Email Address Alreaedy Exists");
            } else {
                ps = con.prepareStatement("INSERT INTO user_information (FirstName,LastName,PhoneNo,Address,Email,Password,Gender,DOB) VALUES (?,?,?,?,?,?,?,?)");
                ps.setString(1, firstName);
                ps.setString(2, lastName);
                ps.setString(3, pno);
                ps.setString(4, add);
                ps.setString(5, emailAdd);
                ps.setString(6, pwd);
                ps.setString(7, gender);
                ps.setString(8, dob);
                ps.executeUpdate();
            }
        } else if (choice == 2) {
            System.out.println("Please Enter Username");
            String userName = scn.next();
            System.out.println("Please Enter Password");
            String pass = scn.next();

            ps = con.prepareStatement("SELECT email, password FROM user_information WHERE email = ? AND password = ?");
            ps.setString(1, userName);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            //boolean loginCredential = false;
            if (rs.next() == true) {
                //loginCredential = true;
                ps = con.prepareStatement("SELECT * FROM user_information WHERE email = ? AND password = ?");
                ps.setString(1, userName);
                ps.setString(2, pass);
                rs = ps.executeQuery();
                rs.next();

                String firstName = rs.getString(2);
                String lastName = rs.getString(3);
                String email = rs.getString(6);
                String userID = rs.getString(1);
                String phoneNo = rs.getString(4);
                String address = rs.getString(5);
                String dateOfBirth = rs.getString(9);

                System.out.println("");
                System.out.println("Hello " + firstName + " " + lastName);
                System.out.println("Email         : " + email);
                System.out.println("User ID       : " + userID);
                System.out.println("Phone No      : 0" + phoneNo);
                System.out.println("Address       : " + address);
                System.out.println("Date of Birth : " + dateOfBirth);
            } else {
                System.out.println("Username or Password doesn't match");
            }
        } else if (choice == 3) {
            System.out.println("Enter Below the Info you want to Delete:");
            System.out.println("Enter Email");
            String emailAdd = scn.next();
            System.out.println("Enter Password");
            String pass = scn.next();
            ps = con.prepareStatement("DELETE FROM user_information WHERE email = ? AND password = ?");
            ps.setString(1, emailAdd);
            ps.setString(2, pass);
            ps.executeUpdate();
            System.out.println("Record deleted succesfully!");

        } else if (choice == 4) {

            System.out.println("Enter Below the Info you want to Update:");
            System.out.println("Enter Email");
            String emailAdd = scn.next();
            System.out.println("Enter Password");
            String pass = scn.next();
            ps = con.prepareStatement("UPDATE user_information SET FirstName=?,LastName=?,PhoneNo=?,Address=?,Password=?,Gender=?,DOB=? WHERE email =?");
            System.out.println("Update Your First Name");
            String firstName = scn.next();
            System.out.println("Update Your Last Name");
            String lastName = scn.next();
            System.out.println("Update Phone No");
            String pno = scn.next();
            System.out.println("Update Address");
            String add = scn.next();
            System.out.println("Update Password");
            String pwd = scn.next();
            System.out.println("Update Gender");
            String gender = scn.next();
            System.out.println("Update Date of Birth");
            String dob = scn.next();
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, pno);
            ps.setString(4, add);
            ps.setString(5, pwd);
            ps.setString(6, gender);
            ps.setString(7, dob);
            ps.setString(8, emailAdd);
            ps.executeUpdate();
            System.out.println("Record updated succesfully!");
        }

        st.close();
        con.close();
    }
}
