package ru.geekbrains.HW12.services;


import ru.geekbrains.HW12.models.Note;

import java.util.List;
import java.util.Optional;

/**
 * В целях улучшения архитектуры и расширяемости кода, был применен
 * паттерн проектирования **Service Layer** (Слой сервисов). Этот
 * паттерн разделяет бизнес-логику и операции с данными от контроллера,
 * что делает код более чистым и модульным.
 * Созданы интерфейс NoteService и класс NoteServiceImpl
 */

public interface NoteService {
    List<Note> getAllNotes();
    Note getById(long id);
    Note create(Note note);
    Optional<Note> editNote(Long id, Note note);
    void delete(long id);
}