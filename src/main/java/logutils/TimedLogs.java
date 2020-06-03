package logutils;

import java.util.List;

public class TimedLogs {

    private final List<TimedLogEntry> logEntries;

    public TimedLogs(final List<TimedLogEntry> logEntries) {
        this.logEntries = logEntries;
    }

    /**
     * returns all logs entries between start time and end time
     * @param start start time (inclusive)
     * @param end end time (exclusive)
     */
    public List<TimedLogEntry> getLogEntriesBetween(final long start, final long end) {
        return null;
    }
}
