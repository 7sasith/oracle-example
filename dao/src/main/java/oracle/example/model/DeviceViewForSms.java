package oracle.example.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by sasith on 06/12/16.
 */
@Entity
@Table(name = "device_view_for_sms")
public class DeviceViewForSms implements Serializable {

    @Id
    @Column(name = "MOBILE")
    private String mobile;
    @Basic
    @Column(name = "IMEI")
    private String imei;
    @Basic
    @Column(name ="BRAND")
    private String brand;
    @Basic
    @Column(name = "MODEL")
    private String model;
    @Basic
    @Column(name = "DEVICE_CATEGORY")
    private String deviceCategory;
    @Basic
    @Column(name = "OS_NAME")
    private String osName;
    @Basic
    @Column(name = "OS_VERSION")
    private String osVersion;

//    public DeviceViewForSms(String mobile, String imei, String brand, String model, String deviceCategory, String osName, String osVersion) {
//        this.mobile = mobile;
//        this.imei = imei;
//        this.brand = brand;
//        this.model = model;
//        this.deviceCategory = deviceCategory;
//        this.osName = osName;
//        this.osVersion = osVersion;
//    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDeviceCategory() {
        return deviceCategory;
    }

    public void setDeviceCategory(String deviceCategory) {
        this.deviceCategory = deviceCategory;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    @Override
    public String toString() {
        return "DeviceViewForSms{" +
                "mobile='" + mobile + '\'' +
                ", imei='" + imei + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", deviceCategory='" + deviceCategory + '\'' +
                ", osName='" + osName + '\'' +
                ", osVersion='" + osVersion + '\'' +
                '}';
    }
}
