package lessons.lesson_02.book_app;

import lessons.lesson_02.book_app.controller.ReaderController;
import lessons.lesson_02.book_app.repository.ReaderRepository;
import lessons.lesson_02.book_app.service.ReaderService;

public class BookApp {
    public static void main(String[] args) {
        ReaderRepository readerRepository = new ReaderRepository();
        ReaderService readerService = new ReaderService(readerRepository);
        ReaderController readerController = new ReaderController(readerService);
    }
}
