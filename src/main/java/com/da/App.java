package com.da;

import io.kaitai.struct.ByteBufferKaitaiStream;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {

        ByteBufferKaitaiStream kaitaiStream = new ByteBufferKaitaiStream("Identify file1.bin");
        kaitaiStream.asRoBuffer();
        System.out.println(kaitaiStream.size());

        byte[] bytes = kaitaiStream.readBytesFull();
        String text = new String(bytes, StandardCharsets.ISO_8859_1);
//        System.out.println(text);
        char[] modelNumber = new char[40];
        int j = 0;
        for(int i = 54; i<93; i+=2){
            modelNumber[j] =  text.charAt(i+1);
            modelNumber[j+1] = text.charAt(i);
            j+=2;
        }
        System.out.print("Model Number : ");
        for(char c: modelNumber){
            System.out.print(c);
        }
        System.out.println("--------------");
        Identify identify = new Identify(kaitaiStream);

        System.out.println("Model Number : "+identify.modelNumber());

        char[] firmwareRevision = new char[8];
        j = 0;
        for(int i=46; i<=53; i+=2){
            firmwareRevision[j] = text.charAt(i+1);
            firmwareRevision[j+1] = text.charAt(i);
            j+=2;
        }
        System.out.println();
        System.out.print("Firmware Revision : ");
        for(char c: firmwareRevision){
            if(c != ' ') {
                System.out.print(c);
            }
        }
        System.out.println();

        char[] serialNumber = new char[160];
        j = 0;
        for(int i=20; i<=39; i+=2){
            serialNumber[j] = text.charAt(i+1);
            serialNumber[j+1] = text.charAt(i);
            j+=2;
        }
        System.out.print("Serial Number : ");
        for(char c: serialNumber){
            if(Character.isAlphabetic(c) || Character.isDigit(c)){
                System.out.print(c);
            }
        }

        System.out.println();

        boolean is_hdd = true;
        byte[] value = new byte[2];
        value[0] = bytes[435];
        value[1] = bytes[434];

        String speed = new BigInteger(value).toString();
        System.out.println("Speed = "+speed);
        System.out.print("Disk type is : " );
        System.out.print(Integer.parseInt(speed) > 1024 ? "SSD" : "HDD");
    }
}
