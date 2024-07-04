package com.microservice.Cards.service.impl;

import com.microservice.Cards.dto.CardsDto;
import com.microservice.Cards.service.CardsService;
import org.springframework.stereotype.Service;

@Service
public class CardsServiceImpl implements CardsService {

    @Override
    public void createCard ( String mobileNumber ) {

    }

    @Override
    public CardsDto fetchCard ( String mobileNumber ) {
        return null;
    }

    @Override
    public boolean updateCard ( CardsDto cardsDto ) {
        return false;
    }

    @Override
    public boolean deleteCard ( String mobileNumber ) {
        return false;
    }
}
