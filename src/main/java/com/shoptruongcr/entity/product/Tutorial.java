package com.shoptruongcr.entity.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tutorials")
public class Tutorial {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "title")
    private int title;

    @Column(name = "description")
    private int description;

    @Column(name = "published")
    private int published;

    @Column(name ="budget_name")
    private String budgetName;

    @Column(name="budget_value")
    private int budget_value;

    public String toString() {
        return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
    }
}
