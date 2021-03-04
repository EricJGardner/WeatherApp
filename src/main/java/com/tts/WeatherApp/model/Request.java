package com.tts.WeatherApp.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Data
public class Request {

        private String zipCode;

        @CreationTimestamp
        private Date createdAt;

}
