package exercice4;

import java.util.ArrayList;
import java.util.List;

public class City {
    public List<String> cityNameList = new ArrayList<String>();

    public List<String> getCityNameList() {
        return cityNameList;
    }

    public void setCityNameList(List<String> cityNameList) {
        this.cityNameList = cityNameList;
        cityNameList.add("Paris");
        cityNameList.add("Berlin");
        cityNameList.add("Londre");
        cityNameList.add("Smolensk");
        cityNameList.add("Oslo");
        cityNameList.add("Bangkok");
        cityNameList.add("Tokyo");
        cityNameList.add("Madrid");
    }

    public <cityNameList> List<String> getCityName(String cityName) {

        if (cityName.length() > 2) {
            throw new RuntimeException("Le nom de la ville doit avoir plus de deux lettres");
        }


        for (String c : cityNameList
        ) {
            String regex = "^" + cityName;
            if (c.equals(regex)) {
                System.out.println(c);
            }
        }
        return null;
    }
}
