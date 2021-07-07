package services;

import enums.StorageEnum;
import interfaces.BaseStorageInterface;
import storages.PolicyStorage;
import storages.UserDashboardStorage;
import storages.UserStorage;


public class StorageStrategy {
    public UserStorage userStorage;
    public PolicyStorage privacyStorage;
    public UserDashboardStorage dashboardStorage;
    public BaseStorageInterface storageClass;

    public void setStorageInstance(StorageEnum Name) {
        switch (Name) {
            case USER:
                storageClass = userStorage;
                break;
            case POLICY:
                storageClass = privacyStorage;
                break;
            case DASHBOARD:
                storageClass = dashboardStorage;
                break;
        }
    }
}
