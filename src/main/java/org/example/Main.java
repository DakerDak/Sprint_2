package org.example;

import model.Food;
import model.Meat;
import model.Apple;
import service.ShoppingCart;
import model.constants.Colour;

public class Main {
    public static void main(String[] args) {
        // Инициализация данных
        Food meat = new Meat(5, 100);
        Food redApple = new Apple(10, 50, Colour.RED);
        Food greenApple = new Apple(8, 60, Colour.GREEN);

        Food[] items = {meat, redApple, greenApple};
        ShoppingCart cart = new ShoppingCart(items);

        // Вывод результатов
        System.out.println("Общая сумма товаров без скидки: " + cart.getTotalWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + cart.getTotalWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.getVegetarianTotalWithoutDiscount());
    }
}