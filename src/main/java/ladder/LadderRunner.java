package ladder;

import static ladder.creator.LadderLabel.*;

public class LadderRunner {

    private final Row[] rows;

    public LadderRunner(Row[] rows) {
        this.rows = rows;
    }

    public void run(Position position) {
        LadderViewer ladderViewer = new LadderViewer(rows);
        for (int i = 0; i < rows.length; i++) {
            ladderViewer.printLadderStatus(LadderPosition.of(Position.from(i), position), BEFORE);
            rows[i].nextPosition(position);
            ladderViewer.printLadderStatus(LadderPosition.of(Position.from(i), position), AFTER);
        }
    }
}
