package me.zeroli.myapp.data.entity;

import com.litesuits.orm.db.annotation.Column;
import com.litesuits.orm.db.annotation.NotNull;
import com.litesuits.orm.db.annotation.PrimaryKey;
import com.litesuits.orm.db.annotation.Unique;

import java.io.Serializable;

/**
 * Created by zhh_li on 2016/9/29.
 */

public class Soul implements Serializable {
    @PrimaryKey(PrimaryKey.AssignType.AUTO_INCREMENT)// 设置为主键,自增
    @Column("_id")// 取名为“_id”,如果此处不重新命名,就采用属性名称
    public long id;

    @NotNull @Unique @Column("objectId") public String objectId;
}
