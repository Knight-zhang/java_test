package thread;
class MyRunnable implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                Thread.sleep(100);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
