package com.da;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.kaitai.struct.ByteBufferKaitaiStream;

import java.io.IOException;
import java.math.BigInteger;

public class GenaralDriveInformationsImpl {
    public static void main(String[] args) throws IOException {
        ByteBufferKaitaiStream kaitaiStream = new ByteBufferKaitaiStream("/home/agsuser/Downloads/ULink Project/Template335_SCSI_Seagate_FARM_Log_Page0x3D.bin");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("General Drive Information");
        System.out.println("-----------------------------------------------------------------------------------");
        GenaralDriveInformations genaralDriveInformations = new GenaralDriveInformations(kaitaiStream);
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        String valueAsString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(genaralDriveInformations);
        System.out.println(valueAsString);

        System.out.println(genaralDriveInformations.parameterCode());
        System.out.println(genaralDriveInformations.paramterControlByte());
        System.out.println(genaralDriveInformations.parameterLength());
        System.out.println("0x"+Long.toHexString(genaralDriveInformations.pageNumber()));
        System.out.println(genaralDriveInformations.copyNumber());
        System.out.println(Long.toHexString(genaralDriveInformations.deviceInterface()));
        System.out.println(Long.toHexString(genaralDriveInformations.deviceCapacity()));
        System.out.println(new BigInteger(Long.toHexString(genaralDriveInformations.physicalSectorSize()).substring(2),16));
        System.out.println(new BigInteger(Long.toHexString(genaralDriveInformations.logicalSectorSize()).substring(2),16));
        System.out.println(new BigInteger(Long.toHexString(genaralDriveInformations.deviceBufferSize()).substring(2),16));
        System.out.println(new BigInteger(Long.toHexString(genaralDriveInformations.numberOfHeads()).substring(2),16));
        System.out.println(new BigInteger(Long.toHexString(genaralDriveInformations.deviceFormFactor()).substring(2),16));
        System.out.println(new BigInteger(Long.toHexString(genaralDriveInformations.rotationalRateOfDevice()).substring(2),16));
        System.out.println(genaralDriveInformations.firmwareRevision30().substring(0,4));
        System.out.println(new BigInteger(Long.toHexString(genaralDriveInformations.powerOnHours()).substring(2),16));
        System.out.println(new BigInteger(Long.toHexString(genaralDriveInformations.powerCycleCount()).substring(2),16));
        System.out.println(new BigInteger(Long.toHexString(genaralDriveInformations.hardwareResetCount()).substring(2),16));
        System.out.println(new BigInteger(Long.toHexString(genaralDriveInformations.nvcStatusOnPowerOn()).substring(2),16));
        System.out.println(new BigInteger(Long.toHexString(genaralDriveInformations.timeAvailableToSaveUserDataToNvm()).substring(2),16));
        System.out.println(new BigInteger(Long.toHexString(genaralDriveInformations.timestampOfFirstSmartSummary()).substring(2),16));
        System.out.println(new BigInteger(Long.toHexString(genaralDriveInformations.timestampOfLastSmartSummary()).substring(2),16));
    }
}
