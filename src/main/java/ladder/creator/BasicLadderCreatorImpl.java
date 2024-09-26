package ladder.creator;

import ladder.component.LadderPosition;
import ladder.component.LadderSize;
import ladder.component.Row;

public class BasicLadderCreatorImpl implements LadderCreator {

    private Row[] rows;

    public BasicLadderCreatorImpl() {

    }

    public BasicLadderCreatorImpl(LadderSize ladderSize) {
        setRowsAndPersons(ladderSize);
    }


    // 빈 껍데기인 기본 사다리에서, 사다리의 높이와 게임에 참여하는 사람 수를 설정해주는 메소드
    public void setRowsAndPersons(LadderSize ladderSize) {
        rows = new Row[ladderSize.getNumberOfRow().getNumber()];
        for (int i = 0; i < ladderSize.getNumberOfRow().getNumber(); i++) {
            rows[i] = new Row(ladderSize.getNumberOfPerson());
        }
    }

    // 원하는 좌표에 사다리를 그리는 메소드
    public void drawLine(LadderPosition ladderPosition) {
        rows[ladderPosition.getRow().getValue()].drawLine(ladderPosition.getCol());
    }

    public Row[] getRows() {
        return rows;
    }
}
