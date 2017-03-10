package com.hdaf.beeradviser;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Pratik saxsena on 23-02-2017.
 */

public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<String>();
        if(color.equals("amber"))
        {
            brands.add("Jack Amber");
            brands.add("Jack Moose");
        }else {
            brands.add("Jale Pale ale");
            brands.add("Gout Stout");
        }
        return brands;
    }

}
