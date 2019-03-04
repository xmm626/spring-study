package com.spring;

import java.util.List;

/*
*
* */
public class Meeting {
    private String theme;
    private List<Boss> bosses;

    @Override
    public String toString() {
        return "Meeting{" +
                "theme='" + theme + '\'' +
                ", bosses=" + bosses +
                '}';
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public List<Boss> getBosses() {
        return bosses;
    }

    public void setBosses(List<Boss> bosses) {
        this.bosses = bosses;
    }

}
