package com.glc.bookapimicroservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import java.util.Collection;

@AutoConfigureJsonTesters
@SpringBootTest
@AutoConfigureMockMvc
class BookApiMicroServiceApplicationTests {

	private MockMvc mvc;
	@Mock
	private BookRepository bookRepository;

	@InjectMocks
	private BookController bookController;

	private JacksonTester<Book> jsonBook;

	private JacksonTester<Collection<Book>> jsonBooks;

	// AC1: When I enter the title, author, year of publication, and length of the
	// book into the UI and hit submit, my book will saved to the list.
	@Test
	public void canAddBook() throws Exception {
		Book book = new Book(1, "Rich Dad Poor Dad", "Robert", 1999, 240);
		mvc.perform(post("/books")
				.contentType(MediaType.APPLICATION_JSON)
				.content(jsonBook.write(book).getJson()))
				.andExpect(status().isOk());
	}

	
}
