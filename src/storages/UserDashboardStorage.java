package storages;

import java.util.ArrayList;
import java.util.UUID;
import interfaces.BaseStorageInterface;
import models.UserDashboard;

public class UserDashboardStorage implements BaseStorageInterface {

    public ArrayList<UserDashboard> userDashboards;
    private static UserDashboardStorage single_instance = null;
    private DBAdapter Adapter;

    private UserDashboardStorage() {
        this.userDashboards = Adapter.getDashboardData();
    }

    public static UserDashboardStorage getInstance() {
        if (single_instance == null) {
            single_instance = new UserDashboardStorage();
        }

        return single_instance;
    }

    public ArrayList<UserDashboard> getData() {
        return this.userDashboards;
    }

    public void addData(UserDashboard userDashboard) {
        this.userDashboards.add(userDashboard);
    }

    public void removeData(UserDashboard userDashboard) {
        this.userDashboards.remove(userDashboard);
    }

    @Override
    public Integer getCount() {
        return this.getData().size();
    }

    @Override
    public boolean doesExist(UUID instanceId) {
        for (UserDashboard userDash : this.getData()) {
            if (userDash.getId().equals(instanceId)) {
                return true;
            }
        }
        return false;
    }
}
