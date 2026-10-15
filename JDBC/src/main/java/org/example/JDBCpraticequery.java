
package org.example;

import java.sql.*;
import java.util.Scanner;

public class JDBCpraticequery {

    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/college";

        try (Connection con =
                     DriverManager.getConnection(url, "root", "Enter your password")) {

            int choice;
            int id;
            int val;
            String name, email;

            System.out.println("Welcome to JDBC Practice Session");

            while (true) {

                System.out.println("\n===== STUDENT MANAGEMENT =====");
                System.out.println("1. Insert Student");
                System.out.println("2. Retrieve All Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter ID: ");
                        id = sc.nextInt();

                        System.out.print("Enter Name: ");
                        name = sc.next();

                        System.out.print("Enter Email: ");
                        email = sc.next();

                        try (PreparedStatement ps = con.prepareStatement(
                                "INSERT INTO student (id, name, email) VALUES (?, ?, ?)")) {

                            ps.setInt(1, id);
                            ps.setString(2, name);
                            ps.setString(3, email);

                            val = ps.executeUpdate();

                            if (val > 0) {
                                System.out.println("Student inserted successfully");
                            } else {
                                System.out.println("Insert failed");
                            }
                        }
                        break;

                    case 2:
                        try (PreparedStatement ps = con.prepareStatement(
                                "SELECT * FROM student");
                             ResultSet rs = ps.executeQuery()) {

                            while (rs.next()) {
                                System.out.println("ID: " + rs.getInt("id"));
                                System.out.println("Name: " + rs.getString("name"));
                                System.out.println("Email: " + rs.getString("email"));
                                System.out.println("--------------------");
                            }
                        }
                        break;

                    case 3:
                        System.out.print("Enter student ID to update: ");
                        id = sc.nextInt();

                        System.out.println("1. Update Name");
                        System.out.println("2. Update Email");
                        System.out.print("Choose a field: ");

                        int updateChoice = sc.nextInt();

                        if (updateChoice == 1) {
                            System.out.print("Enter new name: ");
                            name = sc.next();

                            try (PreparedStatement ps = con.prepareStatement(
                                    "UPDATE student SET name = ? WHERE id = ?")) {

                                ps.setString(1, name);
                                ps.setInt(2, id);

                                val = ps.executeUpdate();

                                if (val > 0) {
                                    System.out.println("Name updated successfully");
                                } else {
                                    System.out.println("Student ID not found");
                                }
                            }

                        } else if (updateChoice == 2) {
                            System.out.print("Enter new email: ");
                            email = sc.next();

                            try (PreparedStatement ps = con.prepareStatement(
                                    "UPDATE student SET email = ? WHERE id = ?")) {

                                ps.setString(1, email);
                                ps.setInt(2, id);

                                val = ps.executeUpdate();

                                if (val > 0) {
                                    System.out.println("Email updated successfully");
                                } else {
                                    System.out.println("Student ID not found");
                                }
                            }

                        } else {
                            System.out.println("Invalid update choice");
                        }
                        break;

                    case 4:
                        System.out.print("Enter student ID to delete: ");
                        id = sc.nextInt();

                        try (PreparedStatement ps = con.prepareStatement(
                                "DELETE FROM student WHERE id = ?")) {

                            ps.setInt(1, id);

                            val = ps.executeUpdate();

                            if (val > 0) {
                                System.out.println("Student deleted successfully");
                            } else {
                                System.out.println("Student ID not found");
                            }
                        }
                        break;

                    case 5:
                        System.out.println("Exiting JDBC application...");
                        return;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }

        } finally {
            sc.close();
        }
    }
}
