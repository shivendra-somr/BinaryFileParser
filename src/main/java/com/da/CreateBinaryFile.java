package com.da;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class CreateBinaryFile {

    private String name;
    private int age;

    public CreateBinaryFile() {
    }

    public CreateBinaryFile(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void createBinaryFile(String name, int age){
        // Create a 40-byte string padded with null bytes
        byte[] nameBytes = new byte[40];
        byte[] nameTemp = name.getBytes(StandardCharsets.UTF_8);
        System.arraycopy(nameTemp, 0, nameBytes, 0, nameTemp.length);

        // Convert age to 2-byte array
        byte[] ageBytes = new byte[2];
        ageBytes[0] = (byte) (age >> 8);
        ageBytes[1] = (byte) age;

        // Combine the bytes
        byte[] binaryContent = new byte[42];
        System.arraycopy(nameBytes, 0, binaryContent, 0, 40);
        System.arraycopy(ageBytes, 0, binaryContent, 40, 2);

        // Write to a binary file
        try (FileOutputStream fos = new FileOutputStream("test.bin")) {
            fos.write(binaryContent);
            System.out.println("Binary file created: test.bin");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
