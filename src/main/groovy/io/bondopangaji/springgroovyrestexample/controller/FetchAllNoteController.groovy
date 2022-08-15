package io.bondopangaji.springgroovyrestexample.controller

import io.bondopangaji.springgroovyrestexample.model.Note
import io.bondopangaji.springgroovyrestexample.service.FetchAllNoteService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

/**
 * @author Bondo Pangaji
 */
@RestController
class FetchAllNoteController {

    FetchAllNoteService fetchAllNoteService

    FetchAllNoteController(FetchAllNoteService fetchAllNoteService) {
        this.fetchAllNoteService = fetchAllNoteService
    }

    @GetMapping(path = "/note")
    @ResponseStatus(HttpStatus.OK)
    List<Note>fetchAllSortedNote(
            @RequestParam(name = "pageNo") int pageNo,
            @RequestParam(name = "pageSize") int pageSize,
            @RequestParam(name = "sortBy", required = false, defaultValue = "createdAt") String sortBy,
            @RequestParam(name = "orderDirection", required = false, defaultValue = "DESC") String orderDirection) {
        fetchAllNoteService.fetch pageNo, pageSize, sortBy, orderDirection
    }

}
