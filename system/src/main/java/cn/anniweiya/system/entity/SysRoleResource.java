package cn.anniweiya.system.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author anniweiya
 * @since 2017-05-29
 */
@TableName("sys_role_resource")
public class SysRoleResource extends Model<SysRoleResource> {

    private static final long serialVersionUID = 1L;

    /**
     * 角色资源关联表id
     */
    @TableId(value = "fid", type = IdType.AUTO)
    private Integer fid;
    /**
     * 角色id
     */
    @TableField("frole_id")
    private Integer froleId;
    /**
     * 资源id
     */
    @TableField("fresource_id")
    private Integer fresourceId;
    private String fcreator;
    @TableField("fcreate_time")
    private Date fcreateTime;
    private String fupdator;
    @TableField("fupdate_time")
    private Date fupdateTime;
    @TableField("fis_delete")
    private Integer fisDelete;
    private String fext;


    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getFroleId() {
        return froleId;
    }

    public void setFroleId(Integer froleId) {
        this.froleId = froleId;
    }

    public Integer getFresourceId() {
        return fresourceId;
    }

    public void setFresourceId(Integer fresourceId) {
        this.fresourceId = fresourceId;
    }

    public String getFcreator() {
        return fcreator;
    }

    public void setFcreator(String fcreator) {
        this.fcreator = fcreator;
    }

    public Date getFcreateTime() {
        return fcreateTime;
    }

    public void setFcreateTime(Date fcreateTime) {
        this.fcreateTime = fcreateTime;
    }

    public String getFupdator() {
        return fupdator;
    }

    public void setFupdator(String fupdator) {
        this.fupdator = fupdator;
    }

    public Date getFupdateTime() {
        return fupdateTime;
    }

    public void setFupdateTime(Date fupdateTime) {
        this.fupdateTime = fupdateTime;
    }

    public Integer getFisDelete() {
        return fisDelete;
    }

    public void setFisDelete(Integer fisDelete) {
        this.fisDelete = fisDelete;
    }

    public String getFext() {
        return fext;
    }

    public void setFext(String fext) {
        this.fext = fext;
    }

    @Override
    protected Serializable pkVal() {
        return this.fid;
    }

    @Override
    public String toString() {
        return "SysRoleResource{" +
               "fid=" + fid +
               ", froleId=" + froleId +
               ", fresourceId=" + fresourceId +
               ", fcreator='" + fcreator + '\'' +
               ", fcreateTime=" + fcreateTime +
               ", fupdator='" + fupdator + '\'' +
               ", fupdateTime=" + fupdateTime +
               ", fisDelete=" + fisDelete +
               ", fext='" + fext + '\'' +
               '}';
    }
}
