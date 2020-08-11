package com.lambdaschool.crudyrestaurants.repositories;

import com.lambdaschool.crudyrestaurants.models.Menu;
import org.springframework.data.repository.CrudRepository;

//it is going to extend the abstract class CrudRepository, it will be working with Menu, and take
// Long as its data type.
//we will be filling in these repos as we go along this week. but for now that is enough in this
// repo, next  we need our Payment interface repo
public interface MenuRepository extends CrudRepository<Menu, Long> {
}
