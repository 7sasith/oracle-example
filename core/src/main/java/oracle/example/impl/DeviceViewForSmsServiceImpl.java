package oracle.example.impl;

import oracle.example.DeviceViewForSmsService;
import oracle.example.dao.DeviceViewForSmsDao;
import oracle.example.model.DeviceViewForSms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sasith on 06/12/16.
 */
@Service("deviceViewForSmsService")
@Transactional
public class DeviceViewForSmsServiceImpl implements DeviceViewForSmsService {
    @Autowired
    private DeviceViewForSmsDao deviceViewForSmsDao;

    @Override
    public void save(DeviceViewForSms deviceViewForSms) {
            deviceViewForSmsDao.saveD(deviceViewForSms);
    }

    @Override
    public List<DeviceViewForSms> getDevises(int limit) {
        return deviceViewForSmsDao.getDevises(limit);
    }
}
