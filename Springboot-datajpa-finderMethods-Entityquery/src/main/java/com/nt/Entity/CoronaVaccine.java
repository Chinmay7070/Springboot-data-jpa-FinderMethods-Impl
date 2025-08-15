package com.nt.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Table(name="CORONA_VACINE_TAB")  tHIS IS OPTIONAL AAHE
 
@Data //FOR GETTER SETTER METHOD
@AllArgsConstructor 
@NoArgsConstructor
public class CoronaVaccine implements Serializable {
	  @Id //tO MAKE PROPERTY AS SINGLE ID PROPTERY AND TO MAP WITH SINGLE PRIMARY KEY COLUMN
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  //@Column(name="regNo")  OPTIONAL AAHE
      private Long regNo;
	  @Column(length=20)
      private String name;
	  @Column(length=20)
      private String company;
	  @Column(length=20)
      private String country;
      private Double price;
      private Integer requiredDosecount;
}
