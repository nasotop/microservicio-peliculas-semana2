package com.movies_api.demo.mapper;

import java.util.List;

import com.movies_api.demo.datatransferobject.GenericResponseDto;
import com.movies_api.demo.datatransferobject.GenericSingleResponseDto;

public class GenericResponseMapper {
    
    public static <T> GenericResponseDto<T> ToGenericResponseDto(List<T> elements){
        GenericResponseDto<T> response = new GenericResponseDto<T>();
        response.setContent(elements);
        return response;
    }

    public static <T> GenericSingleResponseDto<T> ToGenericSingleResponseDto(T element){
        GenericSingleResponseDto<T> response = new GenericSingleResponseDto<T>();
        response.setContent(element);
        return response;
    }
}
