package fx.jfoenix;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * @version: 1.00.00
 * @description:
 * @copyright: Copyright (c) 2018 立林科技 All Rights Reserved
 * @company: 厦门立林科技有限公司
 * @author: suwei
 * @email: 1473040317@qq.com
 * @date: 2019-07-15 23:19
 */
public class User extends RecursiveTreeObject<User> {
    StringProperty userName;
    StringProperty age;
    StringProperty department;

    public User(String department, String age, String userName) {
        this.department = new SimpleStringProperty(department) ;
        this.userName = new SimpleStringProperty(userName);
        this.age = new SimpleStringProperty(age);
    }
}
