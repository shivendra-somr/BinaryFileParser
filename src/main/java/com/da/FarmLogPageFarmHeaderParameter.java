package com.da;// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild


import com.fasterxml.jackson.annotation.JsonProperty;
import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.io.Serializable;

public class FarmLogPageFarmHeaderParameter extends KaitaiStruct implements Serializable {
    public static FarmLogPageFarmHeaderParameter fromFile(String fileName) throws IOException {
        return new FarmLogPageFarmHeaderParameter(new ByteBufferKaitaiStream(fileName));
    }

    public FarmLogPageFarmHeaderParameter(KaitaiStream _io) {
        this(_io, null, null);
    }

    public FarmLogPageFarmHeaderParameter(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public FarmLogPageFarmHeaderParameter(KaitaiStream _io, KaitaiStruct _parent, FarmLogPageFarmHeaderParameter _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.pageCodeFull = this._io.readU1();
        if (!(pageCodeFull() == 253)) {
            throw new KaitaiStream.ValidationNotEqualError(253, pageCodeFull(), _io(), "/seq/0");
        }
        this.subPageCode = this._io.readU1();
        this.pageLength = this._io.readU2be();
        this.parameterCode = this._io.readU2be();
        this.parameterControlByte = this._io.readU1();
        this.prameterLength = this._io.readU1();
        this.logSignature = this._io.readU8be();
        this.logMajorRevision = this._io.readU8be();
        this.logMinorRevision = this._io.readU8be();
        this.numberOfLogParametersSupported = this._io.readU8be();
        this.logPageSizeInBytes = this._io.readU8be();
        this.reservedByte1 = this._io.readU8be();
        this.maximumDriveHeadsSupported = this._io.readU8be();
    }
    private Integer pageCode;

    /**
     * Extracted Page Code (bit 5 to bit 0 of byte 0)
     */
    public Integer pageCode() {
        if (this.pageCode != null)
            return this.pageCode;
        int _tmp = (int) ((pageCodeFull() & 63));
        this.pageCode = _tmp;
        return this.pageCode;
    }
    @JsonProperty
    private int pageCodeFull;
    @JsonProperty
    private int subPageCode;
    @JsonProperty
    private int pageLength;
    @JsonProperty
    private int parameterCode;
    @JsonProperty
    private int parameterControlByte;
    @JsonProperty
    private int prameterLength;
    @JsonProperty
    private long logSignature;
    @JsonProperty
    private long logMajorRevision;
    @JsonProperty
    private long logMinorRevision;
    @JsonProperty
    private long numberOfLogParametersSupported;
    @JsonProperty
    private long logPageSizeInBytes;
    @JsonProperty
    private long reservedByte1;
    @JsonProperty
    private long maximumDriveHeadsSupported;
    private FarmLogPageFarmHeaderParameter _root;
    private KaitaiStruct _parent;

    /**
     * Page Code: 0x3D (byte 0, bit 5 to bit 0)
     */
    public int pageCodeFull() { return pageCodeFull; }

    /**
     * Sub page code: 0x03 (byte 1)
     */
    public int subPageCode() { return subPageCode; }

    /**
     * Page Length: 6016 (byte 2 to byte 3) (== size-3)
     */
    public int pageLength() { return pageLength; }

    /**
     * Parameter Code : 0x00 (byte 0-1)
     */
    public int parameterCode() { return parameterCode; }

    /**
     * Parameter Control Byte: 0x03 (byte 2)
     */
    public int parameterControlByte() { return parameterControlByte; }

    /**
     * Prameter Length: 64 (byte 3)
     */
    public int prameterLength() { return prameterLength; }

    /**
     * Log Signature : 0xC0004641524D4552
     */
    public long logSignature() { return logSignature; }

    /**
     * Log Major Signature : 0xC000000000000003
     */
    public long logMajorRevision() { return logMajorRevision; }

    /**
     * Log Minor Signature : 0xC000000000000007
     */
    public long logMinorRevision() { return logMinorRevision; }

    /**
     * Number of Log Parameters supported : 0xC000000000000028      
     */
    public long numberOfLogParametersSupported() { return numberOfLogParametersSupported; }

    /**
     * Log Page Size in Bytes : 0xC000000000001784 = 6020
     */
    public long logPageSizeInBytes() { return logPageSizeInBytes; }

    /**
     * Reserved bytes
     */
    public long reservedByte1() { return reservedByte1; }

    /**
     * Maximum Drive Heads Supported : 0x12 = 18
     */
    public long maximumDriveHeadsSupported() { return maximumDriveHeadsSupported; }
    public FarmLogPageFarmHeaderParameter _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
