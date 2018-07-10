package boot.sixth.Domain;

import java.util.List;

/**
 * Created by Administrator on 2017/5/5.
 */
public class User {
    private java.lang.String userId;

    private java.lang.String userName;

    private java.lang.String password;

    private java.lang.String email;

    //private java.lang.String cnName;

    private int locked;
    private int isAdmin;
    private int isVerifyLoginIp;
    private Role role;

    public void setRole(Role role) {
        this.role = role;
    }

    public Role getRole() {

        return role;
    }

    private List<Role> roles;

    public void setRoles( List<Role> roles) {
        this.roles = roles;
    }

    public  List<Role> getRoles() {

        return roles;
    }

    public java.lang.String getEmail() {
        return email;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    public java.lang.String getUserId() {
        return userId;
    }

    public void setUserId(java.lang.String id) {
        this.userId = id;
    }

    public java.lang.String getPassword() {
        return password;
    }

    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    public java.lang.String getUserName() {
        return userName;
    }

    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }

    public int getLocked() {
        return locked;
    }
    public void setLocked(int locked) {
        this.locked = locked;
    }

    public int getIsAdmin() {
        return isAdmin;
    }
    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    public int getIsVerifyLoginIp() {
        return isVerifyLoginIp;
    }
    public void setIsVerifyLoginIp(int isVerifyLoginIp) {
        this.isVerifyLoginIp = isVerifyLoginIp;
    }

}
