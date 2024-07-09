package com.da;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.kaitai.struct.ByteBufferKaitaiStream;

import java.io.File;
import java.io.IOException;

public class Template335 {
    public static void main(String[] args) throws IOException {
//        ByteBufferKaitaiStream kaitaiStream = new ByteBufferKaitaiStream("/home/agsuser/Downloads/ULink Project/Template335_SCSI_Seagate_FARM_Log_Page0x3D.bin");
//
//        FarmLogPage farmLogPage = new FarmLogPage(kaitaiStream);
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
//        mapper.writerWithDefaultPrettyPrinter().writeValue(new File("/home/agsuser/Downloads/ULink Project/Template335ExtractedValue.json"), farmLogPage);
//        String valueAsString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(farmLogPage);
//        System.out.println(valueAsString);

//        ByteBufferKaitaiStream idenntifyFileKaitaiStream = new ByteBufferKaitaiStream("/home/agsuser/Downloads/ULink Project/Identify file1.bin");
//        IdentifyFile identifyFile = new IdentifyFile(idenntifyFileKaitaiStream);
//        ObjectMapper identifyMapper = new ObjectMapper();
//        identifyMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
//        identifyMapper.writerWithDefaultPrettyPrinter().writeValue(new File("/home/agsuser/Downloads/ULink Project/Template001IdentityFileExtractedValue.json"), identifyFile);
//        String identifyFileValue = identifyMapper.writerWithDefaultPrettyPrinter().writeValueAsString(identifyFile);
//        System.out.println(identifyFileValue);

        ByteBufferKaitaiStream nvmeKaitaiStream = new ByteBufferKaitaiStream("/home/agsuser/Downloads/ULink Project/NVMe_ID_Controller01.bin");
        NVMEIdController nvmeIdController = new NVMEIdController(nvmeKaitaiStream);
        ObjectMapper nvmeMapper = new ObjectMapper();
        nvmeMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        nvmeMapper.writerWithDefaultPrettyPrinter().writeValue(new File("/home/agsuser/Downloads/ULink Project/NVMe_ID_Controller01ExtractedValue.json"), nvmeIdController);
        String nvmeIdControllerValue = nvmeMapper.writerWithDefaultPrettyPrinter().writeValueAsString(nvmeIdController);
        System.out.println(nvmeIdControllerValue);
    }
}
