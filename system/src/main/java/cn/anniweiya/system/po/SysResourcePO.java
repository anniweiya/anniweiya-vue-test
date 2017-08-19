package cn.anniweiya.system.po;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;

public class SysResourcePO implements Serializable{


    private static final long serialVersionUID = -1813455436463705429L;
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

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getFparentId() {
        return fparentId;
    }

    public void setFparentId(Integer fparentId) {
        this.fparentId = fparentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getRouteUrl() {
        return routeUrl;
    }

    public void setRouteUrl(String routeUrl) {
        this.routeUrl = routeUrl;
    }

    public List<SysResourcePO> getChildren() {
        return children;
    }

    public void setChildren(List<SysResourcePO> children) {
        this.children = children;
    }
}
