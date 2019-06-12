package ryudung.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {

	@Id
	@GeneratedValue
	public int id;

	@Column(name = "title")
	public String title;

	@ManyToOne
	public Author author;

	public int getId() {
		return id;
	}
}