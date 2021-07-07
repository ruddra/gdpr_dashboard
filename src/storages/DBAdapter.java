package storages;
import java.util.ArrayList;

import models.User;
import models.Policy;
import models.UserDashboard;

public class DBAdapter {

    public ArrayList<User> getUserData() {
        return new ArrayList<User>();
    }

    public ArrayList<Policy> getPolicyData() {
        return new ArrayList<Policy>();
    }

    public ArrayList<UserDashboard> getDashboardData() {
        return new ArrayList<UserDashboard>();
    }
    
}
