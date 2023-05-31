package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public class SpecialClient extends Actor implements iActorBehaviour, iReturnOrder {

    public SpecialClient(String name, int SpecID) {
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

    public void setTakeOrder(boolean makeOder) {
      super.isMakeOrder = makeOder;
    }
    
    public void setMakeOrder(boolean pikUpOrder) {
      super.isTakeOrder = pikUpOrder;
    }

    public Actor getActor() {
      return this;
    }

    @Override
    public void takeInQueue(iActorBehaviour actor) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'takeInQueue'");
    }

    @Override
    public void releaseFromQueue() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'releaseFromQueue'");
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