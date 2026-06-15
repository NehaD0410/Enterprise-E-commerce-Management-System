package spring.project.service;

import java.util.List;

import spring.project.entity.Card;

public interface CardFetchService {
List<Card>getCards();
Card getCardByid(int id);

}
