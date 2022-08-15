package io.bondopangaji.springgroovyrestexample.service

import io.bondopangaji.springgroovyrestexample.model.Note

/**
 * @author Bondo Pangaji
 */
interface FetchNoteByIdService {
    Note fetch(UUID noteId)
}