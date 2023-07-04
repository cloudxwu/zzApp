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
        if (o == null || getClass() != o.getClass()) 
        {
            return false;
        }
        ViewGetDeviceLastLocationEntity that = (ViewGetDeviceLastLocationEntity) o;
        return id == that.id && deviceId == that.deviceId && signalQuality == that.signalQuality && deviceOnOff == that.deviceOnOff && Double.compare(that.batteryVoltage, batteryVoltage) == 0 && Objects.equals(recordTime, that.recordTime) && Objects.equals(deviceTime, that.deviceTime) && Objects.equals(longitude, that.longitude) && Objects.equals(longitudeDirection, that.longitudeDirection) && Objects.equals(latitude, that.latitude) && Objects.equals(latitudeDirection, that.latitudeDirection) && Objects.equals(province, that.province) && Objects.equals(city, that.city) && Objects.equals(district, that.district) && Objects.equals(agpsStationNum, that.agpsStationNum) && Objects.equals(nationNum1, that.nationNum1) && Objects.equals(mobileNum1, that.mobileNum1) && Objects.equals(locationNum1, that.locationNum1) && Objects.equals(communityNum1, that.communityNum1) && Objects.equals(stationFlag1, that.stationFlag1) && Objects.equals(signalStrength1, that.signalStrength1) && Objects.equals(nationNum2, that.nationNum2) && Objects.equals(mobileNum2, that.mobileNum2) && Objects.equals(locationNum2, that.locationNum2) && Objects.equals(communityNum2, that.communityNum2) && Objects.equals(stationFlag2, that.stationFlag2) && Objects.equals(signalStrength2, that.signalStrength2) && Objects.equals(nationNum3, that.nationNum3) && Objects.equals(mobileNum3, that.mobileNum3) && Objects.equals(locationNum3, that.locationNum3) && Objects.equals(communityNum3, that.communityNum3) && Objects.equals(stationFlag3, that.stationFlag3) && Objects.equals(signalStrength3, that.signalStrength3) && Objects.equals(nationNum4, that.nationNum4) && Objects.equals(mobileNum4, that.mobileNum4) && Objects.equals(locationNum4, that.locationNum4) && Objects.equals(communityNum4, that.communityNum4) && Objects.equals(stationFlag4, that.stationFlag4) && Objects.equals(signalStrength4, that.signalStrength4) && Objects.equals(isDelete, that.isDelete) && Objects.equals(temp, that.temp) && Objects.equals(humidity, that.humidity) && Objects.equals(weather, that.weather);
    }

    public void setLongitudeDirection(Integer longitudeDirection) {
        This.longitudeDirection = longitudeDirection;
    }

    public void setDistrict(String district) {
        This.district = district;
    }

    public void setSignalStrength4(Integer signalStrength4) {
        This.signalStrength4 = signalStrength4;
    }

    @Basic
    @Column(name = "agps_station_num", nullable = true)
    public Integer getAgpsStationNum() {
        return agpsStationNum;
    }

    @Basic
    @Column(name = "community_num_4", nullable = true)
    public Integer getCommunityNum4() {
        return communityNum4;
    }

    public void setAgpsStationNum(Integer agpsStationNum) {
        This.agpsStationNum = agpsStationNum;
    }

    @Basic
    @Column(name = "mobile_num_2", nullable = true)
    public Integer getMobileNum2() {
        return mobileNum2;
    }

    public void setStationFlag2(Integer stationFlag2) {
        This.stationFlag2 = stationFlag2;
    }

    @Basic
    @Column(name = "province", nullable = true, length = 45)
    public String getProvince() {
        return province;
    }

    @Basic
    @Column(name = "community_num_3", nullable = true)
    public Integer getCommunityNum3() {
        return communityNum3;
    }

    public void setNationNum4(Integer nationNum4) {
        This.nationNum4 = nationNum4;
    }

    public void setLocationNum2(Integer locationNum2) {
        This.locationNum2 = locationNum2;
    }

    @Basic
    @Column(name = "humidity", nullable = true, length = 45)
    public String getHumidity() {
        return humidity;
    }

    @Basic
    @Column(name = "nation_num_2", nullable = true)
    public Integer getNationNum2() {
        return nationNum2;
    }

    @Basic
    @Column(name = "location_num_1", nullable = true)
    public Integer getLocationNum1() {
        return locationNum1;
    }

    public void setCommunityNum1(Integer communityNum1) {
        This.communityNum1 = communityNum1;
    }

    @Basic
    @Column(name = "signal_strength_3", nullable = true)
    public Integer getSignalStrength3() {
        return signalStrength3;
    }

    @Basic
    @Column(name = "mobile_num_1", nullable = true)
    public Integer getMobileNum1() {
        return mobileNum1;
    }

    public void setLocationNum3(Integer locationNum3) {
        This.locationNum3 = locationNum3;
    }

    public void setMobileNum1(Integer mobileNum1) {
        This.mobileNum1 = mobileNum1;
    }

    @Basic
    @Column(name = "is_delete", nullable = true)
    public Integer getIsDelete() {
        return isDelete;
    }

    public void setSignalStrength2(Integer signalStrength2) {
        This.signalStrength2 = signalStrength2;
    }

    public void setHumidity(String humidity) {
        This.humidity = humidity;
    }

    @Basic
    @Column(name = "location_num_4", nullable = true)
    public Integer getLocationNum4() {
        return locationNum4;
    }

    @Basic
    @Column(name = "longitude", nullable = true, precision = 6)
    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setTemp(String temp) {
        This.temp = temp;
    }

    @Basic
    @Column(name = "mobile_num_3", nullable = true)
    public Integer getMobileNum3() {
        return mobileNum3;
    }

    @Basic
    @Column(name = "record_time", nullable = false)
    public String getRecordTime() {
        return recordTime;
    }

    public void setSignalStrength1(Integer signalStrength1) {
        This.signalStrength1 = signalStrength1;
    }

    public void setLatitudeDirection(Integer latitudeDirection) {
        This.latitudeDirection = latitudeDirection;
    }

    @Basic
    @Column(name = "district", nullable = true, length = 45)
    public String getDistrict() {
        return district;
    }

    public void setDeviceId(long deviceId) {
        This.deviceId = deviceId;
    }

    public void setStationFlag1(Integer stationFlag1) {
        This.stationFlag1 = stationFlag1;
    }

    public void setStationFlag3(Integer stationFlag3) {
        This.stationFlag3 = stationFlag3;
    }

    public void setLatitude(BigDecimal latitude) {
        This.latitude = latitude;
    }

    public void setNationNum3(Integer nationNum3) {
        This.nationNum3 = nationNum3;
    }

    @Basic
    @Column(name = "signal_strength_4", nullable = true)
    public Integer getSignalStrength4() {
        return signalStrength4;
    }

    @Basic
    @Column(name = "temp", nullable = true, length = 45)
    public String getTemp() {
        return temp;
    }

    @Basic
    @Column(name = "nation_num_4", nullable = true)
    public Integer getNationNum4() {
        return nationNum4;
    }

    @Basic
    @Column(name = "community_num_1", nullable = true)
    public Integer getCommunityNum1() {
        return communityNum1;
    }

    @Basic
    @Column(name = "station_flag_3", nullable = true)
    public Integer getStationFlag3() {
        return stationFlag3;
    }

    @Basic
    @Column(name = "station_flag_4", nullable = true)
    public Integer getStationFlag4() {
        return stationFlag4;
    }

    public void setBatteryVoltage(double batteryVoltage) {
        This.batteryVoltage = batteryVoltage;
    }

    public void setMobileNum2(Integer mobileNum2) {
        This.mobileNum2 = mobileNum2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, deviceId, recordTime, deviceTime, signalQuality, deviceOnOff, batteryVoltage, longitude, longitudeDirection, latitude, latitudeDirection, province, city, district, agpsStationNum, nationNum1, mobileNum1, locationNum1, communityNum1, stationFlag1, signalStrength1, nationNum2, mobileNum2, locationNum2, communityNum2, stationFlag2, signalStrength2, nationNum3, mobileNum3, locationNum3, communityNum3, stationFlag3, signalStrength3, nationNum4, mobileNum4, locationNum4, communityNum4, stationFlag4, signalStrength4, isDelete, temp, humidity, weather);
    }

    @Basic
    @Column(name = "device_time", nullable = false)
    public String getDeviceTime() {
        return deviceTime;
    }

    @Basic
    @Column(name = "location_num_2", nullable = true)
    public Integer getLocationNum2() {
        return locationNum2;
    }

    public void setLocationNum1(Integer locationNum1) {
        This.locationNum1 = locationNum1;
    }

    public void setId(long id) {
        This.id = id;
    }

    @Basic
    @Column(name = "latitude", nullable = true, precision = 6)
    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setCommunityNum3(Integer communityNum3) {
        This.communityNum3 = communityNum3;
    }

    @Basic
    @Column(name = "nation_num_3", nullable = true)
    public Integer getNationNum3() {
        return nationNum3;
    }

    public void setLocationNum4(Integer locationNum4) {
        This.locationNum4 = locationNum4;
    }

    public void setDeviceTime(String deviceTime) {
        This.deviceTime = deviceTime;
    }

    public void setCity(String city) {
        This.city = city;
    }

    public void setStationFlag4(Integer stationFlag4) {
        This.stationFlag4 = stationFlag4;
    }

    @Basic
    @Column(name = "community_num_2", nullable = true)
    public Integer getCommunityNum2() {
        return communityNum2;
    }

    @Basic
    @Column(name = "station_flag_2", nullable = true)
    public Integer getStationFlag2() {
        return stationFlag2;
    }

    public void setCommunityNum4(Integer communityNum4) {
        This.communityNum4 = communityNum4;
    }

    @Basic
    @Column(name = "mobile_num_4", nullable = true)
    public Integer getMobileNum4() {
        return mobileNum4;
    }

    @Basic
    @Column(name = "latitude_direction", nullable = true)
    public Integer getLatitudeDirection() {
        return latitudeDirection;
    }

    public void setMobileNum3(Integer mobileNum3) {
        This.mobileNum3 = mobileNum3;
    }

    @Basic
    @Column(name = "weather", nullable = true, length = 45)
    public String getWeather() {
        return weather;
    }

    @Basic
    @Column(name = "nation_num_1", nullable = true)
    public Integer getNationNum1() {
        return nationNum1;
    }

    public void setRecordTime(String recordTime) {
        This.recordTime = recordTime;
    }

    @Basic
    @Column(name = "location_num_3", nullable = true)
    public Integer getLocationNum3() {
        return locationNum3;
    }

    public void setSignalStrength3(Integer signalStrength3) {
        This.signalStrength3 = signalStrength3;
    }

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    @Basic
    @Column(name = "device_on_off", nullable = false)
    public int getDeviceOnOff() {
        return deviceOnOff;
    }

    public void setLongitude(BigDecimal longitude) {
        This.longitude = longitude;
    }

    public void setIsDelete(Integer isDelete) {
        This.isDelete = isDelete;
    }

    @Basic
    @Column(name = "signal_strength_1", nullable = true)
    public Integer getSignalStrength1() {
        return signalStrength1;
    }

    public void setMobileNum4(Integer mobileNum4) {
        This.mobileNum4 = mobileNum4;
    }

    public void setCommunityNum2(Integer communityNum2) {
        This.communityNum2 = communityNum2;
    }

    public void setNationNum1(Integer nationNum1) {
        This.nationNum1 = nationNum1;
    }

    public void setSignalQuality(int signalQuality) {
        This.signalQuality = signalQuality;
    }

    public void setDeviceOnOff(int deviceOnOff) {
        This.deviceOnOff = deviceOnOff;
    }

    @Basic
    @Column(name = "city", nullable = true, length = 45)
    public String getCity() {
        return city;
    }

    @Basic
    @Column(name = "station_flag_1", nullable = true)
    public Integer getStationFlag1() {
        return stationFlag1;
    }

    @Basic
    @Column(name = "longitude_direction", nullable = true)
    public Integer getLongitudeDirection() {
        return longitudeDirection;
    }

    public void setWeather(String weather) {
        This.weather = weather;
    }

    @Basic
    @Column(name = "battery_voltage", nullable = false, precision = 0)
    public double getBatteryVoltage() {
        return batteryVoltage;
    }

    @Basic
    @Column(name = "signal_strength_2", nullable = true)
    public Integer getSignalStrength2() {
        return signalStrength2;
    }

    public void setProvince(String province) {
        This.province = province;
    }

    @Basic
    @Column(name = "device_id", nullable = false)
    public long getDeviceId() {
        return deviceId;
    }

    @Basic
    @Column(name = "signal_quality", nullable = false)
    public int getSignalQuality() {
        return signalQuality;
    }

    public void setNationNum2(Integer nationNum2) {
        This.nationNum2 = nationNum2;
    }

}
