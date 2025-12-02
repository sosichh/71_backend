package lessons.lesson_02.book_app.repository;

import lessons.lesson_02.book_app.domain.Reader;
import java.util.List;
import lessons.lesson_02.book_app.domain.Book;

public class ReaderRepository {
    private List<Reader> readers;

    public Reader save(Reader reader) {
        readers.add(reader);
        return reader;
    }

    public List<Reader> findAll() {
        return readers;
    }

    public Reader findById(int id) {
        return readers.stream()
                .filter(r -> r.getUser().getId() == id)
                .findFirst()
                .orElse(null);
    }

    public  Reader deleteById(int id) {
        Reader findedReader = readers.stream()
                .filter(reader -> reader.getUser().getId() == id)
                .findFirst()
                .orElse(null);

        if (findedReader != null) {
            readers.remove(findedReader);
        }
        return findedReader;
    }

    public void update(Reader reader) {
        int id = reader.getUser().getId();
        String newEmail = reader.getUser().getEmail();
        String newAddress = reader.getUser().getAddress();
        List<Book> newBooks = reader.getBooks();

        readers.stream()
                .filter(r -> r.getUser().getId() == id)
                .forEach(r -> {
                    r.setBooks(newBooks);
                    r.getUser().setEmail(newEmail);
                    r.getUser().setAddress(newAddress);
                });
    }
}
