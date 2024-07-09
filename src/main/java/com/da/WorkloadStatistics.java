package com.da;// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.ArrayList;

public class WorkloadStatistics extends KaitaiStruct {
    public static WorkloadStatistics fromFile(String fileName) throws IOException {
        return new WorkloadStatistics(new ByteBufferKaitaiStream(fileName));
    }

    public WorkloadStatistics(KaitaiStream _io) {
        this(_io, null, null);
    }

    public WorkloadStatistics(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public WorkloadStatistics(KaitaiStream _io, KaitaiStruct _parent, WorkloadStatistics _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.unrelatedData = new ArrayList<Integer>();
        for (int i = 0; i < 316; i++) {
            this.unrelatedData.add(this._io.readU1());
        }
        this.parameterCode = this._io.readU2be();
        this.parameterControlByte = this._io.readU1();
        this.parameterLength = this._io.readU1();
        this.pageNumber = this._io.readU8be();
        this.copyNumber = this._io.readU8be();
        this.ratedWorkloadPercentage = this._io.readU8be();
        this.totalNumberOfReadCommmands = this._io.readU8be();
        this.totalNumberOfWriteCommands = this._io.readU8be();
        this.totalNumberOfRandomReadCommands = this._io.readU8be();
        this.totalNumberOfRandomWriteCommands = this._io.readU8be();
        this.totalNumberOfOtherCommands = this._io.readU8be();
        this.logicalSectorsWritten = this._io.readU8be();
        this.logicalSectorsRead = this._io.readU8be();
        this.readCommands0To3125Percent = this._io.readU8be();
        this.readCommands3125To25Percent = this._io.readU8be();
        this.readCommands25To50Percent = this._io.readU8be();
        this.readCommands50To100Percent = this._io.readU8be();
        this.writeCommands0To3125Percent = this._io.readU8be();
        this.writeCommands3125To25Percent = this._io.readU8be();
        this.writeCommands25To50Percent = this._io.readU8be();
        this.writeCommands50To100Percent = this._io.readU8be();
        this.readCommandsTransferLengthLe16kb = this._io.readU8be();
        this.readCommandsTransferLength16kbTo512kb = this._io.readU8be();
        this.readCommandsTransferLength512kbTo2mb = this._io.readU8be();
        this.readCommandsTransferLengthGt2mb = this._io.readU8be();
        this.writeCommandsTransferLengthLe16kb = this._io.readU8be();
        this.writeCommandsTransferLength16kbTo512kb = this._io.readU8be();
        this.writeCommandsTransferLength512kbTo2mb = this._io.readU8be();
        this.writeCommandsTransferLengthGt2mb = this._io.readU8be();
    }
    private ArrayList<Integer> unrelatedData;
    private int parameterCode;
    private int parameterControlByte;
    private int parameterLength;
    private long pageNumber;
    private long copyNumber;
    private long ratedWorkloadPercentage;
    private long totalNumberOfReadCommmands;
    private long totalNumberOfWriteCommands;
    private long totalNumberOfRandomReadCommands;
    private long totalNumberOfRandomWriteCommands;
    private long totalNumberOfOtherCommands;
    private long logicalSectorsWritten;
    private long logicalSectorsRead;
    private long readCommands0To3125Percent;
    private long readCommands3125To25Percent;
    private long readCommands25To50Percent;
    private long readCommands50To100Percent;
    private long writeCommands0To3125Percent;
    private long writeCommands3125To25Percent;
    private long writeCommands25To50Percent;
    private long writeCommands50To100Percent;
    private long readCommandsTransferLengthLe16kb;
    private long readCommandsTransferLength16kbTo512kb;
    private long readCommandsTransferLength512kbTo2mb;
    private long readCommandsTransferLengthGt2mb;
    private long writeCommandsTransferLengthLe16kb;
    private long writeCommandsTransferLength16kbTo512kb;
    private long writeCommandsTransferLength512kbTo2mb;
    private long writeCommandsTransferLengthGt2mb;
    private WorkloadStatistics _root;
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

    /**
     * Page Number : 2
     */
    public long pageNumber() { return pageNumber; }

    /**
     * Copy Number
     */
    public long copyNumber() { return copyNumber; }

    /**
     * Rated Workload Percentage (No longer Supported)
     */
    public long ratedWorkloadPercentage() { return ratedWorkloadPercentage; }

    /**
     * Total Number of Read Commands
     */
    public long totalNumberOfReadCommmands() { return totalNumberOfReadCommmands; }

    /**
     * Total Number of Write Commands
     */
    public long totalNumberOfWriteCommands() { return totalNumberOfWriteCommands; }

    /**
     * Total Number of Random Read Commands
     */
    public long totalNumberOfRandomReadCommands() { return totalNumberOfRandomReadCommands; }

    /**
     * Total Number of Random Write Commands
     */
    public long totalNumberOfRandomWriteCommands() { return totalNumberOfRandomWriteCommands; }

    /**
     * Total Number of Other Commands
     */
    public long totalNumberOfOtherCommands() { return totalNumberOfOtherCommands; }

    /**
     * Logical Sectors Written
     */
    public long logicalSectorsWritten() { return logicalSectorsWritten; }

    /**
     * Logical Sectord Read
     */
    public long logicalSectorsRead() { return logicalSectorsRead; }

    /**
     * Number of Read commands from 0-3.125% of LBA space for restricted time range
     */
    public long readCommands0To3125Percent() { return readCommands0To3125Percent; }

    /**
     * Number of Read commands from 3.125-25% of LBA space for restricted time range
     */
    public long readCommands3125To25Percent() { return readCommands3125To25Percent; }

    /**
     * Number of Read commands from 25-50% of LBA space for restricted time range
     */
    public long readCommands25To50Percent() { return readCommands25To50Percent; }

    /**
     * Number of Read commands from 50-100% of LBA space for restricted time range
     */
    public long readCommands50To100Percent() { return readCommands50To100Percent; }

    /**
     * Number of Write commands from 0-3.125% of LBA space for restricted time range
     */
    public long writeCommands0To3125Percent() { return writeCommands0To3125Percent; }

    /**
     * Number of Write commands from 3.125-25% of LBA space for restricted time range
     */
    public long writeCommands3125To25Percent() { return writeCommands3125To25Percent; }

    /**
     * Number of Write commands from 25-50% of LBA space for restricted time range
     */
    public long writeCommands25To50Percent() { return writeCommands25To50Percent; }

    /**
     * Number of Write commands from 50-100% of LBA space for restricted time range
     */
    public long writeCommands50To100Percent() { return writeCommands50To100Percent; }

    /**
     * Number of Read Commands of transfer length <=16KB for restricted time range
     */
    public long readCommandsTransferLengthLe16kb() { return readCommandsTransferLengthLe16kb; }

    /**
     * Number of Read Commands of transfer length (16KB – 512KB] for restricted time range
     */
    public long readCommandsTransferLength16kbTo512kb() { return readCommandsTransferLength16kbTo512kb; }

    /**
     * Number of Read Commands of transfer length (512KB – 2MB] for restricted time range
     */
    public long readCommandsTransferLength512kbTo2mb() { return readCommandsTransferLength512kbTo2mb; }

    /**
     * Number of Read Commands of transfer length > 2MB for restricted time range
     */
    public long readCommandsTransferLengthGt2mb() { return readCommandsTransferLengthGt2mb; }

    /**
     * Number of Write Commands of transfer length <=16KB for restricted time range
     */
    public long writeCommandsTransferLengthLe16kb() { return writeCommandsTransferLengthLe16kb; }

    /**
     * Number of Write Commands of transfer length (16KB – 512KB] for restricted time range
     */
    public long writeCommandsTransferLength16kbTo512kb() { return writeCommandsTransferLength16kbTo512kb; }

    /**
     * Number of Write Commands of transfer length (512KB – 2MB] for restricted time range
     */
    public long writeCommandsTransferLength512kbTo2mb() { return writeCommandsTransferLength512kbTo2mb; }

    /**
     * Number of Write Commands of transfer length > 2MB for restricted time range
     */
    public long writeCommandsTransferLengthGt2mb() { return writeCommandsTransferLengthGt2mb; }
    public WorkloadStatistics _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
