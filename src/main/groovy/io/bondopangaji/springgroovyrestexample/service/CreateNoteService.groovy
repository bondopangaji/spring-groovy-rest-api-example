package io.bondopangaji.springgroovyrestexample.service

import io.bondopangaji.springgroovyrestexample.model.Note

/**
 * @author Bondo Pangaji
 */
interface CreateNoteService {
    Note save(Note note)
}