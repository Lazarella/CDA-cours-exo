//package com.example.tpblog.mapper;
//
//import com.example.tpblog.entity.Post;
//import com.example.tpblog.model.PostDTO;
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//import org.mapstruct.Named;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.List;
//
//
//@Mapper(componentModel = "spring")
//public interface PostMapper {
//    @Mapping(source = "updateDatelist", target = "lastUpdate", qualifiedByName = "getDate")
//    PostDTO postToDTO(Post post);
//
//    @Mapping(source = "lastUpdate", target = "updateDatelist", qualifiedByName = "convertToDate")
//    Post DTOtoPost(PostDTO dto);
//
//    @Named("convertToDate")
//    public static String convertToDate(LocalDate localDate) {
//        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        return localDate.format(formatters);
//    }
//
//
//    @Named("getDate")
//    public static String getDate(List<LocalDate> updateDateList) {
//        if (updateDateList == null || updateDateList.isEmpty()) {
//            return null;
//        }
//        LocalDate lastUpdate = updateDateList.get(updateDateList.size() - 1);
//        return convertToDate(lastUpdate);
//    }
//}