package io.bondopangaji.springgroovyrestexample.service.impl

import io.bondopangaji.springgroovyrestexample.repository.NoteRepository
import io.bondopangaji.springgroovyrestexample.service.DeleteNoteByIdService
import org.springframework.stereotype.Service

/**
 * @author Bondo Pangaji
 */
@Service
class DeleteNoteByIdServiceImpl implements DeleteNoteByIdService {

    NoteRepository noteRepository

    DeleteNoteByIdServiceImpl(NoteRepository noteRepository) {
        this.noteRepository = noteRepository
    }

    @Override
    void delete(UUID noteId) {
        noteRepository.deleteById noteId
    }

}
