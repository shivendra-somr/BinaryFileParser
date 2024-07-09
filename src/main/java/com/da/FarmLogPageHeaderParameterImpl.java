package com.da;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.kaitai.struct.ByteBufferKaitaiStream;

import java.io.IOException;

public class FarmLogPageHeaderParameterImpl {
    public static void main(String[] args) throws IOException {
        ByteBufferKaitaiStream kaitaiStream = new ByteBufferKaitaiStream("/home/agsuser/Downloads/ULink Project/Template335_SCSI_Seagate_FARM_Log_Page0x3D.bin");

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("******************************>  Farm Sub Page  <**********************************");
        System.out.println("-----------------------------------------------------------------------------------");
        FarmLogPageFarmHeaderParameter farmHeaderParameter = new FarmLogPageFarmHeaderParameter(kaitaiStream);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        String valueAsString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(farmHeaderParameter);
        System.out.println(valueAsString);

        System.out.println("Page Code \t\t: 0x"+Integer.toHexString(farmHeaderParameter.pageCode()));
        System.out.println("Sub Page Code \t: 0x"+farmHeaderParameter.subPageCode());
        System.out.println("Page Length \t: 0x"+farmHeaderParameter.pageLength());
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("***************************> Farm Header Parameter <*******************************");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Parameter Code \t\t\t\t\t\t: 0x"+farmHeaderParameter.parameterCode());
        System.out.println("Parameter Control Byte \t\t\t\t: 0x"+farmHeaderParameter.parameterControlByte());
        System.out.println("Parameter Length \t\t\t\t\t: "+farmHeaderParameter.prameterLength());
        System.out.println("Log Signature \t\t\t\t\t\t: 0x"+Long.toHexString(farmHeaderParameter.logSignature()));
        System.out.println("\t\t\t\t\t\t\t\t\t  (byte 4-5  -> Status byte = 0xC0\n" +"\t\t\t\t\t\t\t\t\t   byte 6-11 -> Log Signature = 0x004641524D4552 )");
        System.out.println("Log Major Revision \t\t\t\t\t: 0x"+ Long.toHexString(farmHeaderParameter.logMajorRevision()));
        System.out.println("Log Minor Revision \t\t\t\t\t: 0x"+ Long.toHexString(farmHeaderParameter.logMinorRevision()));
        System.out.println("Number of Log parameters supported \t: 0x"+Long.toHexString(farmHeaderParameter.numberOfLogParametersSupported()));
        System.out.println("Log Page Sizes in bytes \t\t\t: 0x"+ Long.toHexString(farmHeaderParameter.logPageSizeInBytes()));
        System.out.println("Maximum Drive Heads supported \t\t: 0x"+ Long.toHexString(farmHeaderParameter.maximumDriveHeadsSupported()));
    }
}
