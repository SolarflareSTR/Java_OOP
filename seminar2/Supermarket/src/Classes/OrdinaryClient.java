package Classes;

import Interfaces.iActorBehaviour;

public class OrdinaryClient extends Actor implements iActorBehaviour {

    public OrdinaryClient(String name) {
        super(name);
    }
    @Override
    public String getName() {
        return super.name;
    }
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
    public void setTakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }
    public void setMakeOrder(boolean pickupOrder) {
        super.isTakeOrder = pickupOrder;
    }
    public Actor getActor() {
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
