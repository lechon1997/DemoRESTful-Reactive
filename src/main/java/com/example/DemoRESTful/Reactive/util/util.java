package com.example.DemoRESTful.Reactive.util;

import com.example.DemoRESTful.Reactive.collections.Widget;
import com.example.DemoRESTful.Reactive.dto.DtoWidget;
import org.springframework.beans.BeanUtils;

public class util {
    public static DtoWidget entityToDto(Widget widget){
        DtoWidget dtoWidget = new DtoWidget();
        BeanUtils.copyProperties(widget,dtoWidget);
        return dtoWidget;
    }

    public static Widget dtoToEntity(DtoWidget dtoWidget){
        Widget widget = new Widget();
        BeanUtils.copyProperties(dtoWidget,widget);
        return widget;
    }

}