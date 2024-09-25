package cn.huanzi.qch.baseadmin.sys.sysauthority.vo;

import cn.huanzi.qch.baseadmin. common.pojo.PageCondition;import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Data
public class SysAuthorityVo extends PageCondition implements Serializable {
    private String authorityId;//权限id

    private String authorityName;//传感器名称，ROLE_开头，全大写

    private String authorityContent;//权限内容，可访问的url，多个时用,隔开

    private String authorityRemark;//传感器描述

    private Date createTime;//创建时间

    private Date updateTime;//修改时间

}
