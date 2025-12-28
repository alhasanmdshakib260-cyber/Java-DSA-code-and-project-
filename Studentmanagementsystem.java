package Studentmanage;

import java.io.*;
import java.util.Scanner;

public class Studentmanagementsystem {

    static final String STUDENT_FILE = "student.txt";
    static final String COURSE_FILE  = "courses.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== Student Management System =====");


        boolean loggedIn = false;
        while (!loggedIn) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (authenticateOfficer(username, password)) {
                System.out.println("\nLogin successful!\n");
                loggedIn = true;
            } else {
                System.out.println("Incorrect username or password. Try again.\n");
            }
        }


        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Assign Course to Student");
            System.out.println("5. View Courses for a Student");
            System.out.println("6. Exit");

            System.out.print("Choose option: ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                addStudent(scanner);
            } else if (choice.equals("2")) {
                viewAllStudents();
            } else if (choice.equals("3")) {
                searchStudent(scanner);
            } else if (choice.equals("4")) {
                assignCourse(scanner);
            } else if (choice.equals("5")) {
                viewCourses(scanner);
            } else if (choice.equals("6")) {
                System.out.println("Exiting system...");
                break;
            } else {
                System.out.println("Invalid option! Try again.\n");
            }
        }
    }


    static boolean authenticateOfficer(String username, String password) {

        if (username.equals("admin") && password.equals("1234")) {
            return true;
        }
        return false;
    }


    static void addStudent(Scanner scanner) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(STUDENT_FILE, true))) {
            System.out.print("Enter Student ID: ");
            String id = scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Program: ");
            String program = scanner.nextLine();

            System.out.print("Enter Batch: ");
            String batch = scanner.nextLine();

            System.out.print("Enter Password: ");
            String pass = scanner.nextLine();

            System.out.print("Enter CGPA: ");
            String cgpa = scanner.nextLine();

            bw.write(id + "," + name + "," + program + "," + batch + "," + pass + "," + cgpa);
            bw.newLine();

            System.out.println("Student Added Successfully!\n");
        } catch (IOException e) {
            System.out.println("Error writing student file.");
        }
    }

    static void viewAllStudents() {
        try (BufferedReader br = new BufferedReader(new FileReader(STUDENT_FILE))) {
            String line;
            System.out.println("\n===== All Students =====");
            while ((line = br.readLine()) != null) {
                String[] s = line.split(",");
                System.out.println("ID       : " + s[0]);
                System.out.println("Name     : " + s[1]);
                System.out.println("Program  : " + s[2]);
                System.out.println("Batch    : " + s[3]);
                System.out.println("CGPA     : " + s[5]);
                System.out.println("Password : [HIDDEN]");
                System.out.println("------------------------------");
            }
        } catch (IOException e) {
            System.out.println("Student file missing.\n");
        }
    }


    static void searchStudent(Scanner scanner) {
        System.out.print("Enter Student ID: ");
        String findID = scanner.nextLine();

        boolean found = false;
        try (BufferedReader br = new BufferedReader(new FileReader(STUDENT_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] s = line.split(",");
                if (s[0].equals(findID)) {
                    System.out.println("\nStudent Found!");
                    System.out.println("Name    : " + s[1]);
                    System.out.println("Program : " + s[2]);
                    System.out.println("Batch   : " + s[3]);
                    System.out.println("CGPA    : " + s[5]);
                    found = true;
                    break;
                }
            }
            if (!found) System.out.println("Student not found.\n");
        } catch (IOException e) {
            System.out.println("Error reading student file.");
        }
    }


    static void assignCourse(Scanner scanner) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(COURSE_FILE, true))) {
            System.out.print("Enter Student ID: ");
            String id = scanner.nextLine();

            System.out.print("Enter Course Name: ");
            String course = scanner.nextLine();

            bw.write(id + "," + course);
            bw.newLine();

            System.out.println("Course Assigned Successfully!\n");
        } catch (IOException e) {
            System.out.println("Error writing course file.");
        }
    }
    static void viewCourses(Scanner scanner) {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();

        boolean found = false;
        try (BufferedReader br = new BufferedReader(new FileReader(COURSE_FILE))) {
            String line;
            System.out.println("\nCourses for Student ID: " + id);
            while ((line = br.readLine()) != null) {
                String[] s = line.split(",");
                if (s[0].equals(id)) {
                    System.out.println("- " + s[1]);
                    found = true;
                }
            }
            if (!found) System.out.println("No courses found for this student.");
        } catch (IOException e) {
            System.out.println("Error reading course file.");
        }
    }

}
