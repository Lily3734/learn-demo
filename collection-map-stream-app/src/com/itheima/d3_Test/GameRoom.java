package com.itheima.d3_Test;

import java.util.Collections;
import java.util.LinkedList;

public class GameRoom {
    private LinkedList<Card> cards = new LinkedList<>();

    public GameRoom() {
        String[] name = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] color = {"方块", "红心", "梅花", "黑桃"};
        int size = 0;
        for (int i = 0; i < name.length; i++) {
            size++;
            for (int j = 0; j < color.length; j++) {
                Card card = new Card(name[i], color[j], size);
                cards.add(card);
            }
        }
        cards.add(new Card("小王", "灰", ++size));
        cards.add(new Card("大王", "彩", ++size));
        System.out.println("新牌" + cards);


    }

    public void start() {

        Collections.shuffle(cards);
        System.out.println("洗牌后：" + cards);
        System.out.println(cards.size());
        LinkedList<Card> game1 = new LinkedList<>();
        LinkedList<Card> game2 = new LinkedList<>();
        LinkedList<Card> game3 = new LinkedList<>();
        System.out.println("发牌");
        dealCard(cards, game1, game2, game3);
        System.out.println(game1);
        System.out.println(game1.size());
        System.out.println(game2);
        System.out.println(game3);
        System.out.println(cards);
        System.out.println("game3玩家抢到地主");
        game3.addAll(cards);
        System.out.println(game3);
    }

    public void dealCard(LinkedList<Card> cards, LinkedList<Card> game1, LinkedList<Card> game2, LinkedList<Card> game3) {
        while (cards.size() != 3) {
            game1.addFirst(cards.removeFirst());
            game2.addFirst(cards.removeFirst());
            game3.addFirst(cards.removeFirst());
        }
        Collections.sort(game1, (o1, o2) -> Integer.compare(o1.getSize(), o2.getSize()));

        Collections.sort(game2, (o1, o2) -> Integer.compare(o1.getSize(), o2.getSize()));

        Collections.sort(game3, (o1, o2) -> Integer.compare(o1.getSize(), o2.getSize()));


    }
}
