package com.da;// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

import com.da.util.Template001WordReversal;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public class IdentifyFile extends KaitaiStruct implements Serializable {

    public static IdentifyFile fromFile(String fileName) throws IOException {
        return new IdentifyFile(new ByteBufferKaitaiStream(fileName));
    }

    public IdentifyFile(KaitaiStream _io) {
        this(_io, null, null);
    }

    public IdentifyFile(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public IdentifyFile(KaitaiStream _io, KaitaiStruct _parent, IdentifyFile _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.sata001Word00 = new Sata001Word00(this._io, this, _root);
        this.sata001Word01 = new Obsolete(this._io, this, _root);
        this.sata001Word07CompactFlashTM = new String(this._io.readBytes(4), Charset.forName("ASCII"));
        this.sata001Word09Retired = new String(this._io.readBytes(2), Charset.forName("ASCII"));
        this.sata001Word10SerialNumber = new StrRv(this._io, this, _root);
        this.sata001Word20Retired = new String(this._io.readBytes(6), Charset.forName("ASCII"));
        this.sata001Word23FirmwareRevision = new StrRv8(this._io, this, _root);
        this.sata001Word27ModelNumber = new StrRv40(this._io, this, _root);
        this.sata001Word47 = new String(this._io.readBytes(2), Charset.forName("ASCII"));
        this.sata001Word48 = new Sata001Word48(this._io, this, _root);
        this.sata001Word49 = new Sata001Word49(this._io, this, _root);
        this.sata001Word50 = new Sata001Word50(this._io, this, _root);
        this.sata001Word51 = new String(this._io.readBytes(4), Charset.forName("ASCII"));
        this.sata001Word53 = new String(this._io.readBytes(2), Charset.forName("ASCII"));
        this.sata001Word54 = new String(this._io.readBytes(10), Charset.forName("ASCII"));
        this.sata001Word59 = new Sata001Word59(this._io, this, _root);
        this.sata001Word60 = new String(this._io.readBytes(4), Charset.forName("ASCII"));
        this.sata001Word62 = new String(this._io.readBytes(2), Charset.forName("ASCII"));
        this.sata001Word63 = new String(this._io.readBytes(2), Charset.forName("ASCII"));
        this.sata001Word64 = new String(this._io.readBytes(2), Charset.forName("ASCII"));
        this.sata001Word65 = new String(this._io.readBytes(2), Charset.forName("ASCII"));
        this.sata001Word66 = new String(this._io.readBytes(2), Charset.forName("ASCII"));
        this.sata001Word67 = new String(this._io.readBytes(2), Charset.forName("ASCII"));
        this.sata001Word68 = new String(this._io.readBytes(2), Charset.forName("ASCII"));
        this.sata001Word69 = new Sata001Word69(this._io, this, _root);
        this.sata001Word70 = new String(this._io.readBytes(2), Charset.forName("ASCII"));
        this.sata001Word71 = new String(this._io.readBytes(8), Charset.forName("ASCII"));
        this.sata001Word75 = new Sata001Word75(this._io, this, _root);
        this.sata001Word76 = new Sata001Word76(this._io, this, _root);
        this.sata001Word77 = new Sata001Word77(this._io, this, _root);
        this.sata001Word78 = new Sata001Word78(this._io, this, _root);
        this.sata001Word79 = new Sata001Word79(this._io, this, _root);
        this.sata001Word80 = new Sata001Word80(this._io, this, _root);
        this.sata001Word81 = ByteBuffer.wrap(this._io.readBytes(2)).order(ByteOrder.LITTLE_ENDIAN).getShort();
        this.sata001Word82 = new Sata001Word82(this._io, this, _root);
        this.sata001Word83 = new Sata001Word83(this._io, this, _root);
        this.sata001Word84 = new Sata001Word84(this._io, this, _root);
        this.sata001Word85 = new Sata001Word85(this._io, this, _root);
        this.sata001Word86 = new Sata001Word86(this._io, this, _root);
        this.sata001Word87 = new Sata001Word87(this._io, this, _root);
        this.sata001Word88 = ByteBuffer.wrap(this._io.readBytes(2)).order(ByteOrder.LITTLE_ENDIAN).getShort();
        this.sata001Word89 = new Sata001Word89(this._io, this, _root);
        this.sata001Word90 = new Sata001Word90(this._io, this, _root);
        this.sata001Word91 = new Sata001Word91(this._io, this, _root);
        this.sata001Word92 = ByteBuffer.wrap(this._io.readBytes(2)).order(ByteOrder.LITTLE_ENDIAN).getShort()& 0xFFFF;
        this.sata001Word93 = ByteBuffer.wrap(this._io.readBytes(2)).order(ByteOrder.LITTLE_ENDIAN).getShort();
        this.sata001Word94 = ByteBuffer.wrap(this._io.readBytes(2)).order(ByteOrder.LITTLE_ENDIAN).getShort();
        this.sata001Word95 = ByteBuffer.wrap(this._io.readBytes(2)).order(ByteOrder.LITTLE_ENDIAN).getShort();
        this.sata001Word96 = ByteBuffer.wrap(this._io.readBytes(2)).order(ByteOrder.LITTLE_ENDIAN).getShort();
        this.sata001Word97 = ByteBuffer.wrap(this._io.readBytes(2)).order(ByteOrder.LITTLE_ENDIAN).getShort();
        this.sata001Word98 = ByteBuffer.wrap(this._io.readBytes(4)).order(ByteOrder.LITTLE_ENDIAN).getShort();
        this.sata001Word100LogicalSectors = ByteBuffer.wrap(this._io.readBytes(8)).order(ByteOrder.LITTLE_ENDIAN).getLong();
        this.sata001Word104 = new String(this._io.readBytes(2), Charset.forName("UTF-8"));
        this.sata001Word105DataSetManagement = ByteBuffer.wrap(this._io.readBytes(2)).order(ByteOrder.LITTLE_ENDIAN).getShort();
        this.sata001Word106 = new Sata001Word106(this._io, this, _root);
        this.sata001Word107 = new String(String.valueOf(ByteBuffer.wrap(this._io.readBytes(2)).order(ByteOrder.LITTLE_ENDIAN).getShort()));
        byte[] word108To111 = new byte[8];
        word108To111 = this._io.readBytes(8);
        String worldWideName = String.format("%02x", word108To111[1])+String.format("%02x", word108To111[0])
                                + String.format("%02x", word108To111[3])+ String.format("%02x", word108To111[2])
                                + String.format("%02x", word108To111[5])+String.format("%02x", word108To111[4])
                                +String.format("%02x", word108To111[7])+String.format("%02x", word108To111[6]);
        this.sata001Word108 = 0;
        this.sata001Word108Naa = worldWideName.substring(0,1).toUpperCase();
        this.sata001Word108VendorId = worldWideName.substring(1,7).toUpperCase();
        this.sata001Word108DeviceUniqueId = worldWideName.substring(7).toUpperCase();
        this.sata001Word109 = 0;
        this.sata001Word110 = 0;
        this.sata001Word111 = 0;
        this.sata001Word112 = new String(this._io.readBytes(8), Charset.forName("ASCII"));
        this.sata001Word116 = ByteBuffer.wrap(this._io.readBytes(2)).order(ByteOrder.LITTLE_ENDIAN).getShort();
        this.sata001Word117 = ByteBuffer.wrap(this._io.readBytes(4)).order(ByteOrder.LITTLE_ENDIAN).getShort();
        this.sata001Word119 = new Sata001Word119(this._io, this, _root);
        this.sata001Word120 = new Sata001Word120(this._io, this, _root);
        this.sata001Word121 = new String(this._io.readBytes(12), Charset.forName("UTF-8"));
        this.sata001Word127 = this._io.readU2le();
        this.sata001Word128 = new Sata001Word128(this._io, this, _root);
        this.sata001Word129 = new String(this._io.readBytes(62), Charset.forName("UTF-8"));
        this.sata001Word160 = this._io.readU2le();
        this.sata001Word161 = new String(this._io.readBytes(14), Charset.forName("UTF-8"));
        this.sata001Word168 = new Sata001Word168(this._io, this, _root);
        this.sata001Word169 = new Sata001Word169(this._io, this, _root);
        this.sata001Word170 = this._io.readU8le();
        this.sata001Word174 = this._io.readU2le();
        this.sata001Word176 = new String(this._io.readBytes(62), Charset.forName("UTF-8"));
        this.sata001Word206 = new Sata001Word206(this._io, this, _root);
        this.sata001Word207 = new String(this._io.readBytes(4), Charset.forName("UTF-8"));
        this.sata001Word209 = new Sata001Word209(this._io, this, _root);
        this.sata001Word210 = new String(this._io.readBytes(4), Charset.forName("UTF-8"));
        this.sata001Word212 = new String(this._io.readBytes(4), Charset.forName("UTF-8"));
        this.sata001Word214 = new Sata001Word214(this._io, this, _root);
        this.sata001Word215 = this._io.readU2le();
        this.sata001Word216 = this._io.readU2le();
        this.sata001Word217 = this._io.readU2le();
        this.sata001Word218 = this._io.readU2le();
        this.sata001Word219 = new Sata001Word219(this._io, this, _root);
        this.sata001Word220 = this._io.readU2le();
        this.sata001Word221 = this._io.readU2le();
        this.sata001Word222 = new Sata001Word222(this._io, this, _root);
        this.sata001Word223 = this._io.readU2le();
        this.sata001Word224 =  new BigInteger(this._io.readBytes(12)).longValue();;
        this.sata001Word230 = this._io.readU8le();
        this.sata001Word234 = this._io.readU2le();
        this.sata001Word235 = this._io.readU2le();
        this.sata001Word236 = new String(this._io.readBytes(38), Charset.forName("ASCII"));
        this.sata001Word255 = this._io.readU2le();
    }
    public static class Sata001Word82 extends KaitaiStruct {
        public static Sata001Word82 fromFile(String fileName) throws IOException {
            return new Sata001Word82(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word82(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word82(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word82(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word82Msbb7Interrupt = this._io.readBitsIntBe(1) != 0;
            this.sata001Word82Msbb6LookAhead = this._io.readBitsIntBe(1) != 0;
            this.sata001Word82Msbb5WriteCache = this._io.readBitsIntBe(1) != 0;
            this.sata001Word82Msbb4PacketFeature = this._io.readBitsIntBe(1) != 0;
            this.sata001Word82Msbb3PowerFeature = this._io.readBitsIntBe(1) != 0;
            this.sata001Word82Msbb2Obsolete = this._io.readBitsIntBe(1) != 0;
            this.sata001Word82Msbb1SecurityMode = this._io.readBitsIntBe(1) != 0;
            this.sata001Word82Msbb0SmartFeature = this._io.readBitsIntBe(1) != 0;
            this.sata001Word82Msbb15Obsolete = this._io.readBitsIntBe(1) != 0;
            this.sata001Word82Msbb14Nop = this._io.readBitsIntBe(1) != 0;
            this.sata001Word82Msbb13ReadBuffer = this._io.readBitsIntBe(1) != 0;
            this.sata001Word82Msbb12WriteBuffer = this._io.readBitsIntBe(1) != 0;
            this.sata001Word82Msbb11Obsolete = this._io.readBitsIntBe(1) != 0;
            this.sata001Word82Msbb10HostProtected = this._io.readBitsIntBe(1) != 0;
            this.sata001Word82Msbb9DeviceReset = this._io.readBitsIntBe(1) != 0;
            this.sata001Word82Msbb8ServiceInterrupt = this._io.readBitsIntBe(1) != 0;
        }
        @JsonProperty
        private boolean sata001Word82Msbb7Interrupt;
        @JsonProperty
        private boolean sata001Word82Msbb6LookAhead;
        @JsonProperty
        private boolean sata001Word82Msbb5WriteCache;
        @JsonProperty
        private boolean sata001Word82Msbb4PacketFeature;
        @JsonProperty
        private boolean sata001Word82Msbb3PowerFeature;
        @JsonProperty
        private boolean sata001Word82Msbb2Obsolete;
        @JsonProperty
        private boolean sata001Word82Msbb1SecurityMode;
        @JsonProperty
        private boolean sata001Word82Msbb0SmartFeature;
        @JsonProperty
        private boolean sata001Word82Msbb15Obsolete;
        @JsonProperty
        private boolean sata001Word82Msbb14Nop;
        @JsonProperty
        private boolean sata001Word82Msbb13ReadBuffer;
        @JsonProperty
        private boolean sata001Word82Msbb12WriteBuffer;
        @JsonProperty
        private boolean sata001Word82Msbb11Obsolete;
        @JsonProperty
        private boolean sata001Word82Msbb10HostProtected;
        @JsonProperty
        private boolean sata001Word82Msbb9DeviceReset;
        @JsonProperty
        private boolean sata001Word82Msbb8ServiceInterrupt;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public boolean sata001Word82Msbb7Interrupt() { return sata001Word82Msbb7Interrupt; }
        public boolean sata001Word82Msbb6LookAhead() { return sata001Word82Msbb6LookAhead; }
        public boolean sata001Word82Msbb5WriteCache() { return sata001Word82Msbb5WriteCache; }
        public boolean sata001Word82Msbb4PacketFeature() { return sata001Word82Msbb4PacketFeature; }
        public boolean sata001Word82Msbb3PowerFeature() { return sata001Word82Msbb3PowerFeature; }
        public boolean sata001Word82Msbb2Obsolete() { return sata001Word82Msbb2Obsolete; }
        public boolean sata001Word82Msbb1SecurityMode() { return sata001Word82Msbb1SecurityMode; }
        public boolean sata001Word82Msbb0SmartFeature() { return sata001Word82Msbb0SmartFeature; }
        public boolean sata001Word82Msbb15Obsolete() { return sata001Word82Msbb15Obsolete; }
        public boolean sata001Word82Msbb14Nop() { return sata001Word82Msbb14Nop; }
        public boolean sata001Word82Msbb13ReadBuffer() { return sata001Word82Msbb13ReadBuffer; }
        public boolean sata001Word82Msbb12WriteBuffer() { return sata001Word82Msbb12WriteBuffer; }
        public boolean sata001Word82Msbb11Obsolete() { return sata001Word82Msbb11Obsolete; }
        public boolean sata001Word82Msbb10HostProtected() { return sata001Word82Msbb10HostProtected; }
        public boolean sata001Word82Msbb9DeviceReset() { return sata001Word82Msbb9DeviceReset; }
        public boolean sata001Word82Msbb8ServiceInterrupt() { return sata001Word82Msbb8ServiceInterrupt; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class StrRv extends KaitaiStruct {
        public static StrRv fromFile(String fileName) throws IOException {
            return new StrRv(new ByteBufferKaitaiStream(fileName));
        }

        public StrRv(KaitaiStream _io) {
            this(_io, null, null);
        }

        public StrRv(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public StrRv(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.strRv = new String(this._io.readBytes(20), Charset.forName("ASCII"));
            this.strRv = new Template001WordReversal().parsedWord(this.strRv);
        }
        @JsonProperty
        private String strRv;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public String strRv() { return strRv; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Sata001Word89 extends KaitaiStruct {
        public static Sata001Word89 fromFile(String fileName) throws IOException {
            return new Sata001Word89(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word89(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word89(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word89(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word89Msbb7To0ExtTimeRequired = this._io.readBitsIntBe(8);
            this.sata001Word89Msbb15ExtTime = this._io.readBitsIntBe(1) != 0;
            this.sata001Word89Msbb14ToB8 = this._io.readBitsIntBe(7);
        }
        @JsonProperty
        private long sata001Word89Msbb7To0ExtTimeRequired;
        @JsonProperty
        private boolean sata001Word89Msbb15ExtTime;
        @JsonProperty
        private long sata001Word89Msbb14ToB8;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public long sata001Word89Msbb7To0ExtTimeRequired() { return sata001Word89Msbb7To0ExtTimeRequired; }
        public boolean sata001Word89Msbb15ExtTime() { return sata001Word89Msbb15ExtTime; }
        public long sata001Word89Msbb14ToB8() { return sata001Word89Msbb14ToB8; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Sata001Word78 extends KaitaiStruct {
        public static Sata001Word78 fromFile(String fileName) throws IOException {
            return new Sata001Word78(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word78(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word78(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word78(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word78Msbb7NcqAutosense = this._io.readBitsIntBe(1) != 0;
            this.sata001Word78Msbb6SoftwareSettings = this._io.readBitsIntBe(1) != 0;
            this.sata001Word78Msbb5HardwareControl = this._io.readBitsIntBe(1) != 0;
            this.sata001Word78Msbb4InOrderData = this._io.readBitsIntBe(1) != 0;
            this.sata001Word78Msbb3DevInterface = this._io.readBitsIntBe(1) != 0;
            this.sata001Word78Msbb2DmaSetup = this._io.readBitsIntBe(1) != 0;
            this.sata001Word78Msbb1NonZeroBuffer = this._io.readBitsIntBe(1) != 0;
            this.sata001Word78Msbb0Cleared = this._io.readBitsIntBe(1) != 0;
            this.sata001Word78Msbb15To13 = this._io.readBitsIntBe(3);
            this.sata001Word78Msbb12PowerDisabled = this._io.readBitsIntBe(1) != 0;
            this.sata001Word78Msbb11RebuildAssist = this._io.readBitsIntBe(1) != 0;
            this.sata001Word78Msbb10DeviceInit = this._io.readBitsIntBe(1) != 0;
            this.sata001Word78Msbb9HybridInfo = this._io.readBitsIntBe(1) != 0;
            this.sata001Word78Msbb8DeviceSleep = this._io.readBitsIntBe(1) != 0;
        }
        @JsonProperty
        private boolean sata001Word78Msbb7NcqAutosense;
        @JsonProperty
        private boolean sata001Word78Msbb6SoftwareSettings;
        @JsonProperty
        private boolean sata001Word78Msbb5HardwareControl;
        @JsonProperty
        private boolean sata001Word78Msbb4InOrderData;
        @JsonProperty
        private boolean sata001Word78Msbb3DevInterface;
        @JsonProperty
        private boolean sata001Word78Msbb2DmaSetup;
        @JsonProperty
        private boolean sata001Word78Msbb1NonZeroBuffer;
        @JsonProperty
        private boolean sata001Word78Msbb0Cleared;
        @JsonProperty
        private long sata001Word78Msbb15To13;
        @JsonProperty
        private boolean sata001Word78Msbb12PowerDisabled;
        @JsonProperty
        private boolean sata001Word78Msbb11RebuildAssist;
        @JsonProperty
        private boolean sata001Word78Msbb10DeviceInit;
        @JsonProperty
        private boolean sata001Word78Msbb9HybridInfo;
        @JsonProperty
        private boolean sata001Word78Msbb8DeviceSleep;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public boolean sata001Word78Msbb7NcqAutosense() { return sata001Word78Msbb7NcqAutosense; }
        public boolean sata001Word78Msbb6SoftwareSettings() { return sata001Word78Msbb6SoftwareSettings; }
        public boolean sata001Word78Msbb5HardwareControl() { return sata001Word78Msbb5HardwareControl; }
        public boolean sata001Word78Msbb4InOrderData() { return sata001Word78Msbb4InOrderData; }
        public boolean sata001Word78Msbb3DevInterface() { return sata001Word78Msbb3DevInterface; }
        public boolean sata001Word78Msbb2DmaSetup() { return sata001Word78Msbb2DmaSetup; }
        public boolean sata001Word78Msbb1NonZeroBuffer() { return sata001Word78Msbb1NonZeroBuffer; }
        public boolean sata001Word78Msbb0Cleared() { return sata001Word78Msbb0Cleared; }
        public long sata001Word78Msbb15To13() { return sata001Word78Msbb15To13; }
        public boolean sata001Word78Msbb12PowerDisabled() { return sata001Word78Msbb12PowerDisabled; }
        public boolean sata001Word78Msbb11RebuildAssist() { return sata001Word78Msbb11RebuildAssist; }
        public boolean sata001Word78Msbb10DeviceInit() { return sata001Word78Msbb10DeviceInit; }
        public boolean sata001Word78Msbb9HybridInfo() { return sata001Word78Msbb9HybridInfo; }
        public boolean sata001Word78Msbb8DeviceSleep() { return sata001Word78Msbb8DeviceSleep; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Sata001Word75 extends KaitaiStruct {
        public static Sata001Word75 fromFile(String fileName) throws IOException {
            return new Sata001Word75(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word75(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word75(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word75(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word75Msbb15ToB5 = this._io.readBitsIntBe(11);
            this.sata001Word75Msbb7 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word75Msbb6 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word75Msbb5 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word75Msbb4 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word75Msbb3 = this._io.readBitsIntBe(1) != 0;
        }
        @JsonProperty
        private long sata001Word75Msbb15ToB5;
        @JsonProperty
        private boolean sata001Word75Msbb7;
        @JsonProperty
        private boolean sata001Word75Msbb6;
        @JsonProperty
        private boolean sata001Word75Msbb5;
        @JsonProperty
        private boolean sata001Word75Msbb4;
        @JsonProperty
        private boolean sata001Word75Msbb3;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public long sata001Word75Msbb15ToB5() { return sata001Word75Msbb15ToB5; }
        public boolean sata001Word75Msbb7() { return sata001Word75Msbb7; }
        public boolean sata001Word75Msbb6() { return sata001Word75Msbb6; }
        public boolean sata001Word75Msbb5() { return sata001Word75Msbb5; }
        public boolean sata001Word75Msbb4() { return sata001Word75Msbb4; }
        public boolean sata001Word75Msbb3() { return sata001Word75Msbb3; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Sata001Word219 extends KaitaiStruct {
        public static Sata001Word219 fromFile(String fileName) throws IOException {
            return new Sata001Word219(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word219(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word219(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word219(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word219Msbb7DeviceEstimatedTime = this._io.readBitsIntBe(1) != 0;
            this.sata001Word219Msbb6DeviceEstimatedTime = this._io.readBitsIntBe(1) != 0;
            this.sata001Word219Msbb5DeviceEstimatedTime = this._io.readBitsIntBe(1) != 0;
            this.sata001Word219Msbb4DeviceEstimatedTime = this._io.readBitsIntBe(1) != 0;
            this.sata001Word219Msbb3DeviceEstimatedTime = this._io.readBitsIntBe(1) != 0;
            this.sata001Word219Msbb2DeviceEstimatedTime = this._io.readBitsIntBe(1) != 0;
            this.sata001Word219Msbb1DeviceEstimatedTime = this._io.readBitsIntBe(1) != 0;
            this.sata001Word219Msbb0DeviceEstimatedTime = this._io.readBitsIntBe(1) != 0;
            this.sata001Word219Msbb15To8 = this._io.readBitsIntBe(8) != 0;
        }
        @JsonProperty
        private boolean sata001Word219Msbb7DeviceEstimatedTime;
        @JsonProperty
        private boolean sata001Word219Msbb6DeviceEstimatedTime;
        @JsonProperty
        private boolean sata001Word219Msbb5DeviceEstimatedTime;
        @JsonProperty
        private boolean sata001Word219Msbb4DeviceEstimatedTime;
        @JsonProperty
        private boolean sata001Word219Msbb3DeviceEstimatedTime;
        @JsonProperty
        private boolean sata001Word219Msbb2DeviceEstimatedTime;
        @JsonProperty
        private boolean sata001Word219Msbb1DeviceEstimatedTime;
        @JsonProperty
        private boolean sata001Word219Msbb0DeviceEstimatedTime;
        private boolean sata001Word219Msbb15To8;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public boolean sata001Word219Msbb7DeviceEstimatedTime() { return sata001Word219Msbb7DeviceEstimatedTime; }
        public boolean sata001Word219Msbb6DeviceEstimatedTime() { return sata001Word219Msbb6DeviceEstimatedTime; }
        public boolean sata001Word219Msbb5DeviceEstimatedTime() { return sata001Word219Msbb5DeviceEstimatedTime; }
        public boolean sata001Word219Msbb4DeviceEstimatedTime() { return sata001Word219Msbb4DeviceEstimatedTime; }
        public boolean sata001Word219Msbb3DeviceEstimatedTime() { return sata001Word219Msbb3DeviceEstimatedTime; }
        public boolean sata001Word219Msbb2DeviceEstimatedTime() { return sata001Word219Msbb2DeviceEstimatedTime; }
        public boolean sata001Word219Msbb1DeviceEstimatedTime() { return sata001Word219Msbb1DeviceEstimatedTime; }
        public boolean sata001Word219Msbb0DeviceEstimatedTime() { return sata001Word219Msbb0DeviceEstimatedTime; }
        public boolean sata001Word219Msbb15To8() { return sata001Word219Msbb15To8; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Sata001Word128 extends KaitaiStruct {
        public static Sata001Word128 fromFile(String fileName) throws IOException {
            return new Sata001Word128(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word128(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word128(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word128(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word128Msbb7ToB6 = this._io.readBitsIntBe(2);
            this.sata001Word128Msbb5EnhancedSecurity = this._io.readBitsIntBe(1) != 0;
            this.sata001Word128Msbb4SecurityCountExp = this._io.readBitsIntBe(1) != 0;
            this.sata001Word128Msbb3SecurityFrozen = this._io.readBitsIntBe(1) != 0;
            this.sata001Word128Msbb2SecurityLocked = this._io.readBitsIntBe(1) != 0;
            this.sata001Word128Msbb1SecurityEnabled = this._io.readBitsIntBe(1) != 0;
            this.sata001Word128Msbb0SecuritySupported = this._io.readBitsIntBe(1) != 0;
            this.sata001Word128Msbb15To9 = this._io.readBitsIntBe(7);
            this.sata001Word128Msbb8MasterPassword = this._io.readBitsIntBe(1) != 0;
        }
        private long sata001Word128Msbb7ToB6;
        @JsonProperty
        private boolean sata001Word128Msbb5EnhancedSecurity;
        @JsonProperty
        private boolean sata001Word128Msbb4SecurityCountExp;
        @JsonProperty
        private boolean sata001Word128Msbb3SecurityFrozen;
        @JsonProperty
        private boolean sata001Word128Msbb2SecurityLocked;
        @JsonProperty
        private boolean sata001Word128Msbb1SecurityEnabled;
        @JsonProperty
        private boolean sata001Word128Msbb0SecuritySupported;
        private long sata001Word128Msbb15To9;
        @JsonProperty
        private boolean sata001Word128Msbb8MasterPassword;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public long sata001Word128Msbb7ToB6() { return sata001Word128Msbb7ToB6; }
        public boolean sata001Word128Msbb5EnhancedSecurity() { return sata001Word128Msbb5EnhancedSecurity; }
        public boolean sata001Word128Msbb4SecurityCountExp() { return sata001Word128Msbb4SecurityCountExp; }
        public boolean sata001Word128Msbb3SecurityFrozen() { return sata001Word128Msbb3SecurityFrozen; }
        public boolean sata001Word128Msbb2SecurityLocked() { return sata001Word128Msbb2SecurityLocked; }
        public boolean sata001Word128Msbb1SecurityEnabled() { return sata001Word128Msbb1SecurityEnabled; }
        public boolean sata001Word128Msbb0SecuritySupported() { return sata001Word128Msbb0SecuritySupported; }
        public long sata001Word128Msbb15To9() { return sata001Word128Msbb15To9; }
        public boolean sata001Word128Msbb8MasterPassword() { return sata001Word128Msbb8MasterPassword; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Sata001Word90 extends KaitaiStruct {
        public static Sata001Word90 fromFile(String fileName) throws IOException {
            return new Sata001Word90(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word90(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word90(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word90(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word90Msbb7To0ExtTimeRequired = this._io.readBitsIntBe(8);
            this.sata001Word90Msbb15ExtTime = this._io.readBitsIntBe(1) != 0;
            this.sata001Word90Msbb14ToB8 = this._io.readBitsIntBe(7);
        }
        @JsonProperty
        private long sata001Word90Msbb7To0ExtTimeRequired;
        @JsonProperty
        private boolean sata001Word90Msbb15ExtTime;
        @JsonProperty
        private long sata001Word90Msbb14ToB8;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public long sata001Word90Msbb7To0ExtTimeRequired() { return sata001Word90Msbb7To0ExtTimeRequired; }
        public boolean sata001Word90Msbb15ExtTime() { return sata001Word90Msbb15ExtTime; }
        public long sata001Word90Msbb14ToB8() { return sata001Word90Msbb14ToB8; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Sata001Word83 extends KaitaiStruct {
        public static Sata001Word83 fromFile(String fileName) throws IOException {
            return new Sata001Word83(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word83(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word83(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word83(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word83Msbb7Reserved = this._io.readBitsIntBe(1) != 0;
            this.sata001Word82Msbb6SetFeatures = this._io.readBitsIntBe(1) != 0;
            this.sata001Word82Msbb5PowerUp = this._io.readBitsIntBe(1) != 0;
            this.sata001Word82Msbb4Obsolete = this._io.readBitsIntBe(1) != 0;
            this.sata001Word82Msbb3AdvPower = this._io.readBitsIntBe(1) != 0;
            this.sata001Word82Msbb2CFA = this._io.readBitsIntBe(1) != 0;
            this.sata001Word82Msbb1TCQ = this._io.readBitsIntBe(1) != 0;
            this.sata001Word82Msbb0Microcode = this._io.readBitsIntBe(1) != 0;
            this.sata001Word82Msbb15Cleared = this._io.readBitsIntBe(1) != 0;
            this.sata001Word82Msbb14Set = this._io.readBitsIntBe(1) != 0;
            this.sata001Word82Msbb13FlushCache = this._io.readBitsIntBe(1) != 0;
            this.sata001Word82Msbb12MandatoryFlush = this._io.readBitsIntBe(1) != 0;
            this.sata001Word82Msbb11Config = this._io.readBitsIntBe(1) != 0;
            this.sata001Word82Msbb10AddressFeature = this._io.readBitsIntBe(1) != 0;
            this.sata001Word82Msbb9AcousticFeature = this._io.readBitsIntBe(1) != 0;
            this.sata001Word82Msbb8MaxSecurity = this._io.readBitsIntBe(1) != 0;
        }
        @JsonProperty
        private boolean sata001Word83Msbb7Reserved;
        @JsonProperty
        private boolean sata001Word82Msbb6SetFeatures;
        @JsonProperty
        private boolean sata001Word82Msbb5PowerUp;
        @JsonProperty
        private boolean sata001Word82Msbb4Obsolete;
        @JsonProperty
        private boolean sata001Word82Msbb3AdvPower;
        @JsonProperty
        private boolean sata001Word82Msbb2CFA;
        @JsonProperty
        private boolean sata001Word82Msbb1TCQ;
        @JsonProperty
        private boolean sata001Word82Msbb0Microcode;
        @JsonProperty
        private boolean sata001Word82Msbb15Cleared;
        @JsonProperty
        private boolean sata001Word82Msbb14Set;
        @JsonProperty
        private boolean sata001Word82Msbb13FlushCache;
        @JsonProperty
        private boolean sata001Word82Msbb12MandatoryFlush;
        @JsonProperty
        private boolean sata001Word82Msbb11Config;
        @JsonProperty
        private boolean sata001Word82Msbb10AddressFeature;
        @JsonProperty
        private boolean sata001Word82Msbb9AcousticFeature;
        @JsonProperty
        private boolean sata001Word82Msbb8MaxSecurity;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public boolean sata001Word83Msbb7Reserved() { return sata001Word83Msbb7Reserved; }
        public boolean sata001Word82Msbb6SetFeatures() { return sata001Word82Msbb6SetFeatures; }
        public boolean sata001Word82Msbb5PowerUp() { return sata001Word82Msbb5PowerUp; }
        public boolean sata001Word82Msbb4Obsolete() { return sata001Word82Msbb4Obsolete; }
        public boolean sata001Word82Msbb3AdvPower() { return sata001Word82Msbb3AdvPower; }
        public boolean sata001Word82Msbb2CFA() { return sata001Word82Msbb2CFA; }
        public boolean sata001Word82Msbb1TCQ() { return sata001Word82Msbb1TCQ; }
        public boolean sata001Word82Msbb0Microcode() { return sata001Word82Msbb0Microcode; }
        public boolean sata001Word82Msbb15Cleared() { return sata001Word82Msbb15Cleared; }
        public boolean sata001Word82Msbb14Set() { return sata001Word82Msbb14Set; }
        public boolean sata001Word82Msbb13FlushCache() { return sata001Word82Msbb13FlushCache; }
        public boolean sata001Word82Msbb12MandatoryFlush() { return sata001Word82Msbb12MandatoryFlush; }
        public boolean sata001Word82Msbb11Config() { return sata001Word82Msbb11Config; }
        public boolean sata001Word82Msbb10AddressFeature() { return sata001Word82Msbb10AddressFeature; }
        public boolean sata001Word82Msbb9AcousticFeature() { return sata001Word82Msbb9AcousticFeature; }
        public boolean sata001Word82Msbb8MaxSecurity() { return sata001Word82Msbb8MaxSecurity; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Sata001Word106 extends KaitaiStruct {
        public static Sata001Word106 fromFile(String fileName) throws IOException {
            return new Sata001Word106(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word106(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word106(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word106(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word106Msbb7To4 = this._io.readBitsIntBe(4);
            this.sata001Word106Msbb32xLogicalSectors = this._io.readBitsIntBe(1) != 0;
            this.sata001Word106Msbb22xLogicalSectors = this._io.readBitsIntBe(1) != 0;
            this.sata001Word106Msbb12xLogicalSectors = this._io.readBitsIntBe(1) != 0;
            this.sata001Word106Msbb02xLogicalSectors = this._io.readBitsIntBe(1) != 0;
            this.sata001Word106Msbb15Cleared = this._io.readBitsIntBe(1) != 0;
            this.sata001Word106Msbb14Set = this._io.readBitsIntBe(1) != 0;
            this.sata001Word106Msbb13LogicalSectorsPerPhysicalSectors = this._io.readBitsIntBe(1) != 0;
            this.sata001Word106Msbb12LogicalSectorLonger = this._io.readBitsIntBe(1) != 0;
            this.sata001Word106Msbb11To8 = this._io.readBitsIntBe(4);
        }
        @JsonProperty
        private long sata001Word106Msbb7To4;
        @JsonProperty
        private boolean sata001Word106Msbb32xLogicalSectors;
        @JsonProperty
        private boolean sata001Word106Msbb22xLogicalSectors;
        @JsonProperty
        private boolean sata001Word106Msbb12xLogicalSectors;
        @JsonProperty
        private boolean sata001Word106Msbb02xLogicalSectors;
        @JsonProperty
        private boolean sata001Word106Msbb15Cleared;
        @JsonProperty
        private boolean sata001Word106Msbb14Set;
        @JsonProperty
        private boolean sata001Word106Msbb13LogicalSectorsPerPhysicalSectors;
        @JsonProperty
        private boolean sata001Word106Msbb12LogicalSectorLonger;
        @JsonProperty
        private long sata001Word106Msbb11To8;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public long sata001Word106Msbb7To4() { return sata001Word106Msbb7To4; }
        public boolean sata001Word106Msbb32xLogicalSectors() { return sata001Word106Msbb32xLogicalSectors; }
        public boolean sata001Word106Msbb22xLogicalSectors() { return sata001Word106Msbb22xLogicalSectors; }
        public boolean sata001Word106Msbb12xLogicalSectors() { return sata001Word106Msbb12xLogicalSectors; }
        public boolean sata001Word106Msbb02xLogicalSectors() { return sata001Word106Msbb02xLogicalSectors; }
        public boolean sata001Word106Msbb15Cleared() { return sata001Word106Msbb15Cleared; }
        public boolean sata001Word106Msbb14Set() { return sata001Word106Msbb14Set; }
        public boolean sata001Word106Msbb13LogicalSectorsPerPhysicalSectors() { return sata001Word106Msbb13LogicalSectorsPerPhysicalSectors; }
        public boolean sata001Word106Msbb12LogicalSectorLonger() { return sata001Word106Msbb12LogicalSectorLonger; }
        public long sata001Word106Msbb11To8() { return sata001Word106Msbb11To8; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Sata001Word214 extends KaitaiStruct {
        public static Sata001Word214 fromFile(String fileName) throws IOException {
            return new Sata001Word214(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word214(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word214(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word214(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word214Msbb7To5 = this._io.readBitsIntBe(3);
            this.sata001Word214Msbb4NVCacheFeature = this._io.readBitsIntBe(1) != 0;
            this.sata001Word214Msbb3To2 = this._io.readBitsIntBe(2);
            this.sata001Word214Msbb1NVCachePowerMode = this._io.readBitsIntBe(1) != 0;
            this.sata001Word214Msbb0NVCachePowerMode = this._io.readBitsIntBe(1) != 0;
            this.sata001Word214Msbb15To12NVCacheVersion = this._io.readBitsIntBe(4);
            this.sata001Word214Msbb11To8NVCachePowerVerison = this._io.readBitsIntBe(4);
        }
        private long sata001Word214Msbb7To5;
        @JsonProperty
        private boolean sata001Word214Msbb4NVCacheFeature;
        private long sata001Word214Msbb3To2;
        @JsonProperty
        private boolean sata001Word214Msbb1NVCachePowerMode;
        @JsonProperty
        private boolean sata001Word214Msbb0NVCachePowerMode;
        @JsonProperty
        private long sata001Word214Msbb15To12NVCacheVersion;
        @JsonProperty
        private long sata001Word214Msbb11To8NVCachePowerVerison;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public long sata001Word214Msbb7To5() { return sata001Word214Msbb7To5; }
        public boolean sata001Word214Msbb4NVCacheFeature() { return sata001Word214Msbb4NVCacheFeature; }
        public long sata001Word214Msbb3To2() { return sata001Word214Msbb3To2; }
        public boolean sata001Word214Msbb1NVCachePowerMode() { return sata001Word214Msbb1NVCachePowerMode; }
        public boolean sata001Word214Msbb0NVCachePowerMode() { return sata001Word214Msbb0NVCachePowerMode; }
        public long sata001Word214Msbb15To12NVCacheVersion() { return sata001Word214Msbb15To12NVCacheVersion; }
        public long sata001Word214Msbb11To8NVCachePowerVerison() { return sata001Word214Msbb11To8NVCachePowerVerison; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Sata001Word50 extends KaitaiStruct {
        public static Sata001Word50 fromFile(String fileName) throws IOException {
            return new Sata001Word50(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word50(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word50(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word50(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word50Msbb7To2 = this._io.readBitsIntBe(6);
            this.sata001Word50Msbb1Obsolete = this._io.readBitsIntBe(1) != 0;
            this.sata001Word50Msbb0MinStandbyTime = this._io.readBitsIntBe(1) != 0;
            this.sata001Word50Msbb15ShallBeZero = this._io.readBitsIntBe(1) != 0;
            this.sata001Word50Msbb14ShallBeOne = this._io.readBitsIntBe(1) != 0;
            this.sata001Word50Msbb13To8Reserved = this._io.readBitsIntBe(6);
        }
        private long sata001Word50Msbb7To2;
        @JsonProperty
        private boolean sata001Word50Msbb1Obsolete;
        @JsonProperty
        private boolean sata001Word50Msbb0MinStandbyTime;
        @JsonProperty
        private boolean sata001Word50Msbb15ShallBeZero;
        @JsonProperty
        private boolean sata001Word50Msbb14ShallBeOne;
        private long sata001Word50Msbb13To8Reserved;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public long sata001Word50Msbb7To2() { return sata001Word50Msbb7To2; }
        public boolean sata001Word50Msbb1Obsolete() { return sata001Word50Msbb1Obsolete; }
        public boolean sata001Word50Msbb0MinStandbyTime() { return sata001Word50Msbb0MinStandbyTime; }
        public boolean sata001Word50Msbb15ShallBeZero() { return sata001Word50Msbb15ShallBeZero; }
        public boolean sata001Word50Msbb14ShallBeOne() { return sata001Word50Msbb14ShallBeOne; }
        public long sata001Word50Msbb13To8Reserved() { return sata001Word50Msbb13To8Reserved; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Sata001Word49 extends KaitaiStruct {
        public static Sata001Word49 fromFile(String fileName) throws IOException {
            return new Sata001Word49(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word49(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word49(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word49(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word48Msbb7To2 = this._io.readBitsIntBe(6);
            this.sata001Word48Msbb1To0LongPhysicalSector = this._io.readBitsIntBe(2);
            this.sata001Word48Msbb15To14 = this._io.readBitsIntBe(2);
            this.sata001Word48Msbb13StandbyTimer = this._io.readBitsIntBe(1) != 0;
            this.sata001Word48Msbb12IdentityPacketDevice = this._io.readBitsIntBe(1) != 0;
            this.sata001Word48Msbb11IORDYSupported = this._io.readBitsIntBe(1) != 0;
            this.sata001Word48Msbb10IORDYDisabled = this._io.readBitsIntBe(1) != 0;
            this.sata001Word48Msbb9LBASupported = this._io.readBitsIntBe(1) != 0;
            this.sata001Word48Msbb8DMASupported = this._io.readBitsIntBe(1) != 0;
        }

        private long sata001Word48Msbb7To2;
        @JsonProperty
        private long sata001Word48Msbb1To0LongPhysicalSector;

        private long sata001Word48Msbb15To14;
        @JsonProperty
        private boolean sata001Word48Msbb13StandbyTimer;
        @JsonProperty
        private boolean sata001Word48Msbb12IdentityPacketDevice;
        @JsonProperty
        private boolean sata001Word48Msbb11IORDYSupported;
        @JsonProperty
        private boolean sata001Word48Msbb10IORDYDisabled;
        @JsonProperty
        private boolean sata001Word48Msbb9LBASupported;
        @JsonProperty
        private boolean sata001Word48Msbb8DMASupported;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public long sata001Word48Msbb7To2() { return sata001Word48Msbb7To2; }
        public long sata001Word48Msbb1To0LongPhysicalSector() { return sata001Word48Msbb1To0LongPhysicalSector; }
        public long sata001Word48Msbb15To14() { return sata001Word48Msbb15To14; }
        public boolean sata001Word48Msbb13StandbyTimer() { return sata001Word48Msbb13StandbyTimer; }
        public boolean sata001Word48Msbb12IdentityPacketDevice() { return sata001Word48Msbb12IdentityPacketDevice; }
        public boolean sata001Word48Msbb11IORDYSupported() { return sata001Word48Msbb11IORDYSupported; }
        public boolean sata001Word48Msbb10IORDYDisabled() { return sata001Word48Msbb10IORDYDisabled; }
        public boolean sata001Word48Msbb9LBASupported() { return sata001Word48Msbb9LBASupported; }
        public boolean sata001Word48Msbb8DMASupported() { return sata001Word48Msbb8DMASupported; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class StrRv40 extends KaitaiStruct {
        public static StrRv40 fromFile(String fileName) throws IOException {
            return new StrRv40(new ByteBufferKaitaiStream(fileName));
        }

        public StrRv40(KaitaiStream _io) {
            this(_io, null, null);
        }

        public StrRv40(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public StrRv40(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.strRv40 = new String(this._io.readBytes(40), Charset.forName("ASCII"));
            this.strRv40 = new Template001WordReversal().parsedWord(this.strRv40);
        }
        @JsonProperty
        private String strRv40;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public String strRv40() { return strRv40; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Sata001Word84 extends KaitaiStruct {
        public static Sata001Word84 fromFile(String fileName) throws IOException {
            return new Sata001Word84(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word84(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word84(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word84(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word84Msbb7WriteDmaQueued = this._io.readBitsIntBe(1) != 0;
            this.sata001Word84Msbb6WriteDmaFua = this._io.readBitsIntBe(1) != 0;
            this.sata001Word84Msbb5LoggingFeature = this._io.readBitsIntBe(1) != 0;
            this.sata001Word84Msbb4StreamingFeature = this._io.readBitsIntBe(1) != 0;
            this.sata001Word84Msbb3MediaCard = this._io.readBitsIntBe(1) != 0;
            this.sata001Word84Msbb2MediaSerial = this._io.readBitsIntBe(1) != 0;
            this.sata001Word84Msbb1SmartSelfTest = this._io.readBitsIntBe(1) != 0;
            this.sata001Word84Msbb0SmartError = this._io.readBitsIntBe(1) != 0;
            this.sata001Word84Msbb15Cleared = this._io.readBitsIntBe(1) != 0;
            this.sata001Word84Msbb14Set = this._io.readBitsIntBe(1) != 0;
            this.sata001Word84Msbb13UnloadFeature = this._io.readBitsIntBe(1) != 0;
            this.sata001Word84Msbb12Reserved = this._io.readBitsIntBe(1) != 0;
            this.sata001Word84Msbb11Reserved = this._io.readBitsIntBe(1) != 0;
            this.sata001Word84Msbb10Obsolete = this._io.readBitsIntBe(1) != 0;
            this.sata001Word84Msbb9Obsolete = this._io.readBitsIntBe(1) != 0;
            this.sata001Word84Msbb8WorldWideName = this._io.readBitsIntBe(1) != 0;
        }
        @JsonProperty
        private boolean sata001Word84Msbb7WriteDmaQueued;
        @JsonProperty
        private boolean sata001Word84Msbb6WriteDmaFua;
        @JsonProperty
        private boolean sata001Word84Msbb5LoggingFeature;
        @JsonProperty
        private boolean sata001Word84Msbb4StreamingFeature;
        @JsonProperty
        private boolean sata001Word84Msbb3MediaCard;
        @JsonProperty
        private boolean sata001Word84Msbb2MediaSerial;
        @JsonProperty
        private boolean sata001Word84Msbb1SmartSelfTest;
        @JsonProperty
        private boolean sata001Word84Msbb0SmartError;
        @JsonProperty
        private boolean sata001Word84Msbb15Cleared;
        @JsonProperty
        private boolean sata001Word84Msbb14Set;
        @JsonProperty
        private boolean sata001Word84Msbb13UnloadFeature;
        @JsonProperty
        private boolean sata001Word84Msbb12Reserved;
        @JsonProperty
        private boolean sata001Word84Msbb11Reserved;
        @JsonProperty
        private boolean sata001Word84Msbb10Obsolete;
        @JsonProperty
        private boolean sata001Word84Msbb9Obsolete;
        @JsonProperty
        private boolean sata001Word84Msbb8WorldWideName;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public boolean sata001Word84Msbb7WriteDmaQueued() { return sata001Word84Msbb7WriteDmaQueued; }
        public boolean sata001Word84Msbb6WriteDmaFua() { return sata001Word84Msbb6WriteDmaFua; }
        public boolean sata001Word84Msbb5LoggingFeature() { return sata001Word84Msbb5LoggingFeature; }
        public boolean sata001Word84Msbb4StreamingFeature() { return sata001Word84Msbb4StreamingFeature; }
        public boolean sata001Word84Msbb3MediaCard() { return sata001Word84Msbb3MediaCard; }
        public boolean sata001Word84Msbb2MediaSerial() { return sata001Word84Msbb2MediaSerial; }
        public boolean sata001Word84Msbb1SmartSelfTest() { return sata001Word84Msbb1SmartSelfTest; }
        public boolean sata001Word84Msbb0SmartError() { return sata001Word84Msbb0SmartError; }
        public boolean sata001Word84Msbb15Cleared() { return sata001Word84Msbb15Cleared; }
        public boolean sata001Word84Msbb14Set() { return sata001Word84Msbb14Set; }
        public boolean sata001Word84Msbb13UnloadFeature() { return sata001Word84Msbb13UnloadFeature; }
        public boolean sata001Word84Msbb12Reserved() { return sata001Word84Msbb12Reserved; }
        public boolean sata001Word84Msbb11Reserved() { return sata001Word84Msbb11Reserved; }
        public boolean sata001Word84Msbb10Obsolete() { return sata001Word84Msbb10Obsolete; }
        public boolean sata001Word84Msbb9Obsolete() { return sata001Word84Msbb9Obsolete; }
        public boolean sata001Word84Msbb8WorldWideName() { return sata001Word84Msbb8WorldWideName; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Sata001Word119 extends KaitaiStruct {
        public static Sata001Word119 fromFile(String fileName) throws IOException {
            return new Sata001Word119(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word119(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word119(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word119(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word119Msbb7ExtendedPowerConditions = this._io.readBitsIntBe(1) != 0;
            this.sata001Word119Msbb6SenseData = this._io.readBitsIntBe(1) != 0;
            this.sata001Word119Msbb5FreeFallControl = this._io.readBitsIntBe(1) != 0;
            this.sata001Word119Msbb4MicroCode = this._io.readBitsIntBe(1) != 0;
            this.sata001Word119Msbb3ReadLogDma = this._io.readBitsIntBe(1) != 0;
            this.sata001Word119Msbb2WriteUncorrectableExt = this._io.readBitsIntBe(1) != 0;
            this.sata001Word119Msbb1WriteReadVerifyFeature = this._io.readBitsIntBe(1) != 0;
            this.sata001Word119Msbb0Reserved = this._io.readBitsIntBe(1) != 0;
            this.sata001Word119Msbb15Cleared = this._io.readBitsIntBe(1) != 0;
            this.sata001Word119Msbb14Set = this._io.readBitsIntBe(1) != 0;
            this.sata001Word119Msbb13To10 = this._io.readBitsIntBe(4);
            this.sata001Word119Msbb9DsnFeature = this._io.readBitsIntBe(1) != 0;
            this.sata001Word119Msbb8MaxAddressConfig = this._io.readBitsIntBe(1) != 0;
        }
        @JsonProperty
        private boolean sata001Word119Msbb7ExtendedPowerConditions;
        @JsonProperty
        private boolean sata001Word119Msbb6SenseData;
        @JsonProperty
        private boolean sata001Word119Msbb5FreeFallControl;
        @JsonProperty
        private boolean sata001Word119Msbb4MicroCode;
        @JsonProperty
        private boolean sata001Word119Msbb3ReadLogDma;
        @JsonProperty
        private boolean sata001Word119Msbb2WriteUncorrectableExt;
        @JsonProperty
        private boolean sata001Word119Msbb1WriteReadVerifyFeature;
        @JsonProperty
        private boolean sata001Word119Msbb0Reserved;
        @JsonProperty
        private boolean sata001Word119Msbb15Cleared;
        @JsonProperty
        private boolean sata001Word119Msbb14Set;
        private long sata001Word119Msbb13To10;
        @JsonProperty
        private boolean sata001Word119Msbb9DsnFeature;
        @JsonProperty
        private boolean sata001Word119Msbb8MaxAddressConfig;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public boolean sata001Word119Msbb7ExtendedPowerConditions() { return sata001Word119Msbb7ExtendedPowerConditions; }
        public boolean sata001Word119Msbb6SenseData() { return sata001Word119Msbb6SenseData; }
        public boolean sata001Word119Msbb5FreeFallControl() { return sata001Word119Msbb5FreeFallControl; }
        public boolean sata001Word119Msbb4MicroCode() { return sata001Word119Msbb4MicroCode; }
        public boolean sata001Word119Msbb3ReadLogDma() { return sata001Word119Msbb3ReadLogDma; }
        public boolean sata001Word119Msbb2WriteUncorrectableExt() { return sata001Word119Msbb2WriteUncorrectableExt; }
        public boolean sata001Word119Msbb1WriteReadVerifyFeature() { return sata001Word119Msbb1WriteReadVerifyFeature; }
        public boolean sata001Word119Msbb0Reserved() { return sata001Word119Msbb0Reserved; }
        public boolean sata001Word119Msbb15Cleared() { return sata001Word119Msbb15Cleared; }
        public boolean sata001Word119Msbb14Set() { return sata001Word119Msbb14Set; }
        public long sata001Word119Msbb13To10() { return sata001Word119Msbb13To10; }
        public boolean sata001Word119Msbb9DsnFeature() { return sata001Word119Msbb9DsnFeature; }
        public boolean sata001Word119Msbb8MaxAddressConfig() { return sata001Word119Msbb8MaxAddressConfig; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Sata001Word87 extends KaitaiStruct {
        public static Sata001Word87 fromFile(String fileName) throws IOException {
            return new Sata001Word87(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word87(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word87(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word87(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word87Msbb7WriteDmaQueued = this._io.readBitsIntBe(1) != 0;
            this.sata001Word87Msbb6WriteDmaFua = this._io.readBitsIntBe(1) != 0;
            this.sata001Word87Msbb5LoggingFeature = this._io.readBitsIntBe(1) != 0;
            this.sata001Word87Msbb4Obsolete = this._io.readBitsIntBe(1) != 0;
            this.sata001Word87Msbb3MediaCard = this._io.readBitsIntBe(1) != 0;
            this.sata001Word87Msbb2MediaSerial = this._io.readBitsIntBe(1) != 0;
            this.sata001Word87Msbb1SmartSelfTest = this._io.readBitsIntBe(1) != 0;
            this.sata001Word87Msbb0SmartError = this._io.readBitsIntBe(1) != 0;
            this.sata001Word87Msbb15Cleared = this._io.readBitsIntBe(1) != 0;
            this.sata001Word87Msbb14Set = this._io.readBitsIntBe(1) != 0;
            this.sata001Word87Msbb13UnloadFeature = this._io.readBitsIntBe(1) != 0;
            this.sata001Word87Msbb12 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word87Msbb11 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word87Msbb10Obsolete = this._io.readBitsIntBe(1) != 0;
            this.sata001Word87Msbb9Obsolete = this._io.readBitsIntBe(1) != 0;
            this.sata001Word87Msbb8WorldWideName = this._io.readBitsIntBe(1) != 0;
        }
        @JsonProperty
        private boolean sata001Word87Msbb7WriteDmaQueued;
        @JsonProperty
        private boolean sata001Word87Msbb6WriteDmaFua;
        @JsonProperty
        private boolean sata001Word87Msbb5LoggingFeature;
        @JsonProperty
        private boolean sata001Word87Msbb4Obsolete;
        @JsonProperty
        private boolean sata001Word87Msbb3MediaCard;
        @JsonProperty
        private boolean sata001Word87Msbb2MediaSerial;
        @JsonProperty
        private boolean sata001Word87Msbb1SmartSelfTest;
        @JsonProperty
        private boolean sata001Word87Msbb0SmartError;
        @JsonProperty
        private boolean sata001Word87Msbb15Cleared;
        @JsonProperty
        private boolean sata001Word87Msbb14Set;
        @JsonProperty
        private boolean sata001Word87Msbb13UnloadFeature;
        @JsonProperty
        private boolean sata001Word87Msbb12;
        @JsonProperty
        private boolean sata001Word87Msbb11;
        @JsonProperty
        private boolean sata001Word87Msbb10Obsolete;
        @JsonProperty
        private boolean sata001Word87Msbb9Obsolete;
        @JsonProperty
        private boolean sata001Word87Msbb8WorldWideName;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public boolean sata001Word87Msbb7WriteDmaQueued() { return sata001Word87Msbb7WriteDmaQueued; }
        public boolean sata001Word87Msbb6WriteDmaFua() { return sata001Word87Msbb6WriteDmaFua; }
        public boolean sata001Word87Msbb5LoggingFeature() { return sata001Word87Msbb5LoggingFeature; }
        public boolean sata001Word87Msbb4Obsolete() { return sata001Word87Msbb4Obsolete; }
        public boolean sata001Word87Msbb3MediaCard() { return sata001Word87Msbb3MediaCard; }
        public boolean sata001Word87Msbb2MediaSerial() { return sata001Word87Msbb2MediaSerial; }
        public boolean sata001Word87Msbb1SmartSelfTest() { return sata001Word87Msbb1SmartSelfTest; }
        public boolean sata001Word87Msbb0SmartError() { return sata001Word87Msbb0SmartError; }
        public boolean sata001Word87Msbb15Cleared() { return sata001Word87Msbb15Cleared; }
        public boolean sata001Word87Msbb14Set() { return sata001Word87Msbb14Set; }
        public boolean sata001Word87Msbb13UnloadFeature() { return sata001Word87Msbb13UnloadFeature; }
        public boolean sata001Word87Msbb12() { return sata001Word87Msbb12; }
        public boolean sata001Word87Msbb11() { return sata001Word87Msbb11; }
        public boolean sata001Word87Msbb10Obsolete() { return sata001Word87Msbb10Obsolete; }
        public boolean sata001Word87Msbb9Obsolete() { return sata001Word87Msbb9Obsolete; }
        public boolean sata001Word87Msbb8WorldWideName() { return sata001Word87Msbb8WorldWideName; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Sata001Word91 extends KaitaiStruct {
        public static Sata001Word91 fromFile(String fileName) throws IOException {
            return new Sata001Word91(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word91(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word91(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word91(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word91Msbb7To0 = this._io.readBitsIntBe(8);
            this.sata001Word90Msbb15To8 = this._io.readBitsIntBe(8);
        }
        @JsonProperty
        private long sata001Word91Msbb7To0;
        private long sata001Word90Msbb15To8;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public long sata001Word91Msbb7To0() { return sata001Word91Msbb7To0; }
        public long sata001Word90Msbb15To8() { return sata001Word90Msbb15To8; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Sata001Word120 extends KaitaiStruct {
        public static Sata001Word120 fromFile(String fileName) throws IOException {
            return new Sata001Word120(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word120(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word120(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word120(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word120Msbb7ExtendedPowerConditions = this._io.readBitsIntBe(1) != 0;
            this.sata001Word120Msbb6SenseData = this._io.readBitsIntBe(1) != 0;
            this.sata001Word120Msbb5FreeFallControl = this._io.readBitsIntBe(1) != 0;
            this.sata001Word120Msbb4MicroCode = this._io.readBitsIntBe(1) != 0;
            this.sata001Word120Msbb3ReadLogDma = this._io.readBitsIntBe(1) != 0;
            this.sata001Word120Msbb2WriteUncorrectableExt = this._io.readBitsIntBe(1) != 0;
            this.sata001Word120Msbb1WriteReadVerifyFeature = this._io.readBitsIntBe(1) != 0;
            this.sata001Word120Msbb0Reserved = this._io.readBitsIntBe(1) != 0;
            this.sata001Word120Msbb15Cleared = this._io.readBitsIntBe(1) != 0;
            this.sata001Word120Msbb14Set = this._io.readBitsIntBe(1) != 0;
            this.sata001Word120Msbb13To10 = this._io.readBitsIntBe(4);
            this.sata001Word120Msbb9DsnFeature = this._io.readBitsIntBe(1) != 0;
            this.sata001Word120Msbb8 = this._io.readBitsIntBe(1) != 0;
        }
        @JsonProperty
        private boolean sata001Word120Msbb7ExtendedPowerConditions;
        @JsonProperty
        private boolean sata001Word120Msbb6SenseData;
        @JsonProperty
        private boolean sata001Word120Msbb5FreeFallControl;
        @JsonProperty
        private boolean sata001Word120Msbb4MicroCode;
        @JsonProperty
        private boolean sata001Word120Msbb3ReadLogDma;
        @JsonProperty
        private boolean sata001Word120Msbb2WriteUncorrectableExt;
        @JsonProperty
        private boolean sata001Word120Msbb1WriteReadVerifyFeature;
        private boolean sata001Word120Msbb0Reserved;
        @JsonProperty
        private boolean sata001Word120Msbb15Cleared;
        @JsonProperty
        private boolean sata001Word120Msbb14Set;
        private long sata001Word120Msbb13To10;
        private boolean sata001Word120Msbb9DsnFeature;
        private boolean sata001Word120Msbb8;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public boolean sata001Word120Msbb7ExtendedPowerConditions() { return sata001Word120Msbb7ExtendedPowerConditions; }
        public boolean sata001Word120Msbb6SenseData() { return sata001Word120Msbb6SenseData; }
        public boolean sata001Word120Msbb5FreeFallControl() { return sata001Word120Msbb5FreeFallControl; }
        public boolean sata001Word120Msbb4MicroCode() { return sata001Word120Msbb4MicroCode; }
        public boolean sata001Word120Msbb3ReadLogDma() { return sata001Word120Msbb3ReadLogDma; }
        public boolean sata001Word120Msbb2WriteUncorrectableExt() { return sata001Word120Msbb2WriteUncorrectableExt; }
        public boolean sata001Word120Msbb1WriteReadVerifyFeature() { return sata001Word120Msbb1WriteReadVerifyFeature; }
        public boolean sata001Word120Msbb0Reserved() { return sata001Word120Msbb0Reserved; }
        public boolean sata001Word120Msbb15Cleared() { return sata001Word120Msbb15Cleared; }
        public boolean sata001Word120Msbb14Set() { return sata001Word120Msbb14Set; }
        public long sata001Word120Msbb13To10() { return sata001Word120Msbb13To10; }
        public boolean sata001Word120Msbb9DsnFeature() { return sata001Word120Msbb9DsnFeature; }
        public boolean sata001Word120Msbb8() { return sata001Word120Msbb8; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Sata001Word85 extends KaitaiStruct {
        public static Sata001Word85 fromFile(String fileName) throws IOException {
            return new Sata001Word85(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word85(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word85(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word85(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word85Msbb7ReleaseInterrupt = this._io.readBitsIntBe(1) != 0;
            this.sata001Word85Msbb6ReadLookAhead = this._io.readBitsIntBe(1) != 0;
            this.sata001Word85Msbb5WriteCache = this._io.readBitsIntBe(1) != 0;
            this.sata001Word85Msbb4Cleared = this._io.readBitsIntBe(1) != 0;
            this.sata001Word85Msbb3PowerManagement = this._io.readBitsIntBe(1) != 0;
            this.sata001Word85Msbb2Obsolete = this._io.readBitsIntBe(1) != 0;
            this.sata001Word85Msbb1SecurityMode = this._io.readBitsIntBe(1) != 0;
            this.sata001Word85Msbb0SmartFeature = this._io.readBitsIntBe(1) != 0;
            this.sata001Word85Msbb15Obsolete = this._io.readBitsIntBe(1) != 0;
            this.sata001Word85Msbb14Nop = this._io.readBitsIntBe(1) != 0;
            this.sata001Word85Msbb13ReadBuffer = this._io.readBitsIntBe(1) != 0;
            this.sata001Word85Msbb12WriteBuffer = this._io.readBitsIntBe(1) != 0;
            this.sata001Word85Msbb11Obsolete = this._io.readBitsIntBe(1) != 0;
            this.sata001Word85Msbb10HostProtected = this._io.readBitsIntBe(1) != 0;
            this.sata001Word85Msbb9Cleared = this._io.readBitsIntBe(1) != 0;
            this.sata001Word85Msbb8WorldReadLookAhead = this._io.readBitsIntBe(1) != 0;
        }
        @JsonProperty
        private boolean sata001Word85Msbb7ReleaseInterrupt;
        @JsonProperty
        private boolean sata001Word85Msbb6ReadLookAhead;
        @JsonProperty
        private boolean sata001Word85Msbb5WriteCache;
        @JsonProperty
        private boolean sata001Word85Msbb4Cleared;
        @JsonProperty
        private boolean sata001Word85Msbb3PowerManagement;
        @JsonProperty
        private boolean sata001Word85Msbb2Obsolete;
        @JsonProperty
        private boolean sata001Word85Msbb1SecurityMode;
        @JsonProperty
        private boolean sata001Word85Msbb0SmartFeature;
        @JsonProperty
        private boolean sata001Word85Msbb15Obsolete;
        @JsonProperty
        private boolean sata001Word85Msbb14Nop;
        @JsonProperty
        private boolean sata001Word85Msbb13ReadBuffer;
        @JsonProperty
        private boolean sata001Word85Msbb12WriteBuffer;
        @JsonProperty
        private boolean sata001Word85Msbb11Obsolete;
        @JsonProperty
        private boolean sata001Word85Msbb10HostProtected;
        @JsonProperty
        private boolean sata001Word85Msbb9Cleared;
        @JsonProperty
        private boolean sata001Word85Msbb8WorldReadLookAhead;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public boolean sata001Word85Msbb7ReleaseInterrupt() { return sata001Word85Msbb7ReleaseInterrupt; }
        public boolean sata001Word85Msbb6ReadLookAhead() { return sata001Word85Msbb6ReadLookAhead; }
        public boolean sata001Word85Msbb5WriteCache() { return sata001Word85Msbb5WriteCache; }
        public boolean sata001Word85Msbb4Cleared() { return sata001Word85Msbb4Cleared; }
        public boolean sata001Word85Msbb3PowerManagement() { return sata001Word85Msbb3PowerManagement; }
        public boolean sata001Word85Msbb2Obsolete() { return sata001Word85Msbb2Obsolete; }
        public boolean sata001Word85Msbb1SecurityMode() { return sata001Word85Msbb1SecurityMode; }
        public boolean sata001Word85Msbb0SmartFeature() { return sata001Word85Msbb0SmartFeature; }
        public boolean sata001Word85Msbb15Obsolete() { return sata001Word85Msbb15Obsolete; }
        public boolean sata001Word85Msbb14Nop() { return sata001Word85Msbb14Nop; }
        public boolean sata001Word85Msbb13ReadBuffer() { return sata001Word85Msbb13ReadBuffer; }
        public boolean sata001Word85Msbb12WriteBuffer() { return sata001Word85Msbb12WriteBuffer; }
        public boolean sata001Word85Msbb11Obsolete() { return sata001Word85Msbb11Obsolete; }
        public boolean sata001Word85Msbb10HostProtected() { return sata001Word85Msbb10HostProtected; }
        public boolean sata001Word85Msbb9Cleared() { return sata001Word85Msbb9Cleared; }
        public boolean sata001Word85Msbb8WorldReadLookAhead() { return sata001Word85Msbb8WorldReadLookAhead; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Sata001Word222 extends KaitaiStruct {
        public static Sata001Word222 fromFile(String fileName) throws IOException {
            return new Sata001Word222(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word222(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word222(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word222(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word222Msbb7To2 = this._io.readBitsIntBe(6);
            this.sata001Word222Msbb1Ata7 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word222Msbb0Ata8 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word222Msbb15To12TransportType = this._io.readBitsIntBe(4);
            this.sata001Word222Msbb11To8 = this._io.readBitsIntBe(4);
        }
        private long sata001Word222Msbb7To2;
        @JsonProperty
        private boolean sata001Word222Msbb1Ata7;
        @JsonProperty
        private boolean sata001Word222Msbb0Ata8;
        @JsonProperty
        private long sata001Word222Msbb15To12TransportType;
        private long sata001Word222Msbb11To8;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public long sata001Word222Msbb7To2() { return sata001Word222Msbb7To2; }
        public boolean sata001Word222Msbb1Ata7() { return sata001Word222Msbb1Ata7; }
        public boolean sata001Word222Msbb0Ata8() { return sata001Word222Msbb0Ata8; }
        public long sata001Word222Msbb15To12TransportType() { return sata001Word222Msbb15To12TransportType; }
        public long sata001Word222Msbb11To8() { return sata001Word222Msbb11To8; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Sata001Word80 extends KaitaiStruct {
        public static Sata001Word80 fromFile(String fileName) throws IOException {
            return new Sata001Word80(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word80(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word80(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word80(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word80Msbb7AtaAtaPi7 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word80Msbb6AtaAtaPi6 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word80Msbb5AtaAtaPi5 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word80Msbb4AtaAtaPi4 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word80Msbb3Obsolete = this._io.readBitsIntBe(1) != 0;
            this.sata001Word80Msbb2Obsolete = this._io.readBitsIntBe(1) != 0;
            this.sata001Word80Msbb1Obsolete = this._io.readBitsIntBe(1) != 0;
            this.sata001Word80Msbb0Cleared = this._io.readBitsIntBe(1) != 0;
            this.sata001Word80Msbb15To12 = this._io.readBitsIntBe(4);
            this.sata001Word80Msbb11Acs4 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word80Msbb10Acs3 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word80Msbb9Acs2 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word80Msbb8Ata8Acs = this._io.readBitsIntBe(1) != 0;
        }
        @JsonProperty
        private boolean sata001Word80Msbb7AtaAtaPi7;
        @JsonProperty
        private boolean sata001Word80Msbb6AtaAtaPi6;
        @JsonProperty
        private boolean sata001Word80Msbb5AtaAtaPi5;
        @JsonProperty
        private boolean sata001Word80Msbb4AtaAtaPi4;
        @JsonProperty
        private boolean sata001Word80Msbb3Obsolete;
        @JsonProperty
        private boolean sata001Word80Msbb2Obsolete;
        @JsonProperty
        private boolean sata001Word80Msbb1Obsolete;
        @JsonProperty
        private boolean sata001Word80Msbb0Cleared;
        @JsonProperty
        private long sata001Word80Msbb15To12;
        @JsonProperty
        private boolean sata001Word80Msbb11Acs4;
        @JsonProperty
        private boolean sata001Word80Msbb10Acs3;
        @JsonProperty
        private boolean sata001Word80Msbb9Acs2;
        @JsonProperty
        private boolean sata001Word80Msbb8Ata8Acs;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public boolean sata001Word80Msbb7AtaAtaPi7() { return sata001Word80Msbb7AtaAtaPi7; }
        public boolean sata001Word80Msbb6AtaAtaPi6() { return sata001Word80Msbb6AtaAtaPi6; }
        public boolean sata001Word80Msbb5AtaAtaPi5() { return sata001Word80Msbb5AtaAtaPi5; }
        public boolean sata001Word80Msbb4AtaAtaPi4() { return sata001Word80Msbb4AtaAtaPi4; }
        public boolean sata001Word80Msbb3Obsolete() { return sata001Word80Msbb3Obsolete; }
        public boolean sata001Word80Msbb2Obsolete() { return sata001Word80Msbb2Obsolete; }
        public boolean sata001Word80Msbb1Obsolete() { return sata001Word80Msbb1Obsolete; }
        public boolean sata001Word80Msbb0Cleared() { return sata001Word80Msbb0Cleared; }
        public long sata001Word80Msbb15To12() { return sata001Word80Msbb15To12; }
        public boolean sata001Word80Msbb11Acs4() { return sata001Word80Msbb11Acs4; }
        public boolean sata001Word80Msbb10Acs3() { return sata001Word80Msbb10Acs3; }
        public boolean sata001Word80Msbb9Acs2() { return sata001Word80Msbb9Acs2; }
        public boolean sata001Word80Msbb8Ata8Acs() { return sata001Word80Msbb8Ata8Acs; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class StrRv8 extends KaitaiStruct {
        public static StrRv8 fromFile(String fileName) throws IOException {
            return new StrRv8(new ByteBufferKaitaiStream(fileName));
        }

        public StrRv8(KaitaiStream _io) {
            this(_io, null, null);
        }

        public StrRv8(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public StrRv8(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.strRv8 = new String(this._io.readBytes(8), Charset.forName("ASCII"));
            this.strRv8 = new Template001WordReversal().parsedWord(this.strRv8);
        }
        @JsonProperty
        private String strRv8;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public String strRv8() { return strRv8; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Sata001Word206 extends KaitaiStruct {
        public static Sata001Word206 fromFile(String fileName) throws IOException {
            return new Sata001Word206(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word206(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word206(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word206(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word206Msbb7To6 = this._io.readBitsIntBe(2);
            this.sata001Word206Msbb5DataTables = this._io.readBitsIntBe(1) != 0;
            this.sata001Word206Msbb4FeaturesControl = this._io.readBitsIntBe(1) != 0;
            this.sata001Word206Msbb3ErrorRecovery = this._io.readBitsIntBe(1) != 0;
            this.sata001Word206Msbb2WriteSame = this._io.readBitsIntBe(1) != 0;
            this.sata001Word206Msbb1LongSectorAccess = this._io.readBitsIntBe(1) != 0;
            this.sata001Word206Msbb0SctSupported = this._io.readBitsIntBe(1) != 0;
            this.sata001Word206Msbb15To8 = this._io.readBitsIntBe(8);
        }
        private long sata001Word206Msbb7To6;
        @JsonProperty
        private boolean sata001Word206Msbb5DataTables;
        @JsonProperty
        private boolean sata001Word206Msbb4FeaturesControl;
        @JsonProperty
        private boolean sata001Word206Msbb3ErrorRecovery;
        @JsonProperty
        private boolean sata001Word206Msbb2WriteSame;
        @JsonProperty
        private boolean sata001Word206Msbb1LongSectorAccess;
        @JsonProperty
        private boolean sata001Word206Msbb0SctSupported;
        @JsonProperty
        private long sata001Word206Msbb15To8;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public long sata001Word206Msbb7To6() { return sata001Word206Msbb7To6; }
        public boolean sata001Word206Msbb5DataTables() { return sata001Word206Msbb5DataTables; }
        public boolean sata001Word206Msbb4FeaturesControl() { return sata001Word206Msbb4FeaturesControl; }
        public boolean sata001Word206Msbb3ErrorRecovery() { return sata001Word206Msbb3ErrorRecovery; }
        public boolean sata001Word206Msbb2WriteSame() { return sata001Word206Msbb2WriteSame; }
        public boolean sata001Word206Msbb1LongSectorAccess() { return sata001Word206Msbb1LongSectorAccess; }
        public boolean sata001Word206Msbb0SctSupported() { return sata001Word206Msbb0SctSupported; }
        public long sata001Word206Msbb15To8() { return sata001Word206Msbb15To8; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Sata001Word59 extends KaitaiStruct {
        public static Sata001Word59 fromFile(String fileName) throws IOException {
            return new Sata001Word59(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word59(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word59(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word59(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word59Msbb7To0DrqDataBlock = this._io.readBitsIntBe(8);
            this.sata001Word59Msbb15BlockEraseExt = this._io.readBitsIntBe(1) != 0;
            this.sata001Word59Msbb14OverwriteExt = this._io.readBitsIntBe(1) != 0;
            this.sata001Word59Msbb13CryptoScrambleExt = this._io.readBitsIntBe(1) != 0;
            this.sata001Word59Msbb12SanitizeFeatureSupported = this._io.readBitsIntBe(1) != 0;
            this.sata001Word59Msbb11SanitizeOperationAllowed = this._io.readBitsIntBe(1) != 0;
            this.sata001Word59Msbb10SanitizeAntiFreezeLockExt = this._io.readBitsIntBe(1) != 0;
            this.sata001Word59Msbb9Reserved = this._io.readBitsIntBe(1) != 0;
            this.sata001Word59Msbb8MultipleLogicalSectorValid = this._io.readBitsIntBe(1) != 0;
        }
        @JsonProperty
        private long sata001Word59Msbb7To0DrqDataBlock;
        @JsonProperty
        private boolean sata001Word59Msbb15BlockEraseExt;
        @JsonProperty
        private boolean sata001Word59Msbb14OverwriteExt;
        @JsonProperty
        private boolean sata001Word59Msbb13CryptoScrambleExt;
        @JsonProperty
        private boolean sata001Word59Msbb12SanitizeFeatureSupported;
        @JsonProperty
        private boolean sata001Word59Msbb11SanitizeOperationAllowed;
        @JsonProperty
        private boolean sata001Word59Msbb10SanitizeAntiFreezeLockExt;
        private boolean sata001Word59Msbb9Reserved;
        @JsonProperty
        private boolean sata001Word59Msbb8MultipleLogicalSectorValid;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public long sata001Word59Msbb7To0DrqDataBlock() { return sata001Word59Msbb7To0DrqDataBlock; }
        public boolean sata001Word59Msbb15BlockEraseExt() { return sata001Word59Msbb15BlockEraseExt; }
        public boolean sata001Word59Msbb14OverwriteExt() { return sata001Word59Msbb14OverwriteExt; }
        public boolean sata001Word59Msbb13CryptoScrambleExt() { return sata001Word59Msbb13CryptoScrambleExt; }
        public boolean sata001Word59Msbb12SanitizeFeatureSupported() { return sata001Word59Msbb12SanitizeFeatureSupported; }
        public boolean sata001Word59Msbb11SanitizeOperationAllowed() { return sata001Word59Msbb11SanitizeOperationAllowed; }
        public boolean sata001Word59Msbb10SanitizeAntiFreezeLockExt() { return sata001Word59Msbb10SanitizeAntiFreezeLockExt; }
        public boolean sata001Word59Msbb9Reserved() { return sata001Word59Msbb9Reserved; }
        public boolean sata001Word59Msbb8MultipleLogicalSectorValid() { return sata001Word59Msbb8MultipleLogicalSectorValid; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Sata001Word69 extends KaitaiStruct {
        public static Sata001Word69 fromFile(String fileName) throws IOException {
            return new Sata001Word69(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word69(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word69(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word69(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word69Msbb7 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word69Msbb6OptionalATADevice = this._io.readBitsIntBe(1) != 0;
            this.sata001Word69Msbb5TrimmedLBARange = this._io.readBitsIntBe(1) != 0;
            this.sata001Word69Msbb4DeviceEncryptsAll = this._io.readBitsIntBe(1) != 0;
            this.sata001Word69Msbb3ExtendetNumber = this._io.readBitsIntBe(1) != 0;
            this.sata001Word69Msbb2AllWriteCache = this._io.readBitsIntBe(1) != 0;
            this.sata001Word69Msbb1To0ZoneCapabilties = this._io.readBitsIntBe(2);
            this.sata001Word69Msbb15CFastSpecification = this._io.readBitsIntBe(1) != 0;
            this.sata001Word69Msbb14DataTrimmedLBARange = this._io.readBitsIntBe(1) != 0;
            this.sata001Word69Msbb13LongPhysicalSector = this._io.readBitsIntBe(1) != 0;
            this.sata001Word69Msbb12DeviceConfigIdentityDMA = this._io.readBitsIntBe(1) != 0;
            this.sata001Word69Msbb11ReadBufferDMA = this._io.readBitsIntBe(1) != 0;
            this.sata001Word69Msbb10WriteBufferDMA = this._io.readBitsIntBe(1) != 0;
            this.sata001Word69Msbb9MaxPassword = this._io.readBitsIntBe(1) != 0;
            this.sata001Word69Msbb8MicrocodeDMA = this._io.readBitsIntBe(1) != 0;
        }
        @JsonProperty
        private boolean sata001Word69Msbb7;
        @JsonProperty
        private boolean sata001Word69Msbb6OptionalATADevice;
        @JsonProperty
        private boolean sata001Word69Msbb5TrimmedLBARange;
        @JsonProperty
        private boolean sata001Word69Msbb4DeviceEncryptsAll;
        @JsonProperty
        private boolean sata001Word69Msbb3ExtendetNumber;
        @JsonProperty
        private boolean sata001Word69Msbb2AllWriteCache;
        @JsonProperty
        private long sata001Word69Msbb1To0ZoneCapabilties;
        @JsonProperty
        private boolean sata001Word69Msbb15CFastSpecification;
        @JsonProperty
        private boolean sata001Word69Msbb14DataTrimmedLBARange;
        @JsonProperty
        private boolean sata001Word69Msbb13LongPhysicalSector;
        @JsonProperty
        private boolean sata001Word69Msbb12DeviceConfigIdentityDMA;
        @JsonProperty
        private boolean sata001Word69Msbb11ReadBufferDMA;
        @JsonProperty
        private boolean sata001Word69Msbb10WriteBufferDMA;
        @JsonProperty
        private boolean sata001Word69Msbb9MaxPassword;
        @JsonProperty
        private boolean sata001Word69Msbb8MicrocodeDMA;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public boolean sata001Word69Msbb7() { return sata001Word69Msbb7; }
        public boolean sata001Word69Msbb6OptionalATADevice() { return sata001Word69Msbb6OptionalATADevice; }
        public boolean sata001Word69Msbb5TrimmedLBARange() { return sata001Word69Msbb5TrimmedLBARange; }
        public boolean sata001Word69Msbb4DeviceEncryptsAll() { return sata001Word69Msbb4DeviceEncryptsAll; }
        public boolean sata001Word69Msbb3ExtendetNumber() { return sata001Word69Msbb3ExtendetNumber; }
        public boolean sata001Word69Msbb2AllWriteCache() { return sata001Word69Msbb2AllWriteCache; }
        public long sata001Word69Msbb1To0ZoneCapabilties() { return sata001Word69Msbb1To0ZoneCapabilties; }
        public boolean sata001Word69Msbb15CFastSpecification() { return sata001Word69Msbb15CFastSpecification; }
        public boolean sata001Word69Msbb14DataTrimmedLBARange() { return sata001Word69Msbb14DataTrimmedLBARange; }
        public boolean sata001Word69Msbb13LongPhysicalSector() { return sata001Word69Msbb13LongPhysicalSector; }
        public boolean sata001Word69Msbb12DeviceConfigIdentityDMA() { return sata001Word69Msbb12DeviceConfigIdentityDMA; }
        public boolean sata001Word69Msbb11ReadBufferDMA() { return sata001Word69Msbb11ReadBufferDMA; }
        public boolean sata001Word69Msbb10WriteBufferDMA() { return sata001Word69Msbb10WriteBufferDMA; }
        public boolean sata001Word69Msbb9MaxPassword() { return sata001Word69Msbb9MaxPassword; }
        public boolean sata001Word69Msbb8MicrocodeDMA() { return sata001Word69Msbb8MicrocodeDMA; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Sata001Word77 extends KaitaiStruct {
        public static Sata001Word77 fromFile(String fileName) throws IOException {
            return new Sata001Word77(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word77(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word77(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word77(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word77Msbb7DevSleep = this._io.readBitsIntBe(1) != 0;
            this.sata001Word77Msbb6Receive = this._io.readBitsIntBe(1) != 0;
            this.sata001Word77Msbb5NcqManagement = this._io.readBitsIntBe(1) != 0;
            this.sata001Word77Msbb4NcqStreaming = this._io.readBitsIntBe(1) != 0;
            this.sata001Word77Msbb3CodeValue = this._io.readBitsIntBe(1) != 0;
            this.sata001Word77Msbb2CodeValue = this._io.readBitsIntBe(1) != 0;
            this.sata001Word77Msbb1CodeValue = this._io.readBitsIntBe(1) != 0;
            this.sata001Word77Msbb0Cleared = this._io.readBitsIntBe(1) != 0;
            this.sata001Word77Msbb15To9 = this._io.readBitsIntBe(7);
            this.sata001Word77Msbb8PowerDisable = this._io.readBitsIntBe(1) != 0;
        }
        @JsonProperty
        private boolean sata001Word77Msbb7DevSleep;
        @JsonProperty
        private boolean sata001Word77Msbb6Receive;
        @JsonProperty
        private boolean sata001Word77Msbb5NcqManagement;
        @JsonProperty
        private boolean sata001Word77Msbb4NcqStreaming;
        @JsonProperty
        private boolean sata001Word77Msbb3CodeValue;
        @JsonProperty
        private boolean sata001Word77Msbb2CodeValue;
        @JsonProperty
        private boolean sata001Word77Msbb1CodeValue;
        @JsonProperty
        private boolean sata001Word77Msbb0Cleared;
        @JsonProperty
        private long sata001Word77Msbb15To9;
        @JsonProperty
        private boolean sata001Word77Msbb8PowerDisable;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public boolean sata001Word77Msbb7DevSleep() { return sata001Word77Msbb7DevSleep; }
        public boolean sata001Word77Msbb6Receive() { return sata001Word77Msbb6Receive; }
        public boolean sata001Word77Msbb5NcqManagement() { return sata001Word77Msbb5NcqManagement; }
        public boolean sata001Word77Msbb4NcqStreaming() { return sata001Word77Msbb4NcqStreaming; }
        public boolean sata001Word77Msbb3CodeValue() { return sata001Word77Msbb3CodeValue; }
        public boolean sata001Word77Msbb2CodeValue() { return sata001Word77Msbb2CodeValue; }
        public boolean sata001Word77Msbb1CodeValue() { return sata001Word77Msbb1CodeValue; }
        public boolean sata001Word77Msbb0Cleared() { return sata001Word77Msbb0Cleared; }
        public long sata001Word77Msbb15To9() { return sata001Word77Msbb15To9; }
        public boolean sata001Word77Msbb8PowerDisable() { return sata001Word77Msbb8PowerDisable; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Obsolete extends KaitaiStruct {
        public static Obsolete fromFile(String fileName) throws IOException {
            return new Obsolete(new ByteBufferKaitaiStream(fileName));
        }

        public Obsolete(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Obsolete(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Obsolete(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.obsolete = new String(this._io.readBytes(12), Charset.forName("ASCII"));
        }
        @JsonProperty
        private String obsolete;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public String obsolete() { return obsolete; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Sata001Word48 extends KaitaiStruct {
        public static Sata001Word48 fromFile(String fileName) throws IOException {
            return new Sata001Word48(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word48(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word48(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word48(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word48Msbb7To1 = this._io.readBitsIntBe(7);
            this.sata001Word48MsbbTrustedComputingFeature = this._io.readBitsIntBe(1) != 0;
            this.sata001Word48Msbb15 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word48Msbb14 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word48Msbb13To8 = this._io.readBitsIntBe(6);
        }
        @JsonProperty
        private long sata001Word48Msbb7To1;
        @JsonProperty
        private boolean sata001Word48MsbbTrustedComputingFeature;
        @JsonProperty
        private boolean sata001Word48Msbb15;
        @JsonProperty
        private boolean sata001Word48Msbb14;
        @JsonProperty
        private long sata001Word48Msbb13To8;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public long sata001Word48Msbb7To1() { return sata001Word48Msbb7To1; }
        public boolean sata001Word48MsbbTrustedComputingFeature() { return sata001Word48MsbbTrustedComputingFeature; }
        public boolean sata001Word48Msbb15() { return sata001Word48Msbb15; }
        public boolean sata001Word48Msbb14() { return sata001Word48Msbb14; }
        public long sata001Word48Msbb13To8() { return sata001Word48Msbb13To8; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Sata001Word86 extends KaitaiStruct {
        public static Sata001Word86 fromFile(String fileName) throws IOException {
            return new Sata001Word86(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word86(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word86(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word86(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word86Msbb7Reserved = this._io.readBitsIntBe(1) != 0;
            this.sata001Word86Msbb6SetFeatures = this._io.readBitsIntBe(1) != 0;
            this.sata001Word86Msbb5PowerUp = this._io.readBitsIntBe(1) != 0;
            this.sata001Word86Msbb4Obsolete = this._io.readBitsIntBe(1) != 0;
            this.sata001Word86Msbb3AdvPowerManagement = this._io.readBitsIntBe(1) != 0;
            this.sata001Word86Msbb2Cfa = this._io.readBitsIntBe(1) != 0;
            this.sata001Word86Msbb1Tcq = this._io.readBitsIntBe(1) != 0;
            this.sata001Word86Msbb0DownloadMicrocode = this._io.readBitsIntBe(1) != 0;
            this.sata001Word86Msbb15 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word86Msbb14 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word86Msbb13FlushCacheExt = this._io.readBitsIntBe(1) != 0;
            this.sata001Word86Msbb12FlushCache = this._io.readBitsIntBe(1) != 0;
            this.sata001Word86Msbb11Config = this._io.readBitsIntBe(1) != 0;
            this.sata001Word86Msbb10AddressFeatures = this._io.readBitsIntBe(1) != 0;
            this.sata001Word86Msbb9Acoustic = this._io.readBitsIntBe(1) != 0;
            this.sata001Word86Msbb8SetMaxSecurity = this._io.readBitsIntBe(1) != 0;
        }
        @JsonProperty
        private boolean sata001Word86Msbb7Reserved;
        @JsonProperty
        private boolean sata001Word86Msbb6SetFeatures;
        @JsonProperty
        private boolean sata001Word86Msbb5PowerUp;
        @JsonProperty
        private boolean sata001Word86Msbb4Obsolete;
        @JsonProperty
        private boolean sata001Word86Msbb3AdvPowerManagement;
        @JsonProperty
        private boolean sata001Word86Msbb2Cfa;
        @JsonProperty
        private boolean sata001Word86Msbb1Tcq;
        @JsonProperty
        private boolean sata001Word86Msbb0DownloadMicrocode;
        @JsonProperty
        private boolean sata001Word86Msbb15;
        @JsonProperty
        private boolean sata001Word86Msbb14;
        @JsonProperty
        private boolean sata001Word86Msbb13FlushCacheExt;
        @JsonProperty
        private boolean sata001Word86Msbb12FlushCache;
        @JsonProperty
        private boolean sata001Word86Msbb11Config;
        @JsonProperty
        private boolean sata001Word86Msbb10AddressFeatures;
        @JsonProperty
        private boolean sata001Word86Msbb9Acoustic;
        @JsonProperty
        private boolean sata001Word86Msbb8SetMaxSecurity;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public boolean sata001Word86Msbb7Reserved() { return sata001Word86Msbb7Reserved; }
        public boolean sata001Word86Msbb6SetFeatures() { return sata001Word86Msbb6SetFeatures; }
        public boolean sata001Word86Msbb5PowerUp() { return sata001Word86Msbb5PowerUp; }
        public boolean sata001Word86Msbb4Obsolete() { return sata001Word86Msbb4Obsolete; }
        public boolean sata001Word86Msbb3AdvPowerManagement() { return sata001Word86Msbb3AdvPowerManagement; }
        public boolean sata001Word86Msbb2Cfa() { return sata001Word86Msbb2Cfa; }
        public boolean sata001Word86Msbb1Tcq() { return sata001Word86Msbb1Tcq; }
        public boolean sata001Word86Msbb0DownloadMicrocode() { return sata001Word86Msbb0DownloadMicrocode; }
        public boolean sata001Word86Msbb15() { return sata001Word86Msbb15; }
        public boolean sata001Word86Msbb14() { return sata001Word86Msbb14; }
        public boolean sata001Word86Msbb13FlushCacheExt() { return sata001Word86Msbb13FlushCacheExt; }
        public boolean sata001Word86Msbb12FlushCache() { return sata001Word86Msbb12FlushCache; }
        public boolean sata001Word86Msbb11Config() { return sata001Word86Msbb11Config; }
        public boolean sata001Word86Msbb10AddressFeatures() { return sata001Word86Msbb10AddressFeatures; }
        public boolean sata001Word86Msbb9Acoustic() { return sata001Word86Msbb9Acoustic; }
        public boolean sata001Word86Msbb8SetMaxSecurity() { return sata001Word86Msbb8SetMaxSecurity; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Sata001Word168 extends KaitaiStruct {
        public static Sata001Word168 fromFile(String fileName) throws IOException {
            return new Sata001Word168(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word168(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word168(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word168(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word168Msbb7To4 = this._io.readBitsIntBe(4);
            this.sata001Word168Msbb3DeviceNominalFormFactor = this._io.readBitsIntBe(1) != 0;
            this.sata001Word168Msbb2DeviceNominalFormFactor = this._io.readBitsIntBe(1) != 0;
            this.sata001Word168Msbb1DeviceNominalFormFactor = this._io.readBitsIntBe(1) != 0;
            this.sata001Word168Msbb0DeviceNominalFormFactor = this._io.readBitsIntBe(1) != 0;
            this.sata001Word168Msbb15To8 = this._io.readBitsIntBe(8);
        }
        @JsonProperty
        private long sata001Word168Msbb7To4;
        @JsonProperty
        private boolean sata001Word168Msbb3DeviceNominalFormFactor;
        @JsonProperty
        private boolean sata001Word168Msbb2DeviceNominalFormFactor;
        @JsonProperty
        private boolean sata001Word168Msbb1DeviceNominalFormFactor;
        @JsonProperty
        private boolean sata001Word168Msbb0DeviceNominalFormFactor;
        private long sata001Word168Msbb15To8;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public long sata001Word168Msbb7To4() { return sata001Word168Msbb7To4; }
        public boolean sata001Word168Msbb3DeviceNominalFormFactor() { return sata001Word168Msbb3DeviceNominalFormFactor; }
        public boolean sata001Word168Msbb2DeviceNominalFormFactor() { return sata001Word168Msbb2DeviceNominalFormFactor; }
        public boolean sata001Word168Msbb1DeviceNominalFormFactor() { return sata001Word168Msbb1DeviceNominalFormFactor; }
        public boolean sata001Word168Msbb0DeviceNominalFormFactor() { return sata001Word168Msbb0DeviceNominalFormFactor; }
        public long sata001Word168Msbb15To8() { return sata001Word168Msbb15To8; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Sata001Word76 extends KaitaiStruct {
        public static Sata001Word76 fromFile(String fileName) throws IOException {
            return new Sata001Word76(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word76(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word76(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word76(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word76Msbb7SerialATA = this._io.readBitsIntBe(1) != 0;
            this.sata001Word76Msbb6SerialATA = this._io.readBitsIntBe(1) != 0;
            this.sata001Word76Msbb5SerialATA = this._io.readBitsIntBe(1) != 0;
            this.sata001Word76Msbb4SerialATA = this._io.readBitsIntBe(1) != 0;
            this.sata001Word76Msbb3ATAGen3 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word76Msbb2ATAGen2 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word76Msbb1ATAGen1 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word76Msbb0Cleared = this._io.readBitsIntBe(1) != 0;
            this.sata001Word76Msbb15ReadLogDma = this._io.readBitsIntBe(1) != 0;
            this.sata001Word76Msbb14DevicePartial = this._io.readBitsIntBe(1) != 0;
            this.sata001Word76Msbb13HostPartial = this._io.readBitsIntBe(1) != 0;
            this.sata001Word76Msbb12NativeCmd = this._io.readBitsIntBe(1) != 0;
            this.sata001Word76Msbb11UnloadWhileNcq = this._io.readBitsIntBe(1) != 0;
            this.sata001Word76Msbb10PhyEventCounters = this._io.readBitsIntBe(1) != 0;
            this.sata001Word76Msbb9ReceiptHostInit = this._io.readBitsIntBe(1) != 0;
            this.sata001Word76Msbb8NativeCmdQueuing = this._io.readBitsIntBe(1) != 0;
        }
        @JsonProperty
        private boolean sata001Word76Msbb7SerialATA;
        @JsonProperty
        private boolean sata001Word76Msbb6SerialATA;
        @JsonProperty
        private boolean sata001Word76Msbb5SerialATA;
        @JsonProperty
        private boolean sata001Word76Msbb4SerialATA;
        @JsonProperty
        private boolean sata001Word76Msbb3ATAGen3;
        @JsonProperty
        private boolean sata001Word76Msbb2ATAGen2;
        @JsonProperty
        private boolean sata001Word76Msbb1ATAGen1;
        @JsonProperty
        private boolean sata001Word76Msbb0Cleared;
        @JsonProperty
        private boolean sata001Word76Msbb15ReadLogDma;
        @JsonProperty
        private boolean sata001Word76Msbb14DevicePartial;
        @JsonProperty
        private boolean sata001Word76Msbb13HostPartial;
        @JsonProperty
        private boolean sata001Word76Msbb12NativeCmd;
        @JsonProperty
        private boolean sata001Word76Msbb11UnloadWhileNcq;
        @JsonProperty
        private boolean sata001Word76Msbb10PhyEventCounters;
        @JsonProperty
        private boolean sata001Word76Msbb9ReceiptHostInit;
        @JsonProperty
        private boolean sata001Word76Msbb8NativeCmdQueuing;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public boolean sata001Word76Msbb7SerialATA() { return sata001Word76Msbb7SerialATA; }
        public boolean sata001Word76Msbb6SerialATA() { return sata001Word76Msbb6SerialATA; }
        public boolean sata001Word76Msbb5SerialATA() { return sata001Word76Msbb5SerialATA; }
        public boolean sata001Word76Msbb4SerialATA() { return sata001Word76Msbb4SerialATA; }
        public boolean sata001Word76Msbb3ATAGen3() { return sata001Word76Msbb3ATAGen3; }
        public boolean sata001Word76Msbb2ATAGen2() { return sata001Word76Msbb2ATAGen2; }
        public boolean sata001Word76Msbb1ATAGen1() { return sata001Word76Msbb1ATAGen1; }
        public boolean sata001Word76Msbb0Cleared() { return sata001Word76Msbb0Cleared; }
        public boolean sata001Word76Msbb15ReadLogDma() { return sata001Word76Msbb15ReadLogDma; }
        public boolean sata001Word76Msbb14DevicePartial() { return sata001Word76Msbb14DevicePartial; }
        public boolean sata001Word76Msbb13HostPartial() { return sata001Word76Msbb13HostPartial; }
        public boolean sata001Word76Msbb12NativeCmd() { return sata001Word76Msbb12NativeCmd; }
        public boolean sata001Word76Msbb11UnloadWhileNcq() { return sata001Word76Msbb11UnloadWhileNcq; }
        public boolean sata001Word76Msbb10PhyEventCounters() { return sata001Word76Msbb10PhyEventCounters; }
        public boolean sata001Word76Msbb9ReceiptHostInit() { return sata001Word76Msbb9ReceiptHostInit; }
        public boolean sata001Word76Msbb8NativeCmdQueuing() { return sata001Word76Msbb8NativeCmdQueuing; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Sata001Word169 extends KaitaiStruct {
        public static Sata001Word169 fromFile(String fileName) throws IOException {
            return new Sata001Word169(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word169(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word169(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word169(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word169Msbb7To1 = this._io.readBitsIntBe(7);
            this.sata001Word169Msbb0DataSetManagement = this._io.readBitsIntBe(1) != 0;
            this.sata001Word168Msbb15To8 = this._io.readBitsIntBe(8);
        }
        @JsonProperty
        private long sata001Word169Msbb7To1;
        @JsonProperty
        private boolean sata001Word169Msbb0DataSetManagement;
        @JsonProperty
        private long sata001Word168Msbb15To8;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public long sata001Word169Msbb7To1() { return sata001Word169Msbb7To1; }
        public boolean sata001Word169Msbb0DataSetManagement() { return sata001Word169Msbb0DataSetManagement; }
        public long sata001Word168Msbb15To8() { return sata001Word168Msbb15To8; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Sata001Word00 extends KaitaiStruct {
        public static Sata001Word00 fromFile(String fileName) throws IOException {
            return new Sata001Word00(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word00(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word00(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word00(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word00msbb7 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word00msbb6 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word00msbb5 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word00msbb4 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word00msbb3 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word00msbb2 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word00msbb1 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word00msbb0 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word00msbb15 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word00msbb14 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word00msbb13 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word00msbb12 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word00msbb11 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word00msbb10 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word00msbb9 = this._io.readBitsIntBe(1) != 0;
            this.sata001Word00msbb8 = this._io.readBitsIntBe(1) != 0;
        }
        @JsonProperty
        private boolean sata001Word00msbb7;
        @JsonProperty
        private boolean sata001Word00msbb6;
        @JsonProperty
        private boolean sata001Word00msbb5;
        @JsonProperty
        private boolean sata001Word00msbb4;
        @JsonProperty
        private boolean sata001Word00msbb3;
        @JsonProperty
        private boolean sata001Word00msbb2;
        @JsonProperty
        private boolean sata001Word00msbb1;
        @JsonProperty
        private boolean sata001Word00msbb0;
        @JsonProperty
        private boolean sata001Word00msbb15;
        @JsonProperty
        private boolean sata001Word00msbb14;
        @JsonProperty
        private boolean sata001Word00msbb13;
        @JsonProperty
        private boolean sata001Word00msbb12;
        @JsonProperty
        private boolean sata001Word00msbb11;
        @JsonProperty
        private boolean sata001Word00msbb10;
        @JsonProperty
        private boolean sata001Word00msbb9;
        @JsonProperty
        private boolean sata001Word00msbb8;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public boolean sata001Word00msbb7() { return sata001Word00msbb7; }
        public boolean sata001Word00msbb6() { return sata001Word00msbb6; }
        public boolean sata001Word00msbb5() { return sata001Word00msbb5; }
        public boolean sata001Word00msbb4() { return sata001Word00msbb4; }
        public boolean sata001Word00msbb3() { return sata001Word00msbb3; }
        public boolean sata001Word00msbb2() { return sata001Word00msbb2; }
        public boolean sata001Word00msbb1() { return sata001Word00msbb1; }
        public boolean sata001Word00msbb0() { return sata001Word00msbb0; }
        public boolean sata001Word00msbb15() { return sata001Word00msbb15; }
        public boolean sata001Word00msbb14() { return sata001Word00msbb14; }
        public boolean sata001Word00msbb13() { return sata001Word00msbb13; }
        public boolean sata001Word00msbb12() { return sata001Word00msbb12; }
        public boolean sata001Word00msbb11() { return sata001Word00msbb11; }
        public boolean sata001Word00msbb10() { return sata001Word00msbb10; }
        public boolean sata001Word00msbb9() { return sata001Word00msbb9; }
        public boolean sata001Word00msbb8() { return sata001Word00msbb8; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Sata001Word209 extends KaitaiStruct {
        public static Sata001Word209 fromFile(String fileName) throws IOException {
            return new Sata001Word209(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word209(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word209(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word209(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word209Msbb7LogicalSectorOffset = this._io.readBitsIntBe(1) != 0;
            this.sata001Word209Msbb6LogicalSectorOffset = this._io.readBitsIntBe(1) != 0;
            this.sata001Word209Msbb5LogicalSectorOffset = this._io.readBitsIntBe(1) != 0;
            this.sata001Word209Msbb4LogicalSectorOffset = this._io.readBitsIntBe(1) != 0;
            this.sata001Word209Msbb3LogicalSectorOffset = this._io.readBitsIntBe(1) != 0;
            this.sata001Word209Msbb2LogicalSectorOffset = this._io.readBitsIntBe(1) != 0;
            this.sata001Word209Msbb1LogicalSectorOffset = this._io.readBitsIntBe(1) != 0;
            this.sata001Word209Msbb0LogicalSectorOffset = this._io.readBitsIntBe(1) != 0;
            this.sata001Word209Msbb15Cleared = this._io.readBitsIntBe(1) != 0;
            this.sata001Word209Msbb14Set = this._io.readBitsIntBe(1) != 0;
            this.sata001Word209Msbb13LogicalSectorOffset = this._io.readBitsIntBe(1) != 0;
            this.sata001Word209Msbb12LogicalSectorOffset = this._io.readBitsIntBe(1) != 0;
            this.sata001Word209Msbb11LogicalSectorOffset = this._io.readBitsIntBe(1) != 0;
            this.sata001Word209Msbb10LogicalSectorOffset = this._io.readBitsIntBe(1) != 0;
            this.sata001Word209Msbb9LogicalSectorOffset = this._io.readBitsIntBe(1) != 0;
            this.sata001Word209Msbb8LogicalSectorOffset = this._io.readBitsIntBe(1) != 0;
        }
        @JsonProperty
        private boolean sata001Word209Msbb7LogicalSectorOffset;
        @JsonProperty
        private boolean sata001Word209Msbb6LogicalSectorOffset;
        @JsonProperty
        private boolean sata001Word209Msbb5LogicalSectorOffset;
        @JsonProperty
        private boolean sata001Word209Msbb4LogicalSectorOffset;
        @JsonProperty
        private boolean sata001Word209Msbb3LogicalSectorOffset;
        @JsonProperty
        private boolean sata001Word209Msbb2LogicalSectorOffset;
        @JsonProperty
        private boolean sata001Word209Msbb1LogicalSectorOffset;
        @JsonProperty
        private boolean sata001Word209Msbb0LogicalSectorOffset;
        @JsonProperty
        private boolean sata001Word209Msbb15Cleared;
        @JsonProperty
        private boolean sata001Word209Msbb14Set;
        @JsonProperty
        private boolean sata001Word209Msbb13LogicalSectorOffset;
        @JsonProperty
        private boolean sata001Word209Msbb12LogicalSectorOffset;
        @JsonProperty
        private boolean sata001Word209Msbb11LogicalSectorOffset;
        @JsonProperty
        private boolean sata001Word209Msbb10LogicalSectorOffset;
        @JsonProperty
        private boolean sata001Word209Msbb9LogicalSectorOffset;
        @JsonProperty
        private boolean sata001Word209Msbb8LogicalSectorOffset;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public boolean sata001Word209Msbb7LogicalSectorOffset() { return sata001Word209Msbb7LogicalSectorOffset; }
        public boolean sata001Word209Msbb6LogicalSectorOffset() { return sata001Word209Msbb6LogicalSectorOffset; }
        public boolean sata001Word209Msbb5LogicalSectorOffset() { return sata001Word209Msbb5LogicalSectorOffset; }
        public boolean sata001Word209Msbb4LogicalSectorOffset() { return sata001Word209Msbb4LogicalSectorOffset; }
        public boolean sata001Word209Msbb3LogicalSectorOffset() { return sata001Word209Msbb3LogicalSectorOffset; }
        public boolean sata001Word209Msbb2LogicalSectorOffset() { return sata001Word209Msbb2LogicalSectorOffset; }
        public boolean sata001Word209Msbb1LogicalSectorOffset() { return sata001Word209Msbb1LogicalSectorOffset; }
        public boolean sata001Word209Msbb0LogicalSectorOffset() { return sata001Word209Msbb0LogicalSectorOffset; }
        public boolean sata001Word209Msbb15Cleared() { return sata001Word209Msbb15Cleared; }
        public boolean sata001Word209Msbb14Set() { return sata001Word209Msbb14Set; }
        public boolean sata001Word209Msbb13LogicalSectorOffset() { return sata001Word209Msbb13LogicalSectorOffset; }
        public boolean sata001Word209Msbb12LogicalSectorOffset() { return sata001Word209Msbb12LogicalSectorOffset; }
        public boolean sata001Word209Msbb11LogicalSectorOffset() { return sata001Word209Msbb11LogicalSectorOffset; }
        public boolean sata001Word209Msbb10LogicalSectorOffset() { return sata001Word209Msbb10LogicalSectorOffset; }
        public boolean sata001Word209Msbb9LogicalSectorOffset() { return sata001Word209Msbb9LogicalSectorOffset; }
        public boolean sata001Word209Msbb8LogicalSectorOffset() { return sata001Word209Msbb8LogicalSectorOffset; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    public static class Sata001Word79 extends KaitaiStruct {
        public static Sata001Word79 fromFile(String fileName) throws IOException {
            return new Sata001Word79(new ByteBufferKaitaiStream(fileName));
        }

        public Sata001Word79(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sata001Word79(KaitaiStream _io, IdentifyFile _parent) {
            this(_io, _parent, null);
        }

        public Sata001Word79(KaitaiStream _io, IdentifyFile _parent, IdentifyFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sata001Word79Msbb7DeviceAuto = this._io.readBitsIntBe(1) != 0;
            this.sata001Word79Msbb6SoftwareSettings = this._io.readBitsIntBe(1) != 0;
            this.sata001Word79Msbb5HardwareControl = this._io.readBitsIntBe(1) != 0;
            this.sata001Word79Msbb4InOrderData = this._io.readBitsIntBe(1) != 0;
            this.sata001Word79Msbb3DevInterface = this._io.readBitsIntBe(1) != 0;
            this.sata001Word79Msbb2DmaSetup = this._io.readBitsIntBe(1) != 0;
            this.sata001Word79Msbb1NonZeroBuffer = this._io.readBitsIntBe(1) != 0;
            this.sata001Word79Msbb0Cleared = this._io.readBitsIntBe(1) != 0;
            this.sata001Word79Msbb15To12 = this._io.readBitsIntBe(4);
            this.sata001Word79Msbb11RebuildAssist = this._io.readBitsIntBe(1) != 0;
            this.sata001Word79Msbb10PowerDisabled = this._io.readBitsIntBe(1) != 0;
            this.sata001Word79Msbb9HybridInfo = this._io.readBitsIntBe(1) != 0;
            this.sata001Word79Msbb8DeviceSleep = this._io.readBitsIntBe(1) != 0;
        }
        @JsonProperty
        private boolean sata001Word79Msbb7DeviceAuto;
        @JsonProperty
        private boolean sata001Word79Msbb6SoftwareSettings;
        @JsonProperty
        private boolean sata001Word79Msbb5HardwareControl;
        @JsonProperty
        private boolean sata001Word79Msbb4InOrderData;
        @JsonProperty
        private boolean sata001Word79Msbb3DevInterface;
        @JsonProperty
        private boolean sata001Word79Msbb2DmaSetup;
        @JsonProperty
        private boolean sata001Word79Msbb1NonZeroBuffer;
        @JsonProperty
        private boolean sata001Word79Msbb0Cleared;
        @JsonProperty
        private long sata001Word79Msbb15To12;
        @JsonProperty
        private boolean sata001Word79Msbb11RebuildAssist;
        @JsonProperty
        private boolean sata001Word79Msbb10PowerDisabled;
        @JsonProperty
        private boolean sata001Word79Msbb9HybridInfo;
        @JsonProperty
        private boolean sata001Word79Msbb8DeviceSleep;
        private IdentifyFile _root;
        private IdentifyFile _parent;
        public boolean sata001Word79Msbb7DeviceAuto() { return sata001Word79Msbb7DeviceAuto; }
        public boolean sata001Word79Msbb6SoftwareSettings() { return sata001Word79Msbb6SoftwareSettings; }
        public boolean sata001Word79Msbb5HardwareControl() { return sata001Word79Msbb5HardwareControl; }
        public boolean sata001Word79Msbb4InOrderData() { return sata001Word79Msbb4InOrderData; }
        public boolean sata001Word79Msbb3DevInterface() { return sata001Word79Msbb3DevInterface; }
        public boolean sata001Word79Msbb2DmaSetup() { return sata001Word79Msbb2DmaSetup; }
        public boolean sata001Word79Msbb1NonZeroBuffer() { return sata001Word79Msbb1NonZeroBuffer; }
        public boolean sata001Word79Msbb0Cleared() { return sata001Word79Msbb0Cleared; }
        public long sata001Word79Msbb15To12() { return sata001Word79Msbb15To12; }
        public boolean sata001Word79Msbb11RebuildAssist() { return sata001Word79Msbb11RebuildAssist; }
        public boolean sata001Word79Msbb10PowerDisabled() { return sata001Word79Msbb10PowerDisabled; }
        public boolean sata001Word79Msbb9HybridInfo() { return sata001Word79Msbb9HybridInfo; }
        public boolean sata001Word79Msbb8DeviceSleep() { return sata001Word79Msbb8DeviceSleep; }
        public IdentifyFile _root() { return _root; }
        public IdentifyFile _parent() { return _parent; }
    }
    @JsonProperty
    private Sata001Word00 sata001Word00;
    @JsonProperty
    private Obsolete sata001Word01;
    @JsonProperty
    private String sata001Word07CompactFlashTM;
    @JsonProperty
    private String sata001Word09Retired;
    @JsonProperty
    private StrRv sata001Word10SerialNumber;
    @JsonProperty
    private String sata001Word20Retired;
    @JsonProperty
    private StrRv8 sata001Word23FirmwareRevision;
    @JsonProperty
    private StrRv40 sata001Word27ModelNumber;
    @JsonProperty
    private String sata001Word47;
    @JsonProperty
    private Sata001Word48 sata001Word48;
    @JsonProperty
    private Sata001Word49 sata001Word49;
    @JsonProperty
    private Sata001Word50 sata001Word50;
    @JsonProperty
    private String sata001Word51;
    @JsonProperty
    private String sata001Word53;
    @JsonProperty
    private String sata001Word54;
    @JsonProperty
    private Sata001Word59 sata001Word59;
    @JsonProperty
    private String sata001Word60;
    @JsonProperty
    private String sata001Word62;
    @JsonProperty
    private String sata001Word63;
    @JsonProperty
    private String sata001Word64;
    @JsonProperty
    private String sata001Word65;
    @JsonProperty
    private String sata001Word66;
    @JsonProperty
    private String sata001Word67;
    @JsonProperty
    private String sata001Word68;
    @JsonProperty
    private Sata001Word69 sata001Word69;
    @JsonProperty
    private String sata001Word70;
    @JsonProperty
    private String sata001Word71;
    @JsonProperty
    private Sata001Word75 sata001Word75;
    @JsonProperty
    private Sata001Word76 sata001Word76;
    @JsonProperty
    private Sata001Word77 sata001Word77;
    @JsonProperty
    private Sata001Word78 sata001Word78;
    @JsonProperty
    private Sata001Word79 sata001Word79;
    @JsonProperty
    private Sata001Word80 sata001Word80;
    @JsonProperty
    private short sata001Word81;
    @JsonProperty
    private Sata001Word82 sata001Word82;
    @JsonProperty
    private Sata001Word83 sata001Word83;
    @JsonProperty
    private Sata001Word84 sata001Word84;
    @JsonProperty
    private Sata001Word85 sata001Word85;
    @JsonProperty
    private Sata001Word86 sata001Word86;
    @JsonProperty
    private Sata001Word87 sata001Word87;
    @JsonProperty
    private long sata001Word88;
    @JsonProperty
    private Sata001Word89 sata001Word89;
    @JsonProperty
    private Sata001Word90 sata001Word90;
    @JsonProperty
    private Sata001Word91 sata001Word91;
    @JsonProperty
    private int sata001Word92;
    @JsonProperty
    private short sata001Word93;
    @JsonProperty
    private short sata001Word94;
    @JsonProperty
    private short sata001Word95;
    @JsonProperty
    private short sata001Word96;
    @JsonProperty
    private short sata001Word97;
    @JsonProperty
    private short sata001Word98;
    @JsonProperty
    private long sata001Word100LogicalSectors;
    @JsonProperty
    private String sata001Word104;
    @JsonProperty
    private long sata001Word105DataSetManagement;
    @JsonProperty
    private Sata001Word106 sata001Word106;
    @JsonProperty
    private String sata001Word107;
    @JsonProperty
    private int sata001Word108;
    @JsonProperty
    private String sata001Word108Naa;
    @JsonProperty
    private String sata001Word108VendorId;
    @JsonProperty
    private String sata001Word108DeviceUniqueId;
    @JsonProperty
    private int sata001Word109;
    @JsonProperty
    private int sata001Word110;
    @JsonProperty
    private int sata001Word111;
    @JsonProperty
    private String sata001Word112;
    @JsonProperty
    private short sata001Word116;
    @JsonProperty
    private short sata001Word117;
    @JsonProperty
    private Sata001Word119 sata001Word119;
    @JsonProperty
    private Sata001Word120 sata001Word120;
    @JsonProperty
    private String sata001Word121;
    @JsonProperty
    private int sata001Word127;
    @JsonProperty
    private Sata001Word128 sata001Word128;
    @JsonProperty
    private String sata001Word129;
    @JsonProperty
    private int sata001Word160;
    @JsonProperty
    private String sata001Word161;
    @JsonProperty
    private Sata001Word168 sata001Word168;
    @JsonProperty
    private Sata001Word169 sata001Word169;
    @JsonProperty
    private long sata001Word170;
    @JsonProperty
    private int sata001Word174;
    @JsonProperty
    private String sata001Word176;
    @JsonProperty
    private Sata001Word206 sata001Word206;
    @JsonProperty
    private String sata001Word207;
    @JsonProperty
    private Sata001Word209 sata001Word209;
    @JsonProperty
    private String sata001Word210;
    @JsonProperty
    private String sata001Word212;
    @JsonProperty
    private Sata001Word214 sata001Word214;
    @JsonProperty
    private int sata001Word215;
    @JsonProperty
    private int sata001Word216;
    @JsonProperty
    private int sata001Word217;
    @JsonProperty
    private int sata001Word218;
    @JsonProperty
    private Sata001Word219 sata001Word219;
    @JsonProperty
    private int sata001Word220;
    @JsonProperty
    private int sata001Word221;
    @JsonProperty
    private Sata001Word222 sata001Word222;
    @JsonProperty
    private int sata001Word223;
    @JsonProperty
    private long sata001Word224;
    @JsonProperty
    private long sata001Word230;
    @JsonProperty
    private int sata001Word234;
    @JsonProperty
    private int sata001Word235;
    @JsonProperty
    private String sata001Word236;
    @JsonProperty
    private int sata001Word255;
    private IdentifyFile _root;
    private KaitaiStruct _parent;
    public Sata001Word00 sata001Word00() { return sata001Word00; }
    public Obsolete sata001Word01() { return sata001Word01; }
    public String sata001Word07CompactFlashTM() { return sata001Word07CompactFlashTM; }
    public String sata001Word09Retired() { return sata001Word09Retired; }
    public StrRv sata001Word10SerialNumber() { return sata001Word10SerialNumber; }
    public String sata001Word20Retired() { return sata001Word20Retired; }
    public StrRv8 sata001Word23FirmwareRevision() { return sata001Word23FirmwareRevision; }
    public StrRv40 sata001Word27ModelNumber() { return sata001Word27ModelNumber; }
    public String sata001Word47() { return sata001Word47; }
    public Sata001Word48 sata001Word48() { return sata001Word48; }
    public Sata001Word49 sata001Word49() { return sata001Word49; }
    public Sata001Word50 sata001Word50() { return sata001Word50; }
    public String sata001Word51() { return sata001Word51; }
    public String sata001Word53() { return sata001Word53; }
    public String sata001Word54() { return sata001Word54; }
    public Sata001Word59 sata001Word59() { return sata001Word59; }
    public String sata001Word60() { return sata001Word60; }
    public String sata001Word62() { return sata001Word62; }
    public String sata001Word63() { return sata001Word63; }
    public String sata001Word64() { return sata001Word64; }
    public String sata001Word65() { return sata001Word65; }
    public String sata001Word66() { return sata001Word66; }
    public String sata001Word67() { return sata001Word67; }
    public String sata001Word68() { return sata001Word68; }
    public Sata001Word69 sata001Word69() { return sata001Word69; }
    public String sata001Word70() { return sata001Word70; }
    public String sata001Word71() { return sata001Word71; }
    public Sata001Word75 sata001Word75() { return sata001Word75; }
    public Sata001Word76 sata001Word76() { return sata001Word76; }
    public Sata001Word77 sata001Word77() { return sata001Word77; }
    public Sata001Word78 sata001Word78() { return sata001Word78; }
    public Sata001Word79 sata001Word79() { return sata001Word79; }
    public Sata001Word80 sata001Word80() { return sata001Word80; }
    public short sata001Word81() { return sata001Word81; }
    public Sata001Word82 sata001Word82() { return sata001Word82; }
    public Sata001Word83 sata001Word83() { return sata001Word83; }
    public Sata001Word84 sata001Word84() { return sata001Word84; }
    public Sata001Word85 sata001Word85() { return sata001Word85; }
    public Sata001Word86 sata001Word86() { return sata001Word86; }
    public Sata001Word87 sata001Word87() { return sata001Word87; }
    public long sata001Word88() { return sata001Word88; }
    public Sata001Word89 sata001Word89() { return sata001Word89; }
    public Sata001Word90 sata001Word90() { return sata001Word90; }
    public Sata001Word91 sata001Word91() { return sata001Word91; }
    public int sata001Word92() { return sata001Word92; }
    public short sata001Word93() { return sata001Word93; }
    public short sata001Word94() { return sata001Word94; }
    public short sata001Word95() { return sata001Word95; }
    public short sata001Word96() { return sata001Word96; }
    public short sata001Word97() { return sata001Word97; }
    public short sata001Word98() { return sata001Word98; }
    public long sata001Word100LogicalSectors() { return sata001Word100LogicalSectors; }
    public String sata001Word104() { return sata001Word104; }
    public long sata001Word105DataSetManagement() { return sata001Word105DataSetManagement; }
    public Sata001Word106 sata001Word106() { return sata001Word106; }
    public String sata001Word107() { return sata001Word107; }
    public int sata001Word108() { return sata001Word108; }
    public int sata001Word109() { return sata001Word109; }
    public int sata001Word110() { return sata001Word110; }
    public int sata001Word111() { return sata001Word111; }
    public String sata001Word112() { return sata001Word112; }
    public short sata001Word116() { return sata001Word116; }
    public short sata001Word117() { return sata001Word117; }
    public Sata001Word119 sata001Word119() { return sata001Word119; }
    public Sata001Word120 sata001Word120() { return sata001Word120; }
    public String sata001Word121() { return sata001Word121; }
    public int sata001Word127() { return sata001Word127; }
    public Sata001Word128 sata001Word128() { return sata001Word128; }
    public String sata001Word129() { return sata001Word129; }
    public int sata001Word160() { return sata001Word160; }
    public String sata001Word161() { return sata001Word161; }
    public Sata001Word168 sata001Word168() { return sata001Word168; }
    public Sata001Word169 sata001Word169() { return sata001Word169; }
    public long sata001Word170() { return sata001Word170; }
    public int sata001Word174() { return sata001Word174; }
    public String sata001Word176() { return sata001Word176; }
    public Sata001Word206 sata001Word206() { return sata001Word206; }
    public String sata001Word207() { return sata001Word207; }
    public Sata001Word209 sata001Word209() { return sata001Word209; }
    public String sata001Word210() { return sata001Word210; }
    public String sata001Word212() { return sata001Word212; }
    public Sata001Word214 sata001Word214() { return sata001Word214; }
    public int sata001Word215() { return sata001Word215; }
    public int sata001Word216() { return sata001Word216; }
    public int sata001Word217() { return sata001Word217; }
    public int sata001Word218() { return sata001Word218; }
    public Sata001Word219 sata001Word219() { return sata001Word219; }
    public int sata001Word220() { return sata001Word220; }
    public int sata001Word221() { return sata001Word221; }
    public Sata001Word222 sata001Word222() { return sata001Word222; }
    public int sata001Word223() { return sata001Word223; }
    public long sata001Word224() { return sata001Word224; }
    public long sata001Word230() { return sata001Word230; }
    public int sata001Word234() { return sata001Word234; }
    public int sata001Word235() { return sata001Word235; }
    public String sata001Word236() { return sata001Word236; }
    public int sata001Word255() { return sata001Word255; }
    public IdentifyFile _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
