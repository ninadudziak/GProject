package pl.coderslab.foodapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.foodapp.entity.Restaurant;

import java.util.Date;
import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    List<Restaurant> findAllById (long id);

    List<Restaurant> findAllByCuisine (String cuisine);

    List<Restaurant> findAllByAlcohol (boolean alcohol);

    List<Restaurant> findAllByVeganFriendly (boolean veganFriendly);

    List<Restaurant> findAllByCapacityOfThePlace (String capacityOfThePlace);

    List<Restaurant> findAllByForWho (String forWho);

    List<Restaurant> findAllByPriceRange (String priceRange);

    List<Restaurant> findAllByTypeOfDiet (String typeOfDiet);

    List<Restaurant> findAllByTypeOfPlace (String typeOfPlace);

    List<Restaurant> findAllByWhoLikeIt (long wholikeIt);

    List<Restaurant> findTopByNewestRestaurant(Date newestRestaurant);
}
