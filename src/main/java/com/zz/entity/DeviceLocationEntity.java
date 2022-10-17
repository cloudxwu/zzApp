package java.com.zz.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;
import org.hibernate.annotations.DynamicInsert;
import javax.persistence;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.DynamicUpdate;

/**
 * @author YangFanFei@zz.com
 * @ClassName: DeviceLocationEntity
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "device_location", schema = "zzApp", catalog = "")
public class DeviceLocationEntity { 
    private double batteryVoltage;
    private String city;
    private Integer signalStrength4;
    private Integer communityNum2;
    private int deviceOnOff;
    private long id;
    private Integer stationFlag4;
    private Integer mobileNum4;
    private Integer signalStrength3;
    private Integer mobileNum2;
    private Integer nationNum3;
    private BigDecimal longitude;
    private Integer latitudeDirection;
    private Integer locationNum3;
    private Integer nationNum2;
    private Integer mobileNum3;
    private Integer stationFlag3;
    private DeviceEntity deviceByDeviceId;
    private Integer longitudeDirection;
    private String humidity;
    private Integer isDelete;
    private Integer mobileNum1;
    private Integer stationFlag2;
    private String temp;
    private String deviceTime;
    private String province;
    private String weather;
    private BigDecimal latitude;
    private Integer nationNum4;
    private Integer communityNum1;
    private Integer locationNum2;
    private Integer communityNum4;
    private Integer communityNum3;
    private Integer nationNum1;
    private Integer locationNum1;
    private long deviceId;
    private String district;
    private String recordTime;
    private Integer locationNum4;
    private int signalQuality;
    private Integer stationFlag1;
    private Integer agpsStationNum;
    private Integer signalStrength1;
    private Integer signalStrength2;

    public void setSignalStrength1(Integer signalStrength1) {
    }

    @Basic
    @Column(name = "location_num_1", nullable = true)
    public Integer getLocationNum1() {
    }

    public void setStationFlag4(Integer stationFlag4) {
    }

    public void setMobileNum2(Integer mobileNum2) {
    }

    @Basic
    @Column(name = "nation_num_3", nullable = true)
    public Integer getNationNum3() {
    }

    public void setSignalQuality(int signalQuality) {
    }

    @Basic
    @Column(name = "station_flag_2", nullable = true)
    public Integer getStationFlag2() {
    }

    public void setMobileNum4(Integer mobileNum4) {
    }

    @Basic
    @Column(name = "record_time", nullable = false)
    public String getRecordTime() {
    }

    public void setCommunityNum4(Integer communityNum4) {
    }

    public void setDeviceOnOff(int deviceOnOff) {
    }

    @Basic
    @Column(name = "device_id", nullable = false)
    public long getDeviceId() {
    }

    @Basic
    @Column(name = "latitude", nullable = true, precision = 6)
    public BigDecimal getLatitude() {
    }

    @Basic
    @Column(name = "signal_strength_2", nullable = true)
    public Integer getSignalStrength2() {
    }

    public void setTemp(String temp) {
    }

    public void setAgpsStationNum(Integer agpsStationNum) {
    }

    @Basic
    @Column(name = "nation_num_2", nullable = true)
    public Integer getNationNum2() {
    }

    public void setBatteryVoltage(double batteryVoltage) {
    }

    public void setNationNum2(Integer nationNum2) {
    }

    public void setStationFlag2(Integer stationFlag2) {
    }

    @Basic
    @Column(name = "signal_quality", nullable = false)
    public int getSignalQuality() {
    }

    public void setDeviceId(long deviceId) {
    }

    public void setDeviceByDeviceId(DeviceEntity deviceByDeviceId) {
    }

    @Basic
    @Column(name = "signal_strength_1", nullable = true)
    public Integer getSignalStrength1() {
    }

    public void setRecordTime(String recordTime) {
    }

    public void setNationNum1(Integer nationNum1) {
    }

    @Basic
    @Column(name = "community_num_2", nullable = true)
    public Integer getCommunityNum2() {
    }

    @Basic
    @Column(name = "signal_strength_3", nullable = true)
    public Integer getSignalStrength3() {
    }

    @Basic
    @Column(name = "mobile_num_4", nullable = true)
    public Integer getMobileNum4() {
    }

    public void setSignalStrength4(Integer signalStrength4) {
    }

    public void setLocationNum1(Integer locationNum1) {
    }

    public void setHumidity(String humidity) {
    }

    public void setLocationNum3(Integer locationNum3) {
    }

    @Basic
    @Column(name = "agps_station_num", nullable = true)
    public Integer getAgpsStationNum() {
    }

    public void setCity(String city) {
    }

    @Basic
    @Column(name = "district", nullable = true, length = 45)
    public String getDistrict() {
    }

    public void setCommunityNum1(Integer communityNum1) {
    }

    public void setMobileNum1(Integer mobileNum1) {
    }

    @Override
    public int hashCode() {
    }

    public void setCommunityNum3(Integer communityNum3) {
    }

    @Basic
    @Column(name = "latitude_direction", nullable = true)
    public Integer getLatitudeDirection() {
    }

    @Basic
    @Column(name = "station_flag_4", nullable = true)
    public Integer getStationFlag4() {
    }

}
