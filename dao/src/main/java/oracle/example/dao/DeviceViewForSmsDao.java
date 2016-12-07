package oracle.example.dao;

import oracle.example.model.DeviceViewForSms;

import java.util.List;

/**
 * Created by sasith on 06/12/16.
 */
public interface DeviceViewForSmsDao extends AbstractDao<DeviceViewForSms, String> {

    void saveD(DeviceViewForSms sms);

    List<DeviceViewForSms> getDevises(int limit);
}
