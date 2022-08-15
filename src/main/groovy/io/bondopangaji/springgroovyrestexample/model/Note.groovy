package io.bondopangaji.springgroovyrestexample.model

import groovy.transform.ToString
import groovy.transform.builder.Builder
import groovy.transform.builder.ExternalStrategy
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Type

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

/**
 * @author Bondo Pangaji
 */
@Entity
@Table(name = "note")
@ToString
class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "note_id")
    @Type(type = "org.hibernate.type.UUIDCharType")
    UUID id

    @Column(name = "note_title")
    String title

    @Column(name = "note_content")
    String content

    @Column(name = "created_at")
    long createdAt

    @Column(name = "updated_at")
    long updatedAt

    // Fluent API impl w/ groovy builder annotations
    @Builder(builderStrategy = ExternalStrategy, forClass = Note)
    static class NoteBuilder {}
}
