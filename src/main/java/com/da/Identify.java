// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package com.da;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.ArrayList;
import java.nio.charset.Charset;

public class Identify extends KaitaiStruct {
    public static Identify fromFile(String fileName) throws IOException {
        return new Identify(new ByteBufferKaitaiStream(fileName));
    }

    public Identify(KaitaiStream _io) {
        this(_io, null, null);
    }

    public Identify(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public Identify(KaitaiStream _io, KaitaiStruct _parent, Identify _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.words = new ArrayList<Integer>();
        for (int i = 0; i < 256; i++) {
            this.words.add(this._io.readU2le());
        }
    }
    private String modelNumber;
    public String modelNumber() {
        if (this.modelNumber != null)
            return this.modelNumber;
        long _pos = this._io.pos();
        this._io.seek((27 * 2));
        this.modelNumber = new String(KaitaiStream.bytesTerminate(this._io.readBytes((((47 - 27) + 1) * 2)), (byte) 0, false), Charset.forName("ISO-8859-1"));
        this._io.seek(_pos);
        return this.modelNumber;
    }
    private ArrayList<Integer> words;
    private Identify _root;
    private KaitaiStruct _parent;
    public ArrayList<Integer> words() { return words; }
    public Identify _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
