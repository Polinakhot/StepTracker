public class StepTracker {
    private int minSteps;
    private int totalSteps;
    private int dayCount;
    private int activeDayCount;

    public StepTracker(int min) {
        minSteps = min;
        totalSteps = 0;
        dayCount = 0;
        activeDayCount = 0;
    }

    public void addDailySteps(int steps) {
        totalSteps += steps;
        dayCount++;
        if (steps >= minSteps) {
            activeDayCount++;
        }
    }

    public int activeDays() {
        return activeDayCount;
    }

    public double averageSteps() {
        if (dayCount == 0) return 0.0;
        return (double) totalSteps / dayCount;
    }
}
