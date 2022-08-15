package io.bondopangaji.springgroovyrestexample.service.impl

import io.bondopangaji.springgroovyrestexample.model.Note
import io.bondopangaji.springgroovyrestexample.repository.NoteRepository
import io.bondopangaji.springgroovyrestexample.service.FetchNoteByIdService
import org.springframework.stereotype.Service

/**
 * @author Bondo Pangaji
 */
@Service
class FetchNoteByIdServiceImpl implements FetchNoteByIdService {

    NoteRepository noteRepository

    FetchNoteByIdServiceImpl(NoteRepository noteRepository) {
        this.noteRepository = noteRepository
    }

    @Override
    Note fetch(UUID noteId) {
        noteRepository.findById noteId get()
    }

}
