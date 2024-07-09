package com.da;// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

import com.fasterxml.jackson.annotation.JsonProperty;
import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class NVMEIdController extends KaitaiStruct {
    public static NVMEIdController fromFile(String fileName) throws IOException {
        return new NVMEIdController(new ByteBufferKaitaiStream(fileName));
    }

    public NVMEIdController(KaitaiStream _io) {
        this(_io, null, null);
    }

    public NVMEIdController(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public NVMEIdController(KaitaiStream _io, KaitaiStruct _parent, NVMEIdController _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.nvme101PciVendorId = this._io.readU2le();
        this.nvme101PciSubsystemVendorId = this._io.readU2le();
        this.nvme101SerialNumber = new String(this._io.readBytes(20), Charset.forName("ASCII"));
        this.nvme101ModelNumber = new String(this._io.readBytes(40), Charset.forName("ASCII"));
        this.nvme101FirmwareRevision = new String(this._io.readBytes(8), Charset.forName("ASCII"));
        this.nvme101RecomArbitrationBurst = this._io.readU1();
        byte[] ieee = new byte[3];
        ieee = this._io.readBytes(3);
        String ieeeValue = String.format("%02x", ieee[2]) + String.format("%02x", ieee[1]) + String.format("%02x", ieee[0]);
        this.nvme101IeeeOuiIdentifier = ieeeValue;
        this.nvme101CmiCapabilities = new Nvme101CmiCapabilities(this._io, this, _root);
        this.nvme101MaxDataTransferSize = this._io.readU1();
        this.nvme101ControllerId = this._io.readU2le();
        this.nvme101Version = this._io.readU4le();
        this.nvme101ResumeLatency = this._io.readU4le();
        this.nvme101EntryLatency = this._io.readU4le();
        this.nvme101AsynchronousEventsSupported = new Nvme101AsynchronousEventsSupported(this._io, this, _root);
        this.nvme101ControllerAttributes = new Nvme101ControllerAttributes(this._io, this, _root);
        this.nvme101ReservedBytes100To111 = new String(this._io.readBytes(12), Charset.forName("ASCII"));
        this.nvme101FGUId = new String(this._io.readBytes(16), Charset.forName("ASCII"));
        this.nvme101ReservedBytes128To239 = new String(this._io.readBytes(112), Charset.forName("ASCII"));
        this.nvme101Bytes240To255 = new String(this._io.readBytes(16), Charset.forName("ASCII"));
        this.nvme101AdminCommandSupport = new Nvme101AdminCommandSupport(this._io, this, _root);
        this.nvme101AbortCommandLimit = this._io.readU1();
        this.nvme101AERL = this._io.readU1();
        this.nvme101FirmwareUpdates = new Nvme101FirmwareUpdates(this._io, this, _root);
        this.nvme101LogPageAttributes = new Nvme101LogPageAttributes(this._io, this, _root);
        this.nvme101ErrorLogPageEntries = this._io.readU1();
        this.nvme101NumberOfPowerStates = this._io.readU1();
        this.nvme101AdminCommandConfig = new Nvme101AdminCommandConfig(this._io, this, _root);
        this.nvme101PowerStateTransition = new Nvme101PowerStateTransition(this._io, this, _root);
        this.nvme101WarningTempThreshold = this._io.readU2le();
        this.nvme101CriticalTempThreshold = this._io.readU2le();
        this.nvme101MaxTimeForFirmwareActivation = this._io.readU2le();
        this.nvme101HostMemoryBufferPreferred = this._io.readU4le();
        this.nvme101HostMemoryBufferMinimum = this._io.readU4le();
        this.nvme101TotalNvmCapacity = new String(this._io.readBytes(16), Charset.forName("UTF-8"));
        this.nvme101UnallocatesNvmCapacity = new String(this._io.readBytes(16), Charset.forName("UTF-8"));
        this.nvme101ReplayProtectedMemory = new Nvme101ReplayProtectedMemory(this._io, this, _root);
        this.nvme101ExtendedDeviceSelfTestTime = this._io.readU2le();
        this.nvme101DeviceSelfTestOptions = new Nvme101DeviceSelfTestOptions(this._io, this, _root);
        this.nvme101FirmwareUpdateGranurality = this._io.readU1();
        this.nvme101KeepAlivaeSupport = this._io.readU2le();
        this.nvme101HostControlledAttributes = new Nvme101HostControlledAttributes(this._io, this, _root);
        this.nvme101MinThermalMgmtTemp = this._io.readU2le();
        this.nvme101MaxThermalMgmtTemp = this._io.readU2le();
        this.nvme101SanitizeCapabilities = new Nvme101SanitizeCapabilities(this._io, this, _root);
        this.nvme101ReservedBytes332To511 = new String(this._io.readBytes(180), Charset.forName("ASCII"));
        this.nvme101SubmissionQueryEntrySize = new Nvme101SubmissionQueryEntrySize(this._io, this, _root);
        this.nvme101CompletionQueryEntrySize = new Nvme101CompletionQueryEntrySize(this._io, this, _root);
        this.nvme101MaximumOutstandingCommands = this._io.readU2le();
        this.nvme101NumberOfNamespaces = this._io.readU4le();
        this.nvme101OptionalNvmCommand = new Nvme101OptionalNvmCommand(this._io, this, _root);
        this.nvme101FusedOperationSupport = new Nvme101FusedOperationSupport(this._io, this, _root);
        this.nvme101FormatNvmAttributes = new Nvme101FormatNvmAttributes(this._io, this, _root);
        this.nvme101VolatileWriteCache = new Nvme101VolatileWriteCache(this._io, this, _root);
        this.nvme101AtomicWriteUnitNormal = this._io.readU2le();
        this.nvme101AtomicWriteUnitPowerFail = this._io.readU2le();
        this.nvme101NvmVendorSpecificCommandConfig = new Nvme101NvmVendorSpecificCommandConfig(this._io, this, _root);
        this.nvme101ReservedByte531 = this._io.readU1();
        this.nvme101AtomicCompare0WriteUnit = this._io.readU2le();
        this.nvme101ReservedBytes534To535 = this._io.readU2le();
        this.nvme101SGLSupport = new Nvme101SGLSupport(this._io, this, _root);
        this.nvme101ReservedBytes540To767 = new String(this._io.readBytes(228), Charset.forName("ASCII"));
        this.nvme101NvmSubsystemNvmeQualifiedName = new String(this._io.readBytes(256), Charset.forName("ASCII"));
        this.nvme101ReservedBytes1024To1791 = new String(this._io.readBytes(768), Charset.forName("ASCII"));
        this.nvme101FabricSpecification = new String(this._io.readBytes(256), Charset.forName("ASCII"));
        this.nvme101PowerStateDescriptor = new ArrayList<Nvme101PowerStateDescriptor>();
        for (int i = 0; i < 32; i++) {
            this.nvme101PowerStateDescriptor.add(new Nvme101PowerStateDescriptor(this._io, this, _root));
        }
        this.nvme101VendorSpecific = new String(this._io.readBytes(1024), Charset.forName("ASCII"));
    }
    public static class Nvme101Offset16To19 extends KaitaiStruct {
        public static Nvme101Offset16To19 fromFile(String fileName) throws IOException {
            return new Nvme101Offset16To19(new ByteBufferKaitaiStream(fileName));
        }

        public Nvme101Offset16To19(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Nvme101Offset16To19(KaitaiStream _io, NVMEIdController.Nvme101PowerStateDescriptor _parent) {
            this(_io, _parent, null);
        }

        public Nvme101Offset16To19(KaitaiStream _io, NVMEIdController.Nvme101PowerStateDescriptor _parent, NVMEIdController _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nvme101Idlp = this._io.readU2le();
            this.nvme101Res1 = this._io.readU1();
            this.nvme101Res2 = this._io.readBitsIntBe(2);
            this.nvme101Ips = this._io.readBitsIntBe(2);
            this.nvme101Res3 = this._io.readBitsIntBe(4);
        }
        @JsonProperty
        private int nvme101Idlp;
        @JsonProperty
        private int nvme101Res1;
        @JsonProperty
        private long nvme101Res2;
        @JsonProperty
        private long nvme101Ips;
        @JsonProperty
        private long nvme101Res3;
        private NVMEIdController _root;
        private NVMEIdController.Nvme101PowerStateDescriptor _parent;
        public int nvme101Idlp() { return nvme101Idlp; }
        public int nvme101Res1() { return nvme101Res1; }
        public long nvme101Res2() { return nvme101Res2; }
        public long nvme101Ips() { return nvme101Ips; }
        public long nvme101Res3() { return nvme101Res3; }
        public NVMEIdController _root() { return _root; }
        public NVMEIdController.Nvme101PowerStateDescriptor _parent() { return _parent; }
    }
    public static class Nvme101PowerStateDescriptor extends KaitaiStruct {
        public static Nvme101PowerStateDescriptor fromFile(String fileName) throws IOException {
            return new Nvme101PowerStateDescriptor(new ByteBufferKaitaiStream(fileName));
        }

        public Nvme101PowerStateDescriptor(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Nvme101PowerStateDescriptor(KaitaiStream _io, NVMEIdController _parent) {
            this(_io, _parent, null);
        }

        public Nvme101PowerStateDescriptor(KaitaiStream _io, NVMEIdController _parent, NVMEIdController _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nvme101Offset00To03 = new Nvme101Offset00To03(this._io, this, _root);
            this.nvme101Enlat = this._io.readU4le();
            this.nvme101Exlat = this._io.readU4le();
            this.nvme101Offset12To15 = new Nvme101Offset12To15(this._io, this, _root);
            this.nvme101Offset16To19 = new Nvme101Offset16To19(this._io, this, _root);
            this.nvme101Offset20To23 = new Nvme101Offset20To23(this._io, this, _root);
            this.nvme101Reserved = this._io.readU8be();
        }
        @JsonProperty
        private Nvme101Offset00To03 nvme101Offset00To03;
        @JsonProperty
        private long nvme101Enlat;
        @JsonProperty
        private long nvme101Exlat;
        @JsonProperty
        private Nvme101Offset12To15 nvme101Offset12To15;
        @JsonProperty
        private Nvme101Offset16To19 nvme101Offset16To19;
        @JsonProperty
        private Nvme101Offset20To23 nvme101Offset20To23;
        private long nvme101Reserved;
        private NVMEIdController _root;
        private NVMEIdController _parent;
        public Nvme101Offset00To03 nvme101Offset00To03() { return nvme101Offset00To03; }
        public long nvme101Enlat() { return nvme101Enlat; }
        public long nvme101Exlat() { return nvme101Exlat; }
        public Nvme101Offset12To15 nvme101Offset12To15() { return nvme101Offset12To15; }
        public Nvme101Offset16To19 nvme101Offset16To19() { return nvme101Offset16To19; }
        public Nvme101Offset20To23 nvme101Offset20To23() { return nvme101Offset20To23; }
        public long nvme101Reserved() { return nvme101Reserved; }
        public NVMEIdController _root() { return _root; }
        public NVMEIdController _parent() { return _parent; }
    }
    public static class Nvme101CmiCapabilities extends KaitaiStruct {
        public static Nvme101CmiCapabilities fromFile(String fileName) throws IOException {
            return new Nvme101CmiCapabilities(new ByteBufferKaitaiStream(fileName));
        }

        public Nvme101CmiCapabilities(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Nvme101CmiCapabilities(KaitaiStream _io, NVMEIdController _parent) {
            this(_io, _parent, null);
        }

        public Nvme101CmiCapabilities(KaitaiStream _io, NVMEIdController _parent, NVMEIdController _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nvme101Msbb7To3 = this._io.readBitsIntBe(5);
            this.nvme101Msbb2Associated = this._io.readBitsIntBe(1) != 0;
            this.nvme101Msbb1ContainControllers = this._io.readBitsIntBe(1) != 0;
            this.nvme101Msbb0ContainPciExpressPorts = this._io.readBitsIntBe(1) != 0;
        }
        private long nvme101Msbb7To3;
        @JsonProperty
        private boolean nvme101Msbb2Associated;
        @JsonProperty
        private boolean nvme101Msbb1ContainControllers;
        @JsonProperty
        private boolean nvme101Msbb0ContainPciExpressPorts;
        private NVMEIdController _root;
        private NVMEIdController _parent;
        public long nvme101Msbb7To3() { return nvme101Msbb7To3; }
        public boolean nvme101Msbb2Associated() { return nvme101Msbb2Associated; }
        public boolean nvme101Msbb1ContainControllers() { return nvme101Msbb1ContainControllers; }
        public boolean nvme101Msbb0ContainPciExpressPorts() { return nvme101Msbb0ContainPciExpressPorts; }
        public NVMEIdController _root() { return _root; }
        public NVMEIdController _parent() { return _parent; }
    }
    public static class Nvme101PowerStateTransition extends KaitaiStruct {
        public static Nvme101PowerStateTransition fromFile(String fileName) throws IOException {
            return new Nvme101PowerStateTransition(new ByteBufferKaitaiStream(fileName));
        }

        public Nvme101PowerStateTransition(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Nvme101PowerStateTransition(KaitaiStream _io, NVMEIdController _parent) {
            this(_io, _parent, null);
        }

        public Nvme101PowerStateTransition(KaitaiStream _io, NVMEIdController _parent, NVMEIdController _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nvme101Reserved = this._io.readBitsIntBe(7);
            this.nvme101SupportsPowerStateTransition = this._io.readBitsIntBe(1) != 0;
        }
        private long nvme101Reserved;
        @JsonProperty
        private boolean nvme101SupportsPowerStateTransition;
        private NVMEIdController _root;
        private NVMEIdController _parent;
        public long nvme101Reserved() { return nvme101Reserved; }
        public boolean nvme101SupportsPowerStateTransition() { return nvme101SupportsPowerStateTransition; }
        public NVMEIdController _root() { return _root; }
        public NVMEIdController _parent() { return _parent; }
    }
    public static class Nvme101Offset20To23 extends KaitaiStruct {
        public static Nvme101Offset20To23 fromFile(String fileName) throws IOException {
            return new Nvme101Offset20To23(new ByteBufferKaitaiStream(fileName));
        }

        public Nvme101Offset20To23(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Nvme101Offset20To23(KaitaiStream _io, NVMEIdController.Nvme101PowerStateDescriptor _parent) {
            this(_io, _parent, null);
        }

        public Nvme101Offset20To23(KaitaiStream _io, NVMEIdController.Nvme101PowerStateDescriptor _parent, NVMEIdController _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nvme101Acpt = this._io.readU2le();
            this.nvme101Apw = this._io.readBitsIntBe(3);
            this.nvme101Res1 = this._io.readBitsIntBe(3);
            this.nvme101Aps = this._io.readBitsIntBe(2);
            this._io.alignToByte();
            this.nvme101Res2 = this._io.readU1();
        }
        @JsonProperty
        private int nvme101Acpt;
        @JsonProperty
        private long nvme101Apw;
        @JsonProperty
        private long nvme101Res1;
        @JsonProperty
        private long nvme101Aps;
        @JsonProperty
        private int nvme101Res2;
        private NVMEIdController _root;
        private NVMEIdController.Nvme101PowerStateDescriptor _parent;
        public int nvme101Acpt() { return nvme101Acpt; }
        public long nvme101Apw() { return nvme101Apw; }
        public long nvme101Res1() { return nvme101Res1; }
        public long nvme101Aps() { return nvme101Aps; }
        public int nvme101Res2() { return nvme101Res2; }
        public NVMEIdController _root() { return _root; }
        public NVMEIdController.Nvme101PowerStateDescriptor _parent() { return _parent; }
    }
    public static class Nvme101CompletionQueryEntrySize extends KaitaiStruct {
        public static Nvme101CompletionQueryEntrySize fromFile(String fileName) throws IOException {
            return new Nvme101CompletionQueryEntrySize(new ByteBufferKaitaiStream(fileName));
        }

        public Nvme101CompletionQueryEntrySize(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Nvme101CompletionQueryEntrySize(KaitaiStream _io, NVMEIdController _parent) {
            this(_io, _parent, null);
        }

        public Nvme101CompletionQueryEntrySize(KaitaiStream _io, NVMEIdController _parent, NVMEIdController _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nvme101RequiredSize = this._io.readBitsIntBe(4);
            this.nvme101MaxSize = this._io.readBitsIntBe(4);
        }
        @JsonProperty
        private long nvme101RequiredSize;
        @JsonProperty
        private long nvme101MaxSize;
        private NVMEIdController _root;
        private NVMEIdController _parent;
        public long nvme101RequiredSize() { return nvme101RequiredSize; }
        public long nvme101MaxSize() { return nvme101MaxSize; }
        public NVMEIdController _root() { return _root; }
        public NVMEIdController _parent() { return _parent; }
    }
    public static class Nvme101SubmissionQueryEntrySize extends KaitaiStruct {
        public static Nvme101SubmissionQueryEntrySize fromFile(String fileName) throws IOException {
            return new Nvme101SubmissionQueryEntrySize(new ByteBufferKaitaiStream(fileName));
        }

        public Nvme101SubmissionQueryEntrySize(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Nvme101SubmissionQueryEntrySize(KaitaiStream _io, NVMEIdController _parent) {
            this(_io, _parent, null);
        }

        public Nvme101SubmissionQueryEntrySize(KaitaiStream _io, NVMEIdController _parent, NVMEIdController _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nvme101RequiredSize = this._io.readBitsIntBe(4);
            this.nvme101MaxSize = this._io.readBitsIntBe(4);
        }
        @JsonProperty
        private long nvme101RequiredSize;
        @JsonProperty
        private long nvme101MaxSize;
        private NVMEIdController _root;
        private NVMEIdController _parent;
        public long nvme101RequiredSize() { return nvme101RequiredSize; }
        public long nvme101MaxSize() { return nvme101MaxSize; }
        public NVMEIdController _root() { return _root; }
        public NVMEIdController _parent() { return _parent; }
    }
    public static class Nvme101Offset12To15 extends KaitaiStruct {
        public static Nvme101Offset12To15 fromFile(String fileName) throws IOException {
            return new Nvme101Offset12To15(new ByteBufferKaitaiStream(fileName));
        }

        public Nvme101Offset12To15(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Nvme101Offset12To15(KaitaiStream _io, NVMEIdController.Nvme101PowerStateDescriptor _parent) {
            this(_io, _parent, null);
        }

        public Nvme101Offset12To15(KaitaiStream _io, NVMEIdController.Nvme101PowerStateDescriptor _parent, NVMEIdController _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nvme101Rrt = this._io.readU1();
            this.nvme101Rrl = this._io.readU1();
            this.nvme101Rwt = this._io.readU1();
            this.nvme101Rwl = this._io.readU1();
        }
        @JsonProperty
        private int nvme101Rrt;
        @JsonProperty
        private int nvme101Rrl;
        @JsonProperty
        private int nvme101Rwt;
        @JsonProperty
        private int nvme101Rwl;
        private NVMEIdController _root;
        private NVMEIdController.Nvme101PowerStateDescriptor _parent;
        public int nvme101Rrt() { return nvme101Rrt; }
        public int nvme101Rrl() { return nvme101Rrl; }
        public int nvme101Rwt() { return nvme101Rwt; }
        public int nvme101Rwl() { return nvme101Rwl; }
        public NVMEIdController _root() { return _root; }
        public NVMEIdController.Nvme101PowerStateDescriptor _parent() { return _parent; }
    }
    public static class Nvme101DeviceSelfTestOptions extends KaitaiStruct {
        public static Nvme101DeviceSelfTestOptions fromFile(String fileName) throws IOException {
            return new Nvme101DeviceSelfTestOptions(new ByteBufferKaitaiStream(fileName));
        }

        public Nvme101DeviceSelfTestOptions(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Nvme101DeviceSelfTestOptions(KaitaiStream _io, NVMEIdController _parent) {
            this(_io, _parent, null);
        }

        public Nvme101DeviceSelfTestOptions(KaitaiStream _io, NVMEIdController _parent, NVMEIdController _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nvme101TestOperations = this._io.readBitsIntBe(1) != 0;
            this.nvme101Reserved = this._io.readBitsIntBe(7);
        }
        @JsonProperty
        private boolean nvme101TestOperations;
        private long nvme101Reserved;
        private NVMEIdController _root;
        private NVMEIdController _parent;
        public boolean nvme101TestOperations() { return nvme101TestOperations; }
        public long nvme101Reserved() { return nvme101Reserved; }
        public NVMEIdController _root() { return _root; }
        public NVMEIdController _parent() { return _parent; }
    }
    public static class Nvme101SGLSupport extends KaitaiStruct {
        public static Nvme101SGLSupport fromFile(String fileName) throws IOException {
            return new Nvme101SGLSupport(new ByteBufferKaitaiStream(fileName));
        }

        public Nvme101SGLSupport(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Nvme101SGLSupport(KaitaiStream _io, NVMEIdController _parent) {
            this(_io, _parent, null);
        }

        public Nvme101SGLSupport(KaitaiStream _io, NVMEIdController _parent, NVMEIdController _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nvme101ReservedMsbb31To24 = this._io.readBitsIntBe(8);
            this.nvme101ReservedMsbb23To21 = this._io.readBitsIntBe(3);
            this.nvme101IsAddressFieldSpecifyOffset = this._io.readBitsIntBe(1) != 0;
            this.nvme101IsQwordAlignedSupported = this._io.readBitsIntBe(1) != 0;
            this.nvme101IsSglLengthEquals = this._io.readBitsIntBe(1) != 0;
            this.nvme101IsPhysicalBufferSupported = this._io.readBitsIntBe(1) != 0;
            this.nvme101IsSglBitBucketDescriptorSupported = this._io.readBitsIntBe(1) != 0;
            this.nvme101ReservedMsbb15To3 = this._io.readBitsIntBe(13);
            this.nvme101IsKeyedSglDataBlock = this._io.readBitsIntBe(1) != 0;
            this.nvme101IsSglSupported = this._io.readBitsIntBe(2);
        }
        private long nvme101ReservedMsbb31To24;
        private long nvme101ReservedMsbb23To21;
        @JsonProperty
        private boolean nvme101IsAddressFieldSpecifyOffset;
        @JsonProperty
        private boolean nvme101IsQwordAlignedSupported;
        @JsonProperty
        private boolean nvme101IsSglLengthEquals;
        @JsonProperty
        private boolean nvme101IsPhysicalBufferSupported;
        @JsonProperty
        private boolean nvme101IsSglBitBucketDescriptorSupported;
        private long nvme101ReservedMsbb15To3;
        @JsonProperty
        private boolean nvme101IsKeyedSglDataBlock;
        @JsonProperty
        private long nvme101IsSglSupported;
        private NVMEIdController _root;
        private NVMEIdController _parent;
        public long nvme101ReservedMsbb31To24() { return nvme101ReservedMsbb31To24; }
        public long nvme101ReservedMsbb23To21() { return nvme101ReservedMsbb23To21; }
        public boolean nvme101IsAddressFieldSpecifyOffset() { return nvme101IsAddressFieldSpecifyOffset; }
        public boolean nvme101IsQwordAlignedSupported() { return nvme101IsQwordAlignedSupported; }
        public boolean nvme101IsSglLengthEquals() { return nvme101IsSglLengthEquals; }
        public boolean nvme101IsPhysicalBufferSupported() { return nvme101IsPhysicalBufferSupported; }
        public boolean nvme101IsSglBitBucketDescriptorSupported() { return nvme101IsSglBitBucketDescriptorSupported; }
        public long nvme101ReservedMsbb15To3() { return nvme101ReservedMsbb15To3; }
        public boolean nvme101IsKeyedSglDataBlock() { return nvme101IsKeyedSglDataBlock; }
        public long nvme101IsSglSupported() { return nvme101IsSglSupported; }
        public NVMEIdController _root() { return _root; }
        public NVMEIdController _parent() { return _parent; }
    }
    public static class Nvme101FormatNvmAttributes extends KaitaiStruct {
        public static Nvme101FormatNvmAttributes fromFile(String fileName) throws IOException {
            return new Nvme101FormatNvmAttributes(new ByteBufferKaitaiStream(fileName));
        }

        public Nvme101FormatNvmAttributes(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Nvme101FormatNvmAttributes(KaitaiStream _io, NVMEIdController _parent) {
            this(_io, _parent, null);
        }

        public Nvme101FormatNvmAttributes(KaitaiStream _io, NVMEIdController _parent, NVMEIdController _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nvme101Msbb7To4Reserved = this._io.readBitsIntBe(4);
            this.nvme101Msbb3Reserved = this._io.readBitsIntBe(1) != 0;
            this.nvme101SupportsCryptographicErase = this._io.readBitsIntBe(1) != 0;
            this.nvme101SupportsCryptoErasePerNamespace = this._io.readBitsIntBe(1) != 0;
            this.nvme101SupportsFormatPerNamespace = this._io.readBitsIntBe(1) != 0;
        }
        private long nvme101Msbb7To4Reserved;
        private boolean nvme101Msbb3Reserved;
        @JsonProperty
        private boolean nvme101SupportsCryptographicErase;
        @JsonProperty
        private boolean nvme101SupportsCryptoErasePerNamespace;
        @JsonProperty
        private boolean nvme101SupportsFormatPerNamespace;
        private NVMEIdController _root;
        private NVMEIdController _parent;
        public long nvme101Msbb7To4Reserved() { return nvme101Msbb7To4Reserved; }
        public boolean nvme101Msbb3Reserved() { return nvme101Msbb3Reserved; }
        public boolean nvme101SupportsCryptographicErase() { return nvme101SupportsCryptographicErase; }
        public boolean nvme101SupportsCryptoErasePerNamespace() { return nvme101SupportsCryptoErasePerNamespace; }
        public boolean nvme101SupportsFormatPerNamespace() { return nvme101SupportsFormatPerNamespace; }
        public NVMEIdController _root() { return _root; }
        public NVMEIdController _parent() { return _parent; }
    }
    public static class Nvme101LogPageAttributes extends KaitaiStruct {
        public static Nvme101LogPageAttributes fromFile(String fileName) throws IOException {
            return new Nvme101LogPageAttributes(new ByteBufferKaitaiStream(fileName));
        }

        public Nvme101LogPageAttributes(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Nvme101LogPageAttributes(KaitaiStream _io, NVMEIdController _parent) {
            this(_io, _parent, null);
        }

        public Nvme101LogPageAttributes(KaitaiStream _io, NVMEIdController _parent, NVMEIdController _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nvme101Reserved = this._io.readBitsIntBe(4);
            this.nvme101SupportsTelemetry = this._io.readBitsIntBe(1) != 0;
            this.nvme101SupportsExtendedData = this._io.readBitsIntBe(1) != 0;
            this.nvme101SupportsCommands = this._io.readBitsIntBe(1) != 0;
            this.nvme101SupportsHealthInfo = this._io.readBitsIntBe(1) != 0;
        }
        private long nvme101Reserved;
        @JsonProperty
        private boolean nvme101SupportsTelemetry;
        @JsonProperty
        private boolean nvme101SupportsExtendedData;
        @JsonProperty
        private boolean nvme101SupportsCommands;
        @JsonProperty
        private boolean nvme101SupportsHealthInfo;
        private NVMEIdController _root;
        private NVMEIdController _parent;
        public long nvme101Reserved() { return nvme101Reserved; }
        public boolean nvme101SupportsTelemetry() { return nvme101SupportsTelemetry; }
        public boolean nvme101SupportsExtendedData() { return nvme101SupportsExtendedData; }
        public boolean nvme101SupportsCommands() { return nvme101SupportsCommands; }
        public boolean nvme101SupportsHealthInfo() { return nvme101SupportsHealthInfo; }
        public NVMEIdController _root() { return _root; }
        public NVMEIdController _parent() { return _parent; }
    }
    public static class Nvme101ControllerAttributes extends KaitaiStruct {
        public static Nvme101ControllerAttributes fromFile(String fileName) throws IOException {
            return new Nvme101ControllerAttributes(new ByteBufferKaitaiStream(fileName));
        }

        public Nvme101ControllerAttributes(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Nvme101ControllerAttributes(KaitaiStream _io, NVMEIdController _parent) {
            this(_io, _parent, null);
        }

        public Nvme101ControllerAttributes(KaitaiStream _io, NVMEIdController _parent, NVMEIdController _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nvme101SupportsHostIdentifier = this._io.readBitsIntBe(1) != 0;
            this.nvme101SupportsPermissiveMode = this._io.readBitsIntBe(1) != 0;
            this.nvme101Msbb3To32 = this._io.readBitsIntBe(30);
        }
        @JsonProperty
        private boolean nvme101SupportsHostIdentifier;
        @JsonProperty
        private boolean nvme101SupportsPermissiveMode;
        private long nvme101Msbb3To32;
        private NVMEIdController _root;
        private NVMEIdController _parent;
        public boolean nvme101SupportsHostIdentifier() { return nvme101SupportsHostIdentifier; }
        public boolean nvme101SupportsPermissiveMode() { return nvme101SupportsPermissiveMode; }
        public long nvme101Msbb3To32() { return nvme101Msbb3To32; }
        public NVMEIdController _root() { return _root; }
        public NVMEIdController _parent() { return _parent; }
    }
    public static class Nvme101FirmwareUpdates extends KaitaiStruct {
        public static Nvme101FirmwareUpdates fromFile(String fileName) throws IOException {
            return new Nvme101FirmwareUpdates(new ByteBufferKaitaiStream(fileName));
        }

        public Nvme101FirmwareUpdates(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Nvme101FirmwareUpdates(KaitaiStream _io, NVMEIdController _parent) {
            this(_io, _parent, null);
        }

        public Nvme101FirmwareUpdates(KaitaiStream _io, NVMEIdController _parent, NVMEIdController _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nvme101Reserved = this._io.readBitsIntBe(3);
            this.nvme101SupportsActivationWithoutReset = this._io.readBitsIntBe(1) != 0;
            this.nvme101NumberOfFirmwareSlots = this._io.readBitsIntBe(3);
            this.nvme101FirmwareSlotReadOnly = this._io.readBitsIntBe(1) != 0;
        }
        private long nvme101Reserved;
        @JsonProperty
        private boolean nvme101SupportsActivationWithoutReset;
        @JsonProperty
        private long nvme101NumberOfFirmwareSlots;
        @JsonProperty
        private boolean nvme101FirmwareSlotReadOnly;
        private NVMEIdController _root;
        private NVMEIdController _parent;
        public long nvme101Reserved() { return nvme101Reserved; }
        public boolean nvme101SupportsActivationWithoutReset() { return nvme101SupportsActivationWithoutReset; }
        public long nvme101NumberOfFirmwareSlots() { return nvme101NumberOfFirmwareSlots; }
        public boolean nvme101FirmwareSlotReadOnly() { return nvme101FirmwareSlotReadOnly; }
        public NVMEIdController _root() { return _root; }
        public NVMEIdController _parent() { return _parent; }
    }
    public static class Nvme101VolatileWriteCache extends KaitaiStruct {
        public static Nvme101VolatileWriteCache fromFile(String fileName) throws IOException {
            return new Nvme101VolatileWriteCache(new ByteBufferKaitaiStream(fileName));
        }

        public Nvme101VolatileWriteCache(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Nvme101VolatileWriteCache(KaitaiStream _io, NVMEIdController _parent) {
            this(_io, _parent, null);
        }

        public Nvme101VolatileWriteCache(KaitaiStream _io, NVMEIdController _parent, NVMEIdController _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nvme101Msbb7To4Reserved = this._io.readBitsIntBe(4);
            this.nvme101Msbb3To1Reserved = this._io.readBitsIntBe(3);
            this.nvme101Msbb0SupportsCompareWrite = this._io.readBitsIntBe(1) != 0;
        }
        private long nvme101Msbb7To4Reserved;
        private long nvme101Msbb3To1Reserved;
        @JsonProperty
        private boolean nvme101Msbb0SupportsCompareWrite;
        private NVMEIdController _root;
        private NVMEIdController _parent;
        public long nvme101Msbb7To4Reserved() { return nvme101Msbb7To4Reserved; }
        public long nvme101Msbb3To1Reserved() { return nvme101Msbb3To1Reserved; }
        public boolean nvme101Msbb0SupportsCompareWrite() { return nvme101Msbb0SupportsCompareWrite; }
        public NVMEIdController _root() { return _root; }
        public NVMEIdController _parent() { return _parent; }
    }
    public static class Nvme101SanitizeCapabilities extends KaitaiStruct {
        public static Nvme101SanitizeCapabilities fromFile(String fileName) throws IOException {
            return new Nvme101SanitizeCapabilities(new ByteBufferKaitaiStream(fileName));
        }

        public Nvme101SanitizeCapabilities(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Nvme101SanitizeCapabilities(KaitaiStream _io, NVMEIdController _parent) {
            this(_io, _parent, null);
        }

        public Nvme101SanitizeCapabilities(KaitaiStream _io, NVMEIdController _parent, NVMEIdController _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nvme101CryptoErase = this._io.readBitsIntBe(1) != 0;
            this.nvme101BlockErase = this._io.readBitsIntBe(1) != 0;
            this.nvme101OverwriteErase = this._io.readBitsIntBe(1) != 0;
            this.nvme101Reserved = this._io.readBitsIntBe(29);
        }
        @JsonProperty
        private boolean nvme101CryptoErase;
        @JsonProperty
        private boolean nvme101BlockErase;
        @JsonProperty
        private boolean nvme101OverwriteErase;
        private long nvme101Reserved;
        private NVMEIdController _root;
        private NVMEIdController _parent;
        public boolean nvme101CryptoErase() { return nvme101CryptoErase; }
        public boolean nvme101BlockErase() { return nvme101BlockErase; }
        public boolean nvme101OverwriteErase() { return nvme101OverwriteErase; }
        public long nvme101Reserved() { return nvme101Reserved; }
        public NVMEIdController _root() { return _root; }
        public NVMEIdController _parent() { return _parent; }
    }
    public static class Nvme101AsynchronousEventsSupported extends KaitaiStruct {
        public static Nvme101AsynchronousEventsSupported fromFile(String fileName) throws IOException {
            return new Nvme101AsynchronousEventsSupported(new ByteBufferKaitaiStream(fileName));
        }

        public Nvme101AsynchronousEventsSupported(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Nvme101AsynchronousEventsSupported(KaitaiStream _io, NVMEIdController _parent) {
            this(_io, _parent, null);
        }

        public Nvme101AsynchronousEventsSupported(KaitaiStream _io, NVMEIdController _parent, NVMEIdController _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nvme101Msbb0To7 = this._io.readBitsIntBe(8);
            this.nvme101SupportsNamespaceAttribute = this._io.readBitsIntBe(1) != 0;
            this.nvme101SupportsFirmwareActivation = this._io.readBitsIntBe(1) != 0;
            this.nvme101Msbb10To32 = this._io.readBitsIntBe(22);
        }
        private long nvme101Msbb0To7;
        @JsonProperty
        private boolean nvme101SupportsNamespaceAttribute;
        @JsonProperty
        private boolean nvme101SupportsFirmwareActivation;
        private long nvme101Msbb10To32;
        private NVMEIdController _root;
        private NVMEIdController _parent;
        public long nvme101Msbb0To7() { return nvme101Msbb0To7; }
        public boolean nvme101SupportsNamespaceAttribute() { return nvme101SupportsNamespaceAttribute; }
        public boolean nvme101SupportsFirmwareActivation() { return nvme101SupportsFirmwareActivation; }
        public long nvme101Msbb10To32() { return nvme101Msbb10To32; }
        public NVMEIdController _root() { return _root; }
        public NVMEIdController _parent() { return _parent; }
    }
    public static class Nvme101AdminCommandSupport extends KaitaiStruct {
        public static Nvme101AdminCommandSupport fromFile(String fileName) throws IOException {
            return new Nvme101AdminCommandSupport(new ByteBufferKaitaiStream(fileName));
        }

        public Nvme101AdminCommandSupport(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Nvme101AdminCommandSupport(KaitaiStream _io, NVMEIdController _parent) {
            this(_io, _parent, null);
        }

        public Nvme101AdminCommandSupport(KaitaiStream _io, NVMEIdController _parent, NVMEIdController _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nvme101SupportsSecurity = this._io.readBitsIntBe(1) != 0;
            this.nvme101SupportsNvmCmd = this._io.readBitsIntBe(1) != 0;
            this.nvme101SupportsFirmwareCmd = this._io.readBitsIntBe(1) != 0;
            this.nvme101SupportsNamespaceCmd = this._io.readBitsIntBe(1) != 0;
            this.nvme101SupportsDeviceSelfTestCmd = this._io.readBitsIntBe(1) != 0;
            this.nvme101SupportsDirectives = this._io.readBitsIntBe(1) != 0;
            this.nvme101SupportsNvmeMICmd = this._io.readBitsIntBe(1) != 0;
            this.nvme101SupportsVirtualization = this._io.readBitsIntBe(1) != 0;
            this.nvme101SupportsConfigCmd = this._io.readBitsIntBe(1) != 0;
            this.nvme101Reserved = this._io.readBitsIntBe(7);
        }
        @JsonProperty
        private boolean nvme101SupportsSecurity;
        @JsonProperty
        private boolean nvme101SupportsNvmCmd;
        @JsonProperty
        private boolean nvme101SupportsFirmwareCmd;
        @JsonProperty
        private boolean nvme101SupportsNamespaceCmd;
        @JsonProperty
        private boolean nvme101SupportsDeviceSelfTestCmd;
        @JsonProperty
        private boolean nvme101SupportsDirectives;
        @JsonProperty
        private boolean nvme101SupportsNvmeMICmd;
        @JsonProperty
        private boolean nvme101SupportsVirtualization;
        @JsonProperty
        private boolean nvme101SupportsConfigCmd;
        private long nvme101Reserved;
        private NVMEIdController _root;
        private NVMEIdController _parent;
        public boolean nvme101SupportsSecurity() { return nvme101SupportsSecurity; }
        public boolean nvme101SupportsNvmCmd() { return nvme101SupportsNvmCmd; }
        public boolean nvme101SupportsFirmwareCmd() { return nvme101SupportsFirmwareCmd; }
        public boolean nvme101SupportsNamespaceCmd() { return nvme101SupportsNamespaceCmd; }
        public boolean nvme101SupportsDeviceSelfTestCmd() { return nvme101SupportsDeviceSelfTestCmd; }
        public boolean nvme101SupportsDirectives() { return nvme101SupportsDirectives; }
        public boolean nvme101SupportsNvmeMICmd() { return nvme101SupportsNvmeMICmd; }
        public boolean nvme101SupportsVirtualization() { return nvme101SupportsVirtualization; }
        public boolean nvme101SupportsConfigCmd() { return nvme101SupportsConfigCmd; }
        public long nvme101Reserved() { return nvme101Reserved; }
        public NVMEIdController _root() { return _root; }
        public NVMEIdController _parent() { return _parent; }
    }
    public static class Nvme101AdminCommandConfig extends KaitaiStruct {
        public static Nvme101AdminCommandConfig fromFile(String fileName) throws IOException {
            return new Nvme101AdminCommandConfig(new ByteBufferKaitaiStream(fileName));
        }

        public Nvme101AdminCommandConfig(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Nvme101AdminCommandConfig(KaitaiStream _io, NVMEIdController _parent) {
            this(_io, _parent, null);
        }

        public Nvme101AdminCommandConfig(KaitaiStream _io, NVMEIdController _parent, NVMEIdController _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nvme101Reserved = this._io.readBitsIntBe(7);
            this.nvme101IsCommandVendorSpecific = this._io.readBitsIntBe(1) != 0;
        }
        private long nvme101Reserved;
        @JsonProperty
        private boolean nvme101IsCommandVendorSpecific;
        private NVMEIdController _root;
        private NVMEIdController _parent;
        public long nvme101Reserved() { return nvme101Reserved; }
        public boolean nvme101IsCommandVendorSpecific() { return nvme101IsCommandVendorSpecific; }
        public NVMEIdController _root() { return _root; }
        public NVMEIdController _parent() { return _parent; }
    }
    public static class Nvme101HostControlledAttributes extends KaitaiStruct {
        public static Nvme101HostControlledAttributes fromFile(String fileName) throws IOException {
            return new Nvme101HostControlledAttributes(new ByteBufferKaitaiStream(fileName));
        }

        public Nvme101HostControlledAttributes(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Nvme101HostControlledAttributes(KaitaiStream _io, NVMEIdController _parent) {
            this(_io, _parent, null);
        }

        public Nvme101HostControlledAttributes(KaitaiStream _io, NVMEIdController _parent, NVMEIdController _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nvme101SupportsThermalMgmt = this._io.readBitsIntBe(1) != 0;
            this.nvme101Reserved = this._io.readBitsIntBe(15);
        }
        @JsonProperty
        private boolean nvme101SupportsThermalMgmt;
        private long nvme101Reserved;
        private NVMEIdController _root;
        private NVMEIdController _parent;
        public boolean nvme101SupportsThermalMgmt() { return nvme101SupportsThermalMgmt; }
        public long nvme101Reserved() { return nvme101Reserved; }
        public NVMEIdController _root() { return _root; }
        public NVMEIdController _parent() { return _parent; }
    }
    public static class Nvme101ReplayProtectedMemory extends KaitaiStruct {
        public static Nvme101ReplayProtectedMemory fromFile(String fileName) throws IOException {
            return new Nvme101ReplayProtectedMemory(new ByteBufferKaitaiStream(fileName));
        }

        public Nvme101ReplayProtectedMemory(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Nvme101ReplayProtectedMemory(KaitaiStream _io, NVMEIdController _parent) {
            this(_io, _parent, null);
        }

        public Nvme101ReplayProtectedMemory(KaitaiStream _io, NVMEIdController _parent, NVMEIdController _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nvme101NumberOfRPMBUnits = this._io.readBitsIntBe(3);
            this.nvme101AuthenticationMethod = this._io.readBitsIntBe(3);
            this.nvme101Msbb6To15Reserved = this._io.readBitsIntBe(10);
            this._io.alignToByte();
            this.nvme101TotalSize = this._io.readU1();
            this.nvme101AccessSize = this._io.readU1();
        }
        @JsonProperty
        private long nvme101NumberOfRPMBUnits;
        @JsonProperty
        private long nvme101AuthenticationMethod;
        private long nvme101Msbb6To15Reserved;
        @JsonProperty
        private int nvme101TotalSize;
        @JsonProperty
        private int nvme101AccessSize;
        private NVMEIdController _root;
        private NVMEIdController _parent;
        public long nvme101NumberOfRPMBUnits() { return nvme101NumberOfRPMBUnits; }
        public long nvme101AuthenticationMethod() { return nvme101AuthenticationMethod; }
        public long nvme101Msbb6To15Reserved() { return nvme101Msbb6To15Reserved; }
        public int nvme101TotalSize() { return nvme101TotalSize; }
        public int nvme101AccessSize() { return nvme101AccessSize; }
        public NVMEIdController _root() { return _root; }
        public NVMEIdController _parent() { return _parent; }
    }
    public static class Nvme101OptionalNvmCommand extends KaitaiStruct {
        public static Nvme101OptionalNvmCommand fromFile(String fileName) throws IOException {
            return new Nvme101OptionalNvmCommand(new ByteBufferKaitaiStream(fileName));
        }

        public Nvme101OptionalNvmCommand(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Nvme101OptionalNvmCommand(KaitaiStream _io, NVMEIdController _parent) {
            this(_io, _parent, null);
        }

        public Nvme101OptionalNvmCommand(KaitaiStream _io, NVMEIdController _parent, NVMEIdController _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nvme101Msbb7Reserved = this._io.readBitsIntBe(1) != 0;
            this.nvme101SupportsTimestampFeature = this._io.readBitsIntBe(1) != 0;
            this.nvme101SupportsReservations = this._io.readBitsIntBe(1) != 0;
            this.nvme101SupportsSaveFieldCommand = this._io.readBitsIntBe(1) != 0;
            this.nvme101SupportsWriteZeroesCommand = this._io.readBitsIntBe(1) != 0;
            this.nvme101SupportsDatasetMgmtCommand = this._io.readBitsIntBe(1) != 0;
            this.nvme101SupportsWriteUncorrectableCommands = this._io.readBitsIntBe(1) != 0;
            this.nvme101SupportsCompareCommand = this._io.readBitsIntBe(1) != 0;
            this.nvme101Msbb15To8Reserved = this._io.readBitsIntBe(8);
        }
        private boolean nvme101Msbb7Reserved;
        @JsonProperty
        private boolean nvme101SupportsTimestampFeature;
        @JsonProperty
        private boolean nvme101SupportsReservations;
        @JsonProperty
        private boolean nvme101SupportsSaveFieldCommand;
        @JsonProperty
        private boolean nvme101SupportsWriteZeroesCommand;
        @JsonProperty
        private boolean nvme101SupportsDatasetMgmtCommand;
        @JsonProperty
        private boolean nvme101SupportsWriteUncorrectableCommands;
        @JsonProperty
        private boolean nvme101SupportsCompareCommand;
        private long nvme101Msbb15To8Reserved;
        private NVMEIdController _root;
        private NVMEIdController _parent;
        public boolean nvme101Msbb7Reserved() { return nvme101Msbb7Reserved; }
        public boolean nvme101SupportsTimestampFeature() { return nvme101SupportsTimestampFeature; }
        public boolean nvme101SupportsReservations() { return nvme101SupportsReservations; }
        public boolean nvme101SupportsSaveFieldCommand() { return nvme101SupportsSaveFieldCommand; }
        public boolean nvme101SupportsWriteZeroesCommand() { return nvme101SupportsWriteZeroesCommand; }
        public boolean nvme101SupportsDatasetMgmtCommand() { return nvme101SupportsDatasetMgmtCommand; }
        public boolean nvme101SupportsWriteUncorrectableCommands() { return nvme101SupportsWriteUncorrectableCommands; }
        public boolean nvme101SupportsCompareCommand() { return nvme101SupportsCompareCommand; }
        public long nvme101Msbb15To8Reserved() { return nvme101Msbb15To8Reserved; }
        public NVMEIdController _root() { return _root; }
        public NVMEIdController _parent() { return _parent; }
    }
    public static class Nvme101Offset00To03 extends KaitaiStruct {
        public static Nvme101Offset00To03 fromFile(String fileName) throws IOException {
            return new Nvme101Offset00To03(new ByteBufferKaitaiStream(fileName));
        }

        public Nvme101Offset00To03(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Nvme101Offset00To03(KaitaiStream _io, NVMEIdController.Nvme101PowerStateDescriptor _parent) {
            this(_io, _parent, null);
        }

        public Nvme101Offset00To03(KaitaiStream _io, NVMEIdController.Nvme101PowerStateDescriptor _parent, NVMEIdController _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nvme101Mp = this._io.readU2le();
            this.nvme101Res1 = this._io.readU1();
            this.nvme101Mps = this._io.readBitsIntBe(1) != 0;
            this.nvme101Nops = this._io.readBitsIntBe(1) != 0;
            this.nvme101Res2 = this._io.readBitsIntBe(2);
            this.nvme101Res3 = this._io.readBitsIntBe(4);
        }
        @JsonProperty
        private int nvme101Mp;
        @JsonProperty
        private int nvme101Res1;
        @JsonProperty
        private boolean nvme101Mps;
        @JsonProperty
        private boolean nvme101Nops;
        @JsonProperty
        private long nvme101Res2;
        @JsonProperty
        private long nvme101Res3;
        private NVMEIdController _root;
        private NVMEIdController.Nvme101PowerStateDescriptor _parent;
        public int nvme101Mp() { return nvme101Mp; }
        public int nvme101Res1() { return nvme101Res1; }
        public boolean nvme101Mps() { return nvme101Mps; }
        public boolean nvme101Nops() { return nvme101Nops; }
        public long nvme101Res2() { return nvme101Res2; }
        public long nvme101Res3() { return nvme101Res3; }
        public NVMEIdController _root() { return _root; }
        public NVMEIdController.Nvme101PowerStateDescriptor _parent() { return _parent; }
    }
    public static class Nvme101FusedOperationSupport extends KaitaiStruct {
        public static Nvme101FusedOperationSupport fromFile(String fileName) throws IOException {
            return new Nvme101FusedOperationSupport(new ByteBufferKaitaiStream(fileName));
        }

        public Nvme101FusedOperationSupport(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Nvme101FusedOperationSupport(KaitaiStream _io, NVMEIdController _parent) {
            this(_io, _parent, null);
        }

        public Nvme101FusedOperationSupport(KaitaiStream _io, NVMEIdController _parent, NVMEIdController _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nvme101Msbb7To4Reserved = this._io.readBitsIntBe(4);
            this.nvme101Msbb3To1Reserved = this._io.readBitsIntBe(3);
            this.nvme101Msbb0SupportsCompareWrite = this._io.readBitsIntBe(1) != 0;
            this.nvme101Msbb15To8Reserved = this._io.readBitsIntBe(8);
        }
        private long nvme101Msbb7To4Reserved;
        private long nvme101Msbb3To1Reserved;
        @JsonProperty
        private boolean nvme101Msbb0SupportsCompareWrite;
        private long nvme101Msbb15To8Reserved;
        private NVMEIdController _root;
        private NVMEIdController _parent;
        public long nvme101Msbb7To4Reserved() { return nvme101Msbb7To4Reserved; }
        public long nvme101Msbb3To1Reserved() { return nvme101Msbb3To1Reserved; }
        public boolean nvme101Msbb0SupportsCompareWrite() { return nvme101Msbb0SupportsCompareWrite; }
        public long nvme101Msbb15To8Reserved() { return nvme101Msbb15To8Reserved; }
        public NVMEIdController _root() { return _root; }
        public NVMEIdController _parent() { return _parent; }
    }
    public static class Nvme101NvmVendorSpecificCommandConfig extends KaitaiStruct {
        public static Nvme101NvmVendorSpecificCommandConfig fromFile(String fileName) throws IOException {
            return new Nvme101NvmVendorSpecificCommandConfig(new ByteBufferKaitaiStream(fileName));
        }

        public Nvme101NvmVendorSpecificCommandConfig(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Nvme101NvmVendorSpecificCommandConfig(KaitaiStream _io, NVMEIdController _parent) {
            this(_io, _parent, null);
        }

        public Nvme101NvmVendorSpecificCommandConfig(KaitaiStream _io, NVMEIdController _parent, NVMEIdController _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nvme101Msbb7To4Reserved = this._io.readBitsIntBe(4);
            this.nvme101Msbb3To1Reserved = this._io.readBitsIntBe(3);
            this.nvme101IsVendorSpecificCommandFormat = this._io.readBitsIntBe(1) != 0;
        }
        private long nvme101Msbb7To4Reserved;
        private long nvme101Msbb3To1Reserved;
        @JsonProperty
        private boolean nvme101IsVendorSpecificCommandFormat;
        private NVMEIdController _root;
        private NVMEIdController _parent;
        public long nvme101Msbb7To4Reserved() { return nvme101Msbb7To4Reserved; }
        public long nvme101Msbb3To1Reserved() { return nvme101Msbb3To1Reserved; }
        public boolean nvme101IsVendorSpecificCommandFormat() { return nvme101IsVendorSpecificCommandFormat; }
        public NVMEIdController _root() { return _root; }
        public NVMEIdController _parent() { return _parent; }
    }
    @JsonProperty
    private int nvme101PciVendorId;
    @JsonProperty
    private int nvme101PciSubsystemVendorId;
    @JsonProperty
    private String nvme101SerialNumber;
    @JsonProperty
    private String nvme101ModelNumber;
    @JsonProperty
    private String nvme101FirmwareRevision;
    @JsonProperty
    private int nvme101RecomArbitrationBurst;
    @JsonProperty
    private String nvme101IeeeOuiIdentifier;
    @JsonProperty
    private Nvme101CmiCapabilities nvme101CmiCapabilities;
    @JsonProperty
    private int nvme101MaxDataTransferSize;
    @JsonProperty
    private int nvme101ControllerId;
    @JsonProperty
    private long nvme101Version;
    @JsonProperty
    private long nvme101ResumeLatency;
    @JsonProperty
    private long nvme101EntryLatency;
    @JsonProperty
    private Nvme101AsynchronousEventsSupported nvme101AsynchronousEventsSupported;
    @JsonProperty
    private Nvme101ControllerAttributes nvme101ControllerAttributes;
    private String nvme101ReservedBytes100To111;
    @JsonProperty
    private String nvme101FGUId;
    private String nvme101ReservedBytes128To239;
    @JsonProperty
    private String nvme101Bytes240To255;
    @JsonProperty
    private Nvme101AdminCommandSupport nvme101AdminCommandSupport;
    @JsonProperty
    private int nvme101AbortCommandLimit;
    @JsonProperty
    private int nvme101AERL;
    @JsonProperty
    private Nvme101FirmwareUpdates nvme101FirmwareUpdates;
    @JsonProperty
    private Nvme101LogPageAttributes nvme101LogPageAttributes;
    @JsonProperty
    private int nvme101ErrorLogPageEntries;
    @JsonProperty
    private int nvme101NumberOfPowerStates;
    @JsonProperty
    private Nvme101AdminCommandConfig nvme101AdminCommandConfig;
    @JsonProperty
    private Nvme101PowerStateTransition nvme101PowerStateTransition;
    @JsonProperty
    private int nvme101WarningTempThreshold;
    @JsonProperty
    private int nvme101CriticalTempThreshold;
    @JsonProperty
    private int nvme101MaxTimeForFirmwareActivation;
    @JsonProperty
    private long nvme101HostMemoryBufferPreferred;
    @JsonProperty
    private long nvme101HostMemoryBufferMinimum;
    @JsonProperty
    private String nvme101TotalNvmCapacity;
    @JsonProperty
    private String nvme101UnallocatesNvmCapacity;
    @JsonProperty
    private Nvme101ReplayProtectedMemory nvme101ReplayProtectedMemory;
    @JsonProperty
    private int nvme101ExtendedDeviceSelfTestTime;
    @JsonProperty
    private Nvme101DeviceSelfTestOptions nvme101DeviceSelfTestOptions;
    @JsonProperty
    private int nvme101FirmwareUpdateGranurality;
    @JsonProperty
    private int nvme101KeepAlivaeSupport;
    @JsonProperty
    private Nvme101HostControlledAttributes nvme101HostControlledAttributes;
    @JsonProperty
    private int nvme101MinThermalMgmtTemp;
    @JsonProperty
    private int nvme101MaxThermalMgmtTemp;
    @JsonProperty
    private Nvme101SanitizeCapabilities nvme101SanitizeCapabilities;
    private String nvme101ReservedBytes332To511;
    @JsonProperty
    private Nvme101SubmissionQueryEntrySize nvme101SubmissionQueryEntrySize;
    @JsonProperty
    private Nvme101CompletionQueryEntrySize nvme101CompletionQueryEntrySize;
    @JsonProperty
    private int nvme101MaximumOutstandingCommands;
    @JsonProperty
    private long nvme101NumberOfNamespaces;
    @JsonProperty
    private Nvme101OptionalNvmCommand nvme101OptionalNvmCommand;
    @JsonProperty
    private Nvme101FusedOperationSupport nvme101FusedOperationSupport;
    @JsonProperty
    private Nvme101FormatNvmAttributes nvme101FormatNvmAttributes;
    @JsonProperty
    private Nvme101VolatileWriteCache nvme101VolatileWriteCache;
    @JsonProperty
    private int nvme101AtomicWriteUnitNormal;
    @JsonProperty
    private int nvme101AtomicWriteUnitPowerFail;
    @JsonProperty
    private Nvme101NvmVendorSpecificCommandConfig nvme101NvmVendorSpecificCommandConfig;
    private int nvme101ReservedByte531;
    @JsonProperty
    private int nvme101AtomicCompare0WriteUnit;
    private int nvme101ReservedBytes534To535;
    @JsonProperty
    private Nvme101SGLSupport nvme101SGLSupport;
    private String nvme101ReservedBytes540To767;
    @JsonProperty
    private String nvme101NvmSubsystemNvmeQualifiedName;
    private String nvme101ReservedBytes1024To1791;
    @JsonProperty
    private String nvme101FabricSpecification;
    @JsonProperty
    private ArrayList<Nvme101PowerStateDescriptor> nvme101PowerStateDescriptor;
    @JsonProperty
    private String nvme101VendorSpecific;
    private NVMEIdController _root;
    private KaitaiStruct _parent;
    public int nvme101PciVendorId() { return nvme101PciVendorId; }
    public int nvme101PciSubsystemVendorId() { return nvme101PciSubsystemVendorId; }
    public String nvme101SerialNumber() { return nvme101SerialNumber; }
    public String nvme101ModelNumber() { return nvme101ModelNumber; }
    public String nvme101FirmwareRevision() { return nvme101FirmwareRevision; }
    public int nvme101RecomArbitrationBurst() { return nvme101RecomArbitrationBurst; }
    public String nvme101IeeeOuiIdentifier() { return nvme101IeeeOuiIdentifier; }
    public Nvme101CmiCapabilities nvme101CmiCapabilities() { return nvme101CmiCapabilities; }
    public int nvme101MaxDataTransferSize() { return nvme101MaxDataTransferSize; }
    public int nvme101ControllerId() { return nvme101ControllerId; }
    public long nvme101Version() { return nvme101Version; }
    public long nvme101ResumeLatency() { return nvme101ResumeLatency; }
    public long nvme101EntryLatency() { return nvme101EntryLatency; }
    public Nvme101AsynchronousEventsSupported nvme101AsynchronousEventsSupported() { return nvme101AsynchronousEventsSupported; }
    public Nvme101ControllerAttributes nvme101ControllerAttributes() { return nvme101ControllerAttributes; }
    public String nvme101ReservedBytes100To111() { return nvme101ReservedBytes100To111; }
    public String nvme101FGUId() { return nvme101FGUId; }
    public String nvme101ReservedBytes128To239() { return nvme101ReservedBytes128To239; }
    public String nvme101Bytes240To255() { return nvme101Bytes240To255; }
    public Nvme101AdminCommandSupport nvme101AdminCommandSupport() { return nvme101AdminCommandSupport; }
    public int nvme101AbortCommandLimit() { return nvme101AbortCommandLimit; }
    public int nvme101AERL() { return nvme101AERL; }
    public Nvme101FirmwareUpdates nvme101FirmwareUpdates() { return nvme101FirmwareUpdates; }
    public Nvme101LogPageAttributes nvme101LogPageAttributes() { return nvme101LogPageAttributes; }
    public int nvme101ErrorLogPageEntries() { return nvme101ErrorLogPageEntries; }
    public int nvme101NumberOfPowerStates() { return nvme101NumberOfPowerStates; }
    public Nvme101AdminCommandConfig nvme101AdminCommandConfig() { return nvme101AdminCommandConfig; }
    public Nvme101PowerStateTransition nvme101PowerStateTransition() { return nvme101PowerStateTransition; }
    public int nvme101WarningTempThreshold() { return nvme101WarningTempThreshold; }
    public int nvme101CriticalTempThreshold() { return nvme101CriticalTempThreshold; }
    public int nvme101MaxTimeForFirmwareActivation() { return nvme101MaxTimeForFirmwareActivation; }
    public long nvme101HostMemoryBufferPreferred() { return nvme101HostMemoryBufferPreferred; }
    public long nvme101HostMemoryBufferMinimum() { return nvme101HostMemoryBufferMinimum; }
    public String nvme101TotalNvmCapacity() { return nvme101TotalNvmCapacity; }
    public String nvme101UnallocatesNvmCapacity() { return nvme101UnallocatesNvmCapacity; }
    public Nvme101ReplayProtectedMemory nvme101ReplayProtectedMemory() { return nvme101ReplayProtectedMemory; }
    public int nvme101ExtendedDeviceSelfTestTime() { return nvme101ExtendedDeviceSelfTestTime; }
    public Nvme101DeviceSelfTestOptions nvme101DeviceSelfTestOptions() { return nvme101DeviceSelfTestOptions; }
    public int nvme101FirmwareUpdateGranurality() { return nvme101FirmwareUpdateGranurality; }
    public int nvme101KeepAlivaeSupport() { return nvme101KeepAlivaeSupport; }
    public Nvme101HostControlledAttributes nvme101HostControlledAttributes() { return nvme101HostControlledAttributes; }
    public int nvme101MinThermalMgmtTemp() { return nvme101MinThermalMgmtTemp; }
    public int nvme101MaxThermalMgmtTemp() { return nvme101MaxThermalMgmtTemp; }
    public Nvme101SanitizeCapabilities nvme101SanitizeCapabilities() { return nvme101SanitizeCapabilities; }
    public String nvme101ReservedBytes332To511() { return nvme101ReservedBytes332To511; }
    public Nvme101SubmissionQueryEntrySize nvme101SubmissionQueryEntrySize() { return nvme101SubmissionQueryEntrySize; }
    public Nvme101CompletionQueryEntrySize nvme101CompletionQueryEntrySize() { return nvme101CompletionQueryEntrySize; }
    public int nvme101MaximumOutstandingCommands() { return nvme101MaximumOutstandingCommands; }
    public long nvme101NumberOfNamespaces() { return nvme101NumberOfNamespaces; }
    public Nvme101OptionalNvmCommand nvme101OptionalNvmCommand() { return nvme101OptionalNvmCommand; }
    public Nvme101FusedOperationSupport nvme101FusedOperationSupport() { return nvme101FusedOperationSupport; }
    public Nvme101FormatNvmAttributes nvme101FormatNvmAttributes() { return nvme101FormatNvmAttributes; }
    public Nvme101VolatileWriteCache nvme101VolatileWriteCache() { return nvme101VolatileWriteCache; }
    public int nvme101AtomicWriteUnitNormal() { return nvme101AtomicWriteUnitNormal; }
    public int nvme101AtomicWriteUnitPowerFail() { return nvme101AtomicWriteUnitPowerFail; }
    public Nvme101NvmVendorSpecificCommandConfig nvme101NvmVendorSpecificCommandConfig() { return nvme101NvmVendorSpecificCommandConfig; }
    public int nvme101ReservedByte531() { return nvme101ReservedByte531; }
    public int nvme101AtomicCompare0WriteUnit() { return nvme101AtomicCompare0WriteUnit; }
    public int nvme101ReservedBytes534To535() { return nvme101ReservedBytes534To535; }
    public Nvme101SGLSupport nvme101SGLSupport() { return nvme101SGLSupport; }
    public String nvme101ReservedBytes540To767() { return nvme101ReservedBytes540To767; }
    public String nvme101NvmSubsystemNvmeQualifiedName() { return nvme101NvmSubsystemNvmeQualifiedName; }
    public String nvme101ReservedBytes1024To1791() { return nvme101ReservedBytes1024To1791; }
    public String nvme101FabricSpecification() { return nvme101FabricSpecification; }
    public ArrayList<Nvme101PowerStateDescriptor> nvme101PowerStateDescriptor() { return nvme101PowerStateDescriptor; }
    public String nvme101VendorSpecific() { return nvme101VendorSpecific; }
    public NVMEIdController _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
