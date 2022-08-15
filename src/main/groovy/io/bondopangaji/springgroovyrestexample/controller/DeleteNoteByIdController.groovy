package io.bondopangaji.springgroovyrestexample.controller

import io.bondopangaji.springgroovyrestexample.service.DeleteNoteByIdService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

/**
 * @author Bondo Pangaji
 */
@RestController
class DeleteNoteByIdController {

    DeleteNoteByIdService deleteNoteByIdService

    DeleteNoteByIdController(DeleteNoteByIdService deleteNoteByIdService) {
        this.deleteNoteByIdService = deleteNoteByIdService
    }

    @DeleteMapping(path = "/note/{id}")
    @ResponseStatus(HttpStatus.OK)
    deleteNote(@PathVariable(name = "id") UUID noteId) {
        deleteNoteByIdService.delete noteId
    }

}
