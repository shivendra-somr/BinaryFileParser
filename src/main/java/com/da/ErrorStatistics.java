package com.da;// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.ArrayList;

public class ErrorStatistics extends KaitaiStruct {
    public static ErrorStatistics fromFile(String fileName) throws IOException {
        return new ErrorStatistics(new ByteBufferKaitaiStream(fileName));
    }

    public ErrorStatistics(KaitaiStream _io) {
        this(_io, null, null);
    }

    public ErrorStatistics(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public ErrorStatistics(KaitaiStream _io, KaitaiStruct _parent, ErrorStatistics _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.unrelatedData = new ArrayList<Integer>();
        for (int i = 0; i < 400; i++) {
            this.unrelatedData.add(this._io.readU1());
        }
        this.parameterCode = this._io.readU2be();
        this.parameterControlByte = this._io.readU1();
        this.parameterLength = this._io.readU1();
    }
    private ArrayList<Integer> unrelatedData;
    private int parameterCode;
    private int parameterControlByte;
    private int parameterLength;
    private ErrorStatistics _root;
    private KaitaiStruct _parent;
    public ArrayList<Integer> unrelatedData() { return unrelatedData; }

    /**
     * Paramete Code : 0x02
     */
    public int parameterCode() { return parameterCode; }

    /**
     * Parameter Control Byte
     */
    public int parameterControlByte() { return parameterControlByte; }

    /**
     * Parameter Length
     */
    public int parameterLength() { return parameterLength; }
    public ErrorStatistics _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
