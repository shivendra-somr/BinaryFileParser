package com.da;

import io.kaitai.struct.ByteBufferKaitaiStream;

import java.io.IOException;
import java.math.BigInteger;

public class WorkloadStatisticsImpl {
    public static void main(String[] args) throws IOException {
        ByteBufferKaitaiStream kaitaiStream = new ByteBufferKaitaiStream("/home/agsuser/Downloads/ULink Project/Template335_SCSI_Seagate_FARM_Log_Page0x3D.bin");

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Workload Statistics");
        System.out.println("-----------------------------------------------------------------------------------");
        WorkloadStatistics workloadStatistics = new WorkloadStatistics(kaitaiStream);
        System.out.println(workloadStatistics.parameterCode());
        System.out.println(workloadStatistics.parameterControlByte());
        System.out.println(workloadStatistics.parameterLength());
        System.out.println(new BigInteger(Long.toHexString(workloadStatistics.pageNumber()).substring(2),16));
        System.out.println(workloadStatistics.copyNumber());
        System.out.println(new BigInteger(Long.toHexString(workloadStatistics.ratedWorkloadPercentage()).substring(2),16));
        System.out.println(new BigInteger(Long.toHexString(workloadStatistics.totalNumberOfReadCommmands()).substring(2),16));
        System.out.println(new BigInteger(Long.toHexString(workloadStatistics.totalNumberOfWriteCommands()).substring(2),16));
        System.out.println(new BigInteger(Long.toHexString(workloadStatistics.totalNumberOfRandomReadCommands()).substring(2),16));
        System.out.println(new BigInteger(Long.toHexString(workloadStatistics.totalNumberOfRandomWriteCommands()).substring(2),16));
        System.out.println(new BigInteger(Long.toHexString(workloadStatistics.totalNumberOfOtherCommands()).substring(2),16));
        System.out.println(new BigInteger(Long.toHexString(workloadStatistics.logicalSectorsWritten()).substring(2),16));
        System.out.println(new BigInteger(Long.toHexString(workloadStatistics.logicalSectorsRead()).substring(2),16));
        System.out.println();
        System.out.println();

    }
}
