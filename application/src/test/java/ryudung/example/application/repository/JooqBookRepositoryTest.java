package ryudung.example.application.repository;

import org.jooq.generated.tables.records.BookRecord;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ryudung.example.entity.Book;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JooqBookRepositoryTest {

	@Autowired
	JooqBookRepository jooqBookRepository;

	@Autowired
	BookRepository bookRepository;

	@Test
	public void test() {
		Book book = bookRepository.save(new Book());

		BookRecord bookRecord = jooqBookRepository.select();

		assertEquals(book.getId(), (int) bookRecord.getId());
	}
}