package io.bondopangaji.springgroovyrestexample.service.impl

import io.bondopangaji.springgroovyrestexample.model.Note
import io.bondopangaji.springgroovyrestexample.repository.NoteRepository
import io.bondopangaji.springgroovyrestexample.service.FetchAllNoteService
import io.bondopangaji.springgroovyrestexample.util.constant.OrderDirection
import org.hibernate.criterion.Order
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

/**
 * @author Bondo Pangaji
 */
@Service
class FetchAllNoteServiceImpl implements FetchAllNoteService {

    NoteRepository noteRepository

    FetchAllNoteServiceImpl(NoteRepository noteRepository) {
        this.noteRepository = noteRepository
    }

    @Override
    List<Note> fetch(int pageNo, int pageSize, String sortBy, String sortDirection) {

        if ((pageNo.is(null)) || (pageSize.is(null))) {
            "Page Number or Page Size mus not empty"
        }

        PageRequest paging
                = PageRequest.of pageNo, pageSize, Sort.Direction.fromString(sortDirection), sortBy

        Page<Note> pagedResult = noteRepository.findAll paging

        pagedResult.getContent()
    }

}