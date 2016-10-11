package me.zeroli.myapp.data.entity;

import com.litesuits.orm.db.annotation.Column;
import com.litesuits.orm.db.annotation.Table;

/**
 * Created by zhh_li on 2016/9/29.
 */

@Table("meizhis")
public class Mezhi extends Soul{
    @Column("url") public int url ;
    @Column("type") public int type ;
    @Column("desc") public int desc ;
    @Column("who") public int who ;
    @Column("used") public int used ;
    @Column("createdAt") public int createdAt ;
    @Column("updatedAt") public int updatedAt ;
    @Column("publishAt") public int publishAt ;
    @Column("imageWidth") public int imageWidth ;
    @Column("imageHeight") public int imageHeight ;
}
