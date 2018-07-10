package boot.sixth.Domain;

/**
 * Created by Administrator on 2017/7/5.
 */
public class Role {
    private String roleId;
    private String roleName;
    private String description;
    private Boolean isSystem;

    public String getRoleId() {
        return roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getSystem() {
        return isSystem;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSystem(Boolean system) {
        isSystem = system;
    }
}
