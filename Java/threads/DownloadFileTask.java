package threads;

public class DownloadFileTask implements Runnable {

    private DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading a file: " + Thread.currentThread().getName());

        for ( var i = 0; i < Integer.MAX_VALUE; i++) {
            System.out.println("Downloading Byte " + i);
        }

        System.out.println("Download Complete" + Thread.currentThread().getName());
    }
    
}
