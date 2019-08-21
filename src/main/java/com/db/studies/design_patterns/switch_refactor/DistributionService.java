package com.db.studies.design_patterns.switch_refactor;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Liubov Ruzanova
 */
public class DistributionService {

    private Map<Integer, Service> servicesCatalog = new HashMap<>();

    {
        servicesCatalog.put(1, new ServiceOne());
        servicesCatalog.put(2, new ServiceTwo());
    }

    public void sendMail(){
        int mailCode = DBUtils.getMailCode();
        Service service = servicesCatalog.get(mailCode);
        if (service != null){
            service.doSomeStaff();
        }
    }
}
