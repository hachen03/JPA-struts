package Controller;

import Dao.studentDao;
import Model.student;

public class addAction {
private String name;
private Integer chi;
private Integer eng;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getChi() {
	return chi;
}
public void setChi(Integer chi) {
	this.chi = chi;
}
public Integer getEng() {
	return eng;
}
public void setEng(Integer eng) {
	this.eng = eng;
}
public String execute() throws Exception
{
	student s=new student(getName(),getChi(),getEng());
	new studentDao().add(s);
	return "success";
}
}
