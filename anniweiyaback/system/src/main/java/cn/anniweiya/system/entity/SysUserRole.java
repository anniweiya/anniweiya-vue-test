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
@TableName("sys_user_role")
public class SysUserRole extends Model<SysUserRole> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "fid", type = IdType.AUTO)
    private Integer fid;
    @TableField("fuser_id")
    private Integer fuserId;
    @TableField("frole_id")
    private Integer froleId;
    @TableField("fupdate_time")
    private Date fupdateTime;
    private String fupdator;
    @TableField("fcreate_time")
    private Date fcreateTime;
    private String fcreator;
    @TableField("fis_delete")
    private Integer fisDelete;
    private String fext;


    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getFuserId() {
        return fuserId;
    }

    public void setFuserId(Integer fuserId) {
        this.fuserId = fuserId;
    }

    public Integer getFroleId() {
        return froleId;
    }

    public void setFroleId(Integer froleId) {
        this.froleId = froleId;
    }

    public Date getFupdateTime() {
        return fupdateTime;
    }

    public void setFupdateTime(Date fupdateTime) {
        this.fupdateTime = fupdateTime;
    }

    public String getFupdator() {
        return fupdator;
    }

    public void setFupdator(String fupdator) {
        this.fupdator = fupdator;
    }

    public Date getFcreateTime() {
        return fcreateTime;
    }

    public void setFcreateTime(Date fcreateTime) {
        this.fcreateTime = fcreateTime;
    }

    public String getFcreator() {
        return fcreator;
    }

    public void setFcreator(String fcreator) {
        this.fcreator = fcreator;
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
        return "SysUserRole{" +
               "fid=" + fid +
               ", fuserId=" + fuserId +
               ", froleId=" + froleId +
               ", fupdateTime=" + fupdateTime +
               ", fupdator='" + fupdator + '\'' +
               ", fcreateTime=" + fcreateTime +
               ", fcreator='" + fcreator + '\'' +
               ", fisDelete=" + fisDelete +
               ", fext='" + fext + '\'' +
               '}';
    }
}
