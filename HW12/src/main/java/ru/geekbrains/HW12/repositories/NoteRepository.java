package ru.geekbrains.HW12.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.HW12.models.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
