package com.app.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;



@Entity()
@Table(name="player_table")

@NamedNativeQueries(value = {
        @NamedNativeQuery(name = "Players.findByGender", query = "SELECT * FROM player_table where gender=?1" ,resultClass=Players.class),
       
        
})
public class Players {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="player_id")
	public int playerId;
	
    @Column(name="first_name")
	public String firstName;

	@Column(name="last_name")
	public String lastName;
    
	@Column(name="gender")
	public String gender;

	@Column(name="age")
	public int age;

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
//	@Override
//	public String toString() {
//		return "Players [playerId=" + playerId + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
//				+ gender + ", age=" + age + "]";
//	}

}
