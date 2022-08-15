package io.bondopangaji.springgroovyrestexample.repository

import io.bondopangaji.springgroovyrestexample.model.Note
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

/**
 * @author Bondo Pangaji
 */
@Repository
interface NoteRepository extends JpaRepository<Note, UUID>, PagingAndSortingRepository<Note, UUID> {

}