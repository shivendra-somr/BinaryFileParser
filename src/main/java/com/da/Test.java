// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package com.da;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class Test extends KaitaiStruct {
    public static Test fromFile(String fileName) throws IOException {
        return new Test(new ByteBufferKaitaiStream(fileName));
    }

    public Test(KaitaiStream _io) {
        this(_io, null, null);
    }

    public Test(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public Test(KaitaiStream _io, KaitaiStruct _parent, Test _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.name = new String(this._io.readBytes(40), Charset.forName("UTF-8"));
        this.age = this._io.readS2be();
    }
    private String name;
    private short age;
    private Test _root;
    private KaitaiStruct _parent;
    public String name() { return name; }
    public short age() { return age; }
    public Test _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
