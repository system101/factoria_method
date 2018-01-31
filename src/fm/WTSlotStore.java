/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fm;

/**
 *
 * @author Jimmy Salami
 */
public class WTSlotStore extends SlotStore{

    @Override
    protected Slot makeSlot(slottype type) {
        switch (type) {
            case straight:
                return new WTSlotStraight();
            case bonus:
                return new WTSlotBonus();
            case progressive:
                return new WTSlotProgressive();
            default:
                return null;
        }
    }
    
}
