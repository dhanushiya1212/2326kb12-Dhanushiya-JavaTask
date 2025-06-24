package task.corejava;

public class ThreadCoordination {
	    static class MyThread extends Thread {
	        private String name;

	        public MyThread(String name) {
	            this.name = name;
	        }

	        @Override
	        public void run() {
	            for (int i = 1; i <= 3; i++) {
	                System.out.println(name + " - Count: " + i);
	                try {
	                    Thread.sleep(1000); 
	                } catch (InterruptedException e) {
	                    System.out.println(name + " was interrupted.");
	                }
	            }
	            System.out.println(name + " finished.");
	        }
	    }

	    public static void main(String[] args) {
	        MyThread thread1 = new MyThread("Thread-1");
	        MyThread thread2 = new MyThread("Thread-2");
	        thread1.start();
	        try {
	            thread1.join(); 
	        } catch (InterruptedException e) {
	            System.out.println("Main thread interrupted while waiting.");
	        }
	        thread2.start();
	        try {
	            thread2.join();
	        } catch (InterruptedException e) {
	            System.out.println("Main thread interrupted while waiting.");
	        }

	        System.out.println("Main thread finished.");
	    }
	}


