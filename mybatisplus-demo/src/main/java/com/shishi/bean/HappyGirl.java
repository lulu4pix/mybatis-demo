package com.shishi.bean;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

@TableName("happy_girl")
public class HappyGirl implements Serializable {

    @TableField(value = "id")
    private int id;

    @TableField("happy_thing")
    private String happyThing;

    @TableField("like_what")
    private String likeWhat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHappyThing() {
        return happyThing;
    }

    public void setHappyThing(String happyThing) {
        this.happyThing = happyThing;
    }

    public String getLikeWhat() {
        return likeWhat;
    }

    public void setLikeWhat(String likeWhat) {
        this.likeWhat = likeWhat;
    }
}
