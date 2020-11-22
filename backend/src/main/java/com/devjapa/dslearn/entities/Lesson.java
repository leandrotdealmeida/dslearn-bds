//package com.devjapa.dslearn.entities;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "tb_lesson")
//public class Lesson {
//	
//	@Id
//	@GeneratedValue( strategy = GenerationType.IDENTITY)
//	private Long id;
//	private String title;
//	private Integer position;
//	
//	@ManyToOne
//	@JoinColumn(name = "section_id")
//	private Section section;
//	
//	
//	
//	public Lesson() {		
//	}
//
//	public Lesson(Long id, String title, Integer position) {
//		super();
//		this.id = id;
//		this.title = title;
//		this.position = position;
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	public Integer getPosition() {
//		return position;
//	}
//
//	public void setPosition(Integer position) {
//		this.position = position;
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((id == null) ? 0 : id.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Lesson other = (Lesson) obj;
//		if (id == null) {
//			if (other.id != null)
//				return false;
//		} else if (!id.equals(other.id))
//			return false;
//		return true;
//	}
//
//	@Override
//	public String toString() {
//		return "Lesson [id=" + id + ", title=" + title + ", position=" + position + "]";
//	}	
//	
//
//}
