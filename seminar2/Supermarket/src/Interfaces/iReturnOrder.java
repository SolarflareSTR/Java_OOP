package Interfaces;

import Classes.Actor;

public interface iReturnOrder {
    void takeInQueue(iActorBehaviour actor);
    void releaseFromQueue();
    void returnOrder();
    void refundMoney();
}
