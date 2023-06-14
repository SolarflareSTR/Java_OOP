package Interfaces;

import Classes.Actor;

public interface iReturnOrder {
    Actor getActor();
    void takeInQueue(iActorBehaviour actor); // стоит ли клиент в очереди
    void releaseFromQueue(); 
    void returnOrder(); // возврат товара в магаз
    void refundMoney(); // возврат денег клиенту
}
