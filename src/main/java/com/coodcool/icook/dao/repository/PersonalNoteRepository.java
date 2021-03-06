package com.coodcool.icook.dao.repository;

import com.coodcool.icook.model.PersonalNote;
import com.coodcool.icook.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonalNoteRepository extends JpaRepository<PersonalNote, Long > {

    List<PersonalNote> findAllByRecipeIdAndUserIdOrderBySubmissionTimeDesc(String id, Long userId);

    List<PersonalNote> getAllByRecipeId(String id);

    List<PersonalNote> getAllByRecipeIdAndUser(String id, User user);

    PersonalNote findPersonalNoteById(long id);

}
