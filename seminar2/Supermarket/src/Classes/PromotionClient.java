package Classes;

import Interfaces.iActorBehaviour;

public class PromotionClient extends Actor implements iActorBehaviour {

    public PromotionClient(String name, String PromoName, int PromoID, int PromoPlaces) {
      super(name);
    }

    @Override
    public String getName() { // получаем имя
        return super.name;
    }
    public String getPromoName() { // получаем название акции
        return super.name;
    }

    public boolean isTakeOrder() { // взял ли заказ
      return super.isTakeOrder;
    }

    public boolean isMakeOrder() { // совершил ли заказ
      return super.isMakeOrder;
    }

    public void setTakeOrder(boolean makeOder) {
      super.isMakeOrder = makeOder;
    }
    
    public void setMakeOrder(boolean pikUpOrder) {
      super.isTakeOrder = pikUpOrder;
    }

    public Actor getActor() {
      return this;
    }

    public int PromoPlaces() { // количество оставшихся мест в акции
      return this;
    }

    @Override
    public void returnOrder() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'returnOrder'");
    }

    @Override
    public void refundMoney() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'refundMoney'");
    }

    @Override
    public boolean isReturnOrder() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'isReturnOrder'");
    }

    @Override
    public boolean isRefundMoney() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'isRefundMoney'");
    }
  }