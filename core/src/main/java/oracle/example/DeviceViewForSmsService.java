package oracle.example;

import oracle.example.model.DeviceViewForSms;

import java.util.List;

/**
 * Created by sasith on 06/12/16.
 */
public interface DeviceViewForSmsService {

    void save(DeviceViewForSms deviceViewForSms);

    List<DeviceViewForSms> getDevises(int limit);
}
