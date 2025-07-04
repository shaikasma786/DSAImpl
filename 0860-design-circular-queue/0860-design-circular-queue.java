class MyCircularQueue {
     int []ar;
     int front=-1;
     int rear=-1;
    public MyCircularQueue(int k) {
        ar=new int[k];
    }
    public boolean enQueue(int value) {
        if(isFull())
        {
            return false;
        }
        else
        {
            if(isEmpty())
            {
                front=0;
            }
            rear=(rear+1)%ar.length;
            ar[rear]=value;
            return true;
        }
    }
    public boolean deQueue() {
        if(isEmpty())
        {
            return false;
        }
        if(front==rear)
        {
            front=-1;
            rear=-1;
        }
        else
        {
            front=(front+1)%ar.length;
        }
        return true;
    }
    public int Front() {
        if(isEmpty())
        {
            return -1;
        }
        else
        {
            return ar[front];
        }
    }

    public int Rear() {
        if(isEmpty())
        {
            return -1;
        }
        else
        {
            return ar[rear];
        }
    }
    public boolean isEmpty() {
        if(front==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isFull() {
        if((rear+1)%ar.length==front)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */