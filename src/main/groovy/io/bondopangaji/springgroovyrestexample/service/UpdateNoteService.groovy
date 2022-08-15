package io.bondopangaji.springgroovyrestexample.service

import io.bondopangaji.springgroovyrestexample.model.Note

/**
 * @author Bondo Pangaji
 */
interface UpdateNoteService {
    Note modify(UUID noteId, Note note)
}