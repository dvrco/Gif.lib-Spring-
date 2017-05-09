package com.vellyezz.giflib.data;

import com.vellyezz.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by vellyezz on 04.05.2017.
 */

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(

        new Gif("giphy", 1, LocalDate.of(2015,2,2), "vellyezz", true),
        new Gif("android-explosion", 2,  LocalDate.of(2015,12,14), "vims", false),
        new Gif("ben-and-mike", 3,  LocalDate.of(2015,4,22), "John Doe", false),
        new Gif("book-dominos", 3, LocalDate.of(2015,8,29), "Jan Kowalski", true),
        new Gif("compiler-bot", 2, LocalDate.of(2015,1,30), "vellyezz", false),
        new Gif("cowboy-coder",1,  LocalDate.of(2015,9,19), "vellyezz", true)

    );

    public Gif findByName(String name){
        for(Gif gif : ALL_GIFS){
            if(gif.getName().equals(name)){
                return gif;
            }
        }
        return null;
    }

    public List<Gif> getAllGifs(){
        return ALL_GIFS;
    }

    public List<Gif> findByCategoryId(int id){
        List<Gif> gifs = new ArrayList<Gif>();
        for(Gif gif : ALL_GIFS){
            if(gif.getCategoryId() == id){
                gifs.add(gif);
            }
        }
        return gifs;
    }


}
