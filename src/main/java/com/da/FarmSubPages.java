package com.da;// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;

public class FarmSubPages extends KaitaiStruct {
    public static FarmSubPages fromFile(String fileName) throws IOException {
        return new FarmSubPages(new ByteBufferKaitaiStream(fileName));
    }

    public FarmSubPages(KaitaiStream _io) {
        this(_io, null, null);
    }

    public FarmSubPages(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public FarmSubPages(KaitaiStream _io, KaitaiStruct _parent, FarmSubPages _root) {
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
    private int pageCodeFull;
    private int subPageCode;
    private int pageLength;
    private FarmSubPages _root;
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
    public FarmSubPages _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
