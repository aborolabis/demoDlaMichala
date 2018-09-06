package com.example.demo.guitar;

@org.springframework.stereotype.Service
public class Service {

    public Guitar getOneGuitar(){
        Guitar guitar = new Guitar();
        guitar.setId(1L);
        guitar.setName("name");
        guitar.setType("acoustic");
        guitar.setStrings("Long");

        return guitar;
    }

}
