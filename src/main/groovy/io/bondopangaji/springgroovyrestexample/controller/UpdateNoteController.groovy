package io.bondopangaji.springgroovyrestexample.controller

import io.bondopangaji.springgroovyrestexample.model.Note
import io.bondopangaji.springgroovyrestexample.service.UpdateNoteService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

/**
 * @author Bondo Pangaji
 */
@RestController
class UpdateNoteController {

    UpdateNoteService updateNoteService

    UpdateNoteController(UpdateNoteService updateNoteService) {
        this.updateNoteService = updateNoteService
    }

    @PutMapping("/note/{id}")
    @ResponseStatus(HttpStatus.OK)
    Note updateNote(@PathVariable(name = "id") UUID noteId, @RequestBody Note note){
        updateNoteService.modify noteId, note
    }

}
