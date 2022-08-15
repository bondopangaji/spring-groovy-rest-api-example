package io.bondopangaji.springgroovyrestexample.service.impl

import io.bondopangaji.springgroovyrestexample.model.Note
import io.bondopangaji.springgroovyrestexample.repository.NoteRepository
import io.bondopangaji.springgroovyrestexample.service.UpdateNoteService
import org.springframework.stereotype.Service

/**
 * @author Bondo Pangaji
 */
@Service
class UpdateNoteServiceImpl implements UpdateNoteService{

    NoteRepository noteRepository

    UpdateNoteServiceImpl(NoteRepository noteRepository) {
        this.noteRepository = noteRepository
    }

    @Override
    Note modify(UUID noteId, Note note) {
        Note fetchedNote = noteRepository.findById noteId get()
        fetchedNote.setTitle(note.getTitle())
        fetchedNote.setContent(note.getContent())
        fetchedNote.setUpdatedAt(System.currentTimeMillis())

        noteRepository.save(fetchedNote)
    }

}
