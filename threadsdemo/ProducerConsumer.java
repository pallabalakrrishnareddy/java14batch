package threadsdemo;

public class ProducerConsumer implements Runnable {
int apples;
public static void main(String[] args) {
ProducerConsumer pc=new ProducerConsumer();
Thread producer=new Thread(pc, "Tree");
Thread consumer1=new Thread(pc, "Worm");
Thread consumer2=new Thread(pc, "pavan");
producer.start();
consumer1.start();
consumer2.start();
}
synchronized void produce() {
while(true) {
if (apples>100)
try {
System.out.println("Waiting for apples to be eaten");
wait();
}
catch (InterruptedException e) {}
try {
int i=(int) (Math.random()*100)+1;
Thread.sleep(i*10);
apples=apples+i;
System.out.println("Produced apples ="+apples);
}
catch (InterruptedException e) {}
notifyAll();
}
}
synchronized void consume() {
while (true) {
int i=(int) (Math.random()*100)+1;
if (apples>0 && apples<i)
try {
System.out.println(Thread.currentThread().getName()+"waiting for" +(i-apples) +"more apples");
wait ();
}
catch (InterruptedException e) {}
try {
System.out.println(Thread.currentThread().getName()+"busy eating" +i+ "apples");
Thread.sleep(i);
apples=apples-i;}
catch (InterruptedException e) {}
//notify(); 
}
}
public void run() {
if (Thread.currentThread().getName().equals("Tree"))
produce();
else consume();


}
}