package com.nks.admin_service.helpre_utils;

import java.util.Random;

public class IdCreationLogicUtils {

    public String idCreationLogic(String name) {
        Random random = new Random();
        int halfId = random.nextInt(1999);
        return fetchPrefix(name).concat(String.valueOf(halfId));
    }

    public String fetchPrefix(String name) {
        if (name.length() < 3 ){
            return name;
        }
        return name.substring(0, 3);
    }

}
