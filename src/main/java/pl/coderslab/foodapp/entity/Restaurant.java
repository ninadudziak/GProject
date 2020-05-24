package pl.coderslab.foodapp.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "restaurants")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    @Size(max = 35)
    private String name;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date newestRestaurant;

    @NotEmpty
    private String cuisine;

    @NotEmpty
    private boolean alcohol;

    private boolean veganFriendly;

    @NotEmpty
    private String capacityOfThePlace;

    @NotEmpty
    private String forWho;

    @NotEmpty
    private String priceRange;

    @NotEmpty
    private String typeOfDiet;

    @NotEmpty
    private String typeOfPlace;

    @NotEmpty
    private String whoLikeIt;


    @ManyToMany
    @JoinTable(name = "user_restaurants")
    private List<User> users = new ArrayList<>();
    public List<User> getUsers() {
        return users;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public void setAlcohol(boolean alcohol) {
        this.alcohol = alcohol;
    }

    public void setVeganFriendly(boolean veganfriendly) {
        this.veganFriendly = veganfriendly;
    }

    public void setCapacityOfThePlace(String capacityOfThePlace) {
        this.capacityOfThePlace = capacityOfThePlace;
    }

    public void setForWho(String forWho) {
        this.forWho = forWho;
    }

    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }

    public void setTypeOfDiet(String typeOfDiet) {
        this.typeOfDiet = typeOfDiet;
    }

    public void setTypeOfPlace(String typeOfPlace) {
        this.typeOfPlace = typeOfPlace;
    }

    public void setWhoLikeIt(String whoLikeIt) {
        this.whoLikeIt = whoLikeIt;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public boolean isAlcohol() {
        return alcohol;
    }

    public boolean isVeganFriendly() {
        return veganFriendly;
    }

    public String getCapacityOfThePlace() {
        return capacityOfThePlace;
    }

    public String getForWho() {
        return forWho;
    }

    public String getPriceRange() {
        return priceRange;
    }

    public String getTypeOfDiet() {
        return typeOfDiet;
    }

    public String getTypeOfPlace() {
        return typeOfPlace;
    }

    public String getWhoLikeIt() {
        return whoLikeIt;
    }

}
