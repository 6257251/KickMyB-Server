package org.kickmyb.server.task;

import org.kickmyb.server.account.MUser;
import org.kickmyb.transfer.*;


import java.util.List;

public interface ServiceTask {

    class Existing extends Exception {}
    class TooShort extends Exception {}
    class Empty extends Exception {}

    // entity handling
    TaskDetailResponse detail(Long id, MUser user);
    void addOne(AddTaskRequest req, MUser user) throws Existing, Empty, TooShort;
    void updateProgress(long taskID, int value);
    List<HomeItemResponse> home(Long userID);

    MUser userFromUsername(String username);
}