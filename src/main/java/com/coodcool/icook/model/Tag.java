package com.coodcool.icook.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Tag {

    @Id
    @GeneratedValue
    private Long id;

    private String tag;

    @ToString.Exclude
    @ManyToOne
    private User user;

    @ToString.Exclude
    @Singular
    @ManyToMany
    @EqualsAndHashCode.Exclude
    private Set<FavoriteRecipe> taggedFavorites;

}
