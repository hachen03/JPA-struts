package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="student")
public class student {
	public student() {
		super();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Integer id;
	 private String name;
	 private Integer chi;
	 private Integer eng;
	 private Integer sum;
	public student(String name, Integer chi, Integer eng) {
		super();
		this.name = name;
		this.chi = chi;
		this.eng = eng;
		sum=chi+eng;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public Integer getSum() {
		sum=chi+eng;
		return sum;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
}
