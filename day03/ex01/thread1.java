class thread1 extends Thread{
    private String name;
    thread1(String a){
        name = a;
    }
    public void run(){
        while (true){
            if (Syncro.stack.size() == 0){
                Syncro.print(name);
                Syncro.stack.push(0);
            }
        }
    }
}