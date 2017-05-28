package cn.anniweiya.user.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author anniweiya
 * @since 2017-05-27
 */
@TableName("sys_role")
public class SysRole extends Model<SysRole> {

    private static final long serialVersionUID = 1L;

	@TableId(value="fid", type= IdType.AUTO)
	private Integer fid;
	private String frole;
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

	public String getFrole() {
		return frole;
	}

	public void setFrole(String frole) {
		this.frole = frole;
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

}
