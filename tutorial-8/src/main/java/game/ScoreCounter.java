package game;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ScoreCounter implements Runnable {
    private AtomicInteger score = new AtomicInteger(100);

    private synchronized void decrement() {
        if (score.get() >= 0)
            score.decrementAndGet();
    }

    public synchronized int value() {
        return score.get();
    }

    public synchronized void addOnSideScore() {
        score.addAndGet((int) Math.round(0.1 * score.get()));
    }

    public synchronized void addOffSideScore() {
        score.addAndGet((int) Math.round(0.05 * score.get()));
    }

    @Override
    public void run() {
        ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
        exec.scheduleAtFixedRate(() -> {
            if (score.get() >= 0)
                decrement();
        }, 0, 1, TimeUnit.SECONDS);
    }
}
