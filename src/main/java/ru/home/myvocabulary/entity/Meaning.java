package ru.home.myvocabulary.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Meaning {
    private PartOfSpeech partOfSpeech;
    private Definition definitions;
}
