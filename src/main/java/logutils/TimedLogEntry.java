package logutils;

import java.util.Objects;

public class TimedLogEntry {

  private final String content;
  private final long time;

  public TimedLogEntry(final String content, long time) {
    this.content = content;
    this.time = time;
  }

  public String getContent() {
    return content;
  }

  public long getTime() {
    return time;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TimedLogEntry that = (TimedLogEntry) o;
    return getTime() == that.getTime() &&
            Objects.equals(getContent(), that.getContent());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getContent(), getTime());
  }
}
