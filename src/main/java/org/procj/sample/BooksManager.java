package org.procj.sample;

import org.procj.core.annotations.Bundle;
import org.procj.core.annotations.ConfigProperty;
import org.procj.core.annotations.ProcedureConfig;

@Bundle(properties = { @ConfigProperty(name = "hibernate.connection.driver_class", value = "com.mysql.cj.jdbc.Driver"),
		@ConfigProperty(name = "hibernate.connection.url", value = "jdbc:mysql://localhost:3306/books_manager"),
		@ConfigProperty(name = "hibernate.connection.username", value = "mysql"),
		@ConfigProperty(name = "hibernate.connection.password", value = "mysql"),
		@ConfigProperty(name = "hibernate.connection.useSSL", value = "false") }, provider = "hibernate")
public interface BooksManager {

	@ProcedureConfig(name = "add_book")
	void addBook(String title);

	@ProcedureConfig(name = "count_books")
	Number countBooks();

}
