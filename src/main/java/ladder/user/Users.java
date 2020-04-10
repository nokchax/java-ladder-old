package ladder.user;

import spark.utils.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

public class Users {
    private List<User> users;

    public Users(List<String> users) {
        validateUsers(users);

        this.users = users.stream()
                .map(User::new)
                .collect(Collectors.toList());
    }

    private void validateUsers(List<String> users) {
        if(CollectionUtils.isEmpty(users)) {
            throw new IllegalArgumentException("User is not exist");
        }
    }

    public List<User> getUsers() {
        return users;
    }

    public int numOfUsers() {
        return users.size();
    }
}
