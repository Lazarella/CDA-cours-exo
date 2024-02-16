package org.example.exercice4.entity;

import java.util.ArrayList;
import java.util.List;

public class City {
    public List<String> cityNameList = new ArrayList<String>();

    public List<String> getCityNameList() {
        return cityNameList;
    }

    public void setCityNameList(List<String> cityNameList) {
        this.cityNameList = cityNameList;
    }

//    public <cityNameList> List<String> getCityName(String cityName)  {
//            if (cityName.equals("*"))
//                return cityNameList;
//            if (cityName.length() < 2)
//                throw new NotFoundException();
//            List<String> result = new ArrayList<>();
//            for (String city : cityNameList) {
//                if (city.toLowerCase().contains(cityName.toLowerCase()))
//                    result.add(city);
//            }
//            return result;
//        }
}
