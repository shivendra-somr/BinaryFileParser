package com.da;// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

import com.fasterxml.jackson.annotation.JsonProperty;
import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.nio.charset.Charset;

public class FarmLogPage extends KaitaiStruct implements Serializable {
    public static FarmLogPage fromFile(String fileName) throws IOException {
        return new FarmLogPage(new ByteBufferKaitaiStream(fileName));
    }

    public FarmLogPage(KaitaiStream _io) {
        this(_io, null, null);
    }

    public FarmLogPage(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public FarmLogPage(KaitaiStream _io, KaitaiStruct _parent, FarmLogPage _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.template335SeagateFarmLogDs = this._io.readBitsIntBe(1) != 0;
        this.template335SeagateFarmLogSpf = this._io.readBitsIntBe(1) != 0;
        this.template335SeagateFarmLogPageCode = this._io.readBitsIntBe(6);
        this._io.alignToByte();
        this.template335SeagateSubPageCode = this._io.readU1();
        this.template335SeagatePageLength = this._io.readU2be();
        this.template335SeagateFarmLogParameters = new ArrayList<LogParameters>();
        for (int i = 0; i < 1; i++) {
            this.template335SeagateFarmLogParameters.add(new LogParameters(this._io, this, _root));
        }
    }
    public static class TimestampOfLastSmartSummary extends KaitaiStruct {
        public static TimestampOfLastSmartSummary fromFile(String fileName) throws IOException {
            return new TimestampOfLastSmartSummary(new ByteBufferKaitaiStream(fileName));
        }

        public TimestampOfLastSmartSummary(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TimestampOfLastSmartSummary(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent) {
            this(_io, _parent, null);
        }

        public TimestampOfLastSmartSummary(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.timestampOfLastSmartSummary = new BigInteger(this._io.readBytes(7)).longValue();
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long timestampOfLastSmartSummary;
        private FarmLogPage _root;
        private FarmLogPage.GeneralDriveInformationParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long timestampOfLastSmartSummary() { return timestampOfLastSmartSummary; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.GeneralDriveInformationParameter _parent() { return _parent; }
    }
    public static class CopyNumber extends KaitaiStruct {
        public static CopyNumber fromFile(String fileName) throws IOException {
            return new CopyNumber(new ByteBufferKaitaiStream(fileName));
        }

        public CopyNumber(KaitaiStream _io) {
            this(_io, null, null);
        }

        public CopyNumber(KaitaiStream _io, FarmLogPage.LogParameterCommon _parent) {
            this(_io, _parent, null);
        }

        public CopyNumber(KaitaiStream _io, FarmLogPage.LogParameterCommon _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.copyNumberValue = new BigInteger(this._io.readBytes(7)).longValue();
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long copyNumberValue;
        private FarmLogPage _root;
        private FarmLogPage.LogParameterCommon _parent;
        public StatusByte statusByte() { return statusByte; }

        /**
         * Copy Number = 1   
         */
        public long copyNumberValue() { return copyNumberValue; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.LogParameterCommon _parent() { return _parent; }
    }
    public static class TotalNumberOfRandomWriteCommands extends KaitaiStruct {
        public static TotalNumberOfRandomWriteCommands fromFile(String fileName) throws IOException {
            return new TotalNumberOfRandomWriteCommands(new ByteBufferKaitaiStream(fileName));
        }

        public TotalNumberOfRandomWriteCommands(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TotalNumberOfRandomWriteCommands(KaitaiStream _io, FarmLogPage.WorkloadStatisticsParameter _parent) {
            this(_io, _parent, null);
        }

        public TotalNumberOfRandomWriteCommands(KaitaiStream _io, FarmLogPage.WorkloadStatisticsParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.totalNumberOfRandomReadCommands = new BigInteger(this._io.readBytes(7)).longValue();;
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long totalNumberOfRandomReadCommands;
        private FarmLogPage _root;
        private FarmLogPage.WorkloadStatisticsParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long totalNumberOfRandomReadCommands() { return totalNumberOfRandomReadCommands; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.WorkloadStatisticsParameter _parent() { return _parent; }
    }
    public static class CurrentRelativeHumidity extends KaitaiStruct {
        public static CurrentRelativeHumidity fromFile(String fileName) throws IOException {
            return new CurrentRelativeHumidity(new ByteBufferKaitaiStream(fileName));
        }

        public CurrentRelativeHumidity(KaitaiStream _io) {
            this(_io, null, null);
        }

        public CurrentRelativeHumidity(KaitaiStream _io, FarmLogPage.EnvironmentalStatisticsParameter _parent) {
            this(_io, _parent, null);
        }

        public CurrentRelativeHumidity(KaitaiStream _io, FarmLogPage.EnvironmentalStatisticsParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.currentRelativeHumidity = new BigInteger(this._io.readBytes(7)).longValue();;
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long currentRelativeHumidity;
        private FarmLogPage _root;
        private FarmLogPage.EnvironmentalStatisticsParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long currentRelativeHumidity() { return currentRelativeHumidity; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.EnvironmentalStatisticsParameter _parent() { return _parent; }
    }
    public static class NumberOfMechanicalStartErrors extends KaitaiStruct {
        public static NumberOfMechanicalStartErrors fromFile(String fileName) throws IOException {
            return new NumberOfMechanicalStartErrors(new ByteBufferKaitaiStream(fileName));
        }

        public NumberOfMechanicalStartErrors(KaitaiStream _io) {
            this(_io, null, null);
        }

        public NumberOfMechanicalStartErrors(KaitaiStream _io, FarmLogPage.ErrorStatisticsParameter _parent) {
            this(_io, _parent, null);
        }

        public NumberOfMechanicalStartErrors(KaitaiStream _io, FarmLogPage.ErrorStatisticsParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.numberOfMechanicalStartErrors =new BigInteger(this._io.readBytes(7)).longValue();
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long numberOfMechanicalStartErrors;
        private FarmLogPage _root;
        private FarmLogPage.ErrorStatisticsParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long numberOfMechanicalStartErrors() { return numberOfMechanicalStartErrors; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.ErrorStatisticsParameter _parent() { return _parent; }
    }
    public static class NumberOfUnrecoverableWriteErrorsFromEWLM extends KaitaiStruct {
        public static NumberOfUnrecoverableWriteErrorsFromEWLM fromFile(String fileName) throws IOException {
            return new NumberOfUnrecoverableWriteErrorsFromEWLM(new ByteBufferKaitaiStream(fileName));
        }

        public NumberOfUnrecoverableWriteErrorsFromEWLM(KaitaiStream _io) {
            this(_io, null, null);
        }

        public NumberOfUnrecoverableWriteErrorsFromEWLM(KaitaiStream _io, FarmLogPage.ErrorStatisticsParameter _parent) {
            this(_io, _parent, null);
        }

        public NumberOfUnrecoverableWriteErrorsFromEWLM(KaitaiStream _io, FarmLogPage.ErrorStatisticsParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.numberOfUnrecoverableWriteErrorsFromEWLM = new BigInteger(this._io.readBytes(7)).longValue();
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long numberOfUnrecoverableWriteErrorsFromEWLM;
        private FarmLogPage _root;
        private FarmLogPage.ErrorStatisticsParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long numberOfUnrecoverableWriteErrorsFromEWLM() { return numberOfUnrecoverableWriteErrorsFromEWLM; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.ErrorStatisticsParameter _parent() { return _parent; }
    }
    public static class DeviceFormFactor extends KaitaiStruct {
        public static DeviceFormFactor fromFile(String fileName) throws IOException {
            return new DeviceFormFactor(new ByteBufferKaitaiStream(fileName));
        }

        public DeviceFormFactor(KaitaiStream _io) {
            this(_io, null, null);
        }

        public DeviceFormFactor(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent) {
            this(_io, _parent, null);
        }

        public DeviceFormFactor(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.deviceFormFactor = new BigInteger(this._io.readBytes(7)).longValue();
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long deviceFormFactor;
        private FarmLogPage _root;
        private FarmLogPage.GeneralDriveInformationParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long deviceFormFactor() { return deviceFormFactor; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.GeneralDriveInformationParameter _parent() { return _parent; }
    }
    public static class EnvironmentalStatisticsParameter extends KaitaiStruct {
        public static EnvironmentalStatisticsParameter fromFile(String fileName) throws IOException {
            return new EnvironmentalStatisticsParameter(new ByteBufferKaitaiStream(fileName));
        }

        public EnvironmentalStatisticsParameter(KaitaiStream _io) {
            this(_io, null, null);
        }

        public EnvironmentalStatisticsParameter(KaitaiStream _io, FarmLogPage.LogParameters _parent) {
            this(_io, _parent, null);
        }

        public EnvironmentalStatisticsParameter(KaitaiStream _io, FarmLogPage.LogParameters _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.commonParameter = new LogParameterCommon(this._io, this, _root);
            this.currentTemperatureInCelsius = new CurrentTemperatureInCelsius(this._io, this, _root);
            this.highestTemperatureInCelsius = new HighestTemperatureInCelsius(this._io, this, _root);
            this.lowestTemperatureInCelsius = new LowestTemperatureInCelsius(this._io, this, _root);
            this.reserved44To107 = new String(this._io.readBytes(64), Charset.forName("ASCII"));
            this.specifiedMaxOperatingTemperatureInCelsius = new SpecifiedMaxOperatingTemperatureInCelsius(this._io, this, _root);
            this.specifiedMinOperatingTemperatureInCelsius = new SpecifiedMinOperatingTemperatureInCelsius(this._io, this, _root);
            this.reserved124To139 = new String(this._io.readBytes(16), Charset.forName("ASCII"));
            this.currentRelativeHumidity = new CurrentRelativeHumidity(this._io, this, _root);
            this.reserved148To155 = new String(this._io.readBytes(8), Charset.forName("ASCII"));
            this.currentMotorPower = new CurrentMotorPower(this._io, this, _root);
        }
        @JsonProperty
        private LogParameterCommon commonParameter;
        @JsonProperty
        private CurrentTemperatureInCelsius currentTemperatureInCelsius;
        @JsonProperty
        private HighestTemperatureInCelsius highestTemperatureInCelsius;
        @JsonProperty
        private LowestTemperatureInCelsius lowestTemperatureInCelsius;
        @JsonProperty
        private String reserved44To107;
        @JsonProperty
        private SpecifiedMaxOperatingTemperatureInCelsius specifiedMaxOperatingTemperatureInCelsius;
        @JsonProperty
        private SpecifiedMinOperatingTemperatureInCelsius specifiedMinOperatingTemperatureInCelsius;
        @JsonProperty
        private String reserved124To139;
        @JsonProperty
        private CurrentRelativeHumidity currentRelativeHumidity;
        private String reserved148To155;
        private CurrentMotorPower currentMotorPower;
        @JsonProperty
        private String reserved164to211;
        private FarmLogPage _root;
        private FarmLogPage.LogParameters _parent;
        public LogParameterCommon commonParameter() { return commonParameter; }

        /**
         * Current Temperature in Celsius (Lower 16 bits are a signed integer in units of 0.1C)
         */
        public CurrentTemperatureInCelsius currentTemperatureInCelsius() { return currentTemperatureInCelsius; }

        /**
         * Highest Temperature in Celsius (Lower 16 bits are a signed integer in units of 0.1C)
         */
        public HighestTemperatureInCelsius highestTemperatureInCelsius() { return highestTemperatureInCelsius; }

        /**
         * Lowest Temperature in Celsius (Lower 16 bits are a signed integer in units of 0.1C)
         */
        public LowestTemperatureInCelsius lowestTemperatureInCelsius() { return lowestTemperatureInCelsius; }
        public String reserved44To107() { return reserved44To107; }

        /**
         * Specified Max Operating Temperature in Celsius
         */
        public SpecifiedMaxOperatingTemperatureInCelsius specifiedMaxOperatingTemperatureInCelsius() { return specifiedMaxOperatingTemperatureInCelsius; }

        /**
         * Specified Min Operating Temperature in Celsius
         */
        public SpecifiedMinOperatingTemperatureInCelsius specifiedMinOperatingTemperatureInCelsius() { return specifiedMinOperatingTemperatureInCelsius; }
        public String reserved124To139() { return reserved124To139; }

        /**
         * Current Relative Humidity (in units of .1%)
         */
        public CurrentRelativeHumidity currentRelativeHumidity() { return currentRelativeHumidity; }
        public String reserved148To155() { return reserved148To155; }

        /**
         * Current Motor Power, value from most recent restricted time range data set.
         */
        public CurrentMotorPower currentMotorPower() { return currentMotorPower; }
        public String reserved164to211() { return reserved164to211; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.LogParameters _parent() { return _parent; }
    }
    public static class SpecifiedMaxOperatingTemperatureInCelsius extends KaitaiStruct {
        public static SpecifiedMaxOperatingTemperatureInCelsius fromFile(String fileName) throws IOException {
            return new SpecifiedMaxOperatingTemperatureInCelsius(new ByteBufferKaitaiStream(fileName));
        }

        public SpecifiedMaxOperatingTemperatureInCelsius(KaitaiStream _io) {
            this(_io, null, null);
        }

        public SpecifiedMaxOperatingTemperatureInCelsius(KaitaiStream _io, FarmLogPage.EnvironmentalStatisticsParameter _parent) {
            this(_io, _parent, null);
        }

        public SpecifiedMaxOperatingTemperatureInCelsius(KaitaiStream _io, FarmLogPage.EnvironmentalStatisticsParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.specifiedMaxOperatingTemperatureInCelsius = new BigInteger(this._io.readBytes(7)).longValue();;
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long specifiedMaxOperatingTemperatureInCelsius;
        private FarmLogPage _root;
        private FarmLogPage.EnvironmentalStatisticsParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long specifiedMaxOperatingTemperatureInCelsius() { return specifiedMaxOperatingTemperatureInCelsius; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.EnvironmentalStatisticsParameter _parent() { return _parent; }
    }
    public static class DeviceInterface extends KaitaiStruct {
        public static DeviceInterface fromFile(String fileName) throws IOException {
            return new DeviceInterface(new ByteBufferKaitaiStream(fileName));
        }

        public DeviceInterface(KaitaiStream _io) {
            this(_io, null, null);
        }

        public DeviceInterface(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent) {
            this(_io, _parent, null);
        }

        public DeviceInterface(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.deviceInterface = new String(this._io.readBytes(7), Charset.forName("ASCII"));
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private String deviceInterface;
        private FarmLogPage _root;
        private FarmLogPage.GeneralDriveInformationParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public String deviceInterface() { return deviceInterface; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.GeneralDriveInformationParameter _parent() { return _parent; }
    }
    public static class CummulativeLifetimeUnrecoverableReadErrors extends KaitaiStruct {
        public static CummulativeLifetimeUnrecoverableReadErrors fromFile(String fileName) throws IOException {
            return new CummulativeLifetimeUnrecoverableReadErrors(new ByteBufferKaitaiStream(fileName));
        }

        public CummulativeLifetimeUnrecoverableReadErrors(KaitaiStream _io) {
            this(_io, null, null);
        }

        public CummulativeLifetimeUnrecoverableReadErrors(KaitaiStream _io, FarmLogPage.ReliabilityStatisticsParameter _parent) {
            this(_io, _parent, null);
        }

        public CummulativeLifetimeUnrecoverableReadErrors(KaitaiStream _io, FarmLogPage.ReliabilityStatisticsParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.cummulativeLifetimeUnrecoverableReadErrors = new BigInteger(this._io.readBytes(7)).longValue();
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long cummulativeLifetimeUnrecoverableReadErrors;
        private FarmLogPage _root;
        private FarmLogPage.ReliabilityStatisticsParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long cummulativeLifetimeUnrecoverableReadErrors() { return cummulativeLifetimeUnrecoverableReadErrors; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.ReliabilityStatisticsParameter _parent() { return _parent; }
    }
    public static class InvalidDWordCountPortA extends KaitaiStruct {
        public static InvalidDWordCountPortA fromFile(String fileName) throws IOException {
            return new InvalidDWordCountPortA(new ByteBufferKaitaiStream(fileName));
        }

        public InvalidDWordCountPortA(KaitaiStream _io) {
            this(_io, null, null);
        }

        public InvalidDWordCountPortA(KaitaiStream _io, FarmLogPage.ErrorStatisticsParameter _parent) {
            this(_io, _parent, null);
        }

        public InvalidDWordCountPortA(KaitaiStream _io, FarmLogPage.ErrorStatisticsParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.invalidDWordCountPortA = new BigInteger(this._io.readBytes(7)).longValue();
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long invalidDWordCountPortA;
        private FarmLogPage _root;
        private FarmLogPage.ErrorStatisticsParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long invalidDWordCountPortA() { return invalidDWordCountPortA; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.ErrorStatisticsParameter _parent() { return _parent; }
    }
    public static class NumberOfUnrecoverableReadErrorsFromEWLM extends KaitaiStruct {
        public static NumberOfUnrecoverableReadErrorsFromEWLM fromFile(String fileName) throws IOException {
            return new NumberOfUnrecoverableReadErrorsFromEWLM(new ByteBufferKaitaiStream(fileName));
        }

        public NumberOfUnrecoverableReadErrorsFromEWLM(KaitaiStream _io) {
            this(_io, null, null);
        }

        public NumberOfUnrecoverableReadErrorsFromEWLM(KaitaiStream _io, FarmLogPage.ErrorStatisticsParameter _parent) {
            this(_io, _parent, null);
        }

        public NumberOfUnrecoverableReadErrorsFromEWLM(KaitaiStream _io, FarmLogPage.ErrorStatisticsParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.numberOfUnrecoverableReadErrorsFromEWLM = new BigInteger(this._io.readBytes(7)).longValue();
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long numberOfUnrecoverableReadErrorsFromEWLM;
        private FarmLogPage _root;
        private FarmLogPage.ErrorStatisticsParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long numberOfUnrecoverableReadErrorsFromEWLM() { return numberOfUnrecoverableReadErrorsFromEWLM; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.ErrorStatisticsParameter _parent() { return _parent; }
    }
    public static class HardwareResetCount extends KaitaiStruct {
        public static HardwareResetCount fromFile(String fileName) throws IOException {
            return new HardwareResetCount(new ByteBufferKaitaiStream(fileName));
        }

        public HardwareResetCount(KaitaiStream _io) {
            this(_io, null, null);
        }

        public HardwareResetCount(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent) {
            this(_io, _parent, null);
        }

        public HardwareResetCount(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.hardwareResetCount = new BigInteger(this._io.readBytes(7)).longValue();
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long hardwareResetCount;
        private FarmLogPage _root;
        private FarmLogPage.GeneralDriveInformationParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long hardwareResetCount() { return hardwareResetCount; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.GeneralDriveInformationParameter _parent() { return _parent; }
    }
    public static class TotalNumberOfOtherCommands extends KaitaiStruct {
        public static TotalNumberOfOtherCommands fromFile(String fileName) throws IOException {
            return new TotalNumberOfOtherCommands(new ByteBufferKaitaiStream(fileName));
        }

        public TotalNumberOfOtherCommands(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TotalNumberOfOtherCommands(KaitaiStream _io, FarmLogPage.WorkloadStatisticsParameter _parent) {
            this(_io, _parent, null);
        }

        public TotalNumberOfOtherCommands(KaitaiStream _io, FarmLogPage.WorkloadStatisticsParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.totalNumberOfOtherCommands = new BigInteger(this._io.readBytes(7)).longValue();;
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long totalNumberOfOtherCommands;
        private FarmLogPage _root;
        private FarmLogPage.WorkloadStatisticsParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long totalNumberOfOtherCommands() { return totalNumberOfOtherCommands; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.WorkloadStatisticsParameter _parent() { return _parent; }
    }
    public static class NumberOfHeads extends KaitaiStruct {
        public static NumberOfHeads fromFile(String fileName) throws IOException {
            return new NumberOfHeads(new ByteBufferKaitaiStream(fileName));
        }

        public NumberOfHeads(KaitaiStream _io) {
            this(_io, null, null);
        }

        public NumberOfHeads(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent) {
            this(_io, _parent, null);
        }

        public NumberOfHeads(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.numberOfHeads = new BigInteger(this._io.readBytes(7)).longValue();
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long numberOfHeads;
        private FarmLogPage _root;
        private FarmLogPage.GeneralDriveInformationParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long numberOfHeads() { return numberOfHeads; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.GeneralDriveInformationParameter _parent() { return _parent; }
    }
    public static class CurrentTemperatureInCelsius extends KaitaiStruct {
        public static CurrentTemperatureInCelsius fromFile(String fileName) throws IOException {
            return new CurrentTemperatureInCelsius(new ByteBufferKaitaiStream(fileName));
        }

        public CurrentTemperatureInCelsius(KaitaiStream _io) {
            this(_io, null, null);
        }

        public CurrentTemperatureInCelsius(KaitaiStream _io, FarmLogPage.EnvironmentalStatisticsParameter _parent) {
            this(_io, _parent, null);
        }

        public CurrentTemperatureInCelsius(KaitaiStream _io, FarmLogPage.EnvironmentalStatisticsParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.currentTemperatureInCelsius = new BigInteger(this._io.readBytes(7)).longValue()/10.0;
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private double currentTemperatureInCelsius;
        private FarmLogPage _root;
        private FarmLogPage.EnvironmentalStatisticsParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public double currentTemperatureInCelsius() { return currentTemperatureInCelsius; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.EnvironmentalStatisticsParameter _parent() { return _parent; }
    }
    public static class TimeAvailableToSaveUserData extends KaitaiStruct {
        public static TimeAvailableToSaveUserData fromFile(String fileName) throws IOException {
            return new TimeAvailableToSaveUserData(new ByteBufferKaitaiStream(fileName));
        }

        public TimeAvailableToSaveUserData(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TimeAvailableToSaveUserData(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent) {
            this(_io, _parent, null);
        }

        public TimeAvailableToSaveUserData(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.timeAvailableToSaveUserData = new BigInteger(this._io.readBytes(7)).longValue();
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long timeAvailableToSaveUserData;
        private FarmLogPage _root;
        private FarmLogPage.GeneralDriveInformationParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long timeAvailableToSaveUserData() { return timeAvailableToSaveUserData; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.GeneralDriveInformationParameter _parent() { return _parent; }
    }
    public static class WorkloadStatisticsParameter extends KaitaiStruct {
        public static WorkloadStatisticsParameter fromFile(String fileName) throws IOException {
            return new WorkloadStatisticsParameter(new ByteBufferKaitaiStream(fileName));
        }

        public WorkloadStatisticsParameter(KaitaiStream _io) {
            this(_io, null, null);
        }

        public WorkloadStatisticsParameter(KaitaiStream _io, FarmLogPage.LogParameters _parent) {
            this(_io, _parent, null);
        }

        public WorkloadStatisticsParameter(KaitaiStream _io, FarmLogPage.LogParameters _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.commonParameter = new LogParameterCommon(this._io, this, _root);
            this.ratedWorkloadPercentage = new RatedWorkloadPercentage(this._io, this, _root);
            this.totalNumberOfReadCommmands = new TotalNumberOfReadCommmands(this._io, this, _root);
            this.totalNumberOfWriteCommands = new TotalNumberOfWriteCommands(this._io, this, _root);
            this.totalNumberOfRandomReadCommands = new TotalNumberOfRandomReadCommands(this._io, this, _root);
            this.totalNumberOfRandomWriteCommands = new TotalNumberOfRandomWriteCommands(this._io, this, _root);
            this.totalNumberOfOtherCommands = new TotalNumberOfOtherCommands(this._io, this, _root);
            this.logicalSectorsWritten = new LogicalSectorsWritten(this._io, this, _root);
            this.logicalSectorsRead = new LogicalSectorsRead(this._io, this, _root);
        }
        @JsonProperty
        private LogParameterCommon commonParameter;
        @JsonProperty
        private RatedWorkloadPercentage ratedWorkloadPercentage;
        @JsonProperty
        private TotalNumberOfReadCommmands totalNumberOfReadCommmands;
        @JsonProperty
        private TotalNumberOfWriteCommands totalNumberOfWriteCommands;
        @JsonProperty
        private TotalNumberOfRandomReadCommands totalNumberOfRandomReadCommands;
        @JsonProperty
        private TotalNumberOfRandomWriteCommands totalNumberOfRandomWriteCommands;
        @JsonProperty
        private TotalNumberOfOtherCommands totalNumberOfOtherCommands;
        @JsonProperty
        private LogicalSectorsWritten logicalSectorsWritten;
        @JsonProperty
        private LogicalSectorsRead logicalSectorsRead;
        @JsonProperty
        private String writeCommands0To3125Percent;

        @JsonProperty
        private String writeCommands3125To25Percent;

        @JsonProperty
        private String writeCommands25To50Percent;

        @JsonProperty
        private String writeCommands50To100Percent;

        @JsonProperty
        private String readCommandsTransferLengthLe16kb;

        @JsonProperty
        private String readCommandsTransferLength16kbTo512kb;

        @JsonProperty
        private String readCommandsTransferLength512kbTo2mb;

        @JsonProperty
        private String readCommandsTransferLengthGt2mb;

        @JsonProperty
        private String writeCommandsTransferLengthLe16kb;

        @JsonProperty
        private String writeCommandsTransferLength16kbTo512kb;

        @JsonProperty
        private String writeCommandsTransferLength512kbTo2mb;

        @JsonProperty
        private String writeCommandsTransferLengthGt2mb;
        private FarmLogPage _root;
        private FarmLogPage.LogParameters _parent;
        public LogParameterCommon commonParameter() { return commonParameter; }

        /**
         * Rated Workload Percentage (No longer Supported)
         */
        public RatedWorkloadPercentage ratedWorkloadPercentage() { return ratedWorkloadPercentage; }

        /**
         * Total Number of Read Commands
         */
        public TotalNumberOfReadCommmands totalNumberOfReadCommmands() { return totalNumberOfReadCommmands; }

        /**
         * Total Number of Write Commands
         */
        public TotalNumberOfWriteCommands totalNumberOfWriteCommands() { return totalNumberOfWriteCommands; }

        /**
         * Total Number of Random Read Commands
         */
        public TotalNumberOfRandomReadCommands totalNumberOfRandomReadCommands() { return totalNumberOfRandomReadCommands; }

        /**
         * Total Number of Random Write Commands
         */
        public TotalNumberOfRandomWriteCommands totalNumberOfRandomWriteCommands() { return totalNumberOfRandomWriteCommands; }

        /**
         * Total Number of Other Commands
         */
        public TotalNumberOfOtherCommands totalNumberOfOtherCommands() { return totalNumberOfOtherCommands; }

        /**
         * Logical Sectors Written
         */
        public LogicalSectorsWritten logicalSectorsWritten() { return logicalSectorsWritten; }

        /**
         * Logical Sectord Read
         */
        public LogicalSectorsRead logicalSectorsRead() { return logicalSectorsRead; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.LogParameters _parent() { return _parent; }
    }
    public static class ReliabilityStatisticsParameter extends KaitaiStruct {
        public static ReliabilityStatisticsParameter fromFile(String fileName) throws IOException {
            return new ReliabilityStatisticsParameter(new ByteBufferKaitaiStream(fileName));
        }

        public ReliabilityStatisticsParameter(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ReliabilityStatisticsParameter(KaitaiStream _io, FarmLogPage.LogParameters _parent) {
            this(_io, _parent, null);
        }

        public ReliabilityStatisticsParameter(KaitaiStream _io, FarmLogPage.LogParameters _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.commonParameter = new LogParameterCommon(this._io, this, _root);
            this.reserved20To123 = new String(this._io.readBytes(104), Charset.forName("ASCII"));
            this.numberOfRAWOperations = new NumberOfRAWOperations(this._io, this, _root);
            this.cummulativeLifetimeUnrecoverableReadErrors = new CummulativeLifetimeUnrecoverableReadErrors(this._io, this, _root);
            this.reserved140To203 = new String(this._io.readBytes(64), Charset.forName("ASCII"));
            this.heliumPressureThresholdTrip = new HeliumPressureThresholdTrip(this._io, this, _root);
            this.reserved212To235 = new String(this._io.readBytes(24), Charset.forName("ASCII"));
        }
        @JsonProperty
        private LogParameterCommon commonParameter;
        @JsonProperty
        private String reserved20To123;
        @JsonProperty
        private NumberOfRAWOperations numberOfRAWOperations;
        @JsonProperty
        private CummulativeLifetimeUnrecoverableReadErrors cummulativeLifetimeUnrecoverableReadErrors;
        @JsonProperty
        private String reserved140To203;
        @JsonProperty
        private HeliumPressureThresholdTrip heliumPressureThresholdTrip;
        @JsonProperty
        private String reserved212To235;
        private FarmLogPage _root;
        private FarmLogPage.LogParameters _parent;
        public LogParameterCommon commonParameter() { return commonParameter; }
        public String reserved20To123() { return reserved20To123; }

        /**
         * Number of RAW Operations
         */
        public NumberOfRAWOperations numberOfRAWOperations() { return numberOfRAWOperations; }

        /**
         * Cumulative Lifetime Unrecoverable Read errors due to Error Recovery Control (e.g. ERC timeout)
         */
        public CummulativeLifetimeUnrecoverableReadErrors cummulativeLifetimeUnrecoverableReadErrors() { return cummulativeLifetimeUnrecoverableReadErrors; }
        public String reserved140To203() { return reserved140To203; }

        /**
         * Helium Pressure Threshold Trip (1 – trip 0 – no trip)
         */
        public HeliumPressureThresholdTrip heliumPressureThresholdTrip() { return heliumPressureThresholdTrip; }
        public String reserved212To235() { return reserved212To235; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.LogParameters _parent() { return _parent; }
    }
    public static class FirmwareRevision extends KaitaiStruct {
        public static FirmwareRevision fromFile(String fileName) throws IOException {
            return new FirmwareRevision(new ByteBufferKaitaiStream(fileName));
        }

        public FirmwareRevision(KaitaiStream _io) {
            this(_io, null, null);
        }

        public FirmwareRevision(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent) {
            this(_io, _parent, null);
        }

        public FirmwareRevision(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.firmwareRevision = new String(this._io.readBytes(15), Charset.forName("ASCII"));
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private String firmwareRevision;
        private FarmLogPage _root;
        private FarmLogPage.GeneralDriveInformationParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public String firmwareRevision() { return firmwareRevision; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.GeneralDriveInformationParameter _parent() { return _parent; }
    }
    public static class LogParameterCommon extends KaitaiStruct {
        public static LogParameterCommon fromFile(String fileName) throws IOException {
            return new LogParameterCommon(new ByteBufferKaitaiStream(fileName));
        }

        public LogParameterCommon(KaitaiStream _io) {
            this(_io, null, null);
        }

        public LogParameterCommon(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public LogParameterCommon(KaitaiStream _io, KaitaiStruct _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.parameterCode = this._io.readU2be();
            this.parameterControlByte = this._io.readU1();
            this.parameterLength = this._io.readU1();
            this.pageNumber = new PageNumber(this._io, this, _root);
            this.copyNumber = new CopyNumber(this._io, this, _root);
        }
        @JsonProperty
        private int parameterCode;
        @JsonProperty
        private int parameterControlByte;
        @JsonProperty
        private int parameterLength;
        @JsonProperty
        private PageNumber pageNumber;
        @JsonProperty
        private CopyNumber copyNumber;
        private FarmLogPage _root;
        private KaitaiStruct _parent;

        /**
         * Parameter Code : 0x02 (byte 0-1)
         */
        public int parameterCode() { return parameterCode; }

        /**
         * Parameter Control Byte: 0x03 (byte 2)
         */
        public int parameterControlByte() { return parameterControlByte; }

        /**
         * Parameter Length: 80 (byte 3)
         */
        public int parameterLength() { return parameterLength; }
        public PageNumber pageNumber() { return pageNumber; }
        public CopyNumber copyNumber() { return copyNumber; }
        public FarmLogPage _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class DeviceCapacity extends KaitaiStruct {
        public static DeviceCapacity fromFile(String fileName) throws IOException {
            return new DeviceCapacity(new ByteBufferKaitaiStream(fileName));
        }

        public DeviceCapacity(KaitaiStream _io) {
            this(_io, null, null);
        }

        public DeviceCapacity(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent) {
            this(_io, _parent, null);
        }

        public DeviceCapacity(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.deviceCapacity = new BigInteger(this._io.readBytes(7)).longValue();
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long deviceCapacity;
        private FarmLogPage _root;
        private FarmLogPage.GeneralDriveInformationParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long deviceCapacity() { return deviceCapacity; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.GeneralDriveInformationParameter _parent() { return _parent; }
    }
    public static class GeneralDriveInformationParameter extends KaitaiStruct {
        public static GeneralDriveInformationParameter fromFile(String fileName) throws IOException {
            return new GeneralDriveInformationParameter(new ByteBufferKaitaiStream(fileName));
        }

        public GeneralDriveInformationParameter(KaitaiStream _io) {
            this(_io, null, null);
        }

        public GeneralDriveInformationParameter(KaitaiStream _io, FarmLogPage.LogParameters _parent) {
            this(_io, _parent, null);
        }

        public GeneralDriveInformationParameter(KaitaiStream _io, FarmLogPage.LogParameters _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.commonParameter = new LogParameterCommon(this._io, this, _root);
            this.gdprInfo = new String(this._io.readBytes(32), Charset.forName("ASCII"));
            this.deviceInterface = new DeviceInterface(this._io, this, _root);
            this.deviceCapacity = new DeviceCapacity(this._io, this, _root);
            this.physicalSectorSize = new PhysicalSectorSize(this._io, this, _root);
            this.logicalSectorSize = new LogicalSectorSize(this._io, this, _root);
            this.deviceBufferSize = new DeviceBufferSize(this._io, this, _root);
            this.numberOfHeads = new NumberOfHeads(this._io, this, _root);
            this.deviceFormFactor = new DeviceFormFactor(this._io, this, _root);
            this.rotationalRateOfDevice = new RotationalRateOfDevice(this._io, this, _root);
            this.firmwareRevision = new FirmwareRevision(this._io, this, _root);
            this.reserved132To155 = new String(this._io.readBytes(24), Charset.forName("ASCII"));
            this.powerOnHours = new PowerOnHours(this._io, this, _root);
            this.reserved164To187 = new String(this._io.readBytes(24), Charset.forName("ASCII"));
            this.powerCycleCount = new PowerCycleCount(this._io, this, _root);
            this.hardwareResetCount = new HardwareResetCount(this._io, this, _root);
            this.reserved204To211 = new String(this._io.readBytes(8), Charset.forName("ASCII"));
            this.nvcStatusOnPowerOn = new NvcStatusOnPowerOn(this._io, this, _root);
            this.timeAvailableToSaveUserData = new TimeAvailableToSaveUserData(this._io, this, _root);
            this.timestampOfFirstSmartSummary = new TimestampOfFirstSmartSummary(this._io, this, _root);
            this.timestampOfLastSmartSummary = new TimestampOfLastSmartSummary(this._io, this, _root);
        }
        @JsonProperty
        private LogParameterCommon commonParameter;
        @JsonProperty
        private String gdprInfo;
        @JsonProperty
        private DeviceInterface deviceInterface;
        @JsonProperty
        private DeviceCapacity deviceCapacity;
        @JsonProperty
        private PhysicalSectorSize physicalSectorSize;
        @JsonProperty
        private LogicalSectorSize logicalSectorSize;
        @JsonProperty
        private DeviceBufferSize deviceBufferSize;
        @JsonProperty
        private NumberOfHeads numberOfHeads;
        @JsonProperty
        private DeviceFormFactor deviceFormFactor;
        @JsonProperty
        private RotationalRateOfDevice rotationalRateOfDevice;
        @JsonProperty
        private FirmwareRevision firmwareRevision;
        @JsonProperty
        private String reserved132To155;
        @JsonProperty
        private PowerOnHours powerOnHours;
        @JsonProperty
        private String reserved164To187;
        @JsonProperty
        private PowerCycleCount powerCycleCount;
        @JsonProperty
        private HardwareResetCount hardwareResetCount;
        @JsonProperty
        private String reserved204To211;
        @JsonProperty
        private NvcStatusOnPowerOn nvcStatusOnPowerOn;
        @JsonProperty
        private TimeAvailableToSaveUserData timeAvailableToSaveUserData;
        @JsonProperty
        private TimestampOfFirstSmartSummary timestampOfFirstSmartSummary;
        @JsonProperty
        private TimestampOfLastSmartSummary timestampOfLastSmartSummary;
        @JsonProperty
        private Object dateOfAssembly;
        private FarmLogPage _root;
        private FarmLogPage.LogParameters _parent;
        public LogParameterCommon commonParameter() { return commonParameter; }
        public String gdprInfo() { return gdprInfo; }
        public DeviceInterface deviceInterface() { return deviceInterface; }
        public DeviceCapacity deviceCapacity() { return deviceCapacity; }
        public PhysicalSectorSize physicalSectorSize() { return physicalSectorSize; }
        public LogicalSectorSize logicalSectorSize() { return logicalSectorSize; }
        public DeviceBufferSize deviceBufferSize() { return deviceBufferSize; }
        public NumberOfHeads numberOfHeads() { return numberOfHeads; }
        public DeviceFormFactor deviceFormFactor() { return deviceFormFactor; }
        public RotationalRateOfDevice rotationalRateOfDevice() { return rotationalRateOfDevice; }
        public FirmwareRevision firmwareRevision() { return firmwareRevision; }
        public String reserved132To155() { return reserved132To155; }
        public PowerOnHours powerOnHours() { return powerOnHours; }
        public String reserved164To187() { return reserved164To187; }
        public PowerCycleCount powerCycleCount() { return powerCycleCount; }
        public HardwareResetCount hardwareResetCount() { return hardwareResetCount; }
        public String reserved204To211() { return reserved204To211; }
        public NvcStatusOnPowerOn nvcStatusOnPowerOn() { return nvcStatusOnPowerOn; }
        public TimeAvailableToSaveUserData timeAvailableToSaveUserData() { return timeAvailableToSaveUserData; }
        public TimestampOfFirstSmartSummary timestampOfFirstSmartSummary() { return timestampOfFirstSmartSummary; }
        public TimestampOfLastSmartSummary timestampOfLastSmartSummary() { return timestampOfLastSmartSummary; }
        public FarmLogPage _root() { return _root; }
        public Object dateOfAssembly() { return dateOfAssembly; }
        public FarmLogPage.LogParameters _parent() { return _parent; }
    }
    public static class InvalidDWordCountPortB extends KaitaiStruct {
        public static InvalidDWordCountPortB fromFile(String fileName) throws IOException {
            return new InvalidDWordCountPortB(new ByteBufferKaitaiStream(fileName));
        }

        public InvalidDWordCountPortB(KaitaiStream _io) {
            this(_io, null, null);
        }

        public InvalidDWordCountPortB(KaitaiStream _io, FarmLogPage.ErrorStatisticsParameter _parent) {
            this(_io, _parent, null);
        }

        public InvalidDWordCountPortB(KaitaiStream _io, FarmLogPage.ErrorStatisticsParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.invalidDWordCountPortB = new BigInteger(this._io.readBytes(7)).longValue();
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long invalidDWordCountPortB;
        private FarmLogPage _root;
        private FarmLogPage.ErrorStatisticsParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long invalidDWordCountPortB() { return invalidDWordCountPortB; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.ErrorStatisticsParameter _parent() { return _parent; }
    }
    public static class ErrorStatisticsParameter extends KaitaiStruct {
        public static ErrorStatisticsParameter fromFile(String fileName) throws IOException {
            return new ErrorStatisticsParameter(new ByteBufferKaitaiStream(fileName));
        }

        public ErrorStatisticsParameter(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ErrorStatisticsParameter(KaitaiStream _io, FarmLogPage.LogParameters _parent) {
            this(_io, _parent, null);
        }

        public ErrorStatisticsParameter(KaitaiStream _io, FarmLogPage.LogParameters _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.commonParameter = new LogParameterCommon(this._io, this, _root);
            this.numberOfUnrecoverableReadErrorsFromEWLM = new NumberOfUnrecoverableReadErrorsFromEWLM(this._io, this, _root);
            this.numberOfUnrecoverableWriteErrorsFromEWLM = new NumberOfUnrecoverableWriteErrorsFromEWLM(this._io, this, _root);
            this.reserved36To51 = new String(this._io.readBytes(16), Charset.forName("ASCII"));
            this.numberOfMechanicalStartErrors = new NumberOfMechanicalStartErrors(this._io, this, _root);
            this.reserved60To163 = new String(this._io.readBytes(104), Charset.forName("ASCII"));
            this.fRUCodeIfSmartTrip = new FRUCodeIfSmartTrip(this._io, this, _root);
            this.invalidDWordCountPortA = new InvalidDWordCountPortA(this._io, this, _root);
            this.invalidDWordCountPortB = new InvalidDWordCountPortB(this._io, this, _root);
        }
        @JsonProperty
        private LogParameterCommon commonParameter;
        @JsonProperty
        private NumberOfUnrecoverableReadErrorsFromEWLM numberOfUnrecoverableReadErrorsFromEWLM;
        @JsonProperty
        private NumberOfUnrecoverableWriteErrorsFromEWLM numberOfUnrecoverableWriteErrorsFromEWLM;
        @JsonProperty
        private String reserved36To51;
        @JsonProperty
        private NumberOfMechanicalStartErrors numberOfMechanicalStartErrors;
        @JsonProperty
        private String reserved60To163;
        @JsonProperty
        private FRUCodeIfSmartTrip fRUCodeIfSmartTrip;
        @JsonProperty
        private InvalidDWordCountPortA invalidDWordCountPortA;
        @JsonProperty
        private InvalidDWordCountPortB invalidDWordCountPortB;
        @JsonProperty
        private String disparityErrorCountPartA;
        @JsonProperty
        private String disparityErrorCountPartB;
        @JsonProperty
        private String sossOfDwordSyncPartA;
        @JsonProperty
        private String sossOfDwordSyncPartB;
        @JsonProperty
        private String phyResetProblemPartA;
        @JsonProperty
        private String phyResetProblemPartB;
        private FarmLogPage _root;
        private FarmLogPage.LogParameters _parent;
        public LogParameterCommon commonParameter() { return commonParameter; }
        public NumberOfUnrecoverableReadErrorsFromEWLM numberOfUnrecoverableReadErrorsFromEWLM() { return numberOfUnrecoverableReadErrorsFromEWLM; }
        public NumberOfUnrecoverableWriteErrorsFromEWLM numberOfUnrecoverableWriteErrorsFromEWLM() { return numberOfUnrecoverableWriteErrorsFromEWLM; }
        public String reserved36To51() { return reserved36To51; }

        /**
         * Number of Mechanical Start Retries ( Log Page 0x06, PC 0xD110)
         */
        public NumberOfMechanicalStartErrors numberOfMechanicalStartErrors() { return numberOfMechanicalStartErrors; }
        public String reserved60To163() { return reserved60To163; }

        /**
         * FRU code if smart trip from most recent SMART Frame
         */
        public FRUCodeIfSmartTrip fRUCodeIfSmartTrip() { return fRUCodeIfSmartTrip; }
        public InvalidDWordCountPortA invalidDWordCountPortA() { return invalidDWordCountPortA; }
        public InvalidDWordCountPortB invalidDWordCountPortB() { return invalidDWordCountPortB; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.LogParameters _parent() { return _parent; }
    }
    public static class DeviceBufferSize extends KaitaiStruct {
        public static DeviceBufferSize fromFile(String fileName) throws IOException {
            return new DeviceBufferSize(new ByteBufferKaitaiStream(fileName));
        }

        public DeviceBufferSize(KaitaiStream _io) {
            this(_io, null, null);
        }

        public DeviceBufferSize(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent) {
            this(_io, _parent, null);
        }

        public DeviceBufferSize(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.deviceBufferSize = new BigInteger(this._io.readBytes(7)).longValue();
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long deviceBufferSize;
        private FarmLogPage _root;
        private FarmLogPage.GeneralDriveInformationParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long deviceBufferSize() { return deviceBufferSize; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.GeneralDriveInformationParameter _parent() { return _parent; }
    }
    public static class LogSignature extends KaitaiStruct {
        public static LogSignature fromFile(String fileName) throws IOException {
            return new LogSignature(new ByteBufferKaitaiStream(fileName));
        }

        public LogSignature(KaitaiStream _io) {
            this(_io, null, null);
        }

        public LogSignature(KaitaiStream _io, FarmLogPage.HeaderParameter _parent) {
            this(_io, _parent, null);
        }

        public LogSignature(KaitaiStream _io, FarmLogPage.HeaderParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.logSignatureValue = new String(this._io.readBytes(7), Charset.forName("ASCII"));
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private String logSignatureValue;
        private FarmLogPage _root;
        private FarmLogPage.HeaderParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public String logSignatureValue() { return logSignatureValue; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.HeaderParameter _parent() { return _parent; }
    }
    public static class TimestampOfFirstSmartSummary extends KaitaiStruct {
        public static TimestampOfFirstSmartSummary fromFile(String fileName) throws IOException {
            return new TimestampOfFirstSmartSummary(new ByteBufferKaitaiStream(fileName));
        }

        public TimestampOfFirstSmartSummary(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TimestampOfFirstSmartSummary(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent) {
            this(_io, _parent, null);
        }

        public TimestampOfFirstSmartSummary(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.timestampOfFirstSmartSummary = new BigInteger(this._io.readBytes(7)).longValue();
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long timestampOfFirstSmartSummary;
        private FarmLogPage _root;
        private FarmLogPage.GeneralDriveInformationParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long timestampOfFirstSmartSummary() { return timestampOfFirstSmartSummary; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.GeneralDriveInformationParameter _parent() { return _parent; }
    }
    public static class StatusByte extends KaitaiStruct {
        public static StatusByte fromFile(String fileName) throws IOException {
            return new StatusByte(new ByteBufferKaitaiStream(fileName));
        }

        public StatusByte(KaitaiStream _io) {
            this(_io, null, null);
        }

        public StatusByte(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public StatusByte(KaitaiStream _io, KaitaiStruct _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.fieldSupported = this._io.readBitsIntBe(1) != 0;
            this.fieldValid = this._io.readBitsIntBe(1) != 0;
            this.reserved = this._io.readBitsIntBe(6);
        }
        @JsonProperty
        private boolean fieldSupported;
        @JsonProperty
        private boolean fieldValid;
        @JsonProperty
        private long reserved;
        private FarmLogPage _root;
        private KaitaiStruct _parent;
        public boolean fieldSupported() { return fieldSupported; }
        public boolean fieldValid() { return fieldValid; }
        public long reserved() { return reserved; }
        public FarmLogPage _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class HighestTemperatureInCelsius extends KaitaiStruct {
        public static HighestTemperatureInCelsius fromFile(String fileName) throws IOException {
            return new HighestTemperatureInCelsius(new ByteBufferKaitaiStream(fileName));
        }

        public HighestTemperatureInCelsius(KaitaiStream _io) {
            this(_io, null, null);
        }

        public HighestTemperatureInCelsius(KaitaiStream _io, FarmLogPage.EnvironmentalStatisticsParameter _parent) {
            this(_io, _parent, null);
        }

        public HighestTemperatureInCelsius(KaitaiStream _io, FarmLogPage.EnvironmentalStatisticsParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.highestTemperatureInCelsius = new BigInteger(this._io.readBytes(7)).longValue() /10.0;
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private double highestTemperatureInCelsius;
        private FarmLogPage _root;
        private FarmLogPage.EnvironmentalStatisticsParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public double highestTemperatureInCelsius() { return highestTemperatureInCelsius; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.EnvironmentalStatisticsParameter _parent() { return _parent; }
    }
    public static class LowestTemperatureInCelsius extends KaitaiStruct {
        public static LowestTemperatureInCelsius fromFile(String fileName) throws IOException {
            return new LowestTemperatureInCelsius(new ByteBufferKaitaiStream(fileName));
        }

        public LowestTemperatureInCelsius(KaitaiStream _io) {
            this(_io, null, null);
        }

        public LowestTemperatureInCelsius(KaitaiStream _io, FarmLogPage.EnvironmentalStatisticsParameter _parent) {
            this(_io, _parent, null);
        }

        public LowestTemperatureInCelsius(KaitaiStream _io, FarmLogPage.EnvironmentalStatisticsParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.lowestTemperatureInCelsius = new BigInteger(this._io.readBytes(7)).longValue()/10.0;
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private double lowestTemperatureInCelsius;
        private FarmLogPage _root;
        private FarmLogPage.EnvironmentalStatisticsParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public double lowestTemperatureInCelsius() { return lowestTemperatureInCelsius; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.EnvironmentalStatisticsParameter _parent() { return _parent; }
    }
    public static class LogParameters extends KaitaiStruct {
        public static LogParameters fromFile(String fileName) throws IOException {
            return new LogParameters(new ByteBufferKaitaiStream(fileName));
        }

        public LogParameters(KaitaiStream _io) {
            this(_io, null, null);
        }

        public LogParameters(KaitaiStream _io, FarmLogPage _parent) {
            this(_io, _parent, null);
        }

        public LogParameters(KaitaiStream _io, FarmLogPage _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.headerParameter = new HeaderParameter(this._io, this, _root);
            this.generalDriveInformationParameter = new GeneralDriveInformationParameter(this._io, this, _root);
            this.workloadStatisticsParameter = new WorkloadStatisticsParameter(this._io, this, _root);
            this.errorStatisticsParameter = new ErrorStatisticsParameter(this._io, this, _root);
            this.environmentalStatisticsParameter = new EnvironmentalStatisticsParameter(this._io, this, _root);
            this.reliabilityStatisticsParameter = new ReliabilityStatisticsParameter(this._io, this, _root);
        }
        @JsonProperty
        private HeaderParameter headerParameter;
        @JsonProperty
        private GeneralDriveInformationParameter generalDriveInformationParameter;
        @JsonProperty
        private WorkloadStatisticsParameter workloadStatisticsParameter;
        @JsonProperty
        private ErrorStatisticsParameter errorStatisticsParameter;
        @JsonProperty
        private EnvironmentalStatisticsParameter environmentalStatisticsParameter;
        @JsonProperty
        private ReliabilityStatisticsParameter reliabilityStatisticsParameter;
        private FarmLogPage _root;
        private FarmLogPage _parent;
        public HeaderParameter headerParameter() { return headerParameter; }
        public GeneralDriveInformationParameter generalDriveInformationParameter() { return generalDriveInformationParameter; }
        public WorkloadStatisticsParameter workloadStatisticsParameter() { return workloadStatisticsParameter; }
        public ErrorStatisticsParameter errorStatisticsParameter() { return errorStatisticsParameter; }
        public EnvironmentalStatisticsParameter environmentalStatisticsParameter() { return environmentalStatisticsParameter; }
        public ReliabilityStatisticsParameter reliabilityStatisticsParameter() { return reliabilityStatisticsParameter; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage _parent() { return _parent; }
    }
    public static class SpecifiedMinOperatingTemperatureInCelsius extends KaitaiStruct {
        public static SpecifiedMinOperatingTemperatureInCelsius fromFile(String fileName) throws IOException {
            return new SpecifiedMinOperatingTemperatureInCelsius(new ByteBufferKaitaiStream(fileName));
        }

        public SpecifiedMinOperatingTemperatureInCelsius(KaitaiStream _io) {
            this(_io, null, null);
        }

        public SpecifiedMinOperatingTemperatureInCelsius(KaitaiStream _io, FarmLogPage.EnvironmentalStatisticsParameter _parent) {
            this(_io, _parent, null);
        }

        public SpecifiedMinOperatingTemperatureInCelsius(KaitaiStream _io, FarmLogPage.EnvironmentalStatisticsParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.specifiedMinOperatingTemperatureInCelsius = new BigInteger(this._io.readBytes(7)).longValue();;
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long specifiedMinOperatingTemperatureInCelsius;
        private FarmLogPage _root;
        private FarmLogPage.EnvironmentalStatisticsParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long specifiedMinOperatingTemperatureInCelsius() { return specifiedMinOperatingTemperatureInCelsius; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.EnvironmentalStatisticsParameter _parent() { return _parent; }
    }
    public static class RotationalRateOfDevice extends KaitaiStruct {
        public static RotationalRateOfDevice fromFile(String fileName) throws IOException {
            return new RotationalRateOfDevice(new ByteBufferKaitaiStream(fileName));
        }

        public RotationalRateOfDevice(KaitaiStream _io) {
            this(_io, null, null);
        }

        public RotationalRateOfDevice(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent) {
            this(_io, _parent, null);
        }

        public RotationalRateOfDevice(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.rotationalRateOfDevice = new BigInteger(this._io.readBytes(7)).longValue();
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long rotationalRateOfDevice;
        private FarmLogPage _root;
        private FarmLogPage.GeneralDriveInformationParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long rotationalRateOfDevice() { return rotationalRateOfDevice; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.GeneralDriveInformationParameter _parent() { return _parent; }
    }
    public static class PhysicalSectorSize extends KaitaiStruct {
        public static PhysicalSectorSize fromFile(String fileName) throws IOException {
            return new PhysicalSectorSize(new ByteBufferKaitaiStream(fileName));
        }

        public PhysicalSectorSize(KaitaiStream _io) {
            this(_io, null, null);
        }

        public PhysicalSectorSize(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent) {
            this(_io, _parent, null);
        }

        public PhysicalSectorSize(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.physicalSectorSize = new BigInteger(this._io.readBytes(7)).longValue();
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long physicalSectorSize;
        private FarmLogPage _root;
        private FarmLogPage.GeneralDriveInformationParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long physicalSectorSize() { return physicalSectorSize; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.GeneralDriveInformationParameter _parent() { return _parent; }
    }
    public static class TotalNumberOfRandomReadCommands extends KaitaiStruct {
        public static TotalNumberOfRandomReadCommands fromFile(String fileName) throws IOException {
            return new TotalNumberOfRandomReadCommands(new ByteBufferKaitaiStream(fileName));
        }

        public TotalNumberOfRandomReadCommands(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TotalNumberOfRandomReadCommands(KaitaiStream _io, FarmLogPage.WorkloadStatisticsParameter _parent) {
            this(_io, _parent, null);
        }

        public TotalNumberOfRandomReadCommands(KaitaiStream _io, FarmLogPage.WorkloadStatisticsParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.totalNumberOfRandomReadCommands = new BigInteger(this._io.readBytes(7)).longValue();;
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long totalNumberOfRandomReadCommands;
        private FarmLogPage _root;
        private FarmLogPage.WorkloadStatisticsParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long totalNumberOfRandomReadCommands() { return totalNumberOfRandomReadCommands; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.WorkloadStatisticsParameter _parent() { return _parent; }
    }
    public static class LogicalSectorsRead extends KaitaiStruct {
        public static LogicalSectorsRead fromFile(String fileName) throws IOException {
            return new LogicalSectorsRead(new ByteBufferKaitaiStream(fileName));
        }

        public LogicalSectorsRead(KaitaiStream _io) {
            this(_io, null, null);
        }

        public LogicalSectorsRead(KaitaiStream _io, FarmLogPage.WorkloadStatisticsParameter _parent) {
            this(_io, _parent, null);
        }

        public LogicalSectorsRead(KaitaiStream _io, FarmLogPage.WorkloadStatisticsParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.logicalSectorsRead = new BigInteger(this._io.readBytes(7)).longValue();;
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long logicalSectorsRead;
        private FarmLogPage _root;
        private FarmLogPage.WorkloadStatisticsParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long logicalSectorsRead() { return logicalSectorsRead; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.WorkloadStatisticsParameter _parent() { return _parent; }
    }
    public static class CurrentMotorPower extends KaitaiStruct {
        public static CurrentMotorPower fromFile(String fileName) throws IOException {
            return new CurrentMotorPower(new ByteBufferKaitaiStream(fileName));
        }

        public CurrentMotorPower(KaitaiStream _io) {
            this(_io, null, null);
        }

        public CurrentMotorPower(KaitaiStream _io, FarmLogPage.EnvironmentalStatisticsParameter _parent) {
            this(_io, _parent, null);
        }

        public CurrentMotorPower(KaitaiStream _io, FarmLogPage.EnvironmentalStatisticsParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.currentMotorPower = new BigInteger(this._io.readBytes(7)).longValue();;
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long currentMotorPower;
        private FarmLogPage _root;
        private FarmLogPage.EnvironmentalStatisticsParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long currentMotorPower() { return currentMotorPower; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.EnvironmentalStatisticsParameter _parent() { return _parent; }
    }
    public static class LogicalSectorsWritten extends KaitaiStruct {
        public static LogicalSectorsWritten fromFile(String fileName) throws IOException {
            return new LogicalSectorsWritten(new ByteBufferKaitaiStream(fileName));
        }

        public LogicalSectorsWritten(KaitaiStream _io) {
            this(_io, null, null);
        }

        public LogicalSectorsWritten(KaitaiStream _io, FarmLogPage.WorkloadStatisticsParameter _parent) {
            this(_io, _parent, null);
        }

        public LogicalSectorsWritten(KaitaiStream _io, FarmLogPage.WorkloadStatisticsParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.logicalSectorsWritten = new BigInteger(this._io.readBytes(7)).longValue();;
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long logicalSectorsWritten;
        private FarmLogPage _root;
        private FarmLogPage.WorkloadStatisticsParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long logicalSectorsWritten() { return logicalSectorsWritten; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.WorkloadStatisticsParameter _parent() { return _parent; }
    }
    public static class HeaderParameter extends KaitaiStruct {
        public static HeaderParameter fromFile(String fileName) throws IOException {
            return new HeaderParameter(new ByteBufferKaitaiStream(fileName));
        }

        public HeaderParameter(KaitaiStream _io) {
            this(_io, null, null);
        }

        public HeaderParameter(KaitaiStream _io, FarmLogPage.LogParameters _parent) {
            this(_io, _parent, null);
        }

        public HeaderParameter(KaitaiStream _io, FarmLogPage.LogParameters _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.parameterCode = this._io.readU2be();
            this.parameterControlByte = this._io.readU1();
            this.prameterLength = this._io.readU1();
            this.logSignature = new LogSignature(this._io, this, _root);
            this.logMajorRevision = new LogMajorRevision(this._io, this, _root);
            this.logMinorRevision = new LogMinorRevision(this._io, this, _root);
            this.numberOfLogParametersSupported = new NumberOfLogParametersSupported(this._io, this, _root);
            this.logPageSizeInBytes = new LogPageSizeInBytes(this._io, this, _root);
            this.reservedByte44To51 = new String(this._io.readBytes(8), Charset.forName("ASCII"));
            this.maximumDriveHeadsSupported = new MaximumDriveHeadsSupported(this._io, this, _root);
            this.reservedByte60To67 = new String(this._io.readBytes(8), Charset.forName("ASCII"));
        }
        @JsonProperty
        private int parameterCode;
        @JsonProperty
        private int parameterControlByte;
        @JsonProperty
        private int prameterLength;
        @JsonProperty
        private LogSignature logSignature;
        @JsonProperty
        private LogMajorRevision logMajorRevision;
        @JsonProperty
        private LogMinorRevision logMinorRevision;
        @JsonProperty
        private NumberOfLogParametersSupported numberOfLogParametersSupported;
        @JsonProperty
        private LogPageSizeInBytes logPageSizeInBytes;
        @JsonProperty
        private String reservedByte44To51;
        @JsonProperty
        private MaximumDriveHeadsSupported maximumDriveHeadsSupported;
        @JsonProperty
        private String reservedByte60To67;
        @JsonProperty
        private long reasonForFrameCapture;
        private FarmLogPage _root;
        private FarmLogPage.LogParameters _parent;

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
        public LogSignature logSignature() { return logSignature; }

        /**
         * Log Major Signature : 0xC000000000000003
         */
        public LogMajorRevision logMajorRevision() { return logMajorRevision; }

        /**
         * Log Minor Signature : 0xC000000000000007
         */
        public LogMinorRevision logMinorRevision() { return logMinorRevision; }

        /**
         * Number of Log Parameters supported : 0xC000000000000028      
         */
        public NumberOfLogParametersSupported numberOfLogParametersSupported() { return numberOfLogParametersSupported; }

        /**
         * Log Page Size in Bytes : 0xC000000000001784 = 6020
         */
        public LogPageSizeInBytes logPageSizeInBytes() { return logPageSizeInBytes; }

        /**
         * Reserved bytes
         */
        public String reservedByte44To51() { return reservedByte44To51; }

        /**
         * Maximum Drive Heads Supported : 0x12 = 18
         */
        public MaximumDriveHeadsSupported maximumDriveHeadsSupported() { return maximumDriveHeadsSupported; }

        /**
         * Reserved bytes
         */
        public String reservedByte60To67() { return reservedByte60To67; }

        /**
         * Reason for frame capture
         */
        public long reasonForFrameCapture() { return reasonForFrameCapture; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.LogParameters _parent() { return _parent; }
    }
    public static class TotalNumberOfReadCommmands extends KaitaiStruct {
        public static TotalNumberOfReadCommmands fromFile(String fileName) throws IOException {
            return new TotalNumberOfReadCommmands(new ByteBufferKaitaiStream(fileName));
        }

        public TotalNumberOfReadCommmands(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TotalNumberOfReadCommmands(KaitaiStream _io, FarmLogPage.WorkloadStatisticsParameter _parent) {
            this(_io, _parent, null);
        }

        public TotalNumberOfReadCommmands(KaitaiStream _io, FarmLogPage.WorkloadStatisticsParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.totalNumberOfReadCommmands = new BigInteger(this._io.readBytes(7)).longValue();;
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long totalNumberOfReadCommmands;
        private FarmLogPage _root;
        private FarmLogPage.WorkloadStatisticsParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long totalNumberOfReadCommmands() { return totalNumberOfReadCommmands; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.WorkloadStatisticsParameter _parent() { return _parent; }
    }
    public static class NumberOfRAWOperations extends KaitaiStruct {
        public static NumberOfRAWOperations fromFile(String fileName) throws IOException {
            return new NumberOfRAWOperations(new ByteBufferKaitaiStream(fileName));
        }

        public NumberOfRAWOperations(KaitaiStream _io) {
            this(_io, null, null);
        }

        public NumberOfRAWOperations(KaitaiStream _io, FarmLogPage.ReliabilityStatisticsParameter _parent) {
            this(_io, _parent, null);
        }

        public NumberOfRAWOperations(KaitaiStream _io, FarmLogPage.ReliabilityStatisticsParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.numberOfRAWOperations = new BigInteger(this._io.readBytes(7)).longValue();
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long numberOfRAWOperations;
        private FarmLogPage _root;
        private FarmLogPage.ReliabilityStatisticsParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long numberOfRAWOperations() { return numberOfRAWOperations; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.ReliabilityStatisticsParameter _parent() { return _parent; }
    }
    public static class MaximumDriveHeadsSupported extends KaitaiStruct {
        public static MaximumDriveHeadsSupported fromFile(String fileName) throws IOException {
            return new MaximumDriveHeadsSupported(new ByteBufferKaitaiStream(fileName));
        }

        public MaximumDriveHeadsSupported(KaitaiStream _io) {
            this(_io, null, null);
        }

        public MaximumDriveHeadsSupported(KaitaiStream _io, FarmLogPage.HeaderParameter _parent) {
            this(_io, _parent, null);
        }

        public MaximumDriveHeadsSupported(KaitaiStream _io, FarmLogPage.HeaderParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.maximumDriveHeadsSupportedValue = new BigInteger(this._io.readBytes(7)).longValue();
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long maximumDriveHeadsSupportedValue;
        private FarmLogPage _root;
        private FarmLogPage.HeaderParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long maximumDriveHeadsSupportedValue() { return maximumDriveHeadsSupportedValue; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.HeaderParameter _parent() { return _parent; }
    }
    public static class LogMinorRevision extends KaitaiStruct {
        public static LogMinorRevision fromFile(String fileName) throws IOException {
            return new LogMinorRevision(new ByteBufferKaitaiStream(fileName));
        }

        public LogMinorRevision(KaitaiStream _io) {
            this(_io, null, null);
        }

        public LogMinorRevision(KaitaiStream _io, FarmLogPage.HeaderParameter _parent) {
            this(_io, _parent, null);
        }

        public LogMinorRevision(KaitaiStream _io, FarmLogPage.HeaderParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.logMinorRevisionValue = new BigInteger(this._io.readBytes(7)).longValue();
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long logMinorRevisionValue;
        private FarmLogPage _root;
        private FarmLogPage.HeaderParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long logMinorRevisionValue() { return logMinorRevisionValue; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.HeaderParameter _parent() { return _parent; }
    }
    public static class LogicalSectorSize extends KaitaiStruct {
        public static LogicalSectorSize fromFile(String fileName) throws IOException {
            return new LogicalSectorSize(new ByteBufferKaitaiStream(fileName));
        }

        public LogicalSectorSize(KaitaiStream _io) {
            this(_io, null, null);
        }

        public LogicalSectorSize(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent) {
            this(_io, _parent, null);
        }

        public LogicalSectorSize(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.logicalSectorSize = new BigInteger(this._io.readBytes(7)).longValue();
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long logicalSectorSize;
        private FarmLogPage _root;
        private FarmLogPage.GeneralDriveInformationParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long logicalSectorSize() { return logicalSectorSize; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.GeneralDriveInformationParameter _parent() { return _parent; }
    }
    public static class RatedWorkloadPercentage extends KaitaiStruct {
        public static RatedWorkloadPercentage fromFile(String fileName) throws IOException {
            return new RatedWorkloadPercentage(new ByteBufferKaitaiStream(fileName));
        }

        public RatedWorkloadPercentage(KaitaiStream _io) {
            this(_io, null, null);
        }

        public RatedWorkloadPercentage(KaitaiStream _io, FarmLogPage.WorkloadStatisticsParameter _parent) {
            this(_io, _parent, null);
        }

        public RatedWorkloadPercentage(KaitaiStream _io, FarmLogPage.WorkloadStatisticsParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.ratedWorkloadPercentage = new BigInteger(this._io.readBytes(7)).longValue();;
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long ratedWorkloadPercentage;
        private FarmLogPage _root;
        private FarmLogPage.WorkloadStatisticsParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long ratedWorkloadPercentage() { return ratedWorkloadPercentage; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.WorkloadStatisticsParameter _parent() { return _parent; }
    }
    public static class LogPageSizeInBytes extends KaitaiStruct {
        public static LogPageSizeInBytes fromFile(String fileName) throws IOException {
            return new LogPageSizeInBytes(new ByteBufferKaitaiStream(fileName));
        }

        public LogPageSizeInBytes(KaitaiStream _io) {
            this(_io, null, null);
        }

        public LogPageSizeInBytes(KaitaiStream _io, FarmLogPage.HeaderParameter _parent) {
            this(_io, _parent, null);
        }

        public LogPageSizeInBytes(KaitaiStream _io, FarmLogPage.HeaderParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.logPageSizeInBytesValue = new BigInteger(this._io.readBytes(7)).longValue();
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long logPageSizeInBytesValue;
        private FarmLogPage _root;
        private FarmLogPage.HeaderParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long logPageSizeInBytesValue() { return logPageSizeInBytesValue; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.HeaderParameter _parent() { return _parent; }
    }
    public static class FRUCodeIfSmartTrip extends KaitaiStruct {
        public static FRUCodeIfSmartTrip fromFile(String fileName) throws IOException {
            return new FRUCodeIfSmartTrip(new ByteBufferKaitaiStream(fileName));
        }

        public FRUCodeIfSmartTrip(KaitaiStream _io) {
            this(_io, null, null);
        }

        public FRUCodeIfSmartTrip(KaitaiStream _io, FarmLogPage.ErrorStatisticsParameter _parent) {
            this(_io, _parent, null);
        }

        public FRUCodeIfSmartTrip(KaitaiStream _io, FarmLogPage.ErrorStatisticsParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.fRUCodeIfSmartTrip = new BigInteger(this._io.readBytes(7)).longValue();
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long fRUCodeIfSmartTrip;
        private FarmLogPage _root;
        private FarmLogPage.ErrorStatisticsParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long fRUCodeIfSmartTrip() { return fRUCodeIfSmartTrip; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.ErrorStatisticsParameter _parent() { return _parent; }
    }
    public static class PowerOnHours extends KaitaiStruct {
        public static PowerOnHours fromFile(String fileName) throws IOException {
            return new PowerOnHours(new ByteBufferKaitaiStream(fileName));
        }

        public PowerOnHours(KaitaiStream _io) {
            this(_io, null, null);
        }

        public PowerOnHours(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent) {
            this(_io, _parent, null);
        }

        public PowerOnHours(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.powerOnHours = new BigInteger(this._io.readBytes(7)).longValue();
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long powerOnHours;
        private FarmLogPage _root;
        private FarmLogPage.GeneralDriveInformationParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long powerOnHours() { return powerOnHours; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.GeneralDriveInformationParameter _parent() { return _parent; }
    }
    public static class PowerCycleCount extends KaitaiStruct {
        public static PowerCycleCount fromFile(String fileName) throws IOException {
            return new PowerCycleCount(new ByteBufferKaitaiStream(fileName));
        }

        public PowerCycleCount(KaitaiStream _io) {
            this(_io, null, null);
        }

        public PowerCycleCount(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent) {
            this(_io, _parent, null);
        }

        public PowerCycleCount(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.powerCycleCount = new BigInteger(this._io.readBytes(7)).longValue();
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long powerCycleCount;
        private FarmLogPage _root;
        private FarmLogPage.GeneralDriveInformationParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long powerCycleCount() { return powerCycleCount; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.GeneralDriveInformationParameter _parent() { return _parent; }
    }
    public static class NumberOfLogParametersSupported extends KaitaiStruct {
        public static NumberOfLogParametersSupported fromFile(String fileName) throws IOException {
            return new NumberOfLogParametersSupported(new ByteBufferKaitaiStream(fileName));
        }

        public NumberOfLogParametersSupported(KaitaiStream _io) {
            this(_io, null, null);
        }

        public NumberOfLogParametersSupported(KaitaiStream _io, FarmLogPage.HeaderParameter _parent) {
            this(_io, _parent, null);
        }

        public NumberOfLogParametersSupported(KaitaiStream _io, FarmLogPage.HeaderParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.numberOfLogParametersSupportedValue = new BigInteger(this._io.readBytes(7)).longValue();
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long numberOfLogParametersSupportedValue;
        private FarmLogPage _root;
        private FarmLogPage.HeaderParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long numberOfLogParametersSupportedValue() { return numberOfLogParametersSupportedValue; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.HeaderParameter _parent() { return _parent; }
    }
    public static class PageNumber extends KaitaiStruct {
        public static PageNumber fromFile(String fileName) throws IOException {
            return new PageNumber(new ByteBufferKaitaiStream(fileName));
        }

        public PageNumber(KaitaiStream _io) {
            this(_io, null, null);
        }

        public PageNumber(KaitaiStream _io, FarmLogPage.LogParameterCommon _parent) {
            this(_io, _parent, null);
        }

        public PageNumber(KaitaiStream _io, FarmLogPage.LogParameterCommon _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.pageNumberValue = new BigInteger(this._io.readBytes(7)).longValue();
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long pageNumberValue;
        private FarmLogPage _root;
        private FarmLogPage.LogParameterCommon _parent;
        public StatusByte statusByte() { return statusByte; }

        /**
         * Page NUmber = 1
         */
        public long pageNumberValue() { return pageNumberValue; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.LogParameterCommon _parent() { return _parent; }
    }
    public static class HeliumPressureThresholdTrip extends KaitaiStruct {
        public static HeliumPressureThresholdTrip fromFile(String fileName) throws IOException {
            return new HeliumPressureThresholdTrip(new ByteBufferKaitaiStream(fileName));
        }

        public HeliumPressureThresholdTrip(KaitaiStream _io) {
            this(_io, null, null);
        }

        public HeliumPressureThresholdTrip(KaitaiStream _io, FarmLogPage.ReliabilityStatisticsParameter _parent) {
            this(_io, _parent, null);
        }

        public HeliumPressureThresholdTrip(KaitaiStream _io, FarmLogPage.ReliabilityStatisticsParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.heliumPressureThresholdTrip = new BigInteger(this._io.readBytes(7)).longValue();
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long heliumPressureThresholdTrip;
        private FarmLogPage _root;
        private FarmLogPage.ReliabilityStatisticsParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long heliumPressureThresholdTrip() { return heliumPressureThresholdTrip; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.ReliabilityStatisticsParameter _parent() { return _parent; }
    }
    public static class NvcStatusOnPowerOn extends KaitaiStruct {
        public static NvcStatusOnPowerOn fromFile(String fileName) throws IOException {
            return new NvcStatusOnPowerOn(new ByteBufferKaitaiStream(fileName));
        }

        public NvcStatusOnPowerOn(KaitaiStream _io) {
            this(_io, null, null);
        }

        public NvcStatusOnPowerOn(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent) {
            this(_io, _parent, null);
        }

        public NvcStatusOnPowerOn(KaitaiStream _io, FarmLogPage.GeneralDriveInformationParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.nvcStatusOnPowerOn = new BigInteger(this._io.readBytes(7)).longValue();
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long nvcStatusOnPowerOn;
        private FarmLogPage _root;
        private FarmLogPage.GeneralDriveInformationParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long nvcStatusOnPowerOn() { return nvcStatusOnPowerOn; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.GeneralDriveInformationParameter _parent() { return _parent; }
    }
    public static class TotalNumberOfWriteCommands extends KaitaiStruct {
        public static TotalNumberOfWriteCommands fromFile(String fileName) throws IOException {
            return new TotalNumberOfWriteCommands(new ByteBufferKaitaiStream(fileName));
        }

        public TotalNumberOfWriteCommands(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TotalNumberOfWriteCommands(KaitaiStream _io, FarmLogPage.WorkloadStatisticsParameter _parent) {
            this(_io, _parent, null);
        }

        public TotalNumberOfWriteCommands(KaitaiStream _io, FarmLogPage.WorkloadStatisticsParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.totalNumberOfWriteCommands = new BigInteger(this._io.readBytes(7)).longValue();;
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long totalNumberOfWriteCommands;
        private FarmLogPage _root;
        private FarmLogPage.WorkloadStatisticsParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long totalNumberOfWriteCommands() { return totalNumberOfWriteCommands; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.WorkloadStatisticsParameter _parent() { return _parent; }
    }
    public static class LogMajorRevision extends KaitaiStruct {
        public static LogMajorRevision fromFile(String fileName) throws IOException {
            return new LogMajorRevision(new ByteBufferKaitaiStream(fileName));
        }

        public LogMajorRevision(KaitaiStream _io) {
            this(_io, null, null);
        }

        public LogMajorRevision(KaitaiStream _io, FarmLogPage.HeaderParameter _parent) {
            this(_io, _parent, null);
        }

        public LogMajorRevision(KaitaiStream _io, FarmLogPage.HeaderParameter _parent, FarmLogPage _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.statusByte = new StatusByte(this._io, this, _root);
            this.logMajorRevisionValue = new BigInteger(this._io.readBytes(7)).longValue();
        }
        @JsonProperty
        private StatusByte statusByte;
        @JsonProperty
        private long logMajorRevisionValue;
        private FarmLogPage _root;
        private FarmLogPage.HeaderParameter _parent;
        public StatusByte statusByte() { return statusByte; }
        public long logMajorRevisionValue() { return logMajorRevisionValue; }
        public FarmLogPage _root() { return _root; }
        public FarmLogPage.HeaderParameter _parent() { return _parent; }
    }
    @JsonProperty
    private boolean template335SeagateFarmLogDs;
    @JsonProperty
    private boolean template335SeagateFarmLogSpf;
    @JsonProperty
    private long template335SeagateFarmLogPageCode;
    @JsonProperty
    private int template335SeagateSubPageCode;
    @JsonProperty
    private int template335SeagatePageLength;
    @JsonProperty
    private ArrayList<LogParameters> template335SeagateFarmLogParameters;
    private FarmLogPage _root;
    private KaitaiStruct _parent;

    /**
     * Disable save bit status: should be 1 as this page is NOT savable to disc.Disable save bit status: should be 1 as this page is NOT savable to disc.
     */
    public boolean template335SeagateFarmLogDs() { return template335SeagateFarmLogDs; }

    /**
     * Subpage Format: should be 1 as FARM Log is implemented as a subpages 0x03 and 0x04 of Logpage 0x3D.
     */
    public boolean template335SeagateFarmLogSpf() { return template335SeagateFarmLogSpf; }

    /**
     * Extracted Page Code (bit 5 to bit 0 of byte 0)
     */
    public long template335SeagateFarmLogPageCode() { return template335SeagateFarmLogPageCode; }

    /**
     * Subpage 0x03 for current FARM data and Subpage 0x04 for factory FARM data.
     */
    public int template335SeagateSubPageCode() { return template335SeagateSubPageCode; }

    /**
     * Page Length
     */
    public int template335SeagatePageLength() { return template335SeagatePageLength; }

    /**
     * FARM Logpage log parameters
     */
    public ArrayList<LogParameters> template335SeagateFarmLogParameters() { return template335SeagateFarmLogParameters; }
    public FarmLogPage _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
