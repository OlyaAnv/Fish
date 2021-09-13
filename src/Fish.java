public class Fish implements Runnable {
    private final String[] picture = {
            "oOOOo__________",
            "_oOOOo_________",
            "__oOOOo________",
            "___oOOOo_______",
            "____oOOOo______",
            "_____oOOOo_____",
            "______oOOOo____",
            "_______oOOOo___",
            "________oOOOo__",
            "_________oOOOo_",
            "__________oOOOo"
    };
    Thread t;
    private int interval;

    public Fish(int interval) {
        this.interval = interval;
        t = new Thread(this);
        t.start();
    }


    @Override
    public void run() {
        boolean b = true;
        while (b) {

            for (int i = 0; i < picture.length; i++) {
                System.out.println(picture[i]);
                try {
                    Thread.sleep(interval);
                } catch (InterruptedException exception) {
                    b = false;
                    break;
                }
            }
            if(b) {
                for (int i = picture.length - 1; i >= 0; i--) {
                    System.out.println(picture[i]);
                    try {
                        Thread.sleep(interval);
                    } catch (InterruptedException exception) {
                        b = false;
                        break;
                    }
                }
            }

        }

    }
}
