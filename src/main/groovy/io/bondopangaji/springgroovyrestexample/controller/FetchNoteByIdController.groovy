package io.bondopangaji.springgroovyrestexample.controller

import io.bondopangaji.springgroovyrestexample.model.Note
import io.bondopangaji.springgroovyrestexample.service.FetchNoteByIdService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

/**
 * @author Bondo Pangaji
 */
@RestController
class FetchNoteByIdController {

    FetchNoteByIdService fetchNoteByIdService

    FetchNoteByIdController(FetchNoteByIdService fetchNoteByIdService) {
        this.fetchNoteByIdService = fetchNoteByIdService
    }

    @GetMapping(path = "/note/{id}")
    @ResponseStatus(HttpStatus.OK)
    Note fetchNote(@PathVariable(name = "id") UUID noteId) {
        fetchNoteByIdService.fetch noteId
    }

}
