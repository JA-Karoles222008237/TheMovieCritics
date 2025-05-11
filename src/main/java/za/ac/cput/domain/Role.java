/*
Role.java
Justin Angelo Karoles(222008237)
10 May 2025
 */

package za.ac.cput.domain;

import java.util.UUID;

public class Role {
    private final UUID roleId;
    private final String roleName;

    private Role(Builder builder) {
        this.roleId = builder.roleId;
        this.roleName = builder.roleName;
    }

    public static class Builder {
        private UUID roleId = UUID.randomUUID();
        private String roleName;

        public Builder setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }

        public Role build() {
            return new Role(this);
        }

        // Copy Builder Method
        public Builder(Role existingRole) {
            this.roleId = existingRole.roleId;
            this.roleName = existingRole.roleName;
        }

    }

    @Override
    public String toString() {
        return "Role{roleId=" + roleId + ", roleName='" + roleName + "'}";
    }
}


