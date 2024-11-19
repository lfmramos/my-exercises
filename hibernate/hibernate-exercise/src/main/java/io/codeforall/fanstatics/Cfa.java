package io.codeforall.fanstatics;

import javax.persistence.Embeddable;

@Embeddable
public class Cfa {

    private String unity;
    private String class_name;

    public String getUnity() {
        return unity;
    }

    public void setUnity(String unity) {
        this.unity = unity;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String group) {
        this.class_name = group;
    }
}