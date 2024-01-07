package ru.home.myvocabulary.entity;

import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class Definition {
    private String definition;
    private String example;
    private List<Word> synonyms;
    private List<Word> antonyms;

    public Definition() {
    }

    public Definition(String definition, String example, List<Word> synonyms, List<Word> antonyms) {
        this.definition = definition;
        this.example = example;
        this.synonyms = synonyms;
        this.antonyms = antonyms;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public List<Word> getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(List<Word> synonyms) {
        this.synonyms = synonyms;
    }

    public List<Word> getAntonyms() {
        return antonyms;
    }

    public void setAntonyms(List<Word> antonyms) {
        this.antonyms = antonyms;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((definition == null) ? 0 : definition.hashCode());
        result = prime * result + ((example == null) ? 0 : example.hashCode());
        result = prime * result + ((synonyms == null) ? 0 : synonyms.hashCode());
        result = prime * result + ((antonyms == null) ? 0 : antonyms.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Definition other = (Definition) obj;
        if (definition == null) {
            if (other.definition != null)
                return false;
        } else if (!definition.equals(other.definition))
            return false;
        if (example == null) {
            if (other.example != null)
                return false;
        } else if (!example.equals(other.example))
            return false;
        if (synonyms == null) {
            if (other.synonyms != null)
                return false;
        } else if (!synonyms.equals(other.synonyms))
            return false;
        if (antonyms == null) {
            if (other.antonyms != null)
                return false;
        } else if (!antonyms.equals(other.antonyms))
            return false;
        return true;
    }

}
