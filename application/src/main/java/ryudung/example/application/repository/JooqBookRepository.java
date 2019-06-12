package ryudung.example.application.repository;

import org.jooq.DSLContext;
import org.jooq.generated.tables.records.BookRecord;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import static org.jooq.generated.Tables.BOOK;


@Repository
@Transactional(readOnly = true)
public class JooqBookRepository {
	private final DSLContext dslContext;

	public JooqBookRepository(DSLContext dslContext) {
		this.dslContext = dslContext;
	}

	public BookRecord select() {
		return dslContext
				.selectFrom(BOOK)
				.fetchOne();
	}
}
