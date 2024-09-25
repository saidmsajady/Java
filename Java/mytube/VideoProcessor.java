package mytube;

public class VideoProcessor {

    private IVideoEncoder encoder;
    private IVideoDatabase database;
    private IEmailService emailService;

    public VideoProcessor(IVideoDatabase database, IEmailService emailService, IVideoEncoder encoder) {
        this.database = database;
        this.encoder = encoder;
        this.emailService = emailService;
    }

    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        emailService.sendEmail(video.getUser());

    }
}

