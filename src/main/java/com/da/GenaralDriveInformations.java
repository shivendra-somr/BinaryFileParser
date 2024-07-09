package com.da;// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

import com.fasterxml.jackson.annotation.JsonProperty;
import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.nio.charset.Charset;

public class GenaralDriveInformations extends KaitaiStruct implements Serializable {
    public static GenaralDriveInformations fromFile(String fileName) throws IOException {
        return new GenaralDriveInformations(new ByteBufferKaitaiStream(fileName));
    }

    public GenaralDriveInformations(KaitaiStream _io) {
        this(_io, null, null);
    }

    public GenaralDriveInformations(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public GenaralDriveInformations(KaitaiStream _io, KaitaiStruct _parent, GenaralDriveInformations _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.unrelatedData = new ArrayList<Integer>();
        for (int i = 0; i < 72; i++) {
            this.unrelatedData.add(this._io.readU1());
        }
        this.parameterCode = this._io.readU2be();
        this.paramterControlByte = this._io.readU1();
        this.parameterLength = this._io.readU1();
        this.pageNumber = this._io.readU8be();
        this.copyNumber = this._io.readU8be();
        this.serialNumber30 = this._io.readU8be();
        this.serialNumber74 = this._io.readU8be();
        this.worldWideName30 = this._io.readU8be();
        this.worldWideName74 = this._io.readU8be();
        this.deviceInterface = this._io.readU8be();
        this.deviceCapacity = this._io.readU8be();
        this.physicalSectorSize = this._io.readU8be();
        this.logicalSectorSize = this._io.readU8be();
        this.deviceBufferSize = this._io.readU8be();
        this.numberOfHeads = this._io.readU8be();
        this.deviceFormFactor = this._io.readU8be();
        this.rotationalRateOfDevice = this._io.readU8be();
        this.firmwareRevisionStatusByte = this._io.readU4be();
        this.firmwareRevision30 = new String(this._io.readBytes(4), Charset.forName("ASCII"));
        this.firmwareRevision74 = this._io.readU8be();
        this.unrelatedData01 = new ArrayList<Long>();
        for (int i = 0; i < 3; i++) {
            this.unrelatedData01.add(this._io.readU8be());
        }
        this.powerOnHours = this._io.readU8be();
        this.unrelatedData02 = new ArrayList<Long>();
        for (int i = 0; i < 3; i++) {
            this.unrelatedData02.add(this._io.readU8be());
        }
        this.powerCycleCount = this._io.readU8be();
        this.hardwareResetCount = this._io.readU8be();
        this.unrelatedData03 = this._io.readU8be();
        this.nvcStatusOnPowerOn = this._io.readU8be();
        this.timeAvailableToSaveUserDataToNvm = this._io.readU8be();
        this.timestampOfFirstSmartSummary = this._io.readU8be();
        this.timestampOfLastSmartSummary = this._io.readU8be();
        this.dataOfAssembly = this._io.readU8be();
    }
    private ArrayList<Integer> unrelatedData;
    @JsonProperty
    private int parameterCode;
    @JsonProperty
    private int paramterControlByte;
    @JsonProperty
    private int parameterLength;
    @JsonProperty
    private long pageNumber;
    @JsonProperty
    private long copyNumber;
    @JsonProperty
    private long serialNumber30;
    @JsonProperty
    private long serialNumber74;
    @JsonProperty
    private long worldWideName30;
    @JsonProperty
    private long worldWideName74;
    @JsonProperty
    private long deviceInterface;
    @JsonProperty
    private long deviceCapacity;
    @JsonProperty
    private long physicalSectorSize;
    @JsonProperty
    private long logicalSectorSize;
    @JsonProperty
    private long deviceBufferSize;
    @JsonProperty
    private long numberOfHeads;
    @JsonProperty
    private long deviceFormFactor;
    @JsonProperty
    private long rotationalRateOfDevice;
    @JsonProperty
    private long firmwareRevisionStatusByte;
    @JsonProperty
    private String firmwareRevision30;
    @JsonProperty
    private long firmwareRevision74;

    private ArrayList<Long> unrelatedData01;
    @JsonProperty
    private long powerOnHours;
    private ArrayList<Long> unrelatedData02;
    @JsonProperty
    private long powerCycleCount;
    @JsonProperty
    private long hardwareResetCount;
    private long unrelatedData03;
    @JsonProperty
    private long nvcStatusOnPowerOn;
    @JsonProperty
    private long timeAvailableToSaveUserDataToNvm;
    @JsonProperty
    private long timestampOfFirstSmartSummary;
    @JsonProperty
    private long timestampOfLastSmartSummary;
    @JsonProperty
    private long dataOfAssembly;

    private GenaralDriveInformations _root;
    private KaitaiStruct _parent;

    /**
     * Not related to drive information
     */
    public ArrayList<Integer> unrelatedData() { return unrelatedData; }

    /**
     * Parameter Code : 0x01
     */
    public int parameterCode() { return parameterCode; }

    /**
     * Parameter Control Byte : 0x03
     */
    public int paramterControlByte() { return paramterControlByte; }

    /**
     * Parameter Length : 0xF0
     */
    public int parameterLength() { return parameterLength; }

    /**
     * Page Number : 0xC000000000000001 
     * Status bit -> 0xC0
     * PageNumber -> 0x01
     */
    public long pageNumber() { return pageNumber; }

    /**
     * Copy Number
     */
    public long copyNumber() { return copyNumber; }
    public long serialNumber30() { return serialNumber30; }
    public long serialNumber74() { return serialNumber74; }
    public long worldWideName30() { return worldWideName30; }
    public long worldWideName74() { return worldWideName74; }

    /**
     * Device Interface (”SAS” in ASCII)
     */
    public long deviceInterface() { return deviceInterface; }

    /**
     * 48-bit Device Capacity
     */
    public long deviceCapacity() { return deviceCapacity; }

    /**
     * Physical Sector Size in Bytes
     */
    public long physicalSectorSize() { return physicalSectorSize; }

    /**
     * Logical Sector Size in Bytes
     */
    public long logicalSectorSize() { return logicalSectorSize; }

    /**
     * Device Buffer Size in Bytes
     */
    public long deviceBufferSize() { return deviceBufferSize; }

    /**
     * Number of Heads
     */
    public long numberOfHeads() { return numberOfHeads; }

    /**
     * Device Form Factor
     */
    public long deviceFormFactor() { return deviceFormFactor; }

    /**
     * Rotational Rate of Device
     */
    public long rotationalRateOfDevice() { return rotationalRateOfDevice; }
    public long firmwareRevisionStatusByte() { return firmwareRevisionStatusByte; }

    /**
     * Firmware Revision [3:0]
     */
    public String firmwareRevision30() { return firmwareRevision30; }

    /**
     * Firmware Revision [7:4]
     */
    public long firmwareRevision74() { return firmwareRevision74; }
    public ArrayList<Long> unrelatedData01() { return unrelatedData01; }

    /**
     * Power-on Hours
     */
    public long powerOnHours() { return powerOnHours; }
    public ArrayList<Long> unrelatedData02() { return unrelatedData02; }

    /**
     * Power Cycle Count
     */
    public long powerCycleCount() { return powerCycleCount; }

    /**
     * Hardware Reset Count
     */
    public long hardwareResetCount() { return hardwareResetCount; }
    public long unrelatedData03() { return unrelatedData03; }

    /**
     * NVC Status on Power-on
     */
    public long nvcStatusOnPowerOn() { return nvcStatusOnPowerOn; }

    /**
     * Time Available to Save User Data to Non-volatile Memory Over Last Power Cycle (in 100us)
     */
    public long timeAvailableToSaveUserDataToNvm() { return timeAvailableToSaveUserDataToNvm; }

    /**
     * Timestamp of first SMART Summary Frame in Power-On Hours Milliseconds
     */
    public long timestampOfFirstSmartSummary() { return timestampOfFirstSmartSummary; }

    /**
     * Timestamp of last SMART Summary Frame in Power-On Hours Milliseconds
     */
    public long timestampOfLastSmartSummary() { return timestampOfLastSmartSummary; }

    /**
     * Date of Assembly in ASCII “YYWW” where YY is the year and WW is the calendar week
     */
    public long dataOfAssembly() { return dataOfAssembly; }
    public GenaralDriveInformations _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
