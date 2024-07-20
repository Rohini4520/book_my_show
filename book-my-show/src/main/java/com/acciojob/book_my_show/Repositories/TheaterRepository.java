package com.acciojob.book_my_show.Repositories;

import com.acciojob.book_my_show.models.Theater;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository<Theater,Integer> {
}
