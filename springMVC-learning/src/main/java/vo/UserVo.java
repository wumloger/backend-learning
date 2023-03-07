package vo;

import entity.LoginUser;

import java.util.List;


public class UserVo {
private List<LoginUser> users;
    public List<LoginUser> getUsers(){
        return users;
    }
    public void setUsers(List<LoginUser> users){
        this.users = users;
    }
}
