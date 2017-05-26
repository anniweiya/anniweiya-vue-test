package cn.anniweiya.user.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author anniweiya
 * @since 2017-05-26
 */
@TableName("sys_user")
public class SysUser extends Model<SysUser> {

    private static final long serialVersionUID = 1L;

	@TableId(value="fid", type= IdType.AUTO)
	private Integer fid;
	private String fname;
	private String fpassword;
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

	public String getFpassword() {
		return fpassword;
	}

	public void setFpassword(String fpassword) {
		this.fpassword = fpassword;
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
			   ", fname='" + fname + '\'' +
			   ", fpassword='" + fpassword + '\'' +
			   ", fext='" + fext + '\'' +
			   '}';
	}
}
