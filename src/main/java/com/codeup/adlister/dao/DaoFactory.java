package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import config.Config;

public class DaoFactory {
    private static Ads adsDao;
    private static final Config config = new Config();
    private static Users MySqlUsersDao;
    private static final User user = new User();

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }

    public static Users getUsersDao() {
        if(MySqlUsersDao == null){
            MySqlUsersDao = new MySQLUsersDao(user);
        }
        return MySqlUsersDao;
    }
}
