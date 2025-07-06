class CustomStack {
    static int[]ar;
    int top=-1;
    public CustomStack(int maxSize) {
        ar=new int[maxSize];
    }  
    public void push(int x) {
        if(top<ar.length-1)
        {
            ar[++top]=x;
        }
    }
    public int pop() {
        if(top==-1)
        {
            return -1;
        }
        else
        {
            int val=ar[top--];
            return val;
        }
    }
    public void increment(int k, int val) {
        if(k<ar.length)
        {
            for(int i=0;i<k;i++)
            {
                int v=ar[i];
                ar[i]=v+val;
            }
        }
        else
        {
            for(int i=0;i<ar.length;i++)
            {
                int v=ar[i];
                ar[i]=v+val;
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */