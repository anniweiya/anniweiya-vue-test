package cn.anniweiya.user.entity;

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
 * @since 2017-05-27
 */
@TableName("sys_user")
public class SysUser extends Model<SysUser> {

    private static final long serialVersionUID = 1L;

	@TableId(value="fid", type= IdType.AUTO)
	private Integer fid;
	private String fusername;
	private String fpassword;
	@TableField("flastpassword_reset_date")
	private Date flastpasswordResetDate;
	private Integer fenabled;
	private String femail;
	private String flastname;
	private String ffirstname;
	private Integer fcreator;
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

	public String getFusername() {
		return fusername;
	}

	public void setFusername(String fusername) {
		this.fusername = fusername;
	}

	public String getFpassword() {
		return fpassword;
	}

	public void setFpassword(String fpassword) {
		this.fpassword = fpassword;
	}

	public Date getFlastpasswordResetDate() {
		return flastpasswordResetDate;
	}

	public void setFlastpasswordResetDate(Date flastpasswordResetDate) {
		this.flastpasswordResetDate = flastpasswordResetDate;
	}

//	public Integer getFenabled() {
//		return fenabled;
//	}
	public Boolean getFenabled() {
		return fenabled != null && fenabled == 1;
	}

	public void setFenabled(Integer fenabled) {
		this.fenabled = fenabled;
	}

	public String getFemail() {
		return femail;
	}

	public void setFemail(String femail) {
		this.femail = femail;
	}

	public String getFlastname() {
		return flastname;
	}

	public void setFlastname(String flastname) {
		this.flastname = flastname;
	}

	public String getFfirstname() {
		return ffirstname;
	}

	public void setFfirstname(String ffirstname) {
		this.ffirstname = ffirstname;
	}

	public Integer getFcreator() {
		return fcreator;
	}

	public void setFcreator(Integer fcreator) {
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
		return "SysUser{" +
			   "fid=" + fid +
			   ", fusername='" + fusername + '\'' +
			   ", fpassword='" + fpassword + '\'' +
			   ", flastpasswordResetDate=" + flastpasswordResetDate +
			   ", fenabled=" + fenabled +
			   ", femail='" + femail + '\'' +
			   ", flastname='" + flastname + '\'' +
			   ", ffirstname='" + ffirstname + '\'' +
			   ", fcreator=" + fcreator +
			   ", fcreateTime=" + fcreateTime +
			   ", fupdator='" + fupdator + '\'' +
			   ", fupdateTime=" + fupdateTime +
			   ", fisDelete=" + fisDelete +
			   ", fext='" + fext + '\'' +
			   '}';
	}
}
