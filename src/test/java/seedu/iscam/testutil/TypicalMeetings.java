package seedu.iscam.testutil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.iscam.model.meeting.Meeting;
import seedu.iscam.model.util.meetingbook.MeetingBook;

/**
 * A utility class containing a list of {@code Meeting} objects to be used in tests.
 */
public class TypicalMeetings {

    public static final Meeting ALICE_1 = new MeetingBuilder()
            .withName("Alice Pauline").withDateTime("24-03-2025 15:30").withLocation("Starbucks, Jurong West")
            .withDescription("Discuss lifetime policy.").withTags("friends").withStatus("incomplete")
            .build();
    public static final Meeting ALICE_2 = new MeetingBuilder()
            .withName("Alice Pauline").withDateTime("29-03-2025 20:00").withLocation("Starbucks, Jurong West")
            .withDescription("Finalize lifetime policy.").withTags("friends").withStatus("incomplete")
            .build();
    public static final Meeting BENSON_1 = new MeetingBuilder()
            .withName("Benson Meier").withDateTime("30-03-2025 15:30").withLocation("Kopitiam, Clementi Central")
            .withDescription("Brief introduction of company's policy.").withTags("friends").withStatus("incomplete")
            .build();
    public static final Meeting CARL_1 = new MeetingBuilder()
            .withName("Carl Kurz").withDateTime("21-01-2021 10:00").withLocation("Dio Cafe, Central")
            .withDescription("Explain workflow of policyholder and underwrite.").withStatus("complete")
            .build();
    public static final Meeting DANIEL_1 = new MeetingBuilder()
            .withName("Daniel Meier").withDateTime("09-05-2025 14:15").withLocation("Macdonald, Bedok North")
            .withDescription("Recommend policies for his family.").withStatus("incomplete")
            .build();
    public static final Meeting ELLE_1 = new MeetingBuilder()
            .withName("Elle Meyer").withDateTime("10-05-2025 17:30").withLocation("Macdonald, Serangoon")
            .withDescription("Extension of policy.").withStatus("incomplete")
            .build();
    public static final Meeting FIONA_1 = new MeetingBuilder()
            .withName("Fiona Kunz").withDateTime("03-10-2025 16:30").withLocation("Doot Cafe, One North")
            .withDescription("Discuss additional policies.").withStatus("incomplete")
            .build();
    public static final Meeting FIONA_2 = new MeetingBuilder()
            .withName("Fiona Kunz").withDateTime("05-01-2021 16:30").withLocation("Doot Cafe, One North")
            .withDescription("Introducing policies.").withStatus("complete")
            .build();

    // Manually added
    public static final Meeting HOON = new MeetingBuilder()
            .withName("Hoon Bee").withDateTime("05-01-2022 16:30").withLocation("Toot Cafe, One North")
            .withDescription("Introducing plans.").withStatus("incomplete")
            .build();
    public static final Meeting IGUANA = new MeetingBuilder()
            .withName("Hoon Bee").withDateTime("02-01-2022 16:30").withLocation("TooD Cafe, One South")
            .withDescription("Introducing schemes.").withStatus("incomplete")
            .build();

    /**
     * Returns an {@code MeetingBook} with all the typical meetings.
     */
    public static MeetingBook getTypicalMeetingBook() {
        MeetingBook mb = new MeetingBook();
        for (Meeting meeting : getTypicalMeetings()) {
            mb.addMeeting(meeting);
        }
        return mb;
    }

    public static List<Meeting> getTypicalMeetings() {
        return new ArrayList<>(Arrays.asList(ALICE_1, ALICE_2, BENSON_1, CARL_1, DANIEL_1, ELLE_1, FIONA_1, FIONA_2));
    }
}
