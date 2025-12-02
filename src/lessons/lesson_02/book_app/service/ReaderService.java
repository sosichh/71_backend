package lessons.lesson_02.book_app.service;

import lessons.lesson_02.book_app.domain.Reader;
import lessons.lesson_02.book_app.repository.ReaderRepository;

import java.util.List;

public class ReaderService {
    private ReaderRepository readerRepository;

    public ReaderService() {
        readerRepository = new ReaderRepository();
    }
}
