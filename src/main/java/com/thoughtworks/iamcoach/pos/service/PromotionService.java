package com.thoughtworks.iamcoach.pos.service;

import com.thoughtworks.iamcoach.pos.Dao.*;
import com.thoughtworks.iamcoach.pos.model.promotion.Promotion;

import java.util.ArrayList;

public class PromotionService {
    private PromotionDao promotionImple = new PromotionImple();

    public void setPromotionImple(PromotionDao promotionImple) {
        this.promotionImple = promotionImple;
    }

    public Promotion getPromotionByType(int type) {
        return promotionImple.getPromotionByType(type);
    }

    public ArrayList<Promotion> getPromotions() {
        return promotionImple.getPromotions();
    }
}
