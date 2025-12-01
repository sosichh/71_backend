package lessons.lesson_02.book_app.controller;

import lessons.lesson_02.book_app.service.ReaderService;

public class ReaderController {
    private ReaderService readerService;

    public ReaderController(ReaderService readerService) {
        this.readerService = readerService;
    }
}
