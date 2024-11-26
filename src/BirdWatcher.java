
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeek = new int[]{0, 2, 5, 3, 7, 8, 4};
        return lastWeek;
    }

    public int getToday() {
        // Verifica se o array está vazio para evitar erros
        if (birdsPerDay == null || birdsPerDay.length == 0) {
            return 0; // Retorna 0 se não houver dados
        }
        // Retorna o último elemento do array
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length -1 ] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int n : birdsPerDay) {
            if (n == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;

        // Limita o número de dias ao tamanho do array
        for (int n = 0; n < Math.min(numberOfDays, birdsPerDay.length); n++) {
            total += birdsPerDay[n];
        }

        return total;
    }


    public int getBusyDays() {
        int busyDays = 0;
        for (int n : birdsPerDay) {
            if (n >= 5) {
                busyDays = busyDays + 1;
            }
        }
        return busyDays;
    }
}
