class thread extends Thread{
    private String name;
    thread(String a){
        name = a;
    }
    public void run(){
        while (true){
            if (Syncro.stack.size() > 0){
                Syncro.print(name);
                Syncro.stack.pop();
            }
        }
    }
}