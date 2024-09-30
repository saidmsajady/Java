package mytube;

public class VideoProcessor {

    private final IVideoEncoder encoder;
    private final IVideoDatabase database;
    private final IEmailService emailService;

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

