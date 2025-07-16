package Splitwise.group;

import Splitwise.user.User;

import java.util.ArrayList;
import java.util.List;

public class GroupController {

    List<Group> groupList;

    public GroupController(){
        groupList = new ArrayList<>();
    }

    public void createNewGroup(String groupId, String groupName, User createdByUser){
        Group group = new Group();
        group.setGroupId(groupId);
        group.setGroupName(groupName);

        //user who creates the group will be part of group Member.

        group.addMember(createdByUser);

        groupList.add(group);
    }

    public Group getGroup(String groupId){
        for(Group g:groupList){
            if(g.groupId.equals(groupId)){
                return g;
            }
        }
        return null;
    }
}
