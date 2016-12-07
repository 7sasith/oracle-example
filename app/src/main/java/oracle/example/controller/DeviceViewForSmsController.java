package oracle.example.controller;

import oracle.example.DeviceViewForSmsService;
import oracle.example.model.DeviceViewForSms;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sasith on 06/12/16.
 */
@Controller
public class DeviceViewForSmsController {

    private static final Logger logger = LoggerFactory.getLogger(DeviceViewForSmsController.class);

    @Autowired
    private DeviceViewForSmsService deviceViewForSmsService;

    @RequestMapping(value = "/sss", method = RequestMethod.GET)
    @ResponseBody
    public String sss(){

//        DeviceViewForSms deviceViewForSms = new DeviceViewForSms("2","2","3","4","5","6","7");
        try {


            for(int i=6;i<16;i++){

//                deviceViewForSmsService.save(new DeviceViewForSms(new Integer(i).toString(),"2","3","4","5","6","7") );
            }

            logger.info("Success");
        } catch (Exception e) {
            logger.info("Failed");
            e.printStackTrace();
        }

        return "hello";
    }

    @RequestMapping(value = "/lll", method = RequestMethod.GET)
    @ResponseBody
    public List<DeviceViewForSms> lll(){


        try {

            List<DeviceViewForSms> deviceViewForSmsList = deviceViewForSmsService.getDevises(5);

            for(DeviceViewForSms d : deviceViewForSmsList){
                logger.info(d.toString());
            }
            return deviceViewForSmsList;
        } catch (Exception e) {
            logger.info("Failed");
            e.printStackTrace();
        }

        return new ArrayList<>();
    }
}
