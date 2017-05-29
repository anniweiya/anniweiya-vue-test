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
 * 
 * </p>
 *
 * @author anniweiya
 * @since 2017-05-29
 */
@TableName("sys_role")
public class SysRole extends Model<SysRole> {

    private static final long serialVersionUID = 1L;

    /**
     * 系统角色id
     */
	@TableId(value="fid", type= IdType.AUTO)
	private Integer fid;
    /**
     * 角色名
     */
	private String fname;
    /**
     * 角色代码
     */
	private String fcode;
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

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFcode() {
		return fcode;
	}

	public void setFcode(String fcode) {
		this.fcode = fcode;
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
		return "SysRole{" +
			   "fid=" + fid +
			   ", fname='" + fname + '\'' +
			   ", fcode='" + fcode + '\'' +
			   ", fupdateTime=" + fupdateTime +
			   ", fupdator='" + fupdator + '\'' +
			   ", fcreateTime=" + fcreateTime +
			   ", fcreator='" + fcreator + '\'' +
			   ", fisDelete=" + fisDelete +
			   ", fext='" + fext + '\'' +
			   '}';
	}
}
