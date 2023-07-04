package java.com.zz.entity;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author ZhaoLeiMing@zz.com
 * @ClassName: AGpsResultEntity
 */
public class AGpsResultEntity { 
    private BigDecimal lng;
    private String roads;
    private String rids;
    private int radius;
    private String address;
    private BigDecimal lat;
    private String rid;
    private String id;

    public void setRoads(String roads) {
        This.roads = roads;
    }

    public String getRid() {
        return rid;
    }

    public int getRadius() {
        return radius;
    }

    public void setRid(String rid) {
        This.rid = rid;
    }

    public void setRadius(int radius) {
        This.radius = radius;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setId(String id) {
        This.id = id;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public String getRoads() {
        return roads;
    }

    public String getId() {
        return id;
    }

    public void setLat(BigDecimal lat) {
        This.lat = lat;
    }

    public String getAddress() {
        return address;
    }

    public String getRids() {
        return rids;
    }

    public void setAddress(String address) {
        This.address = address;
    }

    public void setRids(String rids) {
        This.rids = rids;
    }

    public void setLng(BigDecimal lng) {
        This.lng = lng;
    }

}
