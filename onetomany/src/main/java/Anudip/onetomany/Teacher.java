package Anudip.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Teacher {
	@Id
	private int T_id;
	private String T_name;
	@ OneToMany(mappedBy = "teacher")
	private List<course> c;
	
	public List<course> getC() {
		return c;
	}
	public void setC(List<course> c) {
		this.c = c;
	}
	public int getT_id() {
		return T_id;
	}
	public void setT_id(int t_id) {
		T_id = t_id;
	}
	public String getT_name() {
		return T_name;
	}
	public void setT_name(String t_name) {
		T_name = t_name;
	}
	public Teacher(int t_id, String t_name) {
		super();
		T_id = t_id;
		T_name = t_name;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

}
