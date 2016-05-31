package chapter03;

public class Q05 {

    public static class MyQueue {
        private Stack newest = new Stack();
        private Stack oldest = new Stack();

        public void enqueue(Object item){
            newest.push(item);
        }

        public Object dequeue(){
            if(oldest.isEmpty()){
                while(!newest.isEmpty()){
                    oldest.push(newest.pop());
                }
            }
            return oldest.pop();
        }
    }
}
