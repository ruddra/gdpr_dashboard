package services;

import interfaces.BaseStorageInterface;
import storages.PolicyStorage;
import storages.UserDashboardStorage;
import storages.UserStorage;

public class StorageStrategy {
    public final static String USER = "user";
    public final static String PRIVACY = "privacy";
    public final static String DASHBRD = "dashboard";

    public UserStorage userStorage;
    public PolicyStorage privacyStorage;
    public UserDashboardStorage dashboardStorage;
    public BaseStorageInterface storageClass;

    public BaseStorageInterface getStorageInstance(String Name) {
        switch (Name) {
            case USER:
                return userStorage;
                break;
            case PRIVACY:
                return privacyStorage;
                break;
            case DASHBRD:
                return dashboardStorage;
                break;
        }
    }
}
