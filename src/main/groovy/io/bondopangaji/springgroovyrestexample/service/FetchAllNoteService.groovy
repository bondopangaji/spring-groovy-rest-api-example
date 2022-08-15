package io.bondopangaji.springgroovyrestexample.service

import io.bondopangaji.springgroovyrestexample.model.Note

/**
 * @author Bondo Pangaji
 */
interface FetchAllNoteService {
    List<Note> fetch(int pageNo, int pageSize, String sortBy, String sortDirection)
}