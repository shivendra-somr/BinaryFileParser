package com.da;

import io.kaitai.struct.ByteBufferKaitaiStream;

import java.io.IOException;
import java.math.BigInteger;

public class ErrorStatisticsImpl {
    public static void main(String[] args) throws IOException {
        ByteBufferKaitaiStream kaitaiStream = new ByteBufferKaitaiStream("/home/agsuser/Downloads/ULink Project/Template335_SCSI_Seagate_FARM_Log_Page0x3D.bin");

        ErrorStatistics errorStatistics = new ErrorStatistics(kaitaiStream);

        System.out.println(errorStatistics.parameterCode());
        System.out.println(errorStatistics.parameterControlByte());
        System.out.println(errorStatistics.parameterLength());
    }
}
