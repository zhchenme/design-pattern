package com.jas.abstractfactory;

/**
 * 这里是上海原料加工厂，生产的原料是薄面团与Reggiano干酪
 */
public class SHPizzaInfgredientFactory implements PizzaInfgredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
}
