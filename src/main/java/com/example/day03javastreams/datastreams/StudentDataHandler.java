package com.example.day03javastreams.datastreams;

import java.io.*;


public class StudentDataHandler {
    public static void saveStudentData(Student student, String filePath) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            dos.writeInt(student.getRollNumber());
            dos.writeUTF(student.getName());
            dos.writeDouble(student.getGpa());
        }
    }

    public static Student retrieveStudentData(String filePath) throws IOException {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            int rollNumber = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();
            return new Student(rollNumber, name, gpa);
        }
    }

    public static void main(String[] args) {
        String filePath = "src/main/java/com/example/day03javastreams/datastreams/student_data.dat";
        Student student = new Student(101, "Ankit", 9.8);

        try {
            saveStudentData(student, filePath);
            System.out.println("Student data saved successfully!");

            Student retrievedStudent = retrieveStudentData(filePath);
            System.out.println("Retrieved Student: " + retrievedStudent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
