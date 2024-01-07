package ru.home.myvocabulary.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Word {
    private String word;
    private Phonetic phonetics;
    private Meaning meanings;
}
