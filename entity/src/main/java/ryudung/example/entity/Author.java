package ryudung.example.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "author")
public class Author {

	@Id
	@GeneratedValue
	public int id;

	public String firstName;

	public String lastName;

	@OneToMany(mappedBy = "author")
	public Set<Book> books;

}