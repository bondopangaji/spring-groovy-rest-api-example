package io.bondopangaji.springgroovyrestexample.service.impl

import io.bondopangaji.springgroovyrestexample.model.Note
import io.bondopangaji.springgroovyrestexample.repository.NoteRepository
import io.bondopangaji.springgroovyrestexample.service.CreateNoteService
import org.springframework.stereotype.Service

/**
 * @author Bondo Pangaji
 */
@Service
class CreateNoteServiceImpl implements CreateNoteService {

    NoteRepository noteRepository

    CreateNoteServiceImpl(NoteRepository noteRepository) {
        this.noteRepository = noteRepository
    }

    @Override
    Note save(Note note) {
        Note builtNote = new Note.NoteBuilder()
                .id(note.getId())
                .title(note.getTitle())
                .content(note.getContent())
                .createdAt(System.currentTimeMillis())
                .updatedAt(System.currentTimeMillis())
                .build()
        noteRepository.save builtNote
    }

}
