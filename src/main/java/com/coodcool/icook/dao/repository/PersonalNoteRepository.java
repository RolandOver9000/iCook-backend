package com.coodcool.icook.dao.repository;

import com.coodcool.icook.model.PersonalNote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalNoteRepository extends JpaRepository<PersonalNote, Long > {
}