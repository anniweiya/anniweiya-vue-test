package cn.anniweiya.system.po;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;

public class SysResourcePO implements Serializable{


    /**
     * 系统资源配置信息表id
     */
    private Integer fid;
    /**
     * 父菜单id，一级为0
     */
    @JsonIgnore
    private Integer fparentId;
    /**
     * 资源名称
     */
    private String name;
    /**
     * 图标
     */
    private String icon;
    /**
     * 跳转url
     */
    private String routeUrl;
    /**
     * children
     */
    private List<SysResourcePO> children;


    @Override
    public String toString() {
        return "SysResourcePO{" +
               "fid=" + fid +
               ", fparentId=" + fparentId +
               ", name='" + name + '\'' +
               ", icon='" + icon + '\'' +
               ", routeUrl='" + routeUrl + '\'' +
               ", children=" + children +
               '}';
    }
}
