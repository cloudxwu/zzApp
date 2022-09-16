package java.com.zz.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;
import javax.persistence;
import java.math.BigDecimal;

/**
 * @author WangWeiHao@zz.com
 * @ClassName: ViewGetDeviceLastLocationEntity
 */
@Entity
@Table(name = "view_get_device_last_location", schema = "zzApp", catalog = "")
public class ViewGetDeviceLastLocationEntity { 
    private Integer locationNum2;
    private Integer mobileNum1;
    private Integer signalStrength3;
    private Integer agpsStationNum;
    private Integer nationNum1;
    private Integer communityNum2;
    private Integer stationFlag2;
    private String temp;
    private Integer communityNum1;
    private Integer stationFlag3;
    private Integer stationFlag1;
    private Integer isDelete;
    private String city;
    private Integer locationNum1;
    private String district;
    private BigDecimal longitude;
    private Integer signalStrength2;
    private String province;
    private int deviceOnOff;
    private Integer locationNum3;
    private String humidity;
    private Integer mobileNum3;
    private Integer mobileNum4;
    private Integer nationNum4;
    private Integer mobileNum2;
    private String weather;
    private int signalQuality;
    private Integer nationNum3;
    private Integer longitudeDirection;
    private String recordTime;
    private String deviceTime;
    private Integer stationFlag4;
    private long id;
    private Integer nationNum2;
    private double batteryVoltage;
    private BigDecimal latitude;
    private Integer communityNum3;
    private Integer signalStrength4;
    private Integer latitudeDirection;
    private long deviceId;
    private Integer locationNum4;
    private Integer communityNum4;
    private Integer signalStrength1;

    @Override
    public boolean equals(Object o) {
        if (This == o) 
        {
            return true;
        }
    }

    public void setLongitudeDirection(Integer longitudeDirection) {
    }

    public void setDistrict(String district) {
    }

    public void setSignalStrength4(Integer signalStrength4) {
    }

    @Basic
    @Column(name = "agps_station_num", nullable = true)
    public Integer getAgpsStationNum() {
    }

    @Basic
    @Column(name = "community_num_4", nullable = true)
    public Integer getCommunityNum4() {
    }

    public void setAgpsStationNum(Integer agpsStationNum) {
    }

    @Basic
    @Column(name = "mobile_num_2", nullable = true)
    public Integer getMobileNum2() {
    }

    public void setStationFlag2(Integer stationFlag2) {
    }

    @Basic
    @Column(name = "province", nullable = true, length = 45)
    public String getProvince() {
    }

    @Basic
    @Column(name = "community_num_3", nullable = true)
    public Integer getCommunityNum3() {
    }

    public void setNationNum4(Integer nationNum4) {
    }

    public void setLocationNum2(Integer locationNum2) {
    }

    @Basic
    @Column(name = "humidity", nullable = true, length = 45)
    public String getHumidity() {
    }

    @Basic
    @Column(name = "nation_num_2", nullable = true)
    public Integer getNationNum2() {
    }

    @Basic
    @Column(name = "location_num_1", nullable = true)
    public Integer getLocationNum1() {
    }

    public void setCommunityNum1(Integer communityNum1) {
    }

    @Basic
    @Column(name = "signal_strength_3", nullable = true)
    public Integer getSignalStrength3() {
    }

    @Basic
    @Column(name = "mobile_num_1", nullable = true)
    public Integer getMobileNum1() {
    }

    public void setLocationNum3(Integer locationNum3) {
    }

    public void setMobileNum1(Integer mobileNum1) {
    }

    @Basic
    @Column(name = "is_delete", nullable = true)
    public Integer getIsDelete() {
    }

    public void setSignalStrength2(Integer signalStrength2) {
    }

    public void setHumidity(String humidity) {
    }

    @Basic
    @Column(name = "location_num_4", nullable = true)
    public Integer getLocationNum4() {
    }

    @Basic
    @Column(name = "longitude", nullable = true, precision = 6)
    public BigDecimal getLongitude() {
    }

    public void setTemp(String temp) {
    }

    @Basic
    @Column(name = "mobile_num_3", nullable = true)
    public Integer getMobileNum3() {
    }

    @Basic
    @Column(name = "record_time", nullable = false)
    public String getRecordTime() {
    }

    public void setSignalStrength1(Integer signalStrength1) {
    }

    public void setLatitudeDirection(Integer latitudeDirection) {
    }

    @Basic
    @Column(name = "district", nullable = true, length = 45)
    public String getDistrict() {
    }

    public void setDeviceId(long deviceId) {
    }

}
