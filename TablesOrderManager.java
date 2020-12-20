package com.company;

public class TablesOrderManager {
    public static void main(String[] args){
        Order<Dish> orderDish=new Order<>();
        orderDish.add(new Dish(1000,"Рыба","Фарель"));
        orderDish.add(new Dish(450,"Рыба","Треска"));
        orderDish.add(new Dish(900,"Рыба","Лосось"));
        orderDish.remove(2);
        orderDish.showOrders();
        System.out.println("\n<------------------------------------------>");
        Order<Drink> orderDrink=new Order<>();
        orderDrink.add(new Drink(200,"коктейль","молочный"));
        orderDrink.add(new Drink(200,"коктейль","банановый"));
        orderDrink.add(new Drink(200,"коктейль","клубничный"));
        orderDrink.add(new Drink(200,"коктейль","шоколадный"));
        orderDrink.remove(3);
        orderDrink.showOrders();
    }

}
