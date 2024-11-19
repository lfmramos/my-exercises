package io.codeforall.fanstatics;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "sgroup")
public class SecurityGroup {
    @Id
    private Integer id;
    private String name;
    @ManyToMany(
            // mappedBy required for bidirectional association
            mappedBy="sgroups",

            // delay fetching users until they are actually needed
            fetch = FetchType.LAZY
    )
    private List<User> users;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}