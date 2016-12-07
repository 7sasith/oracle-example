package oracle.example.dao.impl;

import oracle.example.dao.DeviceViewForSmsDao;
import oracle.example.dao.impl.AbstractDaoImpl;
import oracle.example.model.DeviceViewForSms;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sasith on 06/12/16.
 */
@Repository("deviceViewForSmsDao")
public class DeviceViewForSmsDaoImpl extends AbstractDaoImpl<DeviceViewForSms,String> implements DeviceViewForSmsDao {


    @Override
    public void saveD(DeviceViewForSms sms) {
        Session session = getSession();
        session.save(sms);
    }

    @Override
    public List<DeviceViewForSms> getDevises(int limit) {
        Session session = getSession();
        Criteria cr = session.createCriteria(DeviceViewForSms.class);

        SQLQuery query = session.createSQLQuery("select * from device_view_for_sms where (imei = :imei and ROWNUM <= :ROWNUM)");
        query.setParameter("imei", "2");
        query.setParameter("ROWNUM",limit);
        query.addEntity(DeviceViewForSms.class);

        List result = (ArrayList<DeviceViewForSms>) query.list();

        return result;
    }
}
