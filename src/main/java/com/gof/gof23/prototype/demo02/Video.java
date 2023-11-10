package com.gof.gof23.prototype.demo02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * 实现克隆的步骤
 * 1.原型类要求实现Cloneable接口
 * 2.重写clone()方法
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Video implements Cloneable{
    private String name;
    private Date createTime;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //protected native Object clone() throws CloneNotSupportedException;
        //调取的是本地
        /**
         * 深拷贝：序列化，反序列化，改造clone()方法
         * 修改新对象的值不会影响源对象的值
         */
        Object obj = super.clone();
        Video v = (Video) obj;
        //拷贝属性
        v.createTime = (Date) this.createTime.clone();
        return obj;
    }
}
