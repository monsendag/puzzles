package logutils;

import java.util.Objects;

public class LogEntry {

  private final String content;

  public LogEntry(final String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LogEntry logEntry = (LogEntry) o;
    return getContent().equals(logEntry.getContent());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getContent());
  }
}
