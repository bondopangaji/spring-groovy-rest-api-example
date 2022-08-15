package io.bondopangaji.springgroovyrestexample.controller

import io.bondopangaji.springgroovyrestexample.model.Note
import io.bondopangaji.springgroovyrestexample.service.CreateNoteService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

/**
 * @author Bondo Pangaji
 */
@RestController
class CreateNoteController {

    CreateNoteService createNoteService

    CreateNoteController(CreateNoteService createNoteService) {
        this.createNoteService = createNoteService
    }

    @PostMapping(path = "/note")
    @ResponseStatus(HttpStatus.CREATED)
    Note createNote(@RequestBody Note note) {
        createNoteService.save note
    }

}
