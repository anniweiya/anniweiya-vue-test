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
 * @since 2017-05-29
 */
@TableName("sys_resource")
public class SysResource extends Model<SysResource> {

    private static final long serialVersionUID = 1L;

    /**
     * 系统资源配置信息表id
     */
	@TableId(value="fid", type= IdType.AUTO)
	private Integer fid;
    /**
     * 父菜单id，一级为0
     */
	@TableField("fparent_id")
	private Integer fparentId;
    /**
     * 资源名称
     */
	private String fname;
    /**
     * 资源代码
     */
	private String fcode;
    /**
     * 权限资源代码
     */
	@TableField("fpermission_code")
	private String fpermissionCode;
    /**
     * 类型（1模块 2按钮）
     */
	private Integer ftype;
    /**
     * 图标
     */
	private String ficon;
    /**
     * 跳转url
     */
	@TableField("froute_url")
	private String frouteUrl;
    /**
     * 排序字段
     */
	private String forder;
    /**
     * 所属系统id
     */
	@TableField("fsystem_id")
	private Integer fsystemId;
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

	public Integer getFparentId() {
		return fparentId;
	}

	public void setFparentId(Integer fparentId) {
		this.fparentId = fparentId;
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

	public String getFpermissionCode() {
		return fpermissionCode;
	}

	public void setFpermissionCode(String fpermissionCode) {
		this.fpermissionCode = fpermissionCode;
	}

	public Integer getFtype() {
		return ftype;
	}

	public void setFtype(Integer ftype) {
		this.ftype = ftype;
	}

	public String getFicon() {
		return ficon;
	}

	public void setFicon(String ficon) {
		this.ficon = ficon;
	}

	public String getFrouteUrl() {
		return frouteUrl;
	}

	public void setFrouteUrl(String frouteUrl) {
		this.frouteUrl = frouteUrl;
	}

	public String getForder() {
		return forder;
	}

	public void setForder(String forder) {
		this.forder = forder;
	}

	public Integer getFsystemId() {
		return fsystemId;
	}

	public void setFsystemId(Integer fsystemId) {
		this.fsystemId = fsystemId;
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
		return "SysResource{" +
			   "fid=" + fid +
			   ", fparentId=" + fparentId +
			   ", fname='" + fname + '\'' +
			   ", fcode='" + fcode + '\'' +
			   ", fpermissionCode='" + fpermissionCode + '\'' +
			   ", ftype=" + ftype +
			   ", ficon='" + ficon + '\'' +
			   ", frouteUrl='" + frouteUrl + '\'' +
			   ", forder='" + forder + '\'' +
			   ", fsystemId=" + fsystemId +
			   ", fcreator='" + fcreator + '\'' +
			   ", fcreateTime=" + fcreateTime +
			   ", fupdator='" + fupdator + '\'' +
			   ", fupdateTime=" + fupdateTime +
			   ", fisDelete=" + fisDelete +
			   ", fext='" + fext + '\'' +
			   '}';
	}
}
